package singletonpattern;

/**
 * @Author: charles
 * @Description:  内部类实现单例
 * @Date Created in 2020/10/19 20:52
 * @Modified By:
 */
public class LazyInnerClasssingleton {

    //这种形式兼顾了饿汉式的内存浪费，也兼顾了synchronized性能问题
    //完美的屏蔽了这两个缺点

    //默认使用LazyInnerClasssingleton的时候，会喜爱那初始化内部类
    //如果不使用的话内部内是不会加载的
    private LazyInnerClasssingleton(){}

    //每一个关键字都不是多余的
    //static 是为了使得单例的空间共享
    //final 是为了使得方法不被重写，和重载
    public static final LazyInnerClasssingleton getInstance(){
        //在返回结果以前，一定会先加载内部类
        return LazyHolder.LAZY;
    }

    //默认不加载
    public static class LazyHolder{
        private static final LazyInnerClasssingleton LAZY = new LazyInnerClasssingleton();
    }

}
