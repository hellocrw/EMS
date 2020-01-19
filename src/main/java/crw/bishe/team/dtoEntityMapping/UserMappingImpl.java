package crw.bishe.team.dtoEntityMapping;

import crw.bishe.team.dto.UserDto;
import crw.bishe.team.entity.User;
import org.springframework.stereotype.Component;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2020/1/19 0019
 * @Time 13:35
 */
@Component("userMapping")
public class UserMappingImpl implements UserMapping {
    @Override
    public User toEntity(UserDto userDto) {
        if(userDto == null ){
            return null;
        }
        User user = new User();
        if(userDto.getId()==null || userDto.getId() == ""){
            user.setId(null);
        }else{
            user.setId(Long.parseLong(userDto.getId()));
        }
        user.setUserId(userDto.getUserId());
        user.setUserName(userDto.getUserName());
        user.setUserAvatar(userDto.getUserAvatar());
        user.setGender(Byte.parseByte(userDto.getGender()));
        user.setUniversity(userDto.getUniversity());
        user.setCollege(userDto.getCollege());
        user.setProfession(userDto.getProfession());
        user.setGrade(userDto.getGrade());
        user.setUserClass(userDto.getUserClass());
        user.setUserNo(Integer.parseInt(userDto.getUserNo()));
        user.setUserTel(userDto.getUserTel());
        user.setEmail(userDto.getEmail());
        user.setAbility(userDto.getAbility());
        return user;
    }

    @Override
    public UserDto toDto(User user) {
        if(user == null){
            return null;
        }
        UserDto userDto = new UserDto();
        userDto.setId(String.valueOf(user.getId()));
        userDto.setUserName(user.getUserName());
        userDto.setUserAvatar(user.getUserAvatar());
        userDto.setGender(String.valueOf(user.getGender()));
        userDto.setUniversity(user.getUniversity());
        userDto.setCollege(user.getCollege());
        userDto.setProfession(user.getProfession());
        userDto.setGrade(user.getGrade());
        userDto.setUserClass(user.getUserClass());
        userDto.setUserNo(String.valueOf(userDto.getUserNo()));
        userDto.setUserTel(user.getUserTel());
        userDto.setEmail(user.getEmail());
        userDto.setAbility(user.getAbility());
        return userDto;
    }
}
