package simplefactorypattern.simple.impl;

import simplefactorypattern.simple.ICourse;

/**
 * @Author: charles
 * @Description: 创建一个Java课程的实现JavaCourse类
 * @Date Created in 2020/10/19 16:13
 * @Modified By:
 */
public class JavaCourse implements ICourse {

    public JavaCourse() {
        makePPT();
    }

    public void makePPT() {
        System.out.println("正在制作Java课程的PPT!");
    }
}
