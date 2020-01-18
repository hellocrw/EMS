package crw.bishe.team.config.init;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Description 实现CommandLineRunner接口实现项目初始化操作
 * @Author crw
 * @Date Created in 2019/12/24 0024
 * @Time 17:20
 */
@Log4j2
@Component
@Order(1)
public class MyInitConfig_CommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("实现CommandLineRunner接口，进行项目初始化操作");
    }
}
