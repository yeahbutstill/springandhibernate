package com.yeahbutstill.alloffshitfuckingdemo.mvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{HibernateConf.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}






