package JavaTDD;
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int multiple(int a, int b) {
        return a * b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public double divide(Integer a, Integer b) {
        if(a == null || b == null || b == 0){
            throw new IllegalArgumentException("Bad argument");
        }
        return a / b;
    }

    public int obliczCalke(){
        // Bardzo skomplikowane obliczenia
        return 0;
    }
}
