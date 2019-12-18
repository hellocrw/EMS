package crw.bishe.teamup01.controller;

import crw.bishe.teamup01.service.StudentInfoServe;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/student")
@RestController
public class StudentInfoController {

    @Autowired
    private StudentInfoServe studentInfoServe;

    @ApiOperation(value = "登录功能", notes = "登录功能")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "username", dataType = "String", paramType = "query", value = "用户名"),
                    @ApiImplicitParam(name = "password", dataType = "String", paramType = "query", value = "密码"),
            }
    )
    @PostMapping(value = "/login")
    public ResponseEntity<String> doLogin(@RequestParam("username") String username,
                                          @RequestParam("password") String password) {
        studentInfoServe.doLogin(username, password);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
