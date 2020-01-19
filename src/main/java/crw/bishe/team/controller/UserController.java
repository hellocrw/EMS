package crw.bishe.team.controller;

import crw.bishe.team.dto.UserDto;
import crw.bishe.team.service.UserService;
import crw.bishe.team.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description Description 用户管理
 * @Author crw
 * @Date Created in 2020/1/19 0019
 * @Time 13:58
 */
@Api(tags = {"用户信息管理"})
@RequestMapping("/api/user")
@RestController
@Log4j2
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @ApiOperation(value = "查找所有用户信息")
    @GetMapping("/All")
    public ResponseEntity<Result> findAll(){
        try{
            List<UserDto> userDtos = userService.findAll();
            return new ResponseEntity<>(new Result(200,"处理成功",userDtos), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @ApiOperation(value = "增加用户信息")
    @PostMapping("")
    public ResponseEntity<Result> create(
            @ApiParam(value = "用户信息") @RequestBody @Validated UserDto userDto){
        try {
            int res = userService.create(userDto);
            if (res > 0) {
                return new ResponseEntity(new Result<>(200, "处理成功"), HttpStatus.OK);
            } else {
                return new ResponseEntity(new Result<>("处理失败"), HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }catch(Exception e){
            log.info(e.getMessage());
            return new ResponseEntity(new Result<>("处理失败"), HttpStatus.BAD_REQUEST);
        }
    }

    @ApiOperation(value = "修改用户信息")
    @PutMapping(value = "/{id}")
    public ResponseEntity<Result> update(@ApiParam(value = "用户ID") @PathVariable(name = "id") String id,
                                         @ApiParam(value = "用户信息", required = true) @RequestBody @Validated UserDto userDto){
        if(id == null ){
            return new ResponseEntity<>(new Result("更新数据不正确"), HttpStatus.METHOD_NOT_ALLOWED);
        }
        try{
            int res =userService.update(userDto,id);
            if(res <= 0){
                return new ResponseEntity<>(new Result("错误"), HttpStatus.BAD_REQUEST);
            }
        }catch (Exception e){
            log.info("用户信息更新失败："+ e.toString());
            return new ResponseEntity<>(new Result("错误"), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(new Result(200,"处理成功"),HttpStatus.OK);
    }

    @ApiOperation(value = "删除用户信息")
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Result> delete(
            @ApiParam(value = "用户信息ID") @PathVariable(name = "id") String id){
        try{
            userService.delete(id);
        }catch (Exception e){
            log.info("用户信息删除失败:" + e.toString());
        }
        return new ResponseEntity(new Result<>(200,"处理成功"),HttpStatus.OK);
    }
}
