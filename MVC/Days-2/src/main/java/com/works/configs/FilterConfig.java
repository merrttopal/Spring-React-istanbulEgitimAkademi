package com.works.configs;


import com.works.props.Users;
import com.works.services.TinkEncDec;
import com.works.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

import  javax.servlet.*;
import javax.servlet.http.Cookie;
import  javax.servlet.http.HttpServletRequest;
import  javax.servlet.http.HttpServletResponse;
import  java.io.IOException;

@Configuration
@RequiredArgsConstructor
public class FilterConfig implements Filter {
    UserService userService = new UserService();
    final TinkEncDec tinkEncDec;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        String url = req.getRequestURI();
        String freeUrls[] = {"/","/userLogin"};
        boolean loginStatus = true;
        for (String item :freeUrls){
            if(url.equals(item)){
                loginStatus = false;
                break;
            }
        }
        if (loginStatus){
            // cookie control
            if(req.getCookies() != null){
                Cookie[] cookies = req.getCookies();
                for (Cookie cookie : cookies){
                    if (cookie.getName().equals("user")){
                        String plainText = tinkEncDec.decrypt(cookie.getValue());
                        int val = Integer.parseInt(plainText);
                        Users u = userService.showUser(val);

                        if( u != null)
                        req.getSession().setAttribute("user",u);
                        break;
                    }
                }
            }
            //session control
            boolean status = req.getSession().getAttribute("user")==null;
            if (status){
                res.sendRedirect("/");
            }else {
                Users user = (Users) req.getSession().getAttribute("user");
                System.out.println("this line user: "+user);
                req.setAttribute("user", user);
                chain.doFilter(req,res);
            }
        }else {
            chain.doFilter(req,res);
        }
    }
}