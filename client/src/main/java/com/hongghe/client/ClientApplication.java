package com.hongghe.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 启动文件
 *
 * @author hongghe 03/08/2018
 */
@EnableAsync
@EnableScheduling
@SpringBootApplication
public class ClientApplication {

	@Bean
	public ClientInitializer clientInitializer() {
		return new ClientInitializer();
	}

	@Bean
	public ClientProperties clientProperties() {
		return new ClientProperties();
	}

	@Bean
	public ClientWebConfig clientWebConfig() {
		return new ClientWebConfig();
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
}
