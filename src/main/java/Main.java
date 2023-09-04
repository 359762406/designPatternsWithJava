/**
 * ClassName: ${NAME}
 * Package:
 * Description:
 *
 * @Author 刘起航
 * @Create 2023/8/30 17:54
 * @Version 1.0
 */// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        System.out.println(Math.a());
//        System.out.println(ints);
    }
    public static int removeElement(int[] nums, int val) {
//        int len = nums.length;
        int count = 0;
//        while(len > 0){
//            if(nums[len - 1] == val){
//                count ++;
//            }
//            len -- ;
//        }
        int n = 0;
        while(n < nums.length){
            if(nums[n] == val){
                count ++;
//                nums[]
            }
            n ++;
        }
        System.out.println();
//        for (int i = 0; i < nums.length - 1; i++) {
//            System.out.println(nums[i]);;
//        }
        return count;
    }

}