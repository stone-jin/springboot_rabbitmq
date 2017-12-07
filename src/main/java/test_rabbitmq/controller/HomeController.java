package test_rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test_rabbitmq.services.HelloSender1;

/**
 * Created by stone-jin on 2017/12/7.
 */
@RestController
@RequestMapping("/rabbit")
public class HomeController {
    @Autowired
    private HelloSender1 helloSender1;

    @RequestMapping("/add.do")
    public String test(){
        helloSender1.send();
        return "";
    }
}
