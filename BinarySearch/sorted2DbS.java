package BinarySearch;

public class sorted2DbS {
    public static void main(String[] args) {

    }

    //
    static int[] BinarySearch(int[] matrix, int row, int cstart, int cend, int targetRow, int target) {
while(cstart < cend) {
    int mid = cstart +(cend - cstart)/2;
    if(matrix[row][mid]=target){
        
      return int new[]{row, mid};
    } 
       if(matrix[row][mid]<target){
    cstart = mid+1;

    }else{
        cend = mid-1;
    }
}
      return new int[]{-1,-1};
    }

    int[] search(int[][] matrix, int target) {

        int row = matrix.length;
        int col = matrix[0].length;

        if (row == 1) {
            return BinarySearch(matrix, 0, 0, col - 1, target);

        }
        // run loop till two rows are remaining
        int rStart = 0;
        int rEnd = rows - 1;
        int cmid = col / 2;
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cmid] == target) {
                return new int[] { mid, cmid };

            }
            if (matrix[mid][cmid] < target) {
                rStart = mid;

            } else {
                rEnd = mid;
            }

        }
        // now we have two rows
        // now we will check the target in those two rows
        if (matrix[rStart][cmid] == target) {
            return new int[] { rStart, cmid };
        }
        if (matrix[rStart + 1][cmid] == target) {
            return new int[] { rStart + 1, cmid };
        }
        // if not the mido of thise two rows then we
        // check the remaining part of rows
        // case 1 first half of the first row
        if (target <= matrix[rStart][cmid - 1]) {
            return BinarySearch(matrix, rStart, 0, cmid - 1, target);

        }
        // case 2 second half of the first row
        if (target >= matrix[rStart][cmid + 1]) {
            return BinarySearch(matrix, rStart, cmid + 1, col - 1, target);

        }
        // case 3 first half of the second row
        if (target <= matrix[rStart + 1][cmid - 1]) {
            return BinarySearch(matrix, rStart + 1, 0, cmid - 1, target);

        }
        // case 4 second half of the second row
        if (target >= matrix[rStart + 1][cmid + 1]) {
            return BinarySearch(matrix, rStart + 1, cmid + 1, col - 1, target);

        }

    }
}