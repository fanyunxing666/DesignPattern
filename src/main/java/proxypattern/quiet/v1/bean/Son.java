package proxypattern.quiet.v1.bean;

import proxypattern.quiet.v1.service.Person;

/**
 * @Author: charles
 * @Description: 日子要找对象，要实现Person接口
 * @Date Created in 2020/10/26 16:16
 * @Modified By:
 */
public class Son implements Person {


    public void findLove() {
        //工作忙
        //没有时间自己找
        System.out.println("儿子要求:肤白，貌美，大长腿!");
    }
}
