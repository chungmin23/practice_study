


public class Excercise_6_20 {

    static int max(int[] nums){
        if(nums == null || nums.length == 0) return -999999;

        int max = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] data = { 3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:" + max(data));
        System.out.println("최대값:" + max(null));
        System.out.println("최대값:" + max(new int[]{}));
    }
}
