package prototypepattern.shallowclone;

import prototypepattern.shallowclone.bean.Client;
import prototypepattern.shallowclone.service.impl.ConcretePrototypeAServiceImpl;

import java.util.ArrayList;

/**
 * @Author: charles
 * @Description: 原型模式测试
 * @Date Created in 2020/10/20 13:49
 * @Modified By:
 */
public class PrototypeTest {

    public static void main(String[] args) {

        //创建一个具体需要克隆的对象
        ConcretePrototypeAServiceImpl concretePrototype = new ConcretePrototypeAServiceImpl();
        //填充属性方便测试
        concretePrototype.setName("张三");
        concretePrototype.setCode("01");
        concretePrototype.setHobbies(new ArrayList());
        System.out.println("原对象："+concretePrototype);

        //创建client对象，准备开始克隆
        Client client = new Client(concretePrototype);
        ConcretePrototypeAServiceImpl concretePrototypeClone = (ConcretePrototypeAServiceImpl)client.startClone(concretePrototype);
        System.out.println("克隆就的对象:"+concretePrototypeClone);
        System.out.println("原对象中引用类型地址值："+concretePrototypeClone.getHobbies());
        System.out.println("克隆对象中引用类型地址值:"+concretePrototypeClone.getHobbies());
        System.out.println("对象地址比较:"+(concretePrototypeClone.getHobbies() == concretePrototype.getHobbies()));
        System.out.println("---------------------结论;浅克隆只是复制了引用地址，并不是值----------------------------");
    }
}
