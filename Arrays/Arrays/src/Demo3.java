
class Calc{

    public int add(int nums[]){
        int result = 0;
        for(int n : nums){
            result = result + n;
        }

        return result;
    }

}

public class Demo3 {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int result = obj.add(new int[]{5,4,3,2});  // Anonymous array
        System.out.println(result);
    }
}
