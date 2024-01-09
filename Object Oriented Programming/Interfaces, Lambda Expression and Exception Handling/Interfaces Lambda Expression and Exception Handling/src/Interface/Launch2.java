package Interface;

interface Computer{
    void CompileCode();
}

class Laptop implements Computer{
    public void CompileCode(){
        System.out.println("You got 5 errors");
    }
}

class Desktop implements Computer{
    public void CompileCode(){
        System.out.println("You got 5 errors, faster");
    }
}

class Developer{
    public void buildApp(Computer obj){
        System.out.println("Building App");
        obj.CompileCode();
    }
}

public class Launch2 {
    public static void main(String[] args) {
        Computer obj = new Desktop();

        Developer dev = new Developer();
        dev.buildApp(obj);
    }
}
