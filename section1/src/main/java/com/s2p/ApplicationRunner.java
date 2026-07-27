package com.s2p;

import com.s2p.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner
{
    public static void main(String[] args)
    {
        new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
