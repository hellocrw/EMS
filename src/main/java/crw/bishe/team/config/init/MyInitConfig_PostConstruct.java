package crw.bishe.team.config.init;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Description 使用@PostConstruct注解实现项目启动的初始化工作
 * @Author crw
 * @Date Created in 2019/12/24 0024
 * @Time 17:40
 */
@Component
public class MyInitConfig_PostConstruct {
    @PostConstruct
    public void init(){
        System.out.println("使用@PostConstruct注解实现项目启动的初始化工作");
    }
}
