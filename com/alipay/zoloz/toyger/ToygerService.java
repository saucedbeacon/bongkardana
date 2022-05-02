package com.alipay.zoloz.toyger;

import android.content.Context;
import com.alipay.zoloz.toyger.ToygerAlgorithmConfig;
import com.alipay.zoloz.toyger.ToygerAttr;
import com.alipay.zoloz.toyger.ToygerBiometricInfo;
import com.alipay.zoloz.toyger.ToygerCallback;
import com.alipay.zoloz.toyger.ToygerState;
import com.alipay.zoloz.toyger.algorithm.IToygerDelegate;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public abstract class ToygerService<C extends ToygerCallback, State extends ToygerState, Attr extends ToygerAttr, Info extends ToygerBiometricInfo, AlgorithmConfig extends ToygerAlgorithmConfig> implements IToygerDelegate<State, Attr, Info> {
    public static final String ASSET_DOC = "toyger.doc.dat";
    public static final String ASSET_FACE = "toyger.face.dat";
    public static final String ASSET_LICENSE = "toyger.license";
    public static final String KEY_DOC_FRAME_POINTS = "docFramePoints";
    public static final String KEY_DOC_FRAME_RECT = "docFrameRect";
    public static final String KEY_IS_MIRROR = "is_mirror";
    public static final String KEY_META_SERIALIZER = "meta_serializer";
    public static final String KEY_PUBLIC_KEY = "pubkey";
    public static final String KEY_RES_9_CONTENT = "content";
    public static final String KEY_RES_9_IS_UTF8 = "isUTF8";
    public static final String KEY_RES_9_KEY = "key";
    public static final String KEY_ROI = "ROI";
    public static final String KEY_ROTATE_TIMES = "rotateTimes";
    public static final String TAG = "TOYGER";
    protected C mToygerCallback;

    public static boolean preLoad(Context context) {
        return false;
    }

    public abstract void handleFinished(int i, List<Info> list, Map<String, Object> map);

    public abstract void handleInfoReady(TGFrame tGFrame, Attr attr);

    public void handleLog(int i, String str, byte[] bArr) {
    }

    public abstract void handleStateUpdated(State state, Attr attr);

    public abstract boolean init(Context context, String str, C c, String str2, String str3, Map<String, Object> map);

    public abstract boolean processImage(TGFrame tGFrame);

    public abstract void release();

    public abstract void reset();

    public void handleEventTriggered(int i, String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(21584786, oncanceled);
            onCancelLoad.getMin(21584786, oncanceled);
        }
        if (str == null) {
            this.mToygerCallback.onEvent(i, (Map<String, Object>) null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", str);
        this.mToygerCallback.onEvent(i, hashMap);
    }
}
