public class Demo5 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Virat");
        System.out.println(sb);

        //StringBuffer sb = "";  invalid
        sb.append("Kohli");
        System.out.println(sb);


        StringBuilder sb2 = new StringBuilder("Soham");
        System.out.println(sb2);

        //StringBuilder sb2 = "";  invalid
        sb2.append("Goswami");
        System.out.println(sb2);
    }
}
