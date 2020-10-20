package simplefactorypattern.simple.impl;

import simplefactorypattern.simple.ICourse;

/**
 * @Author: charles
 * @Description: 增加课程PythonCourse
 * @Date Created in 2020/10/19 16:19
 * @Modified By:
 */
public class PythonCourse implements ICourse {

    public PythonCourse() {
        makePPT();
    }

    public void makePPT() {
        System.out.println("正在制作Python课程PPT!");
    }
}
