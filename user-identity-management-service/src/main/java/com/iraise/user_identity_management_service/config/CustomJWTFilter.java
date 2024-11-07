//package com.iraise.user_identity_management_service.config;
//
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.ExpiredJwtException;
//import io.jsonwebtoken.Jwts;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//
//@Component
//public class CustomJWTFilter extends OncePerRequestFilter {
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        String requestUri = request.getRequestURI();
//        String key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAh9+YR2JqTpDORTGChJ0WR/PRKktPi0YhxHRjCj+qqFGEhTXEpPJVpJqdSJon2wLxHydlHHB+MM405HV4rliq2i2ZNQl+9UfCpjp0Dxwf9YtcS4+M/lERFXi1BmZuWxJcyY6gpFAJTQ0Z69cuyqzzZ58V1v3M3mZygY1BRucNScvYu0DsuAq52Sp9NF6Q5OiThA9CoI01pPJTjuWpA+Kdj0gGK9XOmbxTkPstVMzLvNqWCTRJ2okcpJXRg4aJYy+EZFsiLkt+5ENQydEJUsidzqIJq7c1WMnaNDTrivdaEo0DuS2NJGKbxjWS8UziQvVV6n9kzvBg0oSmecpyXfqEaQIDAQAB";
//        final String requestTokenHeader = request.getHeader("Authorization");
//        System.out.println(requestUri);
//        System.out.println(requestUri.startsWith("/user-identity-management/auth/login"));
//        // Jika request menuju ke /login, lewati filter
//        if (requestUri.startsWith("/user-identity-management/auth/login")) {
//            String username = null;
//            String jwtToken = null;
//            System.out.println(request.getHeader("Authorization"));
//
//            if (requestTokenHeader != null && requestTokenHeader.startsWith("Bearer ")) {
//                jwtToken = requestTokenHeader.substring(7);
//
//                try {
//                    Claims claims = Jwts.parser()
//
//                            .verifyWith(secretKey) // <----
//
//                            .build()
//                            .parseSignedClaims(jwsString);
//
//                    // Verifikasi apakah token sudah expired
//                    if (claims.getExpiration().before(new java.util.Date())) {
//                        throw new ExpiredJwtException(null, claims, "Token telah kedaluwarsa");
//                    }
//                } catch (ExpiredJwtException e) {
//                    System.out.println("Token telah kedaluwarsa");
//                    response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "JWT Token Expired");
//                    return;
//                } catch (Exception e) {
//                    System.out.println("JWT tidak valid");
//                    response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "JWT Token Invalid");
//                    return;
//                }
//            }
//
//            filterChain.doFilter(request, response);
//            return;
//        }
//
//        // Lanjutkan proses filter lainnya
//        filterChain.doFilter(request, response);
//    }
//
//    private String extractToken(HttpServletRequest request) {
//        String token = request.getHeader("Authorization");
//        if (token != null && token.startsWith("Bearer ")) {
//            return token.substring(7);
//        }
//
//        return null;
//    }
//
//}
