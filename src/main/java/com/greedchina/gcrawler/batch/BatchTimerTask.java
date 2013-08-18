package com.greedchina.gcrawler.batch;

import java.util.TimerTask;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;

public class BatchTimerTask extends TimerTask {
	private Job job;
	private JobLauncher jobLauncher;
	private JobParameters jobParameters;

	public Job getJob() {
		return job;
	}


	public void setJob(Job job) {
		this.job = job;
	}


	public JobLauncher getJobLauncher() {
		return jobLauncher;
	}


	public void setJobLauncher(JobLauncher jobLauncher) {
		this.jobLauncher = jobLauncher;
	}
    

	public JobParameters getJobParameters() {
		return jobParameters;
	}


	public void setJobParameters(JobParameters jobParameters) {
		this.jobParameters = jobParameters;
	}


	@Override
	public void run() {
		System.out.println("run Start ===========");
		try {
			jobLauncher.run(job, jobParameters);
		} catch (JobExecutionAlreadyRunningException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JobRestartException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JobInstanceAlreadyCompleteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JobParametersInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
