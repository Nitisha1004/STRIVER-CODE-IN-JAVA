import java.util.Arrays;
import java.util.Scanner;

public class RepeatMissing {

    public static void findMissingAndRepeating(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int repeating = -1;
        int missing = -1;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                repeating = nums[i];
            } else if (nums[i + 1] - nums[i] > 1) {
                missing = nums[i] + 1;
            }
        }

        if (nums[n - 1] != n) {
            missing = n;
        }

        System.out.println("Repeating number: " + repeating);
        System.out.println("Missing number: " + missing);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int [] nums = new int[size];
        System.out.println("Enter the elements of array:");
        for(int i=0; i<size; i++){
         nums[i] = sc.nextInt();
        }
        findMissingAndRepeating(nums);
    }
}
