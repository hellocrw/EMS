package crw.bishe.team.service;

import crw.bishe.team.entity.UserInfo;

import java.util.List;

public interface UserInfoService {
    public List<UserInfo> getUsers();
    public int insertUser(UserInfo userInfo);
    public int doLogin(String userName, String password);
}
