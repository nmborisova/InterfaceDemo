package bg.smg;

public class Main {

    public static void main(String[] args) {
	    MyClass obj = new MyClass();
        System.out.println(MyClass.NUMBER);
        System.out.println(obj.getSymbol(3));
        System.out.println(obj.getNumber(12.5));
    }
}
