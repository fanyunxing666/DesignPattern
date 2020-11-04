package prototypepattern.shallowclone;

/**
 * @Author: charles
 * @Description: 创建客户端调用
 * @Date Created in 2020/10/20 13:46
 * @Modified By:
 */
public class Client {

    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype startClone(Prototype prototype){
        return prototype.clone();
    }
}
