package cn.itcast.ch4.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

/**
 * Created by sren on 2016/11/22.
 */
public class SystemOutJobExecutionListener implements JobExecutionListener {
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("JobExecution create time:"+ jobExecution.getCreateTime());
    }

    public void afterJob(JobExecution jobExecution) {
        System.out.println("JobExecution execute time:"+ jobExecution.getEndTime());
    }
}
