package singletonpattern;

/**
 * @Author: charles
 * @Description:
 * @Date Created in 2020/10/19 19:39
 * @Modified By:
 */
public class HungrySingleton {

    //先静态，再动态
    //先属性，再方法
    //先上后下
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    //构造方法
    private HungrySingleton(){}

    //入口
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
