package edu.nyu.cs9053.homework8;

import java.util.ArrayList;

/**
 * Created by Uayyagari on 4/4/17.
 */
public class Main {
    public static void main(String[] args){

        ArrayList<Job> jobList = new ArrayList<>(10);

        jobList.add(new Job(1,3));
        jobList.add(new Job(2,3));
        jobList.add(new Job(3,4));
        jobList.add(new Job(3,5));
        jobList.add(new Job(5,8));
        jobList.add(new Job(4,9));
        jobList.add(new Job(6,10));
        jobList.add(new Job(8,10));
        jobList.add(new Job(9,10));
        jobList.add(new Job(10,11));

        System.out.println(LambdaScheduler.maxJobsCalculator(jobList));
    }
}
