package abstractfactorypattern.service.impl;

import abstractfactorypattern.service.CourseFactoryService;
import abstractfactorypattern.service.INoteService;
import abstractfactorypattern.service.IVideoService;

/**
 * @Author: charles
 * @Description: 创建Java产品族的具体工厂JavaCourseFactor
 * @Date Created in 2020/10/19 18:03
 * @Modified By:
 */
public class JavaCourseFactoryServiceImpl implements CourseFactoryService {

    public INoteService createNote() {
        return new JavaNoteServiceImpl();
    }

    public IVideoService createVideo() {
        return new JavaVideoServiceImpl();
    }
}
