public class Demo1 {
    public static void main(String[] args) {
        int nums[] = new int[4];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;

        String names[] = {"Soham", "Sambaran", "Anik"};

        for(String name: names){
            System.out.println(name);
        }

        for(int number:nums){
            System.out.println(number);
        }

    }
}
