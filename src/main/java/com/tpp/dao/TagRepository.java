package com.tpp.dao;

import com.tpp.entity.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @ProjectName: blog_backend
 * @Package: com.tpp.dao
 * @ClassName: TagRepository
 * @Author: ptang
 * @Date: 2021/8/10 11:24 下午
 */
public interface TagRepository extends JpaRepository<Tag,Long> {

    @Query("select t from Tag t")
    List<Tag> findTop(Pageable pageable);
}
