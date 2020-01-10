package crw.bishe.team.service;

import crw.bishe.team.entity.UserInfo;
import crw.bishe.team.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2020/1/10 0010
 * @Time 23:35
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int persist(UserInfo userInfo) {
        return userInfoMapper.insert(userInfo);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(Long id) {
        return userInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int update(UserInfo userInfo, Long id) {
        return userInfoMapper.updateByExample(userInfo, id);
    }

    @Override
    public UserInfo findById(Long id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UserInfo> findByPage(int pageNo, int PageSize) {
        return null;
    }

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }
}
