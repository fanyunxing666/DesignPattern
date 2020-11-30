package simplefactorypattern.bean;

import simplefactorypattern.service.ICourseService;

/**
 * @Author: charles
 * @Description: 创建CourseFactory工厂
 * @Date Created in 2020/10/19 16:21
 * @Modified By:
 */
public class CourseFactory2 {

    public static ICourseService create(Class<? extends ICourseService> clazz) {
        try {
            if(clazz != null){
                return clazz.newInstance();
            }else{
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
