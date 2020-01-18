package crw.bishe.team.service;


import crw.bishe.team.dto.ClassInfoDto;

import java.util.List;

/**
 * @description Description
 * @Author crw
 * @create 2020/1/18
 * @Time 14:19
 **/
public interface ClassInfoService {
    /**
     * 增加单位信息
     */
    int persist(ClassInfoDto classInfoDto);

    /**
     * 根据ID删除单位信息
     * @param id
     * @return
     */
    int delete(String id);

    /**
     * 修改单位信息
     * @param classInfoDto
     * @return
     */
    int update(ClassInfoDto classInfoDto, String id);

    /**
     * 查找所有单位信息
     * @return
     */
    List<ClassInfoDto> findAll();
}
