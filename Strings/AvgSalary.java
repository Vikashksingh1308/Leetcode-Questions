/**
 * https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/
 */
import java.util.Arrays;

public class AvgSalary {
    public static double average(int[] salary) {
        Arrays.sort(salary);
        double sum = 0;
        for(int i=1; i<salary.length-1; i++){
            sum = sum + salary[i];
        }
        return sum/(salary.length-2);
    }

    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        System.out.println(average(salary));
    }
}
