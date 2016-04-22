package com.imooc;

/**
 * Created by SamMFFL on 2016/4/22.
 */
public class Telephone {
    private float cpu;
    private float mem;
    private float size;

    public Telephone(float cpu, float mem, float size) {
        this.cpu = cpu;
        this.mem = mem;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "cpu=" + cpu +
                ", mem=" + mem +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Telephone telephone = (Telephone) o;

        if (Float.compare(telephone.cpu, cpu) != 0) return false;
        if (Float.compare(telephone.mem, mem) != 0) return false;
        return Float.compare(telephone.size, size) == 0;

    }

    @Override
    public int hashCode() {
        int result = (cpu != +0.0f ? Float.floatToIntBits(cpu) : 0);
        result = 31 * result + (mem != +0.0f ? Float.floatToIntBits(mem) : 0);
        result = 31 * result + (size != +0.0f ? Float.floatToIntBits(size) : 0);
        return result;
    }
}
