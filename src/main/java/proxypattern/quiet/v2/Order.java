package proxypattern.quiet.v2;

/**
 * @Author: charles
 * @Description:  我们通常会对数据库进行分库分表，
    分库分表之后使用Java操作时，就可能需要配置多个数据源，我们通过设置数据源路由
    来动态切换数据源。先创建Order订单实体
 * @Date Created in 2020/10/26 20:51
 * @Modified By:
 */
public class Order {

    private Object orderInfo;
    private Long createTime;
    private String id;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
