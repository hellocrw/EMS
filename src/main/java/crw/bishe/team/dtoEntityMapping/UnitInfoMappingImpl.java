package crw.bishe.team.dtoEntityMapping;

import crw.bishe.team.dto.UnitInfoDto;
import crw.bishe.team.entity.UnitInfo;

public class UnitInfoMappingImpl implements UnitInfoMapping {
    @Override
    public UnitInfoDto toDto(UnitInfo unitInfo) {
        UnitInfoDto unitInfoDto = new UnitInfoDto();
        unitInfoDto.setId(String.valueOf(unitInfo.getId()));
        unitInfoDto.setUnitType(unitInfo.getUnitType());
        unitInfoDto.setUnitName(unitInfo.getUnitName());
        unitInfoDto.setUnifieSocialCreditCode(String.valueOf(unitInfo.getUnifieSocialCreditCode()));
        unitInfoDto.setIndustryUnit(unitInfo.getIndustryUnit());
        unitInfoDto.setUnitArea(unitInfo.getUnitArea());
        unitInfoDto.setUnitAddress(unitInfo.getUnitAddress());
        unitInfoDto.setUnitContactor(unitInfo.getUnitContactor());
        unitInfoDto.setUnitTel(unitInfo.getUnitTel());
        unitInfoDto.setUnitEmail(unitInfo.getUnitEmail());
        unitInfoDto.setUnitPostcode(String.valueOf(unitInfo.getUnitPostcode()));
        return unitInfoDto;
    }

    @Override
    public UnitInfo toEntity(UnitInfoDto unitInfoDto) {
        UnitInfo unitInfo = new UnitInfo();
        unitInfo.setId(Integer.parseInt(unitInfoDto.getId()));
        unitInfo.setUnitType(unitInfoDto.getUnitType());
        unitInfo.setUnitName(unitInfoDto.getUnitName());
        unitInfo.setUnifieSocialCreditCode(Integer.parseInt(unitInfoDto.getUnifieSocialCreditCode()));
        unitInfo.setIndustryUnit(unitInfoDto.getIndustryUnit());
        unitInfo.setUnitArea(unitInfoDto.getUnitArea());
        unitInfo.setUnitAddress(unitInfoDto.getUnitAddress());
        unitInfo.setUnitContactor(unitInfoDto.getUnitContactor());
        unitInfo.setUnitTel(unitInfoDto.getUnitTel());
        unitInfo.setUnitEmail(unitInfoDto.getUnitEmail());
        unitInfo.setUnitPostcode(Integer.parseInt(unitInfoDto.getUnitPostcode()));
        return unitInfo;
    }
}
