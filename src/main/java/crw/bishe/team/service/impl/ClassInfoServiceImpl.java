package crw.bishe.team.service.impl;

import crw.bishe.team.entity.ClassInfo;
import crw.bishe.team.mapper.ClassInfoMapper;
import crw.bishe.team.service.ClassInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassInfoServiceImpl implements ClassInfoService {
    @Autowired
    private ClassInfoMapper classInfoMapper;
    @Override
    public List<ClassInfo> getClassInfo() {
        return classInfoMapper.selectAll();
    }
}
