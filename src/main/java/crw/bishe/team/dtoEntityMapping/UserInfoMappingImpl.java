package crw.bishe.team.dtoEntityMapping;

import crw.bishe.team.dto.UserInfoDto;
import crw.bishe.team.entity.UserInfo;
import org.springframework.stereotype.Component;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2020/1/17 0017
 * @Time 16:27
 */
@Component("userInfoMapping")
public class UserInfoMappingImpl implements UserInfoMapping {
    @Override
    public UserInfoDto toDto(UserInfo userInfo) {
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setId(String.valueOf(userInfo.getId()));
        userInfoDto.setUserno(String.valueOf(userInfo.getUserno()));
        userInfoDto.setUsername(userInfo.getUsername());
        userInfoDto.setUsertype(String.valueOf(userInfo.getUsertype()));
        userInfoDto.setImageurl(userInfo.getImageurl());
        return userInfoDto;
    }

    @Override
    public UserInfo toEntity(UserInfoDto userInfoDto) {
        if(userInfoDto == null) {
            return null;
        }
        UserInfo userInfo = new UserInfo();
        if(userInfoDto.getId() == null || userInfoDto.getId() == ""){
            userInfo.setId(null);
        }else{
        userInfo.setId(Long.parseLong(userInfoDto.getId()));
        }
        userInfo.setUserno(Integer.parseInt(userInfoDto.getUserno()));
        userInfo.setUsername(userInfoDto.getUsername());
        userInfo.setUsertype(Byte.parseByte(userInfoDto.getUsertype()));
        userInfo.setImageurl(userInfoDto.getImageurl());
        return userInfo;
    }
}
