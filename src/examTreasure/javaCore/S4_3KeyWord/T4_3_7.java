package examTreasure.javaCore.S4_3KeyWord;

public class T4_3_7 {
    public static void main(String[] args) {
        Task task = new Task();
        Run run = new Run();
        new Thread(task).start();
        new Thread(run).start();
        new Thread(run).start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        task.stop();
    }
}
class Task implements Runnable
{
    private /* volatile */Boolean flag = true;
    public void stop()
    {
        flag = false;
        System.out.println("stop");
    }
    public void run()
    {
        while(flag)
        {
            System.out.println("task running");
        }
    }
}
class Run implements Runnable
{
    public void run()
    {
        for (int i = 0 ; i < 3000 ; i++)
        {
            int flad = 0;
        }
    }
}