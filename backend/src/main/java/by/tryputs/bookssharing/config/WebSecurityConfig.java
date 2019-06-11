package by.tryputs.bookssharing.config;

import by.tryputs.bookssharing.filter.AuthenticationFilter;
import by.tryputs.bookssharing.filter.LoginFilter;
import by.tryputs.bookssharing.service.TokenAuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.sql.DataSource;

@Configuration
@RequiredArgsConstructor
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private final DataSource dataSource;
    private final TokenAuthenticationService tokenAuthenticationService;
    private final Jackson2ObjectMapperBuilder objectMapperBuilder;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.cors().and().csrf().disable().authorizeRequests()
                .antMatchers(HttpMethod.POST, "/login").permitAll()
                .antMatchers(HttpMethod.GET,"/swagger-ui.html").permitAll()
                .antMatchers(HttpMethod.GET, "/v2/api-docs").permitAll()
                .antMatchers(HttpMethod.GET, "/webjars/springfox-swagger-ui/**").permitAll()
                .antMatchers(HttpMethod.GET, "/swagger-resources/**").permitAll()
                .antMatchers(HttpMethod.POST, "/users/**").anonymous()
                //.antMatchers("/api/**").authenticated()

                .and().logout()
                .permitAll().and()
                .addFilterBefore(new LoginFilter(tokenAuthenticationService, authenticationManager(), objectMapperBuilder),
                UsernamePasswordAuthenticationFilter.class)
                .addFilterBefore(new AuthenticationFilter(tokenAuthenticationService),
                        UsernamePasswordAuthenticationFilter.class);
    }

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery("select users.email, users.password, users.enabled from users where users" +
                        ".email=?")
                .authoritiesByUsernameQuery("select users.email, roles.name from users " +
                        " join users_roles on users.id = users_roles.user_id " +
                        "join roles on users_roles.role_id = roles.id " +
                        "where users.email=?");
    }
}