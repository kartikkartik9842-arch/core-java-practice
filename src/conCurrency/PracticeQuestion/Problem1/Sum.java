package conCurrency.PracticeQuestion.Problem1;

import java.util.List;
import java.util.concurrent.Callable;

public class Sum implements Callable<Long> {

    private List<Integer> arr;
    private int end;
    private int start;

    public Sum(List<Integer> arr, int start, int end) {
        this.end = end;
        this.start = start;
        this.arr = arr;
    }

    @Override
    public Long call() throws Exception {
        long sum=0;
        for(int i =start; i<end; i++){
            sum+=arr.get(i);
        }
        return sum;
    }
}
