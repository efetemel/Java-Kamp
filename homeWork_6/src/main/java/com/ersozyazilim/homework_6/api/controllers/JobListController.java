package com.ersozyazilim.homework_6.api.controllers;

import com.ersozyazilim.homework_6.business.abstracts.JobListService;
import com.ersozyazilim.homework_6.entites.concretes.JobList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/joblist")
public class JobListController {

    private JobListService jobListService;

    @Autowired
    public JobListController(JobListService jobListService) {
        this.jobListService = jobListService;
    }

    @GetMapping("/getall")
    public List<JobList> getAll(){
        return this.jobListService.getAll();
    }

}
