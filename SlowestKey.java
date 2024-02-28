import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlowestKey {
    public static char slowestKey(int[] releaseTimes, String keyspressed){
        int maxTime = Integer.MIN_VALUE;
        char out = '\u0000';
        for (int i=0; i<releaseTimes.length; i++){
            int time;
            if (i==0){
                time = releaseTimes[i];
            }else {
                time = releaseTimes[i] - releaseTimes[i-1];
            }
            if (time >= maxTime){

                if (time == maxTime){
                    int compare = Character.compare(keyspressed.charAt(i), out);
                    if (compare > 0){
                        out = keyspressed.charAt(i);
                    }
                }else {
                    out = keyspressed.charAt(i);
                }

                maxTime = time;
            }
        }
        return out;
    }
    public static void main(String[] args) {
        int[] nums = {9,29,49,50};
        System.out.println(slowestKey(nums, "cbcd"));
    }
}
