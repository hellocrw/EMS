package crw.bishe.team.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

@ApiModel(description = "单位基础信息")
@Data
@ToString(callSuper = true)
public class UnitInfoDto {

    @ApiModelProperty(value = "序号ID，新增时应当为null, 系统会自动生成", required = true)
    private String id;

    @ApiModelProperty(value = "单位类型")
    private String unitType;

    @ApiModelProperty(value = "就业单位名称")
    private String unitName;

    @ApiModelProperty(value = "统一社会信用代码")
    private String unifieSocialCreditCode;

    @ApiModelProperty(value = "单位所属行业")
    private String industryUnit;

    @ApiModelProperty(value = "单位所属地区")
    private String unitArea;

    @ApiModelProperty(value = "单位详细地址")
    private String unitAddress;

    @ApiModelProperty(value = "单位联系人")
    private String unitContactor;

    @ApiModelProperty(value = "单位联系电话")
    private String unitTel;

    @ApiModelProperty(value = "单位联系邮箱")
    private String unitEmail;

    @ApiModelProperty(value = "单位邮编")
    private String unitPostcode;
}
