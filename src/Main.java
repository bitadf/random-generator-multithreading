public class Main {
    public static void main(String[] args) throws InterruptedException {
        int counter = 1;

        for (int i = 1; i <= Sem.base; i++) {

            Sem.recalculate();

            Thread t1 = new Thread(new Thread_one());
            Thread t2 = new Thread(new Thread_two());
            Thread t3 = new Thread(new Thread_three());
            t1.start();
            t2.start();
            t3.start();

            t1.join();
            t2.join();
            t3.join();



             Sem.n = (Sem.t2 + Sem.t3) + (Sem.t3 % 3);

               if(Sem.n >= Sem.base){
                   Sem.n -= Math.abs(Sem.t2 - (Sem.t3 % 6) - 20);
                   if(Sem.n < 0 ){
                       Sem.n = -Sem.n;
                   }
               }
               if(Sem.n == 0)continue;

            System.out.println("Test Case : " + counter);
            counter++;
            System.out.println("n is : " + Sem.n);

            Thread t_a = new Thread(new A());
            Thread t_b = new Thread(new B());
            Thread t_c = new Thread(new C());
            t_a.start();
            t_b.start();
            t_c.start();

            t_a.join();
            t_b.join();
            t_c.join();
            System.out.println();
        }
    }
}