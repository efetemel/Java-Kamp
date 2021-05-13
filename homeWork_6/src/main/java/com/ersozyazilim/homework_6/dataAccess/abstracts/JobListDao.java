package com.ersozyazilim.homework_6.dataAccess.abstracts;

import com.ersozyazilim.homework_6.entites.concretes.JobList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobListDao extends JpaRepository<JobList,Integer> {
}
