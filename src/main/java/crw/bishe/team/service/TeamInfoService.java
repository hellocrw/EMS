package crw.bishe.team.service;

import crw.bishe.team.entity.TeamInfo;

import java.util.List;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2019/12/26 0026
 * @Time 17:38
 */
public interface TeamInfoService {
    public List<TeamInfo> select();
    public int delete(int id);
    public int update(TeamInfo teamInfo);
    public int insert(TeamInfo teamInfo);

}
