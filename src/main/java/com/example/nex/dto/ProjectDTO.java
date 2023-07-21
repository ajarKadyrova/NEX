package com.example.nex.dto;

import com.example.nex.entity.Course;
import com.example.nex.entity.Project;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDTO {

    private String name;

    private int projectDuration;
    private String projectDescription;

    private String projectPrice;


    public static ProjectDTO from(Project projectDTO) {
        return ProjectDTO.builder()
                .name(projectDTO.getName())
                .projectPrice(projectDTO.getProjectPrice())
                .projectDuration(projectDTO.getProjectDuration())
                .build();
    }
}
