package com.mountblue.blog.repository;

import com.mountblue.blog.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<Tag,Long> {

    @Query("SELECT t FROM Tag t WHERE t.name = :name")
    Tag findByName(@Param("name") String name);
}
