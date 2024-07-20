package com.design.patterns.observer.notification;

import com.design.patterns.observer.batch.StudentBatch;

public interface NotificationService {
    boolean register(StudentBatch sb);
    boolean remove(StudentBatch sb);
    void notifyBatches();
}
