package br.com.robsondejesus.todolist.filter;

import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class FilterTaskAuth extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        // Pega a aunteticação (ususario e senha)
        var authorization = request.getHeader("Authorization");
        System.out.println("Authorization " + authorization);

        authorization.substring("Basic".length()).trim();

        // Validar o usuario
        // valida a senha

        filterChain.doFilter(request, response);
    }

}
