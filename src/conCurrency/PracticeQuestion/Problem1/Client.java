package conCurrency.PracticeQuestion.Problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long startTime = System.currentTimeMillis();
        int noOfThreads=3;
        List<Integer> list= List.of(1,2,3,4,5,6,7,8,9,10);
        int chunkSize= list.size()/noOfThreads;
        ExecutorService executor= Executors.newFixedThreadPool(noOfThreads);

        long res=0;
        int start=0;
        int end=0;
        List<Future<Long>> futureList= new ArrayList<>();

        for(int i =0; i<noOfThreads;i++){
            end = (i == noOfThreads - 1) ? list.size() : start + chunkSize;
            Sum sum= new Sum(list, start, end);
            start= start+chunkSize;
            Future<Long> futureSum=executor.submit(sum);
            futureList.add(futureSum);

        }

        for(int i =0; i<futureList.size(); i++){
            res= res+ futureList.get(i).get();
        }


        System.out.println("res:"+res);
        long endTime=System.currentTimeMillis();
        System.out.println("total time:"+ (endTime-startTime));
        executor.shutdown();
    }
}

//find the array sum using no of threads and threads will be equal to no of core and  now
// each thread will have size of array to get sum other array part will provide
// to other chunk and so on. so parrallelly sum can be made and in the end each
// thread summ will be added to final sun