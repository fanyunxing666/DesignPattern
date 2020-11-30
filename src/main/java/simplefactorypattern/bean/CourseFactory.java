package simplefactorypattern.bean;

import simplefactorypattern.service.ICourseService;

/**
 * @Author: charles
 * @Description: 创建CourseFactory工厂
 * @Date Created in 2020/10/19 16:21
 * @Modified By:
 */
public class CourseFactory {

    public static ICourseService create(String className){
//        if("java".equals(name)){
//            return new JavaCourse();
//        }else if("python".equals(name)){
//            return new PythonCourse();
//        }else{
//            return null;
//        }

        try {
            if(null != className && !"".equals(className)){
                return (ICourseService) Class.forName(className).newInstance();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
