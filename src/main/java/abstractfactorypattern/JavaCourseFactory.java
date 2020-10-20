package abstractfactorypattern;

/**
 * @Author: charles
 * @Description: 创建Java产品族的具体工厂JavaCourseFactor
 * @Date Created in 2020/10/19 18:03
 * @Modified By:
 */
public class JavaCourseFactory implements CourseFactory{

    public INote createNote() {
        return new JavaNote();
    }

    public IVideo createVideo() {
        return new JavaVideo();
    }
}
