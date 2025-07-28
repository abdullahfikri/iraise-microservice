//package com.iraise.api_gateway.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.web.server.SecurityWebFilterChain;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//@Configuration
//@EnableWebFluxSecurity
//public class SecurityConfigCopy {
//    @Bean
//    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
//
//                http
//                        .oauth2Client(withDefaults())
//                        .csrf(ServerHttpSecurity.CsrfSpec::disable)
//                        .oauth2ResourceServer(oauth2 -> oauth2.jwt(Customizer.withDefaults()));
//        return  http.build();
//    }
//
//}
