package com.example.OneToMany.repositories;

import com.example.OneToMany.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepo  extends JpaRepository<Courses, Integer>{

}
