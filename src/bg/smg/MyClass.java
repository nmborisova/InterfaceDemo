package bg.smg;

public class MyClass implements MyInterface {

    @Override
    public char getSymbol(int n) {
        return (char)('A'+n);
    }

    @Override
    public int getNumber(double x) {
        return (int)x;
    }
}
