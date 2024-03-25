public class lc1491 {

}

class Solution {
    public double average(int[] salary) {
        double average;
        int n = salary.length;
        double total = 0;
        Arrays.sort(salary);
        for (int i = 1; i < n - 1; i++) {
            total = total + salary[i];
        }
        // finding Average after excluding minimum and maximum salaries.
        average = total / (n - 2);
        return average;
    }
}
