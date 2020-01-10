package crw.bishe.team.exception;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2020/1/10 0010
 * @Time 22:53
 */
public class NoSuchDataException extends Exception {
    public NoSuchDataException() {
        super(String.format("找不到对应的数据"));
    }
}
