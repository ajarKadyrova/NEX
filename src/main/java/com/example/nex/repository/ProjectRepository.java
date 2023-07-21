package com.example.nex.repository;

import com.example.nex.entity.CourseRecord;
import com.example.nex.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
