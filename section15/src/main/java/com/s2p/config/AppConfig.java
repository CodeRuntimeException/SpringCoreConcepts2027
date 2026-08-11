package com.s2p.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
     basePackages = {"com.s2p.beans"}
)
public class AppConfig
{

}
