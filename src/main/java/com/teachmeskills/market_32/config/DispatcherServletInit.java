package com.teachmeskills.market_32.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    //метод возвращает массив классов конфигурации для корневого контекста
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }
    //метод возвращает массив классов конфигурации для контекста DispatcherServlet
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AppConfig.class};
    }
    //метод возвращает массив строк, на которые нужно отвечать
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
