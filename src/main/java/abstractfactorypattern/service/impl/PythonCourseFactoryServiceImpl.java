package abstractfactorypattern.service.impl;

import abstractfactorypattern.service.CourseFactoryService;
import abstractfactorypattern.service.INoteService;
import abstractfactorypattern.service.IVideoService;

/**
 * @Author: charles
 * @Description: 创建Python产品族的具体工厂PythonCourseFactory
 * @Date Created in 2020/10/19 18:07
 * @Modified By:
 */
public class PythonCourseFactoryServiceImpl implements CourseFactoryService {

    public INoteService createNote() {
        return new PythonNoteServiceImpl();
    }

    public IVideoService createVideo() {
        return new PythonVideoServiceImpl();
    }
}
