package com.alipay.zoloz.zface.beans;

import com.alipay.zoloz.toyger.algorithm.TGFaceState;
import com.alipay.zoloz.toyger.face.ToygerFaceAttr;
import java.util.HashMap;
import java.util.Map;

public class FrameStateData {
    public ToygerFaceAttr attr;
    public Map extMap = new HashMap();
    public TGFaceState tgFaceState = new TGFaceState();
    public int uiDesState = 0;

    public String toString() {
        StringBuilder sb = new StringBuilder("FrameStateData{uiDesState=");
        sb.append(this.uiDesState);
        sb.append(", attr=");
        sb.append(this.attr);
        sb.append(", extMap=");
        sb.append(this.extMap);
        sb.append('}');
        return sb.toString();
    }
}
