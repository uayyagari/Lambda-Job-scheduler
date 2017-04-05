package edu.nyu.cs9053.homework8;

/**
 * Created by Uayyagari on 4/4/17.
 */

public class WeightedJob extends AbstractJob {
    private final int cost;

    public WeightedJob(int startTime, int endTime, int cost){
        super(startTime, endTime);
        if(cost < 0){ throw new IllegalArgumentException("start time can't be greater than end time");}
            this.cost = cost;
    }

    public int getCost(){
        return cost;
    }
}
