package com.tpp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ProjectName: blog_backend
 * @Package: com.tpp.entity
 * @ClassName: Comment
 * @Author: ptang
 * @Date: 2021/7/27 9:56 下午
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("comment")
@Entity
public class Comment extends Base{
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    private Long blogId;
    private String nickname;
    private String email;
    private String content;
    private String avatar;
    private Long parentCommentId;
//    private Blog blog;
//    private List<Comment> replyComments = new ArrayList<>();
//    private Comment parentComment;
    private boolean adminComment;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}