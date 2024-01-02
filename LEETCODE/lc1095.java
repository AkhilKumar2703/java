public class lc1095 {
    public static void main(String[] args) {

    }

    public int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
  int ft =binarySearch(arr, target, 0, peak)
    if(ft!=-1){
    return ft;
     }
     return binarySearch(arr, target, peak+1 , arr.length-1)
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // we are in dec part od mountian array
                // it means that it might be the largest
                // we look at the left
                end = mid;

            } else {
                // we are in asc part of mountian array
                // as mid+1>mid element
                start = mid + 1;
            }

        }
        // after both checks we will get our max element
        // when they will point at one element it means that is the max element
        // here at last (end == start)
        return start; // also we can return (end)as both are equal
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        boolean asc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid]==target) {
                return mid;
            }

           if(asc){ 
            if (target < arr[mid]) {
                end = mid - 1;
            } else (target > arr[mid]) {
                start = mid + 1;}
            } 
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else  (target < arr[mid]) {
                    start = mid + 1;}
        }
        return -1;
    }
}
