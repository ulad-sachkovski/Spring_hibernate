package com.vsachkovsky.spring_project_v1.my_config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.vsachkovsky.spring_project_v1")
@EnableAspectJAutoProxy
public class MyConfig {
}
