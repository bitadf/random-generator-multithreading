public class Thread_one implements Runnable{
@Override
public void run(){
    try {
        Sem.sem_t1_t2_t3.acquire();
        while (true){
            if(Sem.t1 + Sem.t2 + Sem.t3 == Sem.base) break;
            Sem.t1++;
            Sem.sem_t1_t2_t3.release();
        }
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}
}
