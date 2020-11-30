package prototypepattern.deepclone.bean;

import java.io.Serializable;

/**
 * @Author: charles
 * @Description: 创建引用类型金箍棒类
 * @Date Created in 2020/10/20 14:07
 * @Modified By:
 */
public class Jingubang implements Serializable{

    //高度
    public float h;
    //半径
    public float d;

    //变大
    public void big(){
        this.d = d*2;
        this.h = h*2;
    }

    //变小
    public void small(){
        this.h = h/2;
        this.d = d/2;
    }
}
