package prototypepattern.shallowclone.bean;

import prototypepattern.shallowclone.service.PrototypeService;

/**
 * @Author: charles
 * @Description: 创建客户端调用
 * @Date Created in 2020/10/20 13:46
 * @Modified By:
 */
public class Client {

    private PrototypeService prototypeService;

    public Client(PrototypeService prototypeService) {
        this.prototypeService = prototypeService;
    }

    public PrototypeService startClone(PrototypeService prprototypeServiceototype){
        return prototypeService.clone();
    }
}
