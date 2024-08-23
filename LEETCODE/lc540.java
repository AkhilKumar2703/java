public class lc540 {
    public static void main(String[] args) {
        int []arr ={1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));
    }


    static  int singleNonDuplicate(int[] nums) {
        int start= 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start +(end -start)/2;
            if(mid %2 ==0){
              if(nums[mid]==nums[mid-1] && nums[mid]<nums[mid+1]){
                end = mid -1;

              }
            }else {
                  start = mid +1;

                 }

            }
        
        return nums[start];
        
    }
}
