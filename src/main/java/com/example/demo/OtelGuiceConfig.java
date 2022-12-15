package com.example.demo;

import com.example.demo.domain.BeanA;
import com.google.inject.Injector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.guice.annotation.EnableGuiceModules;
import org.springframework.guice.annotation.GuiceModule;

@Configuration
@EnableGuiceModules
@GuiceModule(excludeNames = {"bean"}) // , "otelAutoDispatcherFilter"
public class OtelGuiceConfig {

    @Autowired
    private Injector injector;

    @Bean(name = "bean")
    public BeanA beanA() {
        return injector.getInstance(BeanA.class);
    }
}
