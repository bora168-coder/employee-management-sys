package konkhmer168.api.restaurantmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String Home(){
        return "ehllofhksflds fsdkjfds";
    }
}
