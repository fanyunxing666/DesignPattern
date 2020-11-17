package simplefactorypattern;

import simplefactorypattern.impl.JavaCourse;
import simplefactorypattern.factory.CourseFactory2;

/**
 * @Author: fan_yunxing
 * @Description:
 * @Date Created in 2020/10/19 16:15
 * @Modified By:
 */
public class MainTest {

    public static void main(String[] args) {

        //1.
//        ICourse iCourse = new JavaCourse();
//        iCourse.makePPT();

        //2.
//        CourseFactory courseFactory = new CourseFactory();
//        courseFactory.create("java");
//
//        CourseFactory courseFactory2 = new CourseFactory();
//        courseFactory2.create("JavaCourse");

        CourseFactory2 courseFactory3 = new CourseFactory2();
        courseFactory3.create(JavaCourse.class);

    }
}
