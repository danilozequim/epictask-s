package br.com.fiap.epictaskapi.service;

import org.springframework.security.core.Authentication;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

public class TokenService {

    public boolean validate(String token) {

        try{
            JWT.require(Algorithm.HMAC512("secret")).build().verify(token);
            return true;
        }catch(Exception e){
            return false;
        }

    }

    public Authentication getAuthenticationToken(String token) {
        Authentication authentication = 
                new UsernamePasswordAuthenticationToken(principal, credentials);
        return null;
    }
    
}
