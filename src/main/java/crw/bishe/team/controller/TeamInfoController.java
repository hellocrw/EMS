package crw.bishe.team.controller;

import crw.bishe.team.entity.TeamInfo;
import crw.bishe.team.service.TeamInfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description 团队管理
 * @Author crw
 * @Date Created in 2019/12/26 0026
 * @Time 17:41
 */
@RestController
@ResponseBody
@RequestMapping(value = "/team")
public class TeamInfoController {

    @Autowired
    private TeamInfoService teamInfoService;

    @ApiOperation(value = "查看所有团队信息", notes = "团队信息")
    @GetMapping(value = "/all")
    public List<TeamInfo> getTeams(){
        return teamInfoService.select();
    }
    @ApiOperation(value = "根据id删除团队信息", notes = "根据id删除团队信息")
    @GetMapping(value = "/delete")
    public int delete(int id){
        return teamInfoService.delete(id);
    }
    @ApiOperation(value = "修改团队信息", notes = "修改团队信息")
    @GetMapping(value = "/update")
    public int update(TeamInfo teamInfo){
        return teamInfoService.update(teamInfo);
    }
    @ApiOperation(value = "增加团队信息", notes = "增加团队信息")
    @GetMapping(value = "/insert")
    public int insert(TeamInfo teamInfo){
        return teamInfoService.insert(teamInfo);
    }
}
