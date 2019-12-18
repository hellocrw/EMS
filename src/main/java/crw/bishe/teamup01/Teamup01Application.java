package crw.bishe.teamup01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("crw.bishe.teamup01.mapper")
public class Teamup01Application {

    public static void main(String[] args) {
        SpringApplication.run(Teamup01Application.class, args);
    }

}
