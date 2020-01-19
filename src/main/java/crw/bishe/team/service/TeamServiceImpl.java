package crw.bishe.team.service;

import crw.bishe.team.dto.TeamDto;
import crw.bishe.team.dtoEntityMapping.TeamMapping;
import crw.bishe.team.entity.Team;
import crw.bishe.team.mapper.TeamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2020/1/19 0019
 * @Time 15:03
 */
@Service
public class TeamServiceImpl implements TeamService {

    private final TeamMapping teamMapping;
    private final TeamMapper teamMapper;

    @Autowired
    public TeamServiceImpl(TeamMapper teamMapper, TeamMapping teamMapping){
        this.teamMapper = teamMapper;
        this.teamMapping = teamMapping;
    }
    @Override
    public int create(TeamDto teamDto) {
        if(teamDto == null){
            return 0;
        }
        return teamMapper.insert(teamMapping.toEntity(teamDto));
    }

    @Override
    public int delete(String id) {
        Long key = Long.parseLong(id);
        return teamMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int update(TeamDto teamDto, String id) {
        if(teamDto == null){
            return 0;
        }
        Long key = Long.parseLong(id);
        if(teamMapper.selectByPrimaryKey(key) == null){
            return 0;
        }
        return teamMapper.updateByPrimaryKey(teamMapping.toEntity(teamDto));
    }

    @Override
    public List<TeamDto> findAll() {
        List<Team> teams = teamMapper.selectAll();
        List<TeamDto> teamDtos = new ArrayList<>();
        teams.forEach(team -> teamDtos.add(teamMapping.toDto(team)));
        return teamDtos;
    }
}
