package com.iraise.api_gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("communication-support-management-service",r -> r.
                        method("GET", "POST")
                        .and()
                        .path("/communication-support/pengumuman/**", "/communication-support/layanan-aduan/**", "/communication-support/tutorial/download/**")
                        .filters(f-> f.prefixPath("/communication-support-management-service"))
                        .uri("http://localhost:8765")
                )
                .route("administration-management-service", r-> r
                        .method("GET", "POST")
                        .and()
                        .path("/academic-affairs/cuti/**", "/academic-affairs/wisuda/**", "/academic-affairs/prodi/**", "/academic-affairs/akademik/**")
                        .filters(f -> f.prefixPath("/administration-management-service"))
                        .uri("http://localhost:8765")
                )
                .route("user-identity-management-service", r-> r
                        .method("GET", "POST", "PUT")
                        .and()
                        .path(
                                "/user-identity-management/auth/**",
                                "/user-identity-management/account/**",
                                "/user-identity-management/log/**"
                        )
                        .filters(f -> f.prefixPath("/user-identity-management-service"))
                        .uri("http://localhost:8765")
                )
                .route("student-lecture-management-service", r-> r
                        .method("GET", "POST", "PUT")
                        .and()
                        .path(
                                "/student-lecturer-management/mahasiswa/**",
                                "/student-lecturer-management/dosen/**"
                        )
                        .filters(f -> f.prefixPath("/student-lecture-management-service"))
                        .uri("http://localhost:8765")
                )
                .route("course-curriculum-management-service", r-> r
                        .method("GET", "POST", "PUT")
                        .and()
                        .path(
                                "/academic-courses/kurikulum/**",
                                "/academic-courses/mata-kuliah/**",
                                "/academic-courses/schedule/**"
                        )
                        .filters(f -> f.prefixPath("/course-curriculum-management-service"))
                        .uri("http://localhost:8765")
                )
                .route("performance-assessment-management-service", r-> r
                        .method("GET", "POST")
                        .and()
                        .path(
                                "/academic-performance/mahasiswa/**",
                                "/academic-performance/mata-kuliah/**",
                                "/academic-performance/dosen/**"
                        )
                        .filters(f -> f.prefixPath("/performance-assessment-management-service"))
                        .uri("http://localhost:8765")
                )


                .build();
    }

}
