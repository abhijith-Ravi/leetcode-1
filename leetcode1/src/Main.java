import java.util.HashMap;

// using nested loops
class Solution {
    public static int[] twoSum(int[] nums, int target) {
         int n=nums.length;
         for (int i=0;i<n-1;i++){
             for (int j=i+1;j<n;j++){
                 if(nums[i]+nums[j]==target){
                     return new int[]{i,j};
                 }
             }
         }
         return new int[]{};
    }

    // using hashtable
        public static int[] twoSumhash(int[] nums, int target) {

            // create hashmap
            HashMap<Integer,Integer> table=new HashMap<>();

            int n= nums.length;

            //feed array value as key and index as value
            for (int i=0;i<n;i++){
                table.put(nums[i],i);
            }

            for (int i=0;i<n-1;i++) {
                int another=target-nums[i];

                //check and no repeat
                if(table.containsKey(another) && table.get(another) !=i){
                    return new int[]{i,table.get(another)};
                }

            }
            return new int[]{};
        }


    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        int[] res=twoSumhash(arr,target);
        for (int s:res) {
            System.out.println(s);
        }
    }

}
