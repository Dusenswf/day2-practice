import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static void decreaseDays(ArrayList<Integer> remainingDays) {
        for (int i = 0; i < remainingDays.size(); i++) {
            int remainingDay = remainingDays.get(i);
            if (remainingDay == 0) continue;
            remainingDays.set(i, remainingDay - 1);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<Integer>(Arrays.asList(0,0,4,2,0,0,1));
        decreaseDays(lst);
    }
}
