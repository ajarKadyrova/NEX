package com.example.nex.service;

import com.example.nex.dto.CourseDTO;
import com.example.nex.entity.Course;
import com.example.nex.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;

    public List<CourseDTO> getAllCourse() {
        List<Course> courses =  courseRepository.findAll();
        return courses.stream().map(CourseDTO::from).collect(Collectors.toList());
    }
}
