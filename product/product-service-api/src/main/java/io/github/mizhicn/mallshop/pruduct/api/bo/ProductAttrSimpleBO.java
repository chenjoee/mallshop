package io.github.mizhicn.mallshop.pruduct.api.bo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class ProductAttrSimpleBO {

    /**
     * 规格编号
     */
    private Integer id;
    /**
     * 规格名
     */
    private String name;
    /**
     * 规格值数组
     */
    private List<ProductAttrValueSimpleBO> values;
}
