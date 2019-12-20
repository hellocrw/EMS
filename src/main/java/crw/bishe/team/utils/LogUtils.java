package crw.bishe.team.utils;

import crw.bishe.team.entity.LogInfo;
import crw.bishe.team.mapper.LogInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2019/12/20 0020
 * @Time 17:24
 */
public class LogUtils {
    @Autowired
    private LogInfoMapper logInfoMapper;

    public int addLog(LogInfo logInfo) {
        return logInfoMapper.insert(logInfo);
    }

    public List<LogInfo> getLogs(){
        return logInfoMapper.selectAll();
    }
}
