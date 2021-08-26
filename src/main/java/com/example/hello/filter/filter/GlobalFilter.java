package com.example.hello.filter.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@Slf4j
@Component
public class GlobalFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        ContentCachingRequestWrapper servletRequest = new ContentCachingRequestWrapper((HttpServletRequest) request);
        ContentCachingResponseWrapper servletResponse = new ContentCachingResponseWrapper((HttpServletResponse) response);

        // 전처리
        
        chain.doFilter(servletRequest, servletResponse);

        String url = servletRequest.getRequestURI();
        
        // 후처리

        String reqContent = new String(servletRequest.getContentAsByteArray());
        String resContent = new String(servletResponse.getContentAsByteArray());
        int httpStatus = servletResponse.getStatus();
    }
}
