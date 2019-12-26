package crw.bishe.team.controller;

import crw.bishe.team.mapper.ProInfoMapper;
import crw.bishe.team.mapper.TeamInfoMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description 搜索功能
 * @Author crw
 * @Date Created in 2019/12/26 0026
 * @Time 17:52
 */
@RestController
@ResponseBody
@RequestMapping(value = "search")
public class SearchController {
    @Autowired
    private TeamInfoMapper teamInfoMapper;

    @Autowired
    private ProInfoMapper proInfoMapper;

    @ApiOperation(value = "搜索功能", notes = "搜索功能")
    @GetMapping(value = "search")
    public List<Object> search(){
        return null;
    }


}
