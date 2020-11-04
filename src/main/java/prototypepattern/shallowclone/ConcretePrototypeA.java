package prototypepattern.shallowclone;

import java.util.List;

/**
 * @Author: charles
 * @Description:  创建具体需要克隆的对象
 * @Date Created in 2020/10/20 13:40
 * @Modified By:
 */
public class ConcretePrototypeA implements Prototype{

    private String code;
    private String name;
    private List hobbies;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }
    public Prototype clone() {
        ConcretePrototypeA concretePrototypeA = new  ConcretePrototypeA();
        concretePrototypeA.setCode(this.code);
        concretePrototypeA.setHobbies(this.hobbies);
        concretePrototypeA.setName(this.name);
        return concretePrototypeA;
    }
}
