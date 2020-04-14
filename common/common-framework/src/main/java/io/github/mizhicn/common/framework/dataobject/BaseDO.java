package io.github.mizhicn.common.framework.dataobject;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true)
public class BaseDO implements Serializable {

    private Date createTime;

    private Date updateTime;


}
