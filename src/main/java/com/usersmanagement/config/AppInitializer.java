package com.usersmanagement.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class[] configs = {AppConfig.class};

        return configs;
    }

    @Override
    protected String[] getServletMappings() {
        String[] mappings = {"/"};

        return mappings;
    }
}
