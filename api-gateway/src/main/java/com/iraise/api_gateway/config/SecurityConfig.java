package com.iraise.api_gateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.oauth2.client.oidc.web.server.logout.OidcClientInitiatedServerLogoutSuccessHandler;
import org.springframework.security.oauth2.client.registration.ReactiveClientRegistrationRepository;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.authentication.logout.ServerLogoutSuccessHandler;

import static org.springframework.security.config.Customizer.withDefaults;
//@Configuration
//@EnableWebFluxSecurity
//public class SecurityConfig {
//
////    @Autowired
////    private ReactiveClientRegistrationRepository clientRegistrationRepository;
//
//    @Bean
//    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
//
//                http
//                        .authorizeExchange(auth -> auth.anyExchange().authenticated())
////                        .oauth2Login(withDefaults())
////                        .logout(logout -> logout.logoutSuccessHandler(oidcLoggoutSuccessHandler()))
//                        .oauth2ResourceServer(oauth2 -> oauth2.jwt(Customizer.withDefaults()))
//                        .csrf(ServerHttpSecurity.CsrfSpec::disable);
//        return  http.build();
//    }
//
////    Handle Front-Channel Logout
////    private ServerLogoutSuccessHandler oidcLoggoutSuccessHandler() {
////        OidcClientInitiatedServerLogoutSuccessHandler oidcClientInitiatedServerLogoutSuccessHandler =
////                new OidcClientInitiatedServerLogoutSuccessHandler(this.clientRegistrationRepository);
////
////        oidcClientInitiatedServerLogoutSuccessHandler.setPostLogoutRedirectUri("{baseUrl}");
////
////        return oidcClientInitiatedServerLogoutSuccessHandler;
////    }
//
//}
