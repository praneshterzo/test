import java.lang.String;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] nums = new int[2][2];
        nums[1][0] = 99;
        nums[1][1] = 42;
        System.out.println(Arrays.deepToString(nums));
        System.out.println(nums[0].length);
    }
}