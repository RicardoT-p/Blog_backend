package com.tpp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @ProjectName: blog_backend
 * @Package: com.tpp.entity
 * @ClassName: Blog
 * @Author: ptang
 * @Date: 2021/7/27 9:50 下午
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Blog extends Base{

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    private Long userId;
    private Long typeId;
    private Long commentId;
    private String title;
    private String content;
    private String firstPicture;
    private String flag;
    private Integer views;
    private boolean appreciation;
    private boolean shareStatement;
    private boolean commentabled;
    private boolean published;
    private boolean recommend;
//    private Type type;
//    private List<Tag> tags = new ArrayList<>();
//    private User user;
//    private List<Comment> comments = new ArrayList<>();
    private String tagIds;
    private String description;
}