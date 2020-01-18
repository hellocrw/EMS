package crw.bishe.team.vo;

import lombok.Data;

/**
 * @Description 结果格式
 * @Author crw
 * @Date Created in 2020/1/10 0010
 * @Time 21:43
 */
@Data
public class Result<T> {
    private int status;
    private String desc;
    private T data;

    public Result(){}

    public Result(String desc) {
        this.desc = desc;
    }

    public Result(int status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public Result(int status, String desc, T data) {
        this.status = status;
        this.desc = desc;
        this.data = data;
    }
}
