package com.ersozyazilim.homework_6.business.concretes;

import com.ersozyazilim.homework_6.business.abstracts.JobListService;
import com.ersozyazilim.homework_6.dataAccess.abstracts.JobListDao;
import com.ersozyazilim.homework_6.entites.concretes.JobList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobListManager implements JobListService {

    private JobListDao jobListDao;

    @Autowired
    public JobListManager(JobListDao jobListDao) {
        this.jobListDao = jobListDao;
    }

    @Override
    public List<JobList> getAll() {
        return this.jobListDao.findAll();
    }

}
