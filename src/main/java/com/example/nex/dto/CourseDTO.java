package com.example.nex.dto;

import com.example.nex.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {
    private String name;

    private int courseDuration;

    private String coursePrice;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date courseStart;

    public static CourseDTO from(Course course) {
        return CourseDTO.builder()
                .name(course.getName())
                .coursePrice(course.getCoursePrice())
                .courseDuration(course.getCourseDuration())
                .courseStart(course.getCourse_start())
                .build();
    }
}
