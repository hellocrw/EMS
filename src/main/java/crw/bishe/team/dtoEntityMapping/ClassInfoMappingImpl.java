package crw.bishe.team.dtoEntityMapping;

import crw.bishe.team.dto.ClassInfoDto;
import crw.bishe.team.entity.ClassInfo;
import org.springframework.stereotype.Component;

/**
 * @description Description
 * @Author crw
 * @create 2020/1/18
 * @Time 14:08
 **/
@Component("classInfoMapping")
public class ClassInfoMappingImpl implements ClassInfoMapping {
    @Override
    public ClassInfo toEntity(ClassInfoDto classInfoDto) {
        if(classInfoDto == null){
            return null;
        }
        ClassInfo classInfo = new ClassInfo();
        if(classInfoDto.getId() == "" || classInfoDto.getId() == null){
            classInfo.setId(null);
        }else{
            classInfo.setId(Integer.parseInt(classInfoDto.getId()));
        }
        classInfo.setClassNo(Integer.parseInt(classInfoDto.getClassNo()));
        classInfo.setClassName(classInfoDto.getClassName());
        classInfo.setProfessionNo(Integer.parseInt(classInfoDto.getProfessionNo()));
        classInfo.setProfessionName(classInfoDto.getProfessionName());
        classInfo.setClassNum(Integer.parseInt(classInfoDto.getClassNum()));
        classInfo.setEmployNum(Integer.parseInt(classInfoDto.getEmployNum()));
        classInfo.setNomitor(classInfoDto.getNomitor());
        classInfo.setMonitorTel(classInfoDto.getMonitorTel());
        return classInfo;
    }

    @Override
    public ClassInfoDto toDto(ClassInfo classInfo) {
        if(classInfo == null){
            return null;
        }
        ClassInfoDto classInfoDto = new ClassInfoDto();
        classInfoDto.setId(String.valueOf((classInfo.getId())));
        classInfoDto.setClassNo(String.valueOf((classInfo.getClassNo())));
        classInfoDto.setClassName(classInfo.getClassName());
        classInfoDto.setProfessionNo(String.valueOf((classInfo.getProfessionNo())));
        classInfoDto.setProfessionName(classInfo.getProfessionName());
        classInfoDto.setClassNum(String.valueOf((classInfo.getClassNum())));
        classInfoDto.setEmployNum(String.valueOf(classInfo.getEmployNum()));
        classInfoDto.setNomitor(classInfo.getNomitor());
        classInfoDto.setMonitorTel(classInfo.getMonitorTel());
        return classInfoDto;
    }
}
