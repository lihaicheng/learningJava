package chip;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThreadPool {
    public static void main(String[] args) {
        BlockingDeque<Runnable> workQueue = new LinkedBlockingDeque<>();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                3, 5, 1000,
                TimeUnit.MICROSECONDS, workQueue
        );
        //for (int i = 0 ; i < 10 ; i++)
        {
            //System.out.println("test"+i);
            threadPoolExecutor.execute(new DeadLock());
            //System.out.println("test"+i);
        }

    }
}
class DeadLock implements Runnable
{
    public void run()
    {
        //for (int i = 0 ; i < 10 ; i++)
        {
            System.out.println((long)(Math.pow(26, 9)));
        }
    }
}