package by.tryputs.bookssharing.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

@EnableWebSecurity
@Configuration
@RequiredArgsConstructor
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private final DataSource dataSource;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.cors().and().authorizeRequests()
                .antMatchers(HttpMethod.GET,"/swagger-ui.html").permitAll()
                .antMatchers(HttpMethod.GET, "/v2/api-docs").permitAll()
                .antMatchers(HttpMethod.GET, "/webjars/springfox-swagger-ui/**").permitAll()
                .antMatchers(HttpMethod.GET, "/swagger-resources/**").permitAll()
                .antMatchers("users/**").anonymous()
                .antMatchers("/api/**").authenticated()
                .and().formLogin().defaultSuccessUrl("/swagger-ui.html");
    }
}