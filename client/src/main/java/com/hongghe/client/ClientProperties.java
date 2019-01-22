package com.hongghe.client;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 项目的属性
 *
 * @author hongghe 03/08/2018
 */
@ConfigurationProperties(prefix = "client")
@Data
public class ClientProperties {
}
