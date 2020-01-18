package crw.bishe.team.config.init;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @Description 实现InitializingBean接口实现项目初始化操作
 * @Author crw
 * @Date Created in 2019/12/24 0024
 * @Time 17:35
 */
@Component
@Log4j2
public class MyInitConfig_InitializingBean implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("实现InitializingBean接口实现项目初始化操作");
    }
}
