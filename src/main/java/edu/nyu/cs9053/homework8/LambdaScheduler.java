package edu.nyu.cs9053.homework8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Uayyagari on 4/4/17.
 */

public class LambdaScheduler {

    public static int maxJobsCalculator(ArrayList<Job> jobList) {

        int listLength = jobList.size();
        if( listLength == 1 ) { return 1;}
        if( listLength == 0) { return 0; }

        sortArrayList(jobList);

        int[] maxJobs = new int[listLength];
        maxJobs[0] = 1;

        for(int i = 1; i < listLength; i++){
            int costSum = 1;
            int prevCompatibleJob = getPreviousCompatibleJob(jobList, i);

            if(prevCompatibleJob != -1){
                costSum = maxJobs[prevCompatibleJob] + 1;
            }

            maxJobs[i] = Math.max(maxJobs[i-1], costSum);
        }
        return maxJobs[listLength - 1];

    }

    private static int getPreviousCompatibleJob(ArrayList<Job> list, int globalIndex) {
        for(int j = globalIndex - 1; j >= 0; j--){

            if(list.get(globalIndex).getStartTime() >= list.get(j).getEndTime()){
                return j;
            }
        }
        return -1;
    }

    private static void sortArrayList(ArrayList<Job> listOfJobs) {
        Collections.sort( listOfJobs, new Comparator<Job>() {
            @Override
            public int compare(Job job1, Job job2) {
                if(job1.getEndTime() < job2.getEndTime()) {
                    return -1;
                }
                return 1;
            }
        });
    }
}
