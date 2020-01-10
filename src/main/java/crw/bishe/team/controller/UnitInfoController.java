package crw.bishe.team.controller;

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
    @Autowired
    private UnitInfoService unitInfoService;
    @ApiOperation(value = "增加单位信息")
    @PostMapping("")
    public ResponseEntity<Result> create(
            @ApiParam(value = "新增单位信息") @RequestBody @Validated UnitInfo unitInfo){
        try{
            int res = unitInfoService.persist(unitInfo);
            if (res > 0){
                return new ResponseEntity(new Result<>(200,"处理成功"), HttpStatus.OK);
            }
        }catch (Exception e){
            log.info(e.getMessage());
        }
        return new ResponseEntity(new Result<>( "处理失败"), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ApiOperation(value = "删除单位信息")
    @DeleteMapping(value = "")
    public ResponseEntity<Result> delete(
            @ApiParam(value = "删除单位信息") @RequestParam Long id){
        try{
            unitInfoService.delete(id);
        }catch (Exception e){
            log.info("单位信息删除失败:" + e.toString());
        }
        return new ResponseEntity(new Result<>(200,"处理成功"),HttpStatus.OK);
    }
    @ApiOperation(value = "修改单位信息")
    @PutMapping(value = "")
    public ResponseEntity<Result> update(@ApiParam("更新单位信息") @RequestParam UnitInfo unitInfo){
        try{
            unitInfoService.update(unitInfo);
        }catch (Exception e){
            log.info("单位信息更新失败："+ e.toString());
        }
        return new ResponseEntity<>(new Result(200,"处理成功"),HttpStatus.OK);
    }
    @ApiOperation(value = "查找所有单位信息")
    @GetMapping("/All")
    public ResponseEntity<Result> findAll(){
        try{
            List<UnitInfo> res = unitInfoService.findAll();
            return new ResponseEntity<>(new Result(200,"处理成功",res), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }
}