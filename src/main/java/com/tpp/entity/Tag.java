package com.tpp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: blog_backend
 * @Package: com.tpp.entity
 * @ClassName: Tag
 * @Author: ptang
 * @Date: 2021/7/27 9:56 下午
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("tag")
@Entity
public class Tag extends Base{
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    private Long blogId;
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