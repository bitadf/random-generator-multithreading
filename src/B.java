import javax.swing.plaf.IconUIResource;
import java.util.concurrent.Semaphore;
public class B implements Runnable{
    public void run(){
        try {
           while (true){
                Sem.sem_A_B.acquire();
               if (Sem.count >= Sem.n){
                   Sem.sem_C.release();
                   Sem.sem_A_B.release();
                   break;
               }
                System.out.print("b");
                Sem.count++;
               Sem.sem_A_B.release();
            }
        }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }



    }
}
