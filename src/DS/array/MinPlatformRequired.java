package DS.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
given Arrival and Departure Time of the train
Minimum number of platform required at the railway station such that no train wait for the platform
 */
public class MinPlatformRequired {
    class  Schedule {
        Schedule(int arrivalTime, int departureTime) {
            this.arrivalTime = arrivalTime;
            this.departureTime = departureTime;
        }
        int arrivalTime;
        int departureTime;
    }

    public boolean compareArrivalTime(Schedule trainA, Schedule trainB) {
        return trainA.arrivalTime< trainB.arrivalTime;
    }
    public static void main(String[] args) {
        MinPlatformRequired sol = new MinPlatformRequired();

        int [] arrivalTimes= {940,950,1100,1500,1800, 900};
        int [] departureTime= {1200,1120,1130,1900,2000, 910};
       int answer =  sol.minimumPlatformRequired(arrivalTimes,departureTime);
        System.out.println("Minimum Platform Req:"+answer);
    }

    public int minimumPlatformRequired(int arrivalTime[], int departureTime[]){
        ArrayList<Schedule>  scheduleArrayList = new ArrayList<>();
        int platformCount = 1;
        for(int i=0; i<arrivalTime.length; i++) {
            scheduleArrayList.add(new Schedule(arrivalTime[i], departureTime[i]));
        }
        scheduleArrayList.sort(new ArrivalCompare());
        PriorityQueue<Integer> latestDeparture = new PriorityQueue<>();
        latestDeparture.add(scheduleArrayList.get(0).departureTime);
        for(int i=1; i<arrivalTime.length; i++) {
            if(scheduleArrayList.get(i).arrivalTime <= latestDeparture.peek()) {
                platformCount ++;
            } else {
                latestDeparture.poll();
            }
            latestDeparture.add(scheduleArrayList.get(i).departureTime);
        }
        return platformCount;
    }
}


 class ArrivalCompare implements Comparator<MinPlatformRequired.Schedule> {

     @Override
     public int compare(MinPlatformRequired.Schedule trainA, MinPlatformRequired.Schedule trainB) {
         return trainA.arrivalTime - trainB.arrivalTime;
     }
 }