package com.alipay.zoloz.toyger.face;

import com.alipay.zoloz.toyger.ToygerCallback;
import java.util.List;

public interface ToygerFaceCallback extends ToygerCallback<ToygerFaceState, ToygerFaceAttr> {
    boolean onComplete(int i, List<byte[]> list, byte[] bArr, boolean z);

    @Deprecated
    boolean onComplete(int i, byte[] bArr, byte[] bArr2, boolean z);
}
