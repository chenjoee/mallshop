package io.github.mizhicn.mallshop.pruduct.api.bo;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

@Data
@Accessors(chain = true)
@ToString
public class ProductAttrPageBO implements Serializable {

    private Integer count;

    private List<ProductAttrDetailBO> attrs;

}
