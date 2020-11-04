package proxypattern.quiet.v2;

/**
 * @Author: charles
 * @Description: 接下来使用静态代理，主要完成的功能是，根据订单创建时间自动按年进行分库。根据
 * 开闭原则，原来写好的逻辑我们不去修改，通过代理对象来完成。先创建数据源路由对
 * 象，我们使用ThreadLocal的单例实现，DynamicDataSourceEntry类
 * @Date Created in 2020/10/26 21:01
 * @Modified By:
 */

//动态切换数据源
public class DynamicDataSourceEntry {

    //默认数据源
    public final static String DEFAULT_SOURCE = null;

    private final static ThreadLocal<String> local = new ThreadLocal<String>();

    public DynamicDataSourceEntry() {
    }

    //清空数据源
    public static void clear(){
        local.remove();
    }

    //获取当前正在使用的数据源名字
    public static String getResource(){
        return local.get();
    }

    //还原当前切面的数据源
    public static void restore(){
        local.set(DEFAULT_SOURCE);
    }

    //设置已知切面名字的数据源
    public static void setResource(String source){
        local.set(source);
    }

    //根据年份动态设置数据源
    public static void setResource(int year){
        local.set("DB_"+year);
    }
}
