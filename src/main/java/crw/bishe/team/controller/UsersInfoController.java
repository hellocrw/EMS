package crw.bishe.team.controller;

import crw.bishe.team.entity.UsersInfo;
import crw.bishe.team.service.UsersInfoService;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping(value = "/users")
public class UsersInfoController {

    @Autowired
    private UsersInfoService usersInfoService;

    @ApiOperation(value = "获取所有用户信息", notes = "获取所有用户信息")
    @GetMapping(value = "/all")
    public List<UsersInfo> getUsers(){
        return usersInfoService.getUsers();
    }

    @ApiOperation(value = "增加用户", notes = "增加用户")
    @PostMapping("/insert")
    public int insertUser( @Param("user") UsersInfo userInfo){
        return usersInfoService.insertUser(userInfo);
    }

    @ApiOperation(value = "用户登录功能", notes = "用户登录")
    @PostMapping("login")
    public ResponseEntity<String> doLogin(@RequestParam("userName")  String userName,
                                          @RequestParam("password") String password){
        if(usersInfoService.doLogin(userName, password) > 0){
            return new ResponseEntity<>( "登录成功", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("登录失败", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = "/delete/{id}")
    public String deleteById(@RequestParam("id") int userId){
        if (usersInfoService.delectById(userId) > 0 ){
            return "删除成功";
        }else {
            return "找不到id对应的数据";
        }
    }

}