package web;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")   // /hello로 요청이 오면 hello를 반환하는 메소드
    public String hello(){
        return "hello";
    }
}
