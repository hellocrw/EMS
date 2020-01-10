package crw.bishe.team.service;

import crw.bishe.team.entity.UnitInfo;
import crw.bishe.team.mapper.UnitInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2020/1/10 0010
 * @Time 21:57
 */
@Service
public class UnitInfoServiceImpl implements UnitInfoService {
    @Autowired
    private UnitInfoMapper unitInfoMapper;

    /**
     * 增加单位信息
     * @param unitInfo
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int persist(UnitInfo unitInfo) {
        return unitInfoMapper.insert(unitInfo);
    }

    /**
     * 根据ID删除单位信息
     * @param id
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public int delete(Long id) {
        return unitInfoMapper.deleteByPrimaryKey(id);
    }

    /**
     * 更新单位信息
     * @param unitInfo
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public int update(UnitInfo unitInfo) {
        return unitInfoMapper.updateByPrimaryKey(unitInfo);
    }

    /**
     * 根据ID查找单位信息
     * @param id
     * @return
     */
    @Override
    public UnitInfo findById(Long id) {
        return unitInfoMapper.selectByPrimaryKey(id);
    }

    /**
     * 按页查找单位信息
     * @param pageNo 页数
     * @param PageSize 页大小
     * @return
     */
    @Override
    public List<UnitInfo> findByPage(int pageNo, int PageSize) {
        return null;
    }

    /**
     * 查找所有单位信息
     * @return
     */
    @Override
    public List<UnitInfo> findAll() {
        return unitInfoMapper.selectAll();
    }
}
