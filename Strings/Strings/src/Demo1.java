public class Demo1 {
    public static void main(String[] args) {
        String name = "Soham"; // Immutable
        System.out.println(name);
        name.concat("Goswami");
        System.out.println(name);

        StringBuilder name1 = new StringBuilder("Soham"); // Mutable
        System.out.println(name1);
        name1.append("Goswami");
        System.out.println(name1);
    }
}
