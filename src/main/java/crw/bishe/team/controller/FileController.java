package crw.bishe.team.controller;

import crw.bishe.team.service.FileInfoService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * @Description 文件上传功能
 * @Author crw
 * @Date Created in 2019/12/19 0019
 * @Time 9:54
 */
@RestController
@RequestMapping("/file")
@Log4j2
public class FileController {

    @Autowired
    FileInfoService fileInfoService;

    @Value("${file.upload.url}")
    private String uploadFilePath;

    @ApiOperation(value = "文件上传", notes = "文件上传")
    @PostMapping("/upload")
    public String upload(@RequestParam("files")MultipartFile file) {
        try {
            if (file.isEmpty()) {
                return "文件为空";
            }
            return fileInfoService.upLoad(uploadFilePath, file);
        } catch (IllegalStateException e) {
            log.info("文件获取错误");
            e.printStackTrace();
        }
        return "上传失败";
    }

    @ApiOperation(value = "文件下载", notes = "文件下载")
    @PostMapping("/download")
    public String downloadFile(HttpServletRequest request, HttpServletResponse response,
                               @RequestParam("fileName") String fileName) throws IOException {
        if(fileName == null) {
            return "下载失败";
        }
        return fileInfoService.downLoad(request, response, fileName, uploadFilePath);
    }
}
