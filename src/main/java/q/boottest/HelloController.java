package q.boottest;

/**
 * @author Created by Kingsley.Zhang on 2018/6/13 下午5:00
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello,this is a springboot demo";
    }
}