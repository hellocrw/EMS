package crw.bishe.team.service;

import crw.bishe.team.dto.TeamDto;

import java.util.List;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2020/1/19 0019
 * @Time 15:00
 */
public interface TeamService {
    /**
     * 增加团队信息
     * @param teamDto
     * @return
     */
    int create(TeamDto teamDto);

    /**
     * 根据ID删除团队信息
     * @param id
     * @return
     */
    int delete(String id);

    /**
     * 修改团队信息
     * @param teamDto
     * @return
     */
    int update(TeamDto teamDto, String id);


    /**
     * 查找所有团队信息
     * @return
     */
    List<TeamDto> findAll();
}
