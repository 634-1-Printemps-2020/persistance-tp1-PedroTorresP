import ch.hesge.cours634.counter.Counter;
import ch.hesge.cours634.counter.CounterException;
import ch.hesge.cours634.counter.UpperLimitedPositiveCounter;

public class Main {

    public static void main(String[] args) throws CounterException {
        Counter ct1 = new Counter();
        ct1.inc();
        System.out.println(ct1.getValue());
        ct1.add(9);
        System.out.println(ct1.getValue());
        UpperLimitedPositiveCounter ct2 = new UpperLimitedPositiveCounter(5,10);
        ct2.inc();
        System.out.println(ct2.getValue());
        ct2.add(-5);
        System.out.println(ct2.getValue());


    }
}
