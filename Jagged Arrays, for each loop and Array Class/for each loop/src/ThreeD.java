public class ThreeD {
    public static void main(String[] args) {
        int[][][] threeDArray = {
                {{1,2,3},{4,5,6}},
                {{7,8,9},{10,11,12}},
                {{13,14,15},{16,17,18}}
        };

        for(int[][] outerArray: threeDArray){
            for(int [] innerArray: outerArray){
                for(int val: innerArray){
                    System.out.print(val + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
