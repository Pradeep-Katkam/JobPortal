package com.alpha.JobPortal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpha.JobPortal.entity.Job;

public interface JobRepository extends JpaRepository<Job, Integer>{

}
