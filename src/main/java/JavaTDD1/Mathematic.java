package JavaTDD1;

public class Mathematic {
    private Calculator calculator;

    public Mathematic(Calculator calculator) {
        this.calculator = calculator;
    }

    public int doVeryComplicatedMaths(){
        int calka = calculator.obliczCalke();
        int calka2 = calculator.obliczCalke();
        return calculator.add(calka,calka2);
    }
}
