package crw.bishe.team;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableCaching
@EnableAspectJAutoProxy
@MapperScan("crw.bishe.team.mapper")
public class TeamApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeamApplication.class, args);
    }

}
