package edu.nyu.cs9053.homework8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Uayyagari on 4/4/17.
 */

public class LambdaWeightedScheduler {
    public static int maxCostCalculator(ArrayList<WeightedJob> jobList){

        int listLength = jobList.size();
        jobSorter(jobList);

        int[] maxCost = new int[listLength];
        maxCost[0] = jobList.get(0).getCost();

        for(int i = 1; i < listLength; i++){
            int costSum = jobList.get(i).getCost();
            int prevCompatibleJobIndex = getPreviousCompatibleIndex(jobList, i);

            if(prevCompatibleJobIndex != -1){
                costSum += maxCost[prevCompatibleJobIndex];
            }
            maxCost[i] = Math.max(maxCost[i-1], costSum);
        }
        return maxCost[listLength - 1];

    }

    private static int getPreviousCompatibleIndex(ArrayList<WeightedJob> list, int globalIndex){
        for(int j = globalIndex - 1; j >= 0; j--){
            if(list.get(globalIndex).getStartTime() >= list.get(j).getEndTime()){
                return j;
            }
        }
        return -1;
    }

    private static void jobSorter(ArrayList<WeightedJob> listOfJobs) {
        Collections.sort(listOfJobs, new Comparator<WeightedJob>() {
            @Override
            public int compare(WeightedJob job1, WeightedJob job2) {
                if (job1.getEndTime() < job2.getEndTime()) {
                    return -1;
                }
                return 1;
            }
        });
    }
}
