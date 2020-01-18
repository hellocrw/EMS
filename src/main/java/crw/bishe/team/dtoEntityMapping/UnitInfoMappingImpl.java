package crw.bishe.team.dtoEntityMapping;

import crw.bishe.team.dto.UnitInfoDto;
import crw.bishe.team.entity.UnitInfo;
import org.springframework.stereotype.Component;

@Component("unitInfoMapping")
public class UnitInfoMappingImpl implements UnitInfoMapping {
    @Override
    public UnitInfoDto toDto(UnitInfo unitInfo) {
        if(unitInfo == null) {
            return null;
        }
        UnitInfoDto unitInfoDto = new UnitInfoDto();
        if(unitInfo.getId() != null){
        unitInfoDto.setId(String.valueOf(unitInfo.getId()));
        }
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
        if(unitInfoDto == null){
            return null;
        }
        UnitInfo unitInfo = new UnitInfo();
        if(unitInfoDto.getId() == null || unitInfoDto.getId() == ""){
        unitInfo.setId(null);
        }else{
            unitInfo.setId(Integer.parseInt(unitInfoDto.getId()));
        }
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
