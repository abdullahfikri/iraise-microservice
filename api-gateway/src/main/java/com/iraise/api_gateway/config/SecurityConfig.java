package com.iraise.api_gateway.config;

import com.nimbusds.jose.shaded.gson.internal.LinkedTreeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.client.oidc.web.server.logout.OidcClientInitiatedServerLogoutSuccessHandler;
import org.springframework.security.oauth2.client.registration.ReactiveClientRegistrationRepository;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.authentication.logout.ServerLogoutSuccessHandler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.springframework.security.config.Customizer.withDefaults;
@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

//    @Autowired
//    private ReactiveClientRegistrationRepository clientRegistrationRepository;

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
        System.out.println("securityWebFilterChain invoke");
                http
//                        .authorizeExchange(auth -> auth
//                                .pathMatchers("/user-identity-management/auth/login").permitAll()
//                                .pathMatchers("/user-identity-management/account/forgot-password").permitAll()
//                                .pathMatchers("/user-identity-management-service/user-identity-management/auth/login").permitAll()
//                                .pathMatchers("/user-identity-management-service/user-identity-management/account/forgot-password").permitAll()
//                                .anyExchange().authenticated())
                        .csrf(ServerHttpSecurity.CsrfSpec::disable)
//                        .oauth2Login(withDefaults())
//                        .oauth2Client(withDefaults());
//                        .logout(logout -> logout.logoutSuccessHandler(oidcLoggoutSuccessHandler()))
                        .oauth2ResourceServer(oauth2 -> oauth2.jwt(Customizer.withDefaults()));
        return  http.build();
    }




//    Handle Front-Channel Logout
//    private ServerLogoutSuccessHandler oidcLoggoutSuccessHandler() {
//        OidcClientInitiatedServerLogoutSuccessHandler oidcClientInitiatedServerLogoutSuccessHandler =
//                new OidcClientInitiatedServerLogoutSuccessHandler(this.clientRegistrationRepository);
//
//        oidcClientInitiatedServerLogoutSuccessHandler.setPostLogoutRedirectUri("{baseUrl}");
//
//        return oidcClientInitiatedServerLogoutSuccessHandler;
//    }

}
