package crw.bishe.team.service;

import crw.bishe.team.dto.ClassInfoDto;
import crw.bishe.team.dtoEntityMapping.ClassInfoMapping;
import crw.bishe.team.entity.ClassInfo;
import crw.bishe.team.mapper.ClassInfoMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @description Description
 * @Author crw
 * @create 2020/1/18
 * @Time 14:22
 **/
@Service
@Log4j2
public class ClassInfoServiceImpl implements ClassInfoService {

    private final ClassInfoMapper classInfoMapper;
    private final ClassInfoMapping classInfoMapping;

    @Autowired
    public ClassInfoServiceImpl(ClassInfoMapper classInfoMapper, ClassInfoMapping classInfoMapping){
        this.classInfoMapper = classInfoMapper;
        this.classInfoMapping = classInfoMapping;

    }

    @Override
    public int persist(ClassInfoDto classInfoDto) {
        if(classInfoDto == null){
            return 0;
        }
        ClassInfo classInfo = classInfoMapping.toEntity(classInfoDto);
        return classInfoMapper.insert(classInfo);
    }

    @Override
    public int delete(String id) {
        log.info(id);
        int key = Integer.parseInt(id);
        return classInfoMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int update(ClassInfoDto classInfoDto, String id) {
        if(id == null){
            return 0;
        }
        int key = Integer.parseInt(id);
        if(classInfoMapper.selectByPrimaryKey(key) != null){
            ClassInfo classInfo = classInfoMapping.toEntity(classInfoDto);
            return classInfoMapper.updateByPrimaryKey(classInfo);
        }
        return 0;
    }

    @Override
    public List<ClassInfoDto> findAll() {
        List<ClassInfo> classInfos = classInfoMapper.selectAll();
        List<ClassInfoDto> classInfoDtos = new ArrayList<>();
        classInfos.forEach(classInfo -> {
            ClassInfoDto classInfoDto = classInfoMapping.toDto(classInfo);
            classInfoDtos.add(classInfoDto);
        });
        return classInfoDtos;
    }
}
