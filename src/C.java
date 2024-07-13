public class C implements Runnable {
    public void run(){
        try {
            Sem.sem_C.acquire();
            for(int i = 0 ; i < Sem.n ; i++){
                System.out.print("c");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
