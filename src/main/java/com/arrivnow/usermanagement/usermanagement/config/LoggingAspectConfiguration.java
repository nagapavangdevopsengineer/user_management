package com.arrivnow.usermanagement.usermanagement.config;



import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

import com.arrivnow.usermanagement.usermanagement.aop.logging.LoggingAspect;

@Configuration
@EnableAspectJAutoProxy
public class LoggingAspectConfiguration {

    @Bean
    @Profile(EnvConstants.SPRING_PROFILE_DEVELOPMENT)
    public LoggingAspect loggingAspect(Environment env) {
        return new LoggingAspect(env);
    }
}
