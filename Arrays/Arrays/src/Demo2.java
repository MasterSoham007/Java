public class Demo2 {
    public static void main(String[] args) {

//        int nums[][] = new int[3][2];
//        nums[0][0] = 5;
//        nums[0][1] = 4;
//        nums[1][0] = 3;
//        nums[1][1] = 2;
//        nums[2][0] = 1;
//        nums[2][1] = 0;

//        int nums[][] = {
//                {1,2},
//                {2,2},
//                {3,2}
//        };

        int nums[][] = new int[3][];
        nums[0] = new int[4];
        nums[1] = new int[2];
        nums[2] = new int[3];

        nums[0][0] = 5;
        nums[0][1] = 2;
        nums[0][2] = 3;
        nums[0][3] = 6;
        nums[1][0] = 8;
        nums[1][1] = 3;
        nums[2][0] = 9;
        nums[2][1] = 4;
        nums[2][2] = 8;

        for(int innerarray[] : nums){
            for(int number : innerarray){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
