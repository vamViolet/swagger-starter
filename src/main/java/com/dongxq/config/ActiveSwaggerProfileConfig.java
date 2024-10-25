package com.dongxq.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author dongxiaoqi
 * @date 2024/10/25
 */
@Configuration
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ActiveSwaggerProfileConfig implements EnvironmentPostProcessor {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        environment.addActiveProfile("swagger");
    }
}
