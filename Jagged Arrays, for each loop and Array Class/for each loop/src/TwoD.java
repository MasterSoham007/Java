public class TwoD {

    public static void printArray(int[][] a){
        for(int[] innerArray : a){
            for(int val : innerArray){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] theArray = {{1,2,3},{4,5,6}};
        printArray(theArray);
    }
}
