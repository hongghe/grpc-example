package com.hongghe.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * 启动文件
 *
 * @author hongghe 03/08/2018
 */
@SpringBootApplication
public class ServerApplication {

	@Bean
	public ServerInitializer serverInitializer() {
		return new ServerInitializer();
	}

	@Bean
	public ServerProperties serverProperties() {
		return new ServerProperties();
	}

	@Bean
	public ServerWebConfig serverWebConfig() {
		return new ServerWebConfig();
	}

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}
}
