package com.cloudwise.lcap.commonbase.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName("component_group")
public class ComponentGroup implements Serializable {

    @TableField(fill = FieldFill.INSERT)
    private String id;

    private String info;

    private String name;

    private String cover;

    private String categoryFirstId;

    private String categorySecondId;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @TableLogic
    private Integer deleted;
}
