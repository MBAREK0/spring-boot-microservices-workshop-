package org.mbarek0.userservice.config;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;

@Configuration
public class FeignClientConfig {

    @Bean
    public RequestInterceptor oauth2FeignRequestInterceptor() {
        return requestTemplate -> {
            JwtAuthenticationToken authentication = (JwtAuthenticationToken) SecurityContextHolder
                    .getContext()
                    .getAuthentication();

            if (authentication != null && authentication.getToken() != null) {
                requestTemplate.header(
                        "Authorization",
                        "Bearer " + authentication.getToken().getTokenValue()
                );
            }
        };
    }
}