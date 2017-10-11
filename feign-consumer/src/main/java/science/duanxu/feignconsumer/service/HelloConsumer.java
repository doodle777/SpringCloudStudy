package science.duanxu.feignconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import science.duanxu.feignconsumer.dao.User;

@RestController
public class HelloConsumer {
    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "feign-hello", method = RequestMethod.GET)
    public String helloConsumer() {
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello()).append("\r\n");
        sb.append(helloService.hello("Duan")).append("\r\n");
        sb.append(helloService.hello("Duan", 24)).append("\r\n");
        sb.append(helloService.hello(new User("Xu", 24))).append("\r\n");

        return sb.toString();
    }
}
