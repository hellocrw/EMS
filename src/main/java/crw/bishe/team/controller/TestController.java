package crw.bishe.team.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description Description 测试类
 * @Author crw
 * @Date Created in 2019/12/20 0020
 * @Time 14:00
 */
@RestController
@ResponseBody
public class TestController {
    @GetMapping("/")
    public String demo(){
        return "首页";
    }

    @GetMapping(value = "/out")
    public String logout(){
        return "退出成功";
    }

    @GetMapping(value = "/fail")
    public String fail(){
        return "失败";
    }
}
