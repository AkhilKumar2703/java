public class lc852 {
    public static void main(String[] args) {

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

}
