package com.hx.redis.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel("用户实体类")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @ApiModelProperty("用户名")
    String name;
    String pwd;
}
