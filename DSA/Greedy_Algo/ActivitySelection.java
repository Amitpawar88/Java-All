import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;

public class ActivitySelection {
    public static void main(String[] args) {
        int[] start = {3, 1, 0, 8, 5, 5};
        int[] end = {4, 2, 6, 9, 7, 9};

        // Sorting 
        int[][] activities = new int[start.length][3];

        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // lambda function -> shortform
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                //activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("max Activities = " + maxAct);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
