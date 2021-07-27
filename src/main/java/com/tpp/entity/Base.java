package com.tpp.entity;

/**
 * @ProjectName: blog_backend
 * @Package: com.tpp.entity
 * @ClassName: Base
 * @Author: ptang
 * @Date: 2021/7/27 11:17 下午
 */

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Description: 父类和子类都有@Data注解，要在子类加上EqualsAndHashCode(callSuper = true)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Base {
    @TableField(value = "deletion_flag", fill = FieldFill.INSERT)
    private Integer deletionFlag;

    @TableField(value = "creator", fill = FieldFill.INSERT)
    private Integer creator;

    @TableField(value = "creation_time", fill = FieldFill.INSERT)
    private Date creationTime;

    @TableField(value = "last_modifier", fill = FieldFill.INSERT_UPDATE)
    private Integer lastModifier;

    @TableField(value = "last_modify_time", fill = FieldFill.INSERT_UPDATE)
    private Date lastModifyTime;
}