package com.works.configs;

import com.works.entities.Customer;
import com.works.services.CustomerService;
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
    final CustomerService customerService;


    // sql > login, role
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customerService).passwordEncoder(passwordEncoder);
    }

        // security request > role > map
     @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
        .httpBasic()
        .and()
        .authorizeHttpRequests()
        .antMatchers("/product/**").hasRole("seller")
        .antMatchers("/note/**").hasRole("customer")
        .and()///
                .csrf().disable().formLogin().disable();//security disable




    }
}
