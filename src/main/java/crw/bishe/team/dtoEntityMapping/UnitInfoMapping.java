package crw.bishe.team.dtoEntityMapping;

import crw.bishe.team.dto.UnitInfoDto;
import crw.bishe.team.entity.UnitInfo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

//@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UnitInfoMapping {

    /**
     * 将单位Entity转为DTO
     * @param unitInfo 单位实体
     * @return UnitInfoDto
     */
    UnitInfoDto toDto(UnitInfo unitInfo);

    /**
     * 将Dto转为Entity
     * @param unitInfoDto
     * @return UnitInfo
     */
    UnitInfo toEntity(UnitInfoDto unitInfoDto);
}
