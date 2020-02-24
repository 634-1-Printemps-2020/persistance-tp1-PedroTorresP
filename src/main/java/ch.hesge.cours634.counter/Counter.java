package ch.hesge.cours634.counter;

public class Counter implements ICounter {

    private int counter;
    private int max;

    public Counter(){
        counter = 0;
    }


    public Counter(int init){
        counter = init;
    }


    public void inc() throws CounterException{
        counter++;

    }

    public void add(int n) throws CounterException{
        if(n<0){
            throw new CounterException();
        } else {counter+=n;}


    }

    public int getValue(){
        return counter;

    }
}
