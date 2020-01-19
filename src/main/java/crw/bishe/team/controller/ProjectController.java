package crw.bishe.team.controller;

import crw.bishe.team.dto.ProjectDto;
import crw.bishe.team.entity.Project;
import crw.bishe.team.service.ProjectService;
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
 * @Description Description 项目管理
 * @Author crw
 * @Date Created in 2020/1/19 0019
 * @Time 17:21
 */
@Api(tags = {"项目管理"})
@RestController
@RequestMapping("/api/project")
@Log4j2
public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService){
        this.projectService = projectService;
    }

    @ApiOperation(value = "查找所有项目信息")
    @GetMapping("")
    public ResponseEntity<Result> fillAll(){
        try{
            List<ProjectDto> teamDtos = projectService.findAll();
            return new ResponseEntity<>(new Result(200, "处理成功", teamDtos), HttpStatus.OK);
        }catch (Exception e){
            log.info(e.toString());
            return new ResponseEntity<>(new Result("处理失败"), HttpStatus.BAD_REQUEST);
        }
    }

    @ApiOperation(value = "新增项目信息")
    @PostMapping("")
    public ResponseEntity<Result> create(@ApiParam(value = "项目信息") @RequestBody @Validated ProjectDto projectDto){
        try{
            int res = projectService.create(projectDto);
            if(res > 0){
                return new ResponseEntity<>(new Result(200, "处理成功"), HttpStatus.OK);
            }
        }catch (Exception e){
            log.info(e.toString());
            return new ResponseEntity<>(new Result("处理失败"), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(new Result("处理失败"), HttpStatus.BAD_REQUEST);
    }

    @ApiOperation(value = "修改项目信息")
    @PutMapping("/{id}")
    public ResponseEntity<Result> update(@ApiParam(value = "项目ID") @PathVariable(name = "id") String id ,
                                         @ApiParam(value = "项目信息") @RequestBody @Validated ProjectDto projectDto){
        try{
            int res = projectService.update(projectDto, id);
            if(res > 0){
                return new ResponseEntity<>(new Result(200, "处理成功"), HttpStatus.OK);
            }
        }catch (Exception e){
            log.info(e.toString());
            return new ResponseEntity<>(new Result("处理失败"),HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(new Result("处理失败"), HttpStatus.BAD_REQUEST);
    }

    @ApiOperation(value = "删除项目信息")
    @DeleteMapping("/{id}")
    public ResponseEntity<Result> delete(@ApiParam(value = "项目ID") @PathVariable(name = "id") String id){
        try{
            int res = projectService.delete(id);
            if(res > 0){
                return new ResponseEntity<>(new Result(200, "处理成功"), HttpStatus.OK);
            }
        }catch (Exception e){
            return new ResponseEntity<>(new Result("处理失败"),HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(new Result("处理失败"), HttpStatus.BAD_REQUEST);
    }

}
