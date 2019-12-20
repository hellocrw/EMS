package crw.bishe.team.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2019/12/20 0020
 * @Time 14:00
 */
@RestController
@ResponseBody
public class TestController {
    @GetMapping("/")
    public String demo(){
        return "localhost:8080-->test";
    }
}
