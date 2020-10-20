package simplefactorypattern.simple.factory;

import simplefactorypattern.simple.ICourse;
import simplefactorypattern.simple.impl.JavaCourse;
import simplefactorypattern.simple.impl.PythonCourse;

/**
 * @Author: charles
 * @Description: 创建CourseFactory工厂
 * @Date Created in 2020/10/19 16:21
 * @Modified By:
 */
public class CourseFactory {

    public static ICourse create(String className){
//        if("java".equals(name)){
//            return new JavaCourse();
//        }else if("python".equals(name)){
//            return new PythonCourse();
//        }else{
//            return null;
//        }

        try {
            if(null != className && !"".equals(className)){
                return (ICourse) Class.forName(className).newInstance();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
