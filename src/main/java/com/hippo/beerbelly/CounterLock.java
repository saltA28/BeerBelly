package com.hippo.beerbelly;

public class CounterLock {

    private int count;


    public boolean isFree() {
        return count == 0;
    }

    public void release() {
        count--;
        if (count < 0) {
            throw new IllegalStateException("Release time is more than occupy time");
        }
    }

    public void occupy() {
        count++;
    }
}