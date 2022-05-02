package o;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

public final /* synthetic */ class GriverKVSpStorage {
    public static /* synthetic */ Object getMerchantReview$default(setStorageProxy setstorageproxy, String str, String str2, int i, int i2, List list, Continuation continuation, int i3, Object obj) {
        if (obj == null) {
            int i4 = (i3 & 4) != 0 ? 1 : i;
            int i5 = (i3 & 8) != 0 ? 10 : i2;
            if ((i3 & 16) != 0) {
                list = CollectionsKt.emptyList();
            }
            return setstorageproxy.getMerchantReview(str, str2, i4, i5, list, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMerchantReview");
    }

    public static /* synthetic */ onWebsocketHandshakeSentAsClient getMerchantImage$default(setStorageProxy setstorageproxy, String str, String str2, int i, int i2, boolean z, int i3, Object obj) {
        if (obj == null) {
            return setstorageproxy.getMerchantImage(str, str2, (i3 & 4) != 0 ? 1 : i, (i3 & 8) != 0 ? 10 : i2, (i3 & 16) != 0 ? false : z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMerchantImage");
    }

    public static /* synthetic */ Object getMerchantPromoDanaDeal$default(setStorageProxy setstorageproxy, String str, String str2, int i, int i2, Continuation continuation, int i3, Object obj) {
        if (obj == null) {
            return setstorageproxy.getMerchantPromoDanaDeal(str, str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 10 : i2, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMerchantPromoDanaDeal");
    }

    public static /* synthetic */ Object consultMerchantReview$default(setStorageProxy setstorageproxy, String str, int i, int i2, Continuation continuation, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                str = "";
            }
            if ((i3 & 2) != 0) {
                i = 10;
            }
            if ((i3 & 4) != 0) {
                i2 = 1;
            }
            return setstorageproxy.consultMerchantReview(str, i, i2, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: consultMerchantReview");
    }
}
