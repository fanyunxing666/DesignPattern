package abstractfactorypattern;

/**
 * @Author: charles
 * @Description:
 * @Date Created in 2020/10/19 18:09
 * @Modified By:
 */
public class MainTest {

    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.createNote().edit();
        javaCourseFactory.createVideo().record();
    }
}
