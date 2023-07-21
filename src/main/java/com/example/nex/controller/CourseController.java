package com.example.nex.controller;

import com.example.nex.dto.CourseDTO;
import com.example.nex.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @GetMapping("/course")
    public List<CourseDTO> getParents() {
        return courseService.getAllCourse();
    }
}
