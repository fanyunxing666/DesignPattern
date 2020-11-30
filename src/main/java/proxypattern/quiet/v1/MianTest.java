package proxypattern.quiet.v1;

import proxypattern.quiet.v1.bean.Father;
import proxypattern.quiet.v1.bean.Son;

/**
 * @Author: charles
 * @Description:  测试
 * @Date Created in 2020/10/26 16:22
 * @Modified By:
 */
public class MianTest {
    public static void main(String[] args) {

        //只能帮儿子找对象
        //不能找表妹，不能帮陌生人

        Father father = new Father(new Son());
        father.findLove();
    }
}
