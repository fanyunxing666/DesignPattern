package prototypepattern.shallowclone.service;

/**
 * @Author: charles
 * @Description:  原型模式主要适用场景：
 * 1、类初始化消耗资源较多。
 * 2、new产生的一个对象需要非常繁琐的过程（数据准备、访问权限等）
 * 3、构造函数比较复杂。
 * 4、循环体中生产大量对象时
 * @Date Created in 2020/10/20 11:39
 * @Modified By:
 */
public interface PrototypeService {

    PrototypeService clone();
}
