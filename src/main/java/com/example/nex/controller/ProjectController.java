package com.example.nex.controller;

import com.example.nex.dto.CourseDTO;
import com.example.nex.dto.ProjectDTO;
import com.example.nex.service.CourseService;
import com.example.nex.service.ProjectService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@AllArgsConstructor
public class ProjectController {
    private final ProjectService projectService;

    @GetMapping("/project")
    public List<ProjectDTO> getProjects() {
        return projectService.getAllProject();
    }
}
