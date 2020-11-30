package abstractfactorypattern.service.impl;

import abstractfactorypattern.service.IVideoService;

/**
 * @Author: charles
 * @Description: 创建Python产品，Python视频PythonVideo
 * @Date Created in 2020/10/19 18:05
 * @Modified By:
 */
public class PythonVideoServiceImpl implements IVideoService {

    public void record() {
        System.out.println("正在录制Python课程视频!");
    }
}
