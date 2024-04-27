import java.util.*;
public class CountingSubarrays {

    public int solve(ArrayList<Integer> A, int B) {

        int n=A.size();
        int count=0;

        for(int i=0;i<n;i++){

            int sum=0;

            for(int j=i;j<n;j++){
                sum+=A.get(j);

                if(sum<B){
                    count++;
                }

            }
        }

        return count;
    }


}
