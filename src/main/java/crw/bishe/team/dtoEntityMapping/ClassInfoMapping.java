package crw.bishe.team.dtoEntityMapping;

import crw.bishe.team.dto.ClassInfoDto;
import crw.bishe.team.entity.ClassInfo;

/**
 * @description Description
 * @Author crw
 * @create 2020/1/18
 * @Time 14:05
 **/
public interface ClassInfoMapping {
    /**
     * 将班级实体Dto转为Entity
     * @param classInfoDto dto
     * @return entity
     */
    public ClassInfo toEntity(ClassInfoDto classInfoDto);

    /**
     * 将班级entity 转为 dto
     * @param classInfo entity
     * @return dto
     */
    public ClassInfoDto toDto(ClassInfo classInfo);
}
