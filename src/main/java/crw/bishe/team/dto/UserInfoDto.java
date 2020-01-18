package crw.bishe.team.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description 用户信息dto
 * @Author crw
 * @Date Created in 2020/1/17 0017
 * @Time 16:01
 */
@ApiModel(description = "用户基本信息")
@Data
public class UserInfoDto {

    @ApiModelProperty(value = "序号", required = true)
    private String id;

    @ApiModelProperty(value = "用户编号")
    private String userno;

    @ApiModelProperty(value = "用户昵称")
    private String username;

    @ApiModelProperty(value = "用户类型")
    private String usertype;

    @ApiModelProperty(value = "头像Url")
    private String imageurl;
}
