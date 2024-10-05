/**
 * https://leetcode.com/problems/lemonade-change/description/
 */
public class LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for(int bill: bills){
            if(bill == 5){
                five++;
            } else if(bill == 10){
                if(five > 0){
                    five--;
                    ten++;
                } else {
                    return false;
                }
            } else if(bill == 20){
                if(five > 0 && ten > 0){
                    five--;
                    ten--;
                } else if(five >= 3){
                    five -= 3;
                } else{
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] bills = {5,5,5,10,20};
        System.out.println(lemonadeChange(bills));
    }
}