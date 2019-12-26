package crw.bishe.team.service;

import crw.bishe.team.entity.ProInfo;

import java.util.List;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2019/12/26 0026
 * @Time 17:57
 */
public interface ProInfoService {
    public List<ProInfo> select();
    public int delete(int id);
    public int update(ProInfo proInfo);
    public int insert(ProInfo proInfo);
}
