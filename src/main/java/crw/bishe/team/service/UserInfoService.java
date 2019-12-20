package crw.bishe.team.service;

import crw.bishe.team.entity.UserInfo;

import java.util.List;

public interface UserInfoService {
    List<UserInfo> getUsers();
    int insertUser(UserInfo userInfo);
    int delectById(Integer userId);
    int doLogin(String userName, String password);
}
