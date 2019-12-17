package crw.bishe.teamup01.service.impl;

import crw.bishe.teamup01.mapper.HelloMapper;
import crw.bishe.teamup01.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloServiceImpl implements HelloService {
    @Autowired
    private HelloMapper helloMapper;

    @Override
    public void sayHello() {

    }
}
