package prototypepattern.deepclone;

import java.util.Date;

/**
 * @Author: charles
 * @Description:  深度克隆：大家都知道齐天大圣。首先它是一只猴子，有七十二般变化，
 * 把一根毫毛就可以吹出千万个泼猴，手里还拿着金箍棒，金箍棒可以变大变小。
 * 这就是我们耳熟能详的原型模式的经典体现。
 * @Date Created in 2020/10/20 14:05
 * @Modified By:
 */
public class Monkey {

    //身高
    public int height;
    //体重
    public int weight;
    //生日
    public Date birthday;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
