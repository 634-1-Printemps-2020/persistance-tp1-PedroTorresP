package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {

    private int max;

    public UpperLimitedPositiveCounter(int init, int max) throws CounterException {
        super(init);
        if(init<0 || init>max){
            throw new CounterException();
        } else {this.max = max;}


    }

    public void inc() throws CounterException{
        if(getValue()+1>max){
            throw new CounterException();
        } else {super.inc();}
    }

    public void add(int n) throws CounterException{
        if(getValue()+n>max || getValue()+n<0){
            throw new CounterException();
        } else {super.add(n);}
    }


}
