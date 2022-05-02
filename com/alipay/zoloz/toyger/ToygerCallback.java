package com.alipay.zoloz.toyger;

import android.graphics.Bitmap;
import com.alipay.zoloz.toyger.ToygerAttr;
import com.alipay.zoloz.toyger.ToygerState;
import java.util.Map;

public interface ToygerCallback<State extends ToygerState, Attr extends ToygerAttr> {
    public static final int EVENT_CODE_ACION_END = -11;
    public static final int EVENT_CODE_ACION_START = -10;
    public static final int EVENT_CODE_DARK_SCREEN = -1;
    public static final int EVENT_CODE_DOC_PARM_ERROR = -5;
    public static final int EVENT_CODE_INIT_FAIL = -4;
    public static final int EVENT_CODE_INIT_SUCCESS = 1;
    public static final int EVENT_CODE_LIVENESS_FAILED = -3;
    public static final int EVENT_CODE_LOG = -6;
    public static final int EVENT_CODE_MODEL_ERROR = -2;
    public static final int EVENT_CODE_MONITOR_FACE_KEY = -13;
    public static final int EVENT_CODE_MONITOR_FACE_STATUS = -12;
    public static final int EVENT_CODE_MONITOR_LOG = -7;
    public static final int EVENT_CODE_SYSTEM_ERROR = -8;
    public static final int EVENT_DOC_SCAN_FAILED = -9;
    public static final int RESULT_CODE_ERROR = 2;
    public static final int RESULT_CODE_LIVENESS_FAIL = 1;
    public static final int RESULT_CODE_SUCCESS = 0;

    boolean onComplete(int i, byte[] bArr, byte[] bArr2, boolean z);

    boolean onEvent(int i, Map<String, Object> map);

    boolean onHighQualityFrame(Bitmap bitmap, Attr attr);

    boolean onStateUpdated(State state, Attr attr, Map<String, Object> map);
}
