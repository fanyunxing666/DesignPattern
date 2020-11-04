package proxypattern.quiet.v1;

/**
 * @Author: charles
 * @Description:  父亲帮儿子找对象
 * @Date Created in 2020/10/26 16:18
 * @Modified By:
 */
public class Father {

    public Son son;
    //没办法扩展
    public Father(Son son) {
        this.son = son;
    }

    public void  findLove(){
        System.out.println("父母物色对象!");
        this.son.findLove();
        System.out.println("双方同意交往，确立关系!");
    }
}
