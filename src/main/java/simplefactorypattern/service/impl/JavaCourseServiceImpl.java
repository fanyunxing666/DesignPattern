package simplefactorypattern.service.impl;

import simplefactorypattern.service.ICourseService;

/**
 * @Author: charles
 * @Description: 创建一个Java课程的实现JavaCourse类
 * @Date Created in 2020/10/19 16:13
 * @Modified By:
 */
public class JavaCourseServiceImpl implements ICourseService {

    public JavaCourseServiceImpl() {
        makePPT();
    }

    public void makePPT() {
        System.out.println("正在制作Java课程的PPT!");
    }
}
