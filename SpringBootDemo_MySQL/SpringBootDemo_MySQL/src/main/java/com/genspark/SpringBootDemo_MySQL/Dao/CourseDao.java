package com.genspark.SpringBootDemo_MySQL.Dao;

import com.genspark.SpringBootDemo_MySQL.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao extends JpaRepository<Course, Integer > {//<T,Id> The t stands for Table the Id stands for the type


}
