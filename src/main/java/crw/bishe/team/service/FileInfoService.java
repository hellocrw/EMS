package crw.bishe.team.service;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2019/12/19 0019
 * @Time 13:53
 */
public interface FileInfoService {
    String upLoad(String uploadFliePath, MultipartFile file);
    String downLoad(HttpServletRequest request, HttpServletResponse response, String fileName, String uploadFilePath) throws IOException;
}
