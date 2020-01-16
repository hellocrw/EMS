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
    int delete(Long id);

    /**
     * 跟新单位信息
     * @param unitInfo
     * @return
     */
    int update(UnitInfo unitInfo, Long id);

    /**
     * 通过ID查找单位信息
     * @param id
     * @return
     */
    UnitInfo findById(Long id);

    /**
     * 分页查找单位信息
     * @param pageNo 页数
     * @param PageSize 页大小
     * @return
     */
    List<UnitInfo> findByPage(int pageNo, int PageSize);

    /**
     * 查找所有单位信息
     * @return
     */
    List<UnitInfo> findAll();
}
