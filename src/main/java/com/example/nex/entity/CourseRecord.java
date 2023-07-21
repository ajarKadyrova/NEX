package com.example.nex.entity;

import javax.persistence.*;

import lombok.*;


@Entity
@Table(name = "course_records")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clientName;

    private String phoneClient;

    private String emailClient;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;



}
