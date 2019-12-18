package crw.bishe.teamup01.controller;

import crw.bishe.teamup01.entity.ClassInfo;
import crw.bishe.teamup01.service.ClassInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClassInfoController {
    @Autowired
    private ClassInfoService classInfoService;

    @GetMapping(name = "/")
    @ResponseBody
    public List<ClassInfo> getClassInfo(){
        System.out.println("getClassInfo");
        return classInfoService.getClassInfo();
    }
}
