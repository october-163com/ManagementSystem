package cn.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CommonController {

    @GetMapping("/hello")
    public  String Hello(){
        return "hello springboot";
    }
}
