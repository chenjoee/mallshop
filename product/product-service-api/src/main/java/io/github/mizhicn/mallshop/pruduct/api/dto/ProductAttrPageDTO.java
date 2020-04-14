package io.github.mizhicn.mallshop.pruduct.api.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;


@Data
@Accessors(chain = true)
public class ProductAttrPageDTO {
    private String name;

    @NotNull(message = "页码部门为空")
    private Integer pageNum;

    @NotNull(message = "每页数量不能为空")
    private Integer pageSize;
}
