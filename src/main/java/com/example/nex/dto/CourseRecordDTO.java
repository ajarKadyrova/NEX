package com.example.nex.dto;

import com.example.nex.entity.Course;
import com.example.nex.entity.CourseRecord;
import com.example.nex.entity.Project;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseRecordDTO {

    private String clientName;

    private String phoneClient;

    private String emailClient;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public static CourseRecordDTO from(CourseRecord courseRecord) {
        return CourseRecordDTO.builder()
                .clientName(courseRecord.getClientName())
                .phoneClient(courseRecord.getPhoneClient())
                .course(courseRecord.getCourse())
                .emailClient(courseRecord.getEmailClient())
                .build();
    }

}
