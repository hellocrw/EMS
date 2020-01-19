package crw.bishe.team.service;

import crw.bishe.team.dto.UserDto;
import crw.bishe.team.dtoEntityMapping.UserMapping;
import crw.bishe.team.entity.User;
import crw.bishe.team.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2020/1/19 0019
 * @Time 13:49
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    private final UserMapping userMapping;

    @Autowired
    public UserServiceImpl(UserMapper userMapper, UserMapping userMapping){
        this.userMapper = userMapper;
        this.userMapping = userMapping;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int create(UserDto userDto) {
        if (userDto == null){
            return 0;
        }
        return userMapper.insert(userMapping.toEntity(userDto));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(String id) {
        Long key = Long.parseLong(id);
        return userMapper.deleteByPrimaryKey(key);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int update(UserDto userDto, String id) {
        if(id == null){
            return 0;
        }
        Long key = Long.parseLong(id);
        if(userMapper.selectByPrimaryKey(key) == null){
            return 0;
        }
        return userMapper.updateByPrimaryKey(userMapping.toEntity(userDto));
    }

    @Override
    public List<UserDto> findAll() {
        List<User> users = userMapper.selectAll();
        List<UserDto> userDtos = new ArrayList<>();
        users.forEach(user -> {
            UserDto userDto = userMapping.toDto(user);
            userDtos.add(userDto);
        });
        return userDtos;
    }
}
