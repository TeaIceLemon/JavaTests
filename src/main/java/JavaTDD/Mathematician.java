package JavaTDD;
public class Mathematician {

    private Calculator calculator;

    public Mathematician(Calculator calculator) {
        this.calculator = calculator;
    }

    public int wykonajBardzoTrudneObliczenia(){

        int calka = calculator.obliczCalke();
        int calka2 = calculator.obliczCalke();

        return calculator.add(calka, calka2);
    }
}
