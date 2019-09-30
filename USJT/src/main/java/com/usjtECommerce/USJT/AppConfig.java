package com.usjtECommerce.USJT;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.usjtECommerce.USJT.interceptor.LoginInterceptor;

@Configuration
public class AppConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/buy", "/sell", "/perfil")
				.excludePathPatterns("login", "/", "/fazerLogin");
	}

	public void loginInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/login","/fazerLogin").excludePathPatterns("/perfil","/buy", "/sell");
	}

}
