package com.configs;


import com.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    final PasswordEncoder passwordEncoder;
    final UserService userService;

/*
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder);
    }


     @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
        .httpBasic()
        .and()
//        .authorizeHttpRequests()
//       .antMatchers("/product/getPage").hasAnyRole("USER","ADMİN")
//       .antMatchers("/").hasRole("customer")
//        .and()///
                .csrf().disable().formLogin().disable();

    }*/

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user")
                .password(passwordEncoder.encode("user1Pass"))
                .authorities("ROLE_USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/login").authenticated()
                .and().authorizeRequests ()
                .antMatchers ("/user/register").permitAll()//access ("hasRole ('ROLE_USER') or hasRole ('ROLE_ADMIN')")
                .antMatchers ("/").access ("hasRole ('ROLE_USER')")
                .antMatchers ("/adminPage").access ("hasRole ('ROLE_ADMIN')");


    }

}
