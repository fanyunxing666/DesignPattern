package proxypattern.quiet.v2;

import java.text.SimpleDateFormat;

/**
 * @Author: charles
 * @Description: 创建切换数据源的代理OrderServiceSaticProxy类
 * @Date Created in 2020/10/26 21:13
 * @Modified By:
 */
public class OrderServiceSaticProxy implements IOrderService{

    private IOrderService iOrderService;

    SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    public int createOrder(Order order) {
        before();
        Long time = order.getCreateTime();
        Integer dbRouter = Integer.valueOf(yearFormat.format(time));
        System.out.println("静态代理类自动分配到【DB_"+dbRouter+"】数据源处理数据!");
        DynamicDataSourceEntry.setResource(dbRouter);
        iOrderService.createOrder(order);
        after();
        return 0;
    }


    private void before() {
        System.out.println("Proxy before method");
    }

    private void after() {
        System.out.println("Proxy after method");
    }

}
