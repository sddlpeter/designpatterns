package com.atguigu.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        int srcVoltage = output220V();
        int dstVoltage = srcVoltage / 44;
        return dstVoltage;
    }
}
