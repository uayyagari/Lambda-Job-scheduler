package edu.nyu.cs9053.homework8;

/**
 * Created by Uayyagari on 4/5/17.
 */
abstract class AbstractJob {
    private final int startTime;
    private final int endTime;

    public AbstractJob(int startTime, int endTime){
        if(startTime > endTime){ throw new IllegalArgumentException("start time can't be greater than end time");}
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime(){ return startTime; }

    public int getEndTime(){ return endTime; }
}
