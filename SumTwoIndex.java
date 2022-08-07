import java.util.*;

public class SumTwoIndex {

    public static int[] twoIndex(int[] twoIndex, int t, int s, int l) {
        if(s>l) return new int[]{-1,-1};
        else
        {
            int sum=twoIndex[s]+twoIndex[l];
            if(sum==t)return new int[]{s,l};
            if(sum>t) return twoIndex(twoIndex,t,s,l-1);
            return twoIndex(twoIndex,t,s+1,l);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter the Number of Elements you want to add");
            int[] twoIndex = new int[sc.nextInt()];
            System.out.println("Enter the Target Element you want to Find");
            int taregt = sc.nextInt();
            for(int i=0; i<twoIndex.length-1; i++)
            {
                System.out.println("Enter your" + i + "element");
                twoIndex[i] = sc.nextInt();
            }
            Arrays.sort(twoIndex);
            System.out.println(Arrays.toString(twoIndex(twoIndex,taregt, 0, twoIndex.length-1)));
        }
    }
}
