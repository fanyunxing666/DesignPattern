package singletonpattern;

/**
 * @Author: charles
 * @Description: 利用静态代码块的机制实现饿汉式静态单例
 * @Date Created in 2020/10/19 19:44
 * @Modified By:
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungryStaticSingleton;

    static{
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    private static HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}
