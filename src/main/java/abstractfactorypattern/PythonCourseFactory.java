package abstractfactorypattern;

/**
 * @Author: charles
 * @Description: 创建Python产品族的具体工厂PythonCourseFactory
 * @Date Created in 2020/10/19 18:07
 * @Modified By:
 */
public class PythonCourseFactory implements CourseFactory{

    public INote createNote() {
        return new PythonNote();
    }

    public IVideo createVideo() {
        return new PythonVideo();
    }
}
