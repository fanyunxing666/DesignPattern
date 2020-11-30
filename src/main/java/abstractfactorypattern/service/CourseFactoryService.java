package abstractfactorypattern.service;

/**
 * @Author: charles
 * @Description:  抽象工厂是用户的主要入口
 * 在string中应用最广泛的一种设计模式
 * 易于扩张
 * @Date Created in 2020/10/19 17:56
 * @Modified By:
 */
public interface CourseFactoryService {

    //做课堂笔记
    INoteService createNote();

    //课堂录屏
    IVideoService createVideo();
}
