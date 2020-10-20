package singletonpattern;

/**
 * @Author: Charles
 * @Description:
 * @Date Created in 2020/10/19 20:03
 * @Modified By:
 */
public class MianTest {

    public static void main(String[] args) {
//        Thread thread1 = new Thread(new ExectorThread());
//        Thread thread2 = new Thread(new ExectorThread());
//        thread1.start();
//        thread2.start();
//        System.out.println("End");

        Thread thread1 = new Thread(new ExectorThread());
        Thread thread2 = new Thread(new ExectorThread());
        thread1.start();
        thread2.start();
        System.out.println("End");
    }
}
