package crw.bishe.team.service;

import crw.bishe.team.dto.UserInfoDto;
import crw.bishe.team.dtoEntityMapping.UserInfoMapping;
import crw.bishe.team.entity.UserInfo;
import crw.bishe.team.mapper.UserInfoMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description Description 用户信息service实现类
 * @Author crw
 * @Date Created in 2020/1/10 0010
 * @Time 23:35
 */
@Service
@Log4j2
public class UserInfoServiceImpl implements UserInfoService {

    private final UserInfoMapper userInfoMapper;
    private final UserInfoMapping userInfoMapping;

    @Autowired
    public UserInfoServiceImpl(UserInfoMapper userInfoMapper, UserInfoMapping userInfoMapping){
        this.userInfoMapper = userInfoMapper;
        this.userInfoMapping = userInfoMapping;
    }
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int persist(UserInfoDto userInfoDto) {
        if(userInfoDto == null){
            return 0;
        }
        return userInfoMapper.insert(userInfoMapping.toEntity(userInfoDto));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(String id) {
        Long key = Long.parseLong(id);
        return userInfoMapper.deleteByPrimaryKey(key);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int update(UserInfoDto userInfoDto, String id) {
        if(id == null){
            return 0;
        }
        Long key = Long.parseLong(id);
        if(userInfoMapper.selectByPrimaryKey(key) == null){
            return 0;
        }
        return userInfoMapper.updateByPrimaryKey(userInfoMapping.toEntity(userInfoDto));
    }

    @Override
    public List<UserInfoDto> findAll() {
        List<UserInfo> userInfos = userInfoMapper.selectAll();
        List<UserInfoDto> userInfoDtos = new ArrayList<>();
        userInfos.forEach(userInfo -> {
            UserInfoDto userInfoDto = userInfoMapping.toDto(userInfo);
            userInfoDtos.add(userInfoDto);
        });
        return userInfoDtos;
    }
}
