package com.design.patterns.observer.notification;

import com.design.patterns.observer.batch.StudentBatch;

import java.util.ArrayList;
import java.util.List;

public class NewIphone implements NotificationService{//register,remove,notify,state
    private List<StudentBatch> registeredBatches;
    private String currentVersion;

    public NewIphone(){
        this.registeredBatches = new ArrayList<>();
    }

    @Override
    public boolean register(StudentBatch sb) {
        return registeredBatches.add(sb);
    }

    @Override
    public boolean remove(StudentBatch sb) {
        return registeredBatches.remove(sb);
    }

    @Override
    public void notifyBatches() {
        for(StudentBatch sb: registeredBatches){
            sb.update(currentVersion);//use of batch obj ref
        }
    }

    public void setNewIphoneVersion(String version){
        this.currentVersion = version;
        notifyBatches();
    }

}
