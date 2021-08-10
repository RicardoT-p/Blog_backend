package com.tpp.dao;

import com.tpp.entity.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

/**
 * @ProjectName: blog_backend
 * @Package: com.tpp.dao
 * @ClassName: TypeRepository
 * @Author: ptang
 * @Date: 2021/8/6 10:31 上午
 */

public interface TypeRepository extends JpaRepository<Type,Long> {

    Type findByName(String name);


    @Query("select t from Type t")
    List<Type> findTop(Pageable pageable);
}