package com.tpp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

/**
 * @ProjectName: blog_backend
 * @Package: com.tpp.entity
 * @ClassName: Type
 * @Author: ptang
 * @Date: 2021/7/27 9:57 下午
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("type")
@Entity
public class Type extends Base{
    @TableId(value = "id",type = IdType.AUTO)
    @Id
    @GeneratedValue
    private Long id;
    private Long blogId;
    @NotBlank(message = "分类名称不能为空")
    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }


//    private List<Blog> blogs = new ArrayList<>();
}