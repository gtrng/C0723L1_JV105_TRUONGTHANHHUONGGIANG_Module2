package SS4_Class.Fan;

public class Test {
    public static void main(String[] args) {
        Fan fan1 =new Fan(4,true,"blue",11);
        Fan fan2 =new Fan(5,false,"white",10);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
