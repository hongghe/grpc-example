package com.hongghe.client.service;

import com.hongghe.client.message.GreetingRequest;
import com.hongghe.client.message.GreetingResponse;

/**
 * @author: hongghe @date: 2019-01-22 16:43
 */
public interface GreetingService {

    GreetingResponse greeting(GreetingRequest request);
}
