package cn.itcast.ch4.listener;

import jdk.nashorn.internal.scripts.JO;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.annotation.AfterJob;
import org.springframework.batch.core.annotation.BeforeJob;

/**
 * Created by sren on 2016/11/22.
 */
public class SystemOut {

    @BeforeJob
    public void beforeJob(JobExecution jobExecution) {

        System.out.println("Annotation: JobExecution creat time:" + jobExecution.getCreateTime());
    }

    @AfterJob
    public void afterJob(JobExecution jobExecution) {
        System.out.println("Annotation: Job execute state:" + jobExecution.getStatus().toString());
    }
}
