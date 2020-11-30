package abstractfactorypattern.service.impl;

import abstractfactorypattern.service.IVideoService;

/**
 * @Author: charles
 * @Description: ，Java视频JavaVideo类:
 * @Date Created in 2020/10/19 18:00
 * @Modified By:
 */
public class JavaVideoServiceImpl implements IVideoService {

    public void record() {
        System.out.println("正在录制java视频!");
    }
}
