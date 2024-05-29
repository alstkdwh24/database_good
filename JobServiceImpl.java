package com.project.wizian1.job.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.wizian1.command.JobVO;
@Service("JobService")
public class JobServiceImpl implements JobService{
	@Autowired
	private JobMapper jobMapper;
	@Override
	public int regist(JobVO vo) {
		// TODO Auto-generated method stub
		return jobMapper.regist(vo);
	}

}
