package com.demo.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskServer {

    @Async
    public void execoteAsyncTask(Integer i){
        System.out.println("执行异步任务："+i);
    }
    @Async
    public void excoteAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1："+i);
    }
}
