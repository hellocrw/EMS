package crw.bishe.team.config.init;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @Description 实现ApplicationRunner接口实现项目初始化操作
 * @Author crw
 * @Date Created in 2019/12/24 0024
 * @Time 17:16
 */
@Component
@Log4j2
public class MyInitConfig_ApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("实现ApplicationRunner接口，在项目启动完成之前初始化操作");
    }
}
