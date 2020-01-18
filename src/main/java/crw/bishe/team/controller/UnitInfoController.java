package crw.bishe.team.controller;

import crw.bishe.team.dto.UnitInfoDto;
import crw.bishe.team.dtoEntityMapping.UnitInfoMapping;
import crw.bishe.team.entity.UnitInfo;
import crw.bishe.team.service.UnitInfoService;
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
import java.util.UUID;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2020/1/10 0010
 * @Time 22:09
 */
@Api(tags = {"单位信息管理"})
@Log4j2
@RestController
@RequestMapping(value = "/api/unit")
public class UnitInfoController {

    private final UnitInfoService unitInfoService;

    @Autowired
    public UnitInfoController(UnitInfoService unitInfoService){
        this.unitInfoService = unitInfoService;
    }

    @ApiOperation(value = "查找所有单位信息")
    @GetMapping("/All")
    public ResponseEntity<Result> findAll(){
        try{
            List<UnitInfoDto> unitInfoDtos = unitInfoService.findAll();
            return new ResponseEntity<>(new Result(200,"处理成功",unitInfoDtos), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @ApiOperation(value = "增加单位信息")
    @PostMapping("")
    public ResponseEntity<Result> create(
            @ApiParam(value = "单位信息") @RequestBody @Validated UnitInfoDto unitInfoDto){
        try{
            int res = unitInfoService.persist(unitInfoDto);
            if (res > 0){
                return new ResponseEntity(new Result<>(200,"处理成功"), HttpStatus.OK);
            }
        }catch (Exception e){
            log.info(e.getMessage());
        }
        return new ResponseEntity(new Result<>( "处理失败"), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ApiOperation(value = "修改单位信息")
    @PutMapping(value = "/{id}")
    public ResponseEntity<Result> update(@ApiParam("单位信息ID") @PathVariable(name = "id") String id,
                                         @ApiParam("单位信息") @RequestBody @Validated UnitInfoDto unitInfoDto
    ){
        try{
            int res = unitInfoService.update(unitInfoDto, id);
            if(res > 0){
                return new ResponseEntity<>(new Result(200,"处理成功"),HttpStatus.OK);
            }else {
                return new ResponseEntity<>(new Result("找不到信息，无法更新"),HttpStatus.METHOD_NOT_ALLOWED);
            }
        }catch (Exception e){
            log.info("单位信息更新失败："+ e.toString());
            return new ResponseEntity<>(new Result("更新失败"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation(value = "删除单位信息")
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Result> delete(
            @ApiParam(value = "单位信息") @PathVariable(name = "id") String id){
        try{
            unitInfoService.delete(id);
        }catch (Exception e){
            log.info("单位信息删除失败:" + e.toString());
        }
        return new ResponseEntity(new Result<>(200,"处理成功"),HttpStatus.OK);
    }

}
