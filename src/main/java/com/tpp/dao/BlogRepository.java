package com.tpp.dao;


import com.tpp.entity.Blog;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog,Long> {

    @Query("select t from Blog t")
    List<Blog> findTop(Pageable pageable);
}
