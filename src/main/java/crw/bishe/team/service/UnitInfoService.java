package crw.bishe.team.service;

import crw.bishe.team.dto.UnitInfoDto;
import crw.bishe.team.entity.UnitInfo;

import java.util.List;

/**
 * @Description 单位信息
 * @Author crw
 * @Date Created in 2020/1/10 0010
 * @Time 21:49
 */
public interface UnitInfoService {
    /**
     * 增加单位信息
     */
    int persist(UnitInfoDto unitInfoDto);

    /**
     * 根据ID删除单位信息
     * @param id
     * @return
     */
    int delete(String id);

    /**
     * 修改单位信息
     * @param unitInfoDto
     * @return
     */
    int update(UnitInfoDto unitInfoDto, String id);

    /**
     * 查找所有单位信息
     * @return
     */
    List<UnitInfoDto> findAll();
}
