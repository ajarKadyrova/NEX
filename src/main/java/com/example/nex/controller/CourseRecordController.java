package com.example.nex.controller;

import com.example.nex.dto.CourseDTO;
import com.example.nex.dto.CourseRecordDTO;
import com.example.nex.service.CourseRecordService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/add/course/record")
public class CourseRecordController {
    private final CourseRecordService recordService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public CourseRecordDTO addCourseRecord(@RequestBody CourseRecordDTO recordDTO) {
        return recordService.addCourseRecord(recordDTO);
    }

    @GetMapping("/records")
    public List<CourseRecordDTO> getRecord() {
        return recordService.getAllRecords();
    }
}
