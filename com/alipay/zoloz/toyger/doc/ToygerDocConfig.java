package com.alipay.zoloz.toyger.doc;

import android.graphics.Rect;
import android.graphics.RectF;
import com.alibaba.fastjson.JSON;

public class ToygerDocConfig {
    public float boundaryThreshold = 0.7f;
    public float docThreshold = 0.7f;
    public String docType;
    public RectF faceROI = new RectF(0.1f, 0.0f, 1.0f, 1.0f);
    public float faceThreshold = 30.0f;
    public int flash = 500;
    public int logLevel = 0;
    public int pageNo;
    public float[] points;
    public Rect rect;
    public int stackTime = 0;
    public String subType = "";
    public int thickness = 14;

    public static ToygerDocConfig from(String str) {
        return (ToygerDocConfig) JSON.parseObject(str, ToygerDocConfig.class);
    }
}
