package com.ersozyazilim.homework_6.entites.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class JobList {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "job_name")
    private String jobName;
}
