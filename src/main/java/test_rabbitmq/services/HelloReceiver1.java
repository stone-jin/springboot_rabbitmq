package test_rabbitmq.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by stone-jin on 2017/12/7.
 */
@Component
@RabbitListener(queues = "helloQueue")
@Slf4j
public class HelloReceiver1 {

    @RabbitHandler
    public void process(String hello) {
        log.info("Receiver1  : " + hello);
    }
}
