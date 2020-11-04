package prototypepattern.deepclone;

import java.io.*;
import java.util.Date;

/**
 * @Author: charles
 * @Description: 创造齐天大圣类
 * @Date Created in 2020/10/20 14:12
 * @Modified By:
 */
public class QiTianDaSheng extends Monkey implements Cloneable,Serializable{

    public Jingubang jingubang;

    //初始化
    public QiTianDaSheng() {
        this.birthday = new Date();
        this.jingubang = new Jingubang();
    }

    protected Object clone(){
        return this.deepClone();
    }

    //深度克隆
    private Object deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream outputStream = new ObjectOutputStream(bos);
            outputStream.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream inputStream = new ObjectInputStream(bis);

            QiTianDaSheng copy = (QiTianDaSheng)inputStream.readObject();
            copy.birthday = new Date();

            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }

    //浅克隆对比
    public QiTianDaSheng shallowClone(QiTianDaSheng target){
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.height = target.height;
        qiTianDaSheng.weight = target.weight;

        qiTianDaSheng.jingubang = target.jingubang;
        qiTianDaSheng.birthday = new Date();
        return  qiTianDaSheng;
    }
}
