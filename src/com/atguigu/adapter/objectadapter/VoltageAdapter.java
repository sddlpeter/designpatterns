package com.atguigu.adapter.objectadapter;

public class VoltageAdapter implements IVoltage5V{
    Voltage220V voltage220V;
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }
    @Override
    public int output5V() {
        int srcVoltage = voltage220V.output220V();
        int dstVoltage = srcVoltage / 44;
        return dstVoltage;
    }
}
