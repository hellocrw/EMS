package crw.bishe.team.controller;

import crw.bishe.team.entity.ProInfo;
import crw.bishe.team.service.ProInfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description 项目管理
 * @Author crw
 * @Date Created in 2019/12/26 0026
 * @Time 17:57
 */
@RestController
@ResponseBody
@RequestMapping(value = "/pro")
public class ProInfoController {

    @Autowired
    private ProInfoService proInfoService;

    @ApiOperation(value = "查看所有项目信息", notes = "项目信息")
    @GetMapping(value = "/all")
    public List<ProInfo> select(){
        return proInfoService.select();
    }
    @ApiOperation(value = "根据id删除项目信息", notes = "根据id删除项目信息")
    @GetMapping(value = "/delete")
    public int delete(int id){
        return proInfoService.delete(id);
    }
    @ApiOperation(value = "修改项目信息", notes = "修改项目信息")
    @GetMapping(value = "/update")
    public int update(ProInfo proInfo){
        return proInfoService.update(proInfo);
    }
    @ApiOperation(value = "增加项目信息", notes = "增加项目信息")
    @GetMapping(value = "/insert")
    public int insert(ProInfo proInfo){
        return proInfoService.insert(proInfo);
    }

}
