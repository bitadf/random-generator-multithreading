import java.util.concurrent.Semaphore;
public class Sem{
    static int base = 70;
    static int t1 = 0 ;
    static int t2 = 0 ;
    static int t3 = 0 ;
    static Semaphore sem_t1_t2_t3 = new Semaphore(1);
    static int n;
    static Semaphore sem_C = new Semaphore(-1);
    static Semaphore sem_A_B = new Semaphore(1);
    static volatile int count = 0;

    static void recalculate(){
        sem_A_B = new Semaphore(1);
        sem_C = new Semaphore(-1);
        sem_t1_t2_t3 = new Semaphore(1);
        count = 0;
        t1 = 0;
        t2 = 0;
        t3 = 0 ;

    }


}
