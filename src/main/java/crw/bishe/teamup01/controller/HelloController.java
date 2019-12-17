package crw.bishe.teamup01.controller;

import crw.bishe.teamup01.entity.ClassInfo;
import crw.bishe.teamup01.mapper.ClassInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private ClassInfoMapper classInfoMapper;

    @GetMapping({"/hello", "/"})
    public String sayHello() {
        return "hello";
    }
    @GetMapping(name = "/getClassInfo")
    public List<ClassInfo> getClassInfo() {
        return classInfoMapper.selectAll();
    }
}
