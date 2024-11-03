package Lecture11;

public class BS_SearchSpace {

    public static void main(String[] args) {

        int distance = 421;
        int time = 6;

        System.out.println(reachCenter(distance, time));


    }

    public static boolean check(int speed, int distance, int time) {

        int dist_travelled = speed * time;

        return (dist_travelled >= distance);
    }

    public static int reachCenter(int distance, int time) {

        int high = 200;
        int low = 0;

        int ans = -1;

        while(low <= high) {
            int mid = (high + low)/ 2;

            if(check(mid, distance, time)) {
                ans = mid;
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
    
}
