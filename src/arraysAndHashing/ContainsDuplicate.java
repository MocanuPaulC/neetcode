package arraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ContainsDuplicate {
    int[] nrs = new int[]{0,1,2,3,4};
    int[] nrsDup = new int[]{0,1,2,3,4,5,5,5};


    boolean checkDUplicate(int[] nums){
        Arrays.sort(nums);


        for (int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1])return true;
        }
        return false;
    }


}
