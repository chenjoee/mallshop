package io.github.mizhicn.mallshop.pruduct.api.bo;

import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;

@Data
@Accessors(chain = true)
public class ProductAttrValueSimpleBO implements Serializable {

    /**
     * 规格值编号
     */
    private Integer id;
    /**
     * 规格值名
     */
    private String name;

}
