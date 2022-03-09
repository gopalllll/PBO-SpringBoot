package id.ac.uin.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestController;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("API")
public class IndexController {
    @GetMapping("Hello")
    public String Hello (){
        return "gopal lagi belajar springboot"
    }
}
