package com.sh.sparkle.config;

import com.sh.sparkle.common.MqConstants;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * ClassName : MqConfig<br>
 * Description : mq配置<br>
 * Company : rrtx
 *
 * @author : sj
 * @version : 1.0.0
 * @date : 2020/11/6
 **/
@Configuration
public class MqConfig {

    @Bean
    public Queue queue_1() {
        return new Queue(MqConstants.QUEUE_1);
    }

    @Bean
    public Queue queue_2() {
        return new Queue(MqConstants.QUEUE_2);
    }

    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange(MqConstants.EXCHANGE_1);
    }

    @Bean
    public Binding binding(Queue queue_1, TopicExchange topicExchange) {
        return BindingBuilder.bind(queue_1).to(topicExchange).with(MqConstants.ROUTING_1);
    }

}
