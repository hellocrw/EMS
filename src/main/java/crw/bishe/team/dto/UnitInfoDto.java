package crw.bishe.team.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UnitInfoDto {

    @ApiModelProperty(position = 10, value = "序号ID，新增时应当为null, 系统会自动生成", required = true)
    private String id;

    @ApiModelProperty(position = 20, value = "单位类型")
    private String unitType;

    @ApiModelProperty(position = 30, value = "就业单位名称")
    private String unitName;

    @ApiModelProperty(position = 40, value = "统一社会信用代码")
    private String unifieSocialCreditCode;

    @ApiModelProperty(position = 50, value = "单位所属行业")
    private String industryUnit;

    @ApiModelProperty(position = 60, value = "单位所属地区")
    private String unitArea;

    @ApiModelProperty(position = 70, value = "单位详细地址")
    private String unitAddress;

    @ApiModelProperty(position = 80, value = "单位联系人")
    private String unitContactor;

    @ApiModelProperty(position = 90, value = "单位联系电话")
    private String unitTel;

    @ApiModelProperty(position = 100, value = "单位联系邮箱")
    private String unitEmail;

    @ApiModelProperty(position = 110, value = "单位邮编")
    private String unitPostcode;
}
