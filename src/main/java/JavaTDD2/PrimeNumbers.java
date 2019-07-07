package JavaTDD2;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public List<Integer> getPrimeNumbers(int range) {
        List<Integer> toReturn = new ArrayList<>();
        for (int i = 2; i <= range; i++) {
            int maxDivider = (int)Math.sqrt(i);
            boolean isPrime = false;
            for (int j = 2; j <= maxDivider; j++) {
                if (i % j == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime) {
                toReturn.add(i);
            }
        }
        return toReturn;
    }

}
