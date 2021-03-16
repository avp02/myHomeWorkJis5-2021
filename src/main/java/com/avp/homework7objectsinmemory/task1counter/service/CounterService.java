package com.avp.homework7objectsinmemory.task1counter.service;

import com.avp.homework7objectsinmemory.task1counter.bean.Counter;

import java.util.Random;

public class CounterService {

    private final Counter counter;

    public CounterService(Counter counter) {
        this.counter = counter;
    }

    public void increment() {
        if ((counter.getValue() + counter.getStep() <= 100)) {
            counter.setValue(counter.getValue() + counter.getStep());
        }
    }

     public void decrement() {
         if ((counter.getValue() - counter.getStep()) >= 0) {
             counter.setValue(counter.getValue() - counter.getStep());
         }
     }

    public void reset() {
        counter.setStep(1);
        counter.setValue(0);
    }

    public void setValue() {
        Random random = new Random();
        counter.setValue(random.nextInt(101));
    }

    public void getValue() {
        counter.getValue();
    }

    public void setStep() {
        Random random = new Random(1);
        counter.setStep(random.nextInt(11));
    }

    public void getStep() {
        counter.getStep();
    }

}
