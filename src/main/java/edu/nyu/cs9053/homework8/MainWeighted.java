package edu.nyu.cs9053.homework8;

import java.util.ArrayList;

/**
 * Created by Uayyagari on 4/4/17.
 */
public class MainWeighted {
    public static void main(String[] args) {

        ArrayList<WeightedJob> jobList = new ArrayList<>(10);

        jobList.add(new WeightedJob(3, 10, 20));
        jobList.add(new WeightedJob(1, 2, 50));
        jobList.add(new WeightedJob(16, 19, 100));
        jobList.add(new WeightedJob(2, 100, 200));

        System.out.println(LambdaWeightedScheduler.maxCostCalculator(jobList));
    }
}
