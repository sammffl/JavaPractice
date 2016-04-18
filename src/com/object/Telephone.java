package com.object;

/**
 * Created by SamMFFL on 2016/4/18.
 */
public class Telephone {
    private float screen;
    private float cpu;
    private float mem;

    public Telephone() {
        System.out.println("无参构造函数方法执行了！");
    }

    public Telephone(float newScreen, float newCpu, float newMem) {
        this.screen = newScreen;
        this.cpu = newCpu;
        this.mem = newMem;
        System.out.println("有参构造函数方法执行了！");
    }

    public float getScreen() {
        return screen;
    }

    public void setScreen(float screen) {
        this.screen = screen;
    }

    public float getCpu() {
        return cpu;
    }

    public void setCpu(float cpu) {
        this.cpu = cpu;
    }

    public float getMem() {
        return mem;
    }

    public void setMem(float mem) {
        this.mem = mem;
    }
}
