package crw.bishe.team.controller;

import crw.bishe.team.entity.UserInfo;
import crw.bishe.team.mapper.UserInfoMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description 用户基本信息
 * @Author crw
 * @Date Created in 2020/1/4 0004
 * @Time 19:10
 */
@RestController
@ResponseBody
@RequestMapping(value = "/user-info")
public class UserController {

    @Autowired
    UserInfoMapper userInfoMapper;

    @ApiOperation(value = "查询所有用户基本信息", notes = "查询所有用户基本信息")
    @GetMapping(value = "users")
    public List<UserInfo> addUser(){
        return userInfoMapper.selectAll();
    }


}
