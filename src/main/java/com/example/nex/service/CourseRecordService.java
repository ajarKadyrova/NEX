package com.example.nex.service;

import com.example.nex.dto.CourseDTO;
import com.example.nex.dto.CourseRecordDTO;
import com.example.nex.entity.Course;
import com.example.nex.entity.CourseRecord;
import com.example.nex.repository.CourseRecordRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CourseRecordService {
    private final CourseRecordRepository recordRepository;

    public CourseRecordDTO addCourseRecord(CourseRecordDTO courseRecordDTO) {


        CourseRecord courseRecord = CourseRecord.builder()
                .clientName(courseRecordDTO.getClientName())
                .course(courseRecordDTO.getCourse())
                .phoneClient(courseRecordDTO.getPhoneClient())
                .emailClient(courseRecordDTO.getEmailClient())
                .build();
        recordRepository.save(courseRecord);
        return CourseRecordDTO.from(courseRecord);
    }

    public List<CourseRecordDTO> getAllRecords() {
        List<CourseRecord> courseRecords =  recordRepository.findAll();
        return courseRecords.stream().map(CourseRecordDTO::from).collect(Collectors.toList());
    }


}
