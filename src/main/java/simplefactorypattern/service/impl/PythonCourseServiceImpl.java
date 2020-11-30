package simplefactorypattern.service.impl;

import simplefactorypattern.service.ICourseService;

/**
 * @Author: charles
 * @Description: 增加课程PythonCourse
 * @Date Created in 2020/10/19 16:19
 * @Modified By:
 */
public class PythonCourseServiceImpl implements ICourseService {

    public PythonCourseServiceImpl() {
        makePPT();
    }

    public void makePPT() {
        System.out.println("正在制作Python课程PPT!");
    }
}
