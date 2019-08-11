package yo.maddy.com.maplib;

import java.util.Collection;
import java.util.Iterator;

public class Test {





    /**
     * computes arithmetic mean for a set of Integer values
     *
     * @param numbers
     * @return
     */
    public static double computeMeanInt(Collection<? extends Number> numbers) {
        double result = 0;
        Iterator<? extends  Number> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            result += iterator.next().intValue();
        }
        return result/numbers.size();
    }



    private void mySecter(){

        SecretClass secretClass = new SecretClass();



    }
}
