package crw.bishe.team.service.impl;

import crw.bishe.team.entity.ProInfo;
import crw.bishe.team.mapper.ProInfoMapper;
import crw.bishe.team.service.ProInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2019/12/26 0026
 * @Time 18:19
 */
@Service
public class ProInfoServiceImpl implements ProInfoService {
    @Autowired
    private ProInfoMapper proInfoMapper;
    @Override
    public List<ProInfo> select() {
        return proInfoMapper.selectAll();
    }

    @Override
    public int delete(int id) {
        return proInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(ProInfo proInfo) {
        return proInfoMapper.updateByPrimaryKey(proInfo);
    }

    @Override
    public int insert(ProInfo proInfo) {
        return proInfoMapper.insert(proInfo);
    }
}
