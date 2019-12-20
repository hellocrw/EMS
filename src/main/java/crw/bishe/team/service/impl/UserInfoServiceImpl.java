package crw.bishe.team.service.impl;

import crw.bishe.team.entity.UserInfo;
import crw.bishe.team.mapper.UserInfoMapper;
import crw.bishe.team.service.UserInfoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@CacheConfig(cacheNames = "user")
@Service
@Log4j2
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    @Cacheable(cacheNames = "users", key = "'users'")   //缓存key=users value=返回值
    public List<UserInfo> getUsers() {
        log.info("getUsers...");
        return userInfoMapper.selectAll();
    }

//    @CachePut(cacheNames = "users", key = "'users'")  //返回类型不一致，这里不能用@CachePut()
    @CacheEvict(cacheNames = "users", key = "'users'")
    @Override
    public int insertUser(UserInfo userInfo) {
        return userInfoMapper.insert(userInfo);
    }

    @CacheEvict(cacheNames = "users", key = "'users'")
    @Override
    public int delectById(Integer userId) {
        return userInfoMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int doLogin(String userName, String password) {
        return userInfoMapper.findUser(userName, password);
    }

}
