package com.example.nex.repository;

import com.example.nex.entity.Course;
import com.example.nex.entity.CourseRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
