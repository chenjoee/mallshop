package io.github.mizhicn.common.framework.dataobject;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class DeletableDO extends BaseDO {

    @TableLogic
    private Integer deleted;

}
