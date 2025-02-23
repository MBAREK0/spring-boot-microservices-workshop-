//package org.mbarek0.apigateway.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.web.server.SecurityWebFilterChain;
//
//@Configuration
//public class ApiGatewaySecurityConfig {
//
//    @Bean
//    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
//        return http
//                .csrf(ServerHttpSecurity.CsrfSpec::disable)
//                .authorizeExchange(exchanges -> exchanges
//                        .pathMatchers("/login").permitAll()  // Allow unauthenticated access to /login
//                        .anyExchange().authenticated()       // Secure all other endpoints
//                )
//                .oauth2Login(Customizer.withDefaults())      // OAuth2 login configuration
//                .oauth2Client(Customizer.withDefaults())     // OAuth2 client configuration
//                .build();
//    }
//}