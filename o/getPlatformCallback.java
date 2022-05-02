package o;

import android.text.TextUtils;
import id.dana.oauth.model.OauthParamsModel;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Unit;
import o.onAnimationEnd;
import org.jetbrains.annotations.NotNull;

public class getPlatformCallback implements onAnimationEnd.length {
    /* access modifiers changed from: private */
    public final String IsOverlapping = getPlatformCallback.class.getSimpleName();
    private final notifyCharacteristicValue equals;
    private final shouldShowRevokeOpenAuthItem getMax;
    checkBitmap getMin;
    /* access modifiers changed from: private */
    public final onAnimationEnd.getMin length;
    KitUtils setMax;
    private final handleSave setMin;
    /* access modifiers changed from: private */
    public final GriverCreatePromptParam toFloatRange;

    public interface getMin {
        void getMax();

        void setMax(boolean z);
    }

    public interface length {
        void getMin(boolean z);
    }

    public interface setMax {
        void getMin();

        void setMax();
    }

    public interface setMin {
        void length();

        void setMin();
    }

    @Inject
    getPlatformCallback(onAnimationEnd.getMin getmin, handleSave handlesave, shouldShowRevokeOpenAuthItem shouldshowrevokeopenauthitem, notifyCharacteristicValue notifycharacteristicvalue, GriverCreatePromptParam griverCreatePromptParam) {
        this.length = getmin;
        this.setMin = handlesave;
        this.getMax = shouldshowrevokeopenauthitem;
        this.equals = notifycharacteristicvalue;
        this.toFloatRange = griverCreatePromptParam;
    }

    public final void length(isForMainFrame isformainframe) {
        this.length.setMax((OauthParamsModel) this.setMin.apply(isformainframe));
    }

    public final void getMin(getMin getmin) {
        this.getMax.execute(onReceivedIcon.INSTANCE, new setStrokeWidth(this, getmin), new setStrokeColor(this, getmin));
    }

    public final void getMax(final length length2) {
        this.toFloatRange.execute(new GriverAppVirtualHostProxy<String>() {
            public final /* synthetic */ void onNext(@NotNull Object obj) {
                length2.getMin(getPlatformCallback.setMax((String) obj));
            }

            public final void onError(Throwable th) {
                super.onError(th);
                length2.getMin(false);
                updateActionSheetContent.e(getPlatformCallback.this.IsOverlapping, th.getMessage());
            }

            public final void onComplete() {
                getPlatformCallback.this.toFloatRange.dispose();
            }
        });
    }

    public final void setMax(String str, setMin setmin) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(1083953164, oncanceled);
            onCancelLoad.getMin(1083953164, oncanceled);
        }
        this.setMax.execute(onReceivedIcon.INSTANCE, new getStrokeWidth(str, setmin), new getStrokeColor(this, setmin));
    }

    public final void setMin(String str, setMax setmax) {
        this.getMin.execute(onReceivedIcon.INSTANCE, new getFillAlpha(str, setmax), new setFillColor(this, setmax));
    }

    /* access modifiers changed from: private */
    public static boolean setMin(String str) {
        return str.equals("KYC2");
    }

    /* access modifiers changed from: private */
    public static boolean setMax(String str) {
        if (!TextUtils.isEmpty(str) && !str.matches("^(\\+62|62|0)?8[0-9]*$")) {
            return true;
        }
        return false;
    }

    public void setMax() {
        this.equals.dispose();
        this.toFloatRange.dispose();
        this.getMax.dispose();
        this.setMax.dispose();
        this.getMin.dispose();
    }

    static /* synthetic */ Unit length(String str, setMax setmax, Set set) {
        if (set.contains(str)) {
            setmax.setMax();
            return null;
        }
        setmax.getMin();
        return null;
    }

    static /* synthetic */ Unit setMin(getPlatformCallback getplatformcallback, setMin setmin, Throwable th) {
        setmin.length();
        updateActionSheetContent.e(getplatformcallback.IsOverlapping, th.getMessage());
        return null;
    }

    static /* synthetic */ Unit setMin(getPlatformCallback getplatformcallback, final getMin getmin) {
        getplatformcallback.length.showProgress();
        getplatformcallback.equals.execute(new GriverAppVirtualHostProxy<disconnect>() {
            public final /* synthetic */ void onNext(@NotNull Object obj) {
                disconnect disconnect = (disconnect) obj;
                if (disconnect.getKycInfo() != null) {
                    getmin.setMax(getPlatformCallback.setMin(disconnect.getKycInfo()));
                }
                getPlatformCallback.this.length.dismissProgress();
            }

            public final void onError(Throwable th) {
                getmin.getMax();
                getPlatformCallback.this.length.dismissProgress();
            }
        });
        return null;
    }

    static /* synthetic */ Unit setMin(getPlatformCallback getplatformcallback, setMax setmax, Throwable th) {
        setmax.getMin();
        updateActionSheetContent.e(getplatformcallback.IsOverlapping, th.getMessage());
        return null;
    }

    static /* synthetic */ Unit length(String str, setMin setmin, List list) {
        if (list.contains(str)) {
            setmin.setMin();
            return null;
        }
        setmin.length();
        return null;
    }
}
