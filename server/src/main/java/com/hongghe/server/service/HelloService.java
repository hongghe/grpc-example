package com.hongghe.server.service;

import com.hongghe.server.message.HelloRequest;
import com.hongghe.server.message.HelloResponse;

/**
 * @author: hongghe @date: 2019-01-22 16:44
 */
public interface HelloService {

    HelloResponse hello(HelloRequest request);
}
