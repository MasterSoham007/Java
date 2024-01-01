public class Demo7 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("abcdefghijklmnop");
        System.out.println(sb.capacity());
        sb.append("q");
        System.out.println(sb.capacity()); // how many charecters you can add
        System.out.println(sb.length());  // how many charecters are present


        StringBuffer sb2 = new StringBuffer("Sachin");
        System.out.println(sb2);
        System.out.println(sb2.capacity());
        System.out.println(sb2.charAt(1));
        sb2.setCharAt(1,'A');
        System.out.println(sb2);

        StringBuffer sb3 = new StringBuffer(150);
        System.out.println(sb3.capacity());
        sb3.append("java");
        System.out.println(sb3);
        sb3.trimToSize();
        System.out.println(sb3.capacity());

        StringBuilder sb4 = new StringBuilder("java");
        System.out.println(sb4);
        System.out.println(sb4.reverse());
    }
}
