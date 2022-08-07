import java.util.Arrays;

public class LargestPossibleNum{

    public static void main(String[] args) {
        int nums[] = {2,30,56};
        Arrays.sort(nums);
        String ans="";
        for(int i=nums.length-1; i>=0; i--)
        {
            ans+=nums[i];
        }
        System.out.println(ans);
    }
}
