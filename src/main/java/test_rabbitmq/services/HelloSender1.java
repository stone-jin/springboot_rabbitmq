package test_rabbitmq.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by stone-jin on 2017/12/7.
 */
@Component
@Slf4j
public class HelloSender1 {

    @Autowired
    private AmqpTemplate rabbitTemplate;


    public void send(){
        String sendMsg = "hello1 " + new Date();
        log.info("Sender1 : " + sendMsg);
        this.rabbitTemplate.convertAndSend("helloQueue", sendMsg);
    }
}
