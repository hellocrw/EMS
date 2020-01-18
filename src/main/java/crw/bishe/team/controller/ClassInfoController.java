package crw.bishe.team.controller;

import crw.bishe.team.dto.ClassInfoDto;
import crw.bishe.team.service.ClassInfoService;
import crw.bishe.team.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @description Description
 * @Author crw
 * @create 2020/1/18
 * @Time 14:23
 **/
@Api(tags = {"班级管理"})
@RequestMapping(value = "/api/class")
@RestController
@Log4j2
public class ClassInfoController {

    private ClassInfoService classInfoService;

    @Autowired
    public ClassInfoController(ClassInfoService classInfoService){
        this.classInfoService = classInfoService;
    }

    @ApiOperation(value = "查找所有班级信息")
    @GetMapping("/all")
    public ResponseEntity<Result> findAll(){
        List<ClassInfoDto> classInfoDtos = classInfoService.findAll();
        return new ResponseEntity<>(new Result(200, "处理成功", classInfoDtos), HttpStatus.OK);
    }

    @ApiOperation(value = "增加班级信息")
    @PostMapping("")
    public ResponseEntity<Result> create(@ApiParam(value = "班级信息") @RequestBody @Valid ClassInfoDto classInfoDto){
        int res = classInfoService.persist(classInfoDto);
        if(res > 0){
            return new ResponseEntity<>(new Result(200, "处理成功"), HttpStatus.OK);
        }
        return new ResponseEntity<>(new Result("处理失败"), HttpStatus.BAD_REQUEST);
    }

    @ApiOperation(value = "修改班级信息")
    @PutMapping("/{id}")
    public ResponseEntity<Result> update(@ApiParam(value = "班级ID") @PathVariable(name = "id") String id,
                                         @ApiParam(value = "班级信息") @RequestBody @Valid ClassInfoDto classInfoDto){
        int res = classInfoService.update(classInfoDto, id);
        if(res >0 ){
            return new ResponseEntity<>(new Result(200, "处理成功"), HttpStatus.OK);
        }
        return new ResponseEntity<>(new Result("处理失败"), HttpStatus.BAD_REQUEST);
    }

    @ApiOperation(value = "删除班级信息")
    @DeleteMapping("/{id}")
    public ResponseEntity<Result> delete(
            @ApiParam(value = "班级ID") @PathVariable(name = "id") String id){
        log.info(id);
        int res = classInfoService.delete(id);
        if(res > 0){
            return new ResponseEntity<>(new Result(200,"处理成功"), HttpStatus.OK);
        }
        return new ResponseEntity<>(new Result("处理失败"), HttpStatus.BAD_REQUEST);
    }
}
