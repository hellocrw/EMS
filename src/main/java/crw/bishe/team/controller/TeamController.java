package crw.bishe.team.controller;

import crw.bishe.team.dto.TeamDto;
import crw.bishe.team.service.TeamService;
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
 * @Description Description 团队管理
 * @Author crw
 * @Date Created in 2020/1/19 0019
 * @Time 15:13
 */
@Api(tags = {"团队管理"})
@RequestMapping("/api/team")
@RestController
@Log4j2
public class TeamController {

    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService){
        this.teamService = teamService;
    }

    @ApiOperation(value = "查找所有团队信息")
    @GetMapping("")
    public ResponseEntity<Result> fillAll(){
        try{
            List<TeamDto> teamDtos = teamService.findAll();
            return new ResponseEntity<>(new Result(200, "处理成功", teamDtos), HttpStatus.OK);
        }catch (Exception e){
            log.info(e.toString());
            return new ResponseEntity<>(new Result("处理失败"), HttpStatus.BAD_REQUEST);
        }
    }

    @ApiOperation(value = "新增团队信息")
    @PostMapping("")
    public ResponseEntity<Result> create(@ApiParam(value = "团队信息") @RequestBody @Validated TeamDto teamDto){
        try{
            int res = teamService.create(teamDto);
            if(res > 0){
                return new ResponseEntity<>(new Result(200, "处理成功"), HttpStatus.OK);
            }else{
                return new ResponseEntity<>(new Result("处理失败"), HttpStatus.BAD_REQUEST);
            }
        }catch (Exception e){
            log.info(e.toString());
            return new ResponseEntity<>(new Result("处理失败"), HttpStatus.BAD_REQUEST);
        }
    }

    @ApiOperation(value = "修改团队信息")
    @PutMapping("/{id}")
    public ResponseEntity<Result> update(@ApiParam(value = "团队ID") @PathVariable(name = "id") String id ,
                                         @ApiParam(value = "团队信息") @RequestBody @Validated TeamDto teamDto){
        try{
            int res = teamService.update(teamDto, id);
            if(res > 0){
                return new ResponseEntity<>(new Result(200, "处理成功"), HttpStatus.OK);
            }else{
                return new ResponseEntity<>(new Result("处理失败"), HttpStatus.BAD_REQUEST);
            }
        }catch (Exception e){
            log.info(e.toString());
            return new ResponseEntity<>(new Result("处理失败"),HttpStatus.BAD_REQUEST);
        }
    }

    @ApiOperation(value = "删除团队信息")
    @DeleteMapping("/{id}")
    public ResponseEntity<Result> delete(@ApiParam(value = "团队ID") @PathVariable(name = "id") String id){
        try{
            int res = teamService.delete(id);
            if(res > 0){
                return new ResponseEntity<>(new Result(200, "处理成功"), HttpStatus.OK);
            }else{
                return new ResponseEntity<>(new Result("处理失败"), HttpStatus.BAD_REQUEST);
            }
        }catch (Exception e){
            return new ResponseEntity<>(new Result("处理失败"),HttpStatus.BAD_REQUEST);
        }
    }

}
