package com.huang.log.conmmon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @ProjectName: hzh-cloud-app
 * @Package: com.huang.log.conmmon
 * @ClassName:
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021/4/24
 * @Version: 1.0
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
@Configuration
public class TaskExecutePool {


   // @Value("${task.pool.corePoolSize}")
    private int corePoolSize=4;

   // @Value("${task.pool.maxPoolSize}")
    private int maxPoolSize=4;

  //  @Value("${task.pool.keepAliveSeconds}")
    private int keepAliveSeconds=50;

   // @Value("${task.pool.queueCapacity}")
    private int queueCapacity=60;

    @Bean("taskExecutor")
    public Executor threadExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        //线程池创建时初始化的线程数
        executor.setCorePoolSize(corePoolSize);
        //线程池最大的线程数，只有在缓冲队列满了之后才会申请超过核心线程数的线程
        executor.setMaxPoolSize(maxPoolSize);
        //队列容量,用来缓冲执行任务的队列
        executor.setQueueCapacity(queueCapacity);
        //允许线程的空闲时间：超过了核心线程数之外的线程，在空闲时间到达之后会被销毁
        executor.setKeepAliveSeconds(keepAliveSeconds);
        //设置线程池中任务的等待时间，如果超过这个时候还没有销毁就强制销毁，以确保应用最后能够被关闭，而不是阻塞住
        executor.setAwaitTerminationSeconds(60);
        //线程名字前缀：设置好了之后可以方便我们定位处理任务所在的线程池
        executor.setThreadNamePrefix("system-log");
        // setRejectedExecutionHandler：当pool已经达到max size的时候，如何处理新任务
        // CallerRunsPolicy：不在新线程中执行任务，而是由调用者所在的线程来执行
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        //设置线程池关闭的时候等待所有任务都完成再继续销毁其他的Bean
        executor.setWaitForTasksToCompleteOnShutdown(true);
        executor.initialize();
        return executor;
    }
}