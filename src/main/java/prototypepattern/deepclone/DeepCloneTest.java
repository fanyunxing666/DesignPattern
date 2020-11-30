package prototypepattern.deepclone;

import prototypepattern.deepclone.service.QiTianDaSheng;

/**
 * @Author: charles
 * @Description: 深度克隆测试
 * @Date Created in 2020/10/20 15:26
 * @Modified By:
 */
public class DeepCloneTest {

    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        try {
            QiTianDaSheng deepClone = (QiTianDaSheng)qiTianDaSheng.clone();
            System.out.println("深度克隆:"+(deepClone.jingubang == qiTianDaSheng.jingubang));

            QiTianDaSheng q = new QiTianDaSheng();
            QiTianDaSheng shallowClone = qiTianDaSheng.shallowClone(q);

            System.out.println("浅克隆:"+(shallowClone.jingubang == q.jingubang));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
