package com.ab.spring.data.redis.springdataredisexample.queue;

public interface MessagePublisher {
	
	void publish(final String message);
}
