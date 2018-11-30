package com.zoctan.seedling.dto;

import com.zoctan.seedling.core.dto.AbastractConverter;
import com.zoctan.seedling.entity.RoleDO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author Zoctan
 * @date 2018/07/15
 */
@Data
@ApiModel(value = "角色传输实体")
@EqualsAndHashCode(callSuper = true)
public class RoleDTO extends AbastractConverter<RoleDTO, RoleDO> implements Serializable {
  @ApiModelProperty(value = "角色Id", readOnly = true)
  private Long id;

  @ApiModelProperty(value = "角色名称")
  private String name;

  @Override
  protected RoleDTO setDTO() {
    return this;
  }
}
