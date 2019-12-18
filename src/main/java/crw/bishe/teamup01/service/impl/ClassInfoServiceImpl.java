package crw.bishe.teamup01.service.impl;

import crw.bishe.teamup01.entity.ClassInfo;
import crw.bishe.teamup01.mapper.ClassInfoMapper;
import crw.bishe.teamup01.service.ClassInfoService;
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
