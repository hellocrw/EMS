package crw.bishe.team.service.impl;

import crw.bishe.team.entity.UserInfo;
import crw.bishe.team.mapper.UserInfoMapper;
import crw.bishe.team.service.UserInfoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
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
    @Cacheable(cacheNames = "users")
    public List<UserInfo> getUsers() {
        log.info("getUsers...");
        return userInfoMapper.selectAll();
    }

    @CachePut(cacheNames = "users", key = "#userInfo.userId")
    @Override
    public int insertUser(UserInfo userInfo) {
        log.info("insertUser...");
        return userInfoMapper.insert(userInfo);
    }

    @Override
    public int doLogin(String userName, String password) {
        return userInfoMapper.findUser(userName, password);
    }

}
