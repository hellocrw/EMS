package crw.bishe.team.service.impl;

import crw.bishe.team.entity.TeamInfo;
import crw.bishe.team.mapper.TeamInfoMapper;
import crw.bishe.team.service.TeamInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2019/12/26 0026
 * @Time 17:40
 */
@Service
public class TeamInfoServiceImpl implements TeamInfoService {

    @Autowired
    private TeamInfoMapper teamInfoMapper;

    @Override
    public List<TeamInfo> select() {
        return teamInfoMapper.selectAll();
    }

    @Override
    public int delete(int id){
        return teamInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(TeamInfo teamInfo){
        return teamInfoMapper.updateByPrimaryKey(teamInfo);
    }

    @Override
    public int insert(TeamInfo teamInfo) {
        return teamInfoMapper.insert(teamInfo);
    }
}
