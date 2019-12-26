package crw.bishe.team.service;

import crw.bishe.team.entity.UsersInfo;

import java.util.List;

public interface UsersInfoService {
    List<UsersInfo> getUsers();
    int insertUser(UsersInfo userInfo);
    int delectById(Integer userId);
    int doLogin(String userName, String password);
}
