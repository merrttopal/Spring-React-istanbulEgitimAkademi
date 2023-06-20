package com.restJpa.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

@Configuration

public class JpaConfig implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        String mail = "mert@mail.com";
        Optional<String> optional = Optional.of(mail);
        return optional;
    }
}
