public class Demo2 {
    public static void main(String[] args) {
        String s1 = "Soham";
        String s2 = "Soham";
        System.out.println(s1 == s2);

        String s3 = new String("Soham");
        String s4 = new String("Soham");
        System.out.println(s3 == s4);

        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

        String s5 = "Soham";
        String s6 = "Soham";
        String s7 = "SOHAM";
        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));
        System.out.println(s5 == s7);
        System.out.println(s5.equals(s7));
        System.out.println(s6.equalsIgnoreCase(s7));

    }
}
