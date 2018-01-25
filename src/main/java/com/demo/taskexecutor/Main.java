package com.demo.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutor.class);
        AsyncTaskServer asyncTaskServer = context.getBean(AsyncTaskServer.class);

        for (int i = 0 ; i < 10 ; i++){
            asyncTaskServer.execoteAsyncTask(i);
            asyncTaskServer.excoteAsyncTaskPlus(i);
        }
    }
}
