package by.tryputs.bookssharing.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;

@Configuration
@EnableResourceServer
public class OAuth2ResourceServerConfig extends ResourceServerConfigurerAdapter {

    private final DefaultTokenServices tokenServices;
    private final TokenStore tokenStore;

    @Autowired
    public OAuth2ResourceServerConfig(DefaultTokenServices tokenServices, TokenStore tokenStore) {
        this.tokenServices = tokenServices;
        this.tokenStore = tokenStore;
    }

    @Autowired
    public OAuth2ResourceServerConfig(DefaultTokenServices tokenServices, TokenStore tokenStore) {
        this.tokenServices = tokenServices;
        this.tokenStore = tokenStore;
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .anonymous().disable()
                .authorizeRequests()
                .antMatchers("/bookssharing/rest/signup", "/bookssharing/rest/restore").permitAll()
                .antMatchers("/oauth/**").authenticated();

    }

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        resources
                .resourceId("api")
                .tokenServices(tokenServices)
                .tokenStore(tokenStore);
    }
}