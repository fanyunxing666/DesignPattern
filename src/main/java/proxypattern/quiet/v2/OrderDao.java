package proxypattern.quiet.v2;

/**
 * @Author: charles
 * @Description:  创建OrderDao持久层操作类
 * @Date Created in 2020/10/26 20:53
 * @Modified By:
 */
public class OrderDao {

    public int insert(Order order){
        System.out.println("OrderDao创建order成功!");
        return 1;
    }
}
