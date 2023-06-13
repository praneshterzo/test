import java.lang.String;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1 ,23, 43, 0 ,0};
        nums[3] = 37;
        nums[4] = 7;
        System.out.println(Arrays.toString(nums));
        System.out.println(nums.length);
    }
}