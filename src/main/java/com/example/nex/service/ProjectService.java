package com.example.nex.service;

import com.example.nex.dto.CourseDTO;
import com.example.nex.dto.ProjectDTO;
import com.example.nex.entity.Course;
import com.example.nex.entity.Project;
import com.example.nex.repository.CourseRepository;
import com.example.nex.repository.ProjectRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@AllArgsConstructor
@Service
public class ProjectService {
    private final ProjectRepository projectRepository;

    public List<ProjectDTO> getAllProject() {
        List<Project> projects =  projectRepository.findAll();
        return projects.stream().map(ProjectDTO::from).collect(Collectors.toList());
    }
}
