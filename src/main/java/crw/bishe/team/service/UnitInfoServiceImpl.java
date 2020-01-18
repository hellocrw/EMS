package crw.bishe.team.service;

import crw.bishe.team.dto.UnitInfoDto;
import crw.bishe.team.dtoEntityMapping.UnitInfoMapping;
import crw.bishe.team.entity.UnitInfo;
import crw.bishe.team.mapper.UnitInfoMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2020/1/10 0010
 * @Time 21:57
 */
@Service
@Log4j2
public class UnitInfoServiceImpl implements UnitInfoService {

    private final UnitInfoMapper unitInfoMapper;
    private final UnitInfoMapping unitInfoMapping;

    @Autowired
    public UnitInfoServiceImpl(UnitInfoMapper unitInfoMapper, UnitInfoMapping unitInfoMapping){
        this.unitInfoMapper = unitInfoMapper;
        this.unitInfoMapping = unitInfoMapping;
    }
    /**
     * 增加单位信息
     * @param unitInfoDto
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int persist(UnitInfoDto unitInfoDto) {
        UnitInfo unitInfo = unitInfoMapping.toEntity(unitInfoDto);
        return unitInfoMapper.insert(unitInfo);
    }

    /**
     * 根据ID删除单位信息
     * @param id
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public int delete(String id) {
        if(id == null){
            return 0;
        }
        Long key = Long.parseLong(id);
        return unitInfoMapper.deleteByPrimaryKey(key);
    }

    /**
     * 更新单位信息
     * @param unitInfoDto
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public int update(UnitInfoDto unitInfoDto, String id) {
        if(id == null){
            return 0;
        }
        Long key = Long.parseLong(id);
        if(unitInfoMapper.selectByPrimaryKey(key) == null){
            return 0;
        }
        UnitInfo unitInfo = unitInfoMapping.toEntity(unitInfoDto);
        return unitInfoMapper.updateByPrimaryKey(unitInfo);
    }

    /**
     * 查找所有单位信息
     * @return
     */
    @Override
    public List<UnitInfoDto> findAll() {
        List<UnitInfo> unitInfos = unitInfoMapper.selectAll();
        List<UnitInfoDto> unitInfoDtos = new ArrayList<>();
        unitInfos.forEach( unitInfo -> {
            UnitInfoDto unitInfoDto = unitInfoMapping.toDto(unitInfo);
            unitInfoDtos.add(unitInfoDto);
        });
        return unitInfoDtos;
    }
}
