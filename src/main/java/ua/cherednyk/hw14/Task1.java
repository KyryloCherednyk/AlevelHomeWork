package ua.cherednyk.hw14;
public class Task1 {
    public static void main(String[] args) {
        for (int i = 49; i >= 0; i--) {
            int threadNumber = i;
            Thread thread = new Thread(() -> {
                System.out.println("Hello from thread " + threadNumber);
            });
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
