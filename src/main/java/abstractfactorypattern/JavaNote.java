package abstractfactorypattern;

/**
 * @Author:  charles
 * @Description: 扩展产品等级Java课堂笔记JavaNote类
 * @Date Created in 2020/10/19 18:01
 * @Modified By:
 */
public class JavaNote implements INote{

    public void edit() {
        System.out.println("正在记录java课堂笔记!");
    }
}
