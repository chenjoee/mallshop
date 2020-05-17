package io.github.mizhicn.mallshop.pruduct.dataobject;

import com.baomidou.mybatisplus.annotation.*;
import io.github.mizhicn.common.framework.dataobject.DeletableDO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Product 规格
 */
@Data
@Accessors(chain = true)
@TableName("product_attr")
@AllArgsConstructor
@NoArgsConstructor
public class ProductAttrDO extends DeletableDO {

    /**
     * 规格编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 名称
     */
    @TableField("name")
    private String name;
    /**
     * 状态
     *
     * 1-开启
     * 2-禁用
     */
    @TableField("status")
    @EnumValue
    private Integer status;

}
