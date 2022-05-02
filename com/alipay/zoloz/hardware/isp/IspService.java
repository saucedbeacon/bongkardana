package com.alipay.zoloz.hardware.isp;

import com.alipay.mobile.security.bio.service.BioService;

public abstract class IspService extends BioService {
    public static final String TAG = "IspService";

    public abstract int getAEMode();

    public abstract float[][][] getAwbTable();

    public abstract float[] getColorTemperature();

    public abstract long getExposureTime();

    public abstract int getISO();

    public abstract void setAEMode(int i);

    public abstract void setExposureTime(long j);

    public abstract void setISO(int i);
}
