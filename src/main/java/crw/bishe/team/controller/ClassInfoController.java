package crw.bishe.team.controller;

import crw.bishe.team.entity.ClassInfo;
import crw.bishe.team.service.ClassInfoService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/class")
@Log4j2
public class ClassInfoController {
    @Autowired
    private ClassInfoService classInfoService;

    @ApiOperation(value = "获取班级所有人信息", notes = "获取班级所有人信息")
    @GetMapping(value = "/all")
    @ResponseBody
    public List<ClassInfo> getClassInfo(){
        log.info("查询班级所有人的信息");
        return classInfoService.getClassInfo();
    }
}
