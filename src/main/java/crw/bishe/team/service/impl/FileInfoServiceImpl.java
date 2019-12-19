package crw.bishe.team.service.impl;

import crw.bishe.team.entity.FileInfo;
import crw.bishe.team.mapper.FileInfoMapper;
import crw.bishe.team.service.FileInfoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.UUID;

/**
 * @Description 文件上传下载
 * @Author crw
 * @Date Created in 2019/12/19 0019
 * @Time 13:54
 */
@Service
@Log4j2
public class FileInfoServiceImpl implements FileInfoService {

    @Autowired
    private FileInfoMapper fileInfoMapper;
    @Override
    public String upLoad(String uploadFliePath, MultipartFile file) {
        String fileName = file.getOriginalFilename();
        String path = uploadFliePath + fileName;
        File dest = new File(path);
        if(!dest.getParentFile().exists()){
            dest.getParentFile().mkdirs();
        }
        try{
            file.transferTo(dest);
            FileInfo fileInfo = FileInfo.builder()
                    .id(UUID.randomUUID().toString())
                    .fileName(fileName)
                    .fileUrl(path)
                    .build();
            fileInfoMapper.insert(fileInfo);
            log.info("保存的文件："+fileName+"--->"+path);
        } catch (IOException e) {
            log.info("文件上传失败");
            e.printStackTrace();
        }
        return "文件上传成功";
    }

    @Override
    public String downLoad(HttpServletRequest request, HttpServletResponse response,
                           String fileName, String uploadFilePath) {
        String path = fileName + uploadFilePath;
        File file = new File(path);
        if(file.exists()){
            response.setContentType("application/force-download");
            response.addHeader("Content-Disposition", "attachment;fileName="+fileName);
            byte[] buffer = new byte[1024];
            FileInputStream fileInputStream = null;
            BufferedInputStream bufferedInputStream = null;
            try{
                fileInputStream = new FileInputStream(file);
                bufferedInputStream = new BufferedInputStream(fileInputStream);
                OutputStream outputStream = response.getOutputStream();
                int i = bufferedInputStream.read(buffer);
                while (1 != -1){
                    outputStream.write(buffer, 0, i);
                    i = bufferedInputStream.read(buffer);
                }
            } catch (Exception e) {
                log.info("文件下载失败");
                e.printStackTrace();
            } finally {
                if (bufferedInputStream!=null){
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if(fileInputStream!=null){
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return "文件下载成功";
    }
}
