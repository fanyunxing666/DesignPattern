package singletonpattern;

/**
 * @Author: charles
 * @Description: 懒汉式单例的简单实现
 * @Date Created in 2020/10/19 19:55
 * @Modified By:
 */
public class LazySimpleSingleton {

    //懒汉式单例，在外部需要使用的时候才进行实例化
    private LazySimpleSingleton lazySimpleSingleton;
    //静态快块，在公共内存区域
    private static LazySimpleSingleton lazy = null;
    public static synchronized LazySimpleSingleton getInstance(){
        if(lazy == null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }

}
