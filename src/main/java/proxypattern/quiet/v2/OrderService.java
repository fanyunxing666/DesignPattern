package proxypattern.quiet.v2;

/**
 * @Author: charles
 * @Description:
 * @Date Created in 2020/10/26 20:56
 * @Modified By:
 */
public class OrderService implements IOrderService{

    private OrderDao orderDao;

    public OrderService() {
         //如果使用Spring应该是自动注入的
         //此处为了方便直接在构造方法中初始化了
         orderDao = new OrderDao();
    }

    public int createOrder(Order order) {
        System.out.println("-----OrderService调用OrderDao创建订单-----");
        return orderDao.insert(order);
    }
}
