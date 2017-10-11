package science.duanxu.eurekaclient.service;

import com.netflix.discovery.DiscoveryClient;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.*;
import science.duanxu.eurekaclient.dao.User;


@RestController
public class HelloController {
    private final Logger logger = Logger.getLogger(getClass());

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        return "hello world!";
    }

    @RequestMapping(value = "/helloParm", method = RequestMethod.GET)
    public String hello(@RequestParam("name") String name) {
        return "hello " + name;
    }

    @RequestMapping(value = "/helloHeader", method = RequestMethod.GET)
    public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        return new User(name, age);
    }

    @RequestMapping(value = "/helloBody", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello(@RequestBody User user) {
        return user.toString();
    }

}
