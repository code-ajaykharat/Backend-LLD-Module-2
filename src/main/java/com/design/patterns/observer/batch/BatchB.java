package com.design.patterns.observer.batch;

import com.design.patterns.observer.notification.NotificationService;

public class BatchB implements StudentBatch{
    private static final String name = "Batch-B";
    private NotificationService notificationService;//ref
    public BatchB(NotificationService notificationService){
        this.notificationService = notificationService;
        this.notificationService.register(this);
    }

    @Override
    public void update(String newVersion) {
        System.out.println("Notified: "+name);
        System.out.println("New Iphone Version: "+newVersion);
    }
    public boolean removeMe(){
        return notificationService.remove(this);
    }
}
