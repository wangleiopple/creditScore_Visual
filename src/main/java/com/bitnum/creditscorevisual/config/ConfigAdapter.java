package com.bitnum.creditscorevisual.config;

import com.bitnum.creditscorevisual.Interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ConfigAdapter implements WebMvcConfigurer {

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("/index","/js/**","/css/**","/images/**");
//    }
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry){
////        registry.addViewController("/").setViewName("login");
//
//        registry.addViewController("/").setViewName("index");//默认访问页面
////        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);//最先执行过滤
//
//        //设置ViewController的优先级,将此处的优先级设为最高,当存在相同映射时依然优先执行
////        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
//    }

}
