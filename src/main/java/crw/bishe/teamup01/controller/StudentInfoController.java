package crw.bishe.teamup01.controller;

import crw.bishe.teamup01.entity.StudentInfo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentInfoController {

    @ApiOperation(value = "登录功能", notes = "登录功能")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "stuNo", dataType = "int", paramType = "query", value = "学号"),
                    @ApiImplicitParam(name = "stuName", dataType = "String", paramType = "query", value = "姓名"),
            }
    )
    @PostMapping(value = "/login")
    public StudentInfo doLogin(StudentInfo studentInfo) {
        return null;
    }
}
