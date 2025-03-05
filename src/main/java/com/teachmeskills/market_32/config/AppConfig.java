package com.teachmeskills.market_32.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//WebMvcConfigurer - для Interceptor -> addInterceptors(InterceptorRegistry registry)
@EnableWebMvc // включаем Interceptor
@ComponentScan("com.teachmeskills.market_32")
@Configuration
public class AppConfig implements WebMvcConfigurer {


    public HandlerInterceptor logInterceptor;

    //Подключаем сюда log-interceptor
    @Autowired
    public AppConfig(@Qualifier("log-interceptor") HandlerInterceptor logInterceptor) {
        this.logInterceptor = logInterceptor;
    }

    @Override //Добвавить Interceptor logInterceptor  по следеющему пути
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(logInterceptor).addPathPatterns("/**");
    }


    //Настройка ViewResolver(Интерфес) (InternalResourceViewResolver - реализация)
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

}
