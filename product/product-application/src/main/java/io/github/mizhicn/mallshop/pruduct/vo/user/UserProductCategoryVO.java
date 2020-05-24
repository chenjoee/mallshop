package io.github.mizhicn.mallshop.pruduct.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@ApiModel("商品分类（简单）")
@Data
@Accessors(chain = true)
public class UserProductCategoryVO implements Serializable {

    @ApiModelProperty(value = "分类编号", required = true, example = "1")
    private Integer id;
    @ApiModelProperty(value = "分类名", required = true, example = "手机")
    private String name;
    @ApiModelProperty(value = "分类图片", notes = "一般情况下，只有根分类才有图片", example = "http://www.iocoder.cn/images/common/wechat_mp_2017_07_31_bak.jpg")
    private String picUrl;
}
