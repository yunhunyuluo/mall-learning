/*
 * Copyright 2015-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.linsh.mall.tiny.simple;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @description 简单模式消息队列配置
 */
@Configuration
public class SimpleRabbitConfig {

	@Bean
	public Queue hello() {
		return new Queue("simple.hello");
	}

	@Bean
	public SimpleSender simpleSender(){
		return new SimpleSender();
	}

	@Bean
	public SimpleReceiver simpleReceiver(){
		return new SimpleReceiver();
	}

}
