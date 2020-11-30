package abstractfactorypattern;

import abstractfactorypattern.service.impl.JavaCourseFactoryServiceImpl;

/**
 * @Author: charles
 * @Description:
 * @Date Created in 2020/10/19 18:09
 * @Modified By:
 */
public class MainTest {

    public static void main(String[] args) {
        JavaCourseFactoryServiceImpl javaCourseFactory = new JavaCourseFactoryServiceImpl();

        javaCourseFactory.createVideo().record();
        javaCourseFactory.createNote().edit();
    }
}
