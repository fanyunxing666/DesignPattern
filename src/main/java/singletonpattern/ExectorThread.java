package singletonpattern;

/**
 * @Author: charles
 * @Description:  创建线程类进行测试
 * @Date Created in 2020/10/19 20:00
 * @Modified By:
 */
public class ExectorThread implements Runnable{


    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    public void run() {
//        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
//        System.out.println(Thread.currentThread().getId()+"：--"+lazySimpleSingleton);

        LazyInnerClasssingleton lazySimpleSingleton = LazyInnerClasssingleton.getInstance();
        System.out.println(Thread.currentThread().getId()+"：--"+lazySimpleSingleton);
    }
}
