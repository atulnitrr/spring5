package com.atul.spring5.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18SpanisGreetingService implements GreetingService {

    @Override
    public String sayGreetings() {
        return "Hola sanio";
    }
}
