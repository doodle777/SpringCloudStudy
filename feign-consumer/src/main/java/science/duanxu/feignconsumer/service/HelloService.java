package science.duanxu.feignconsumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import science.duanxu.feignconsumer.dao.User;

@FeignClient("HELLO-SERVICE")
public interface HelloService {
    @RequestMapping("hello")
    String hello();

    @RequestMapping("helloParm")
    String hello(@RequestParam("name") String name);

    @RequestMapping("helloHeader")
    String hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping("helloBody")
    String hello(@RequestBody User user);
}
