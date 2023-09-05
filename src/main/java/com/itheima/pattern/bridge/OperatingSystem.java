package com.itheima.pattern.bridge;

/**
 * @version v1.0
 * @ClassName: OpratingSystem
 * @Description: 抽象的操作系统类(抽象化角色)
 * @Author: 黑马程序员
 */
public abstract class OperatingSystem {

    //声明videFile变量
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
