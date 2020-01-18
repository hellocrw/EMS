package crw.bishe.team.entity;

import javax.persistence.*;

@Table(name = "file_info")
public class FileInfo {
    /**
     * 序号
     */
    @Id
    private String id;

    /**
     * 文件地址
     */
    @Column(name = "file_url")
    private String fileUrl;

    /**
     * 文件名
     */
    @Column(name = "file_name")
    private String fileName;

    /**
     * 获取序号
     *
     * @return id - 序号
     */
    public String getId() {
        return id;
    }

    /**
     * 设置序号
     *
     * @param id 序号
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取文件地址
     *
     * @return file_url - 文件地址
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * 设置文件地址
     *
     * @param fileUrl 文件地址
     */
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    /**
     * 获取文件名
     *
     * @return file_name - 文件名
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 设置文件名
     *
     * @param fileName 文件名
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}