package o;

import android.content.Context;
import id.dana.R;
import id.dana.data.base.NetworkException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import id.dana.model.SendMoneyHomeMenuModel;
import java.util.List;
import javax.inject.Inject;
import o.getModifiedTime;

@PerActivity
public final class setRightText implements getModifiedTime.getMin {
    /* access modifiers changed from: private */
    public final getModifiedTime.getMax IsOverlapping;
    private GriverAppVirtualHostProxy<GriverAMCSLiteAppUpdater> equals;
    /* access modifiers changed from: private */
    public final getSharedPreferenceForApp getMax;
    private final removeAllRangeNotifiers getMin;
    /* access modifiers changed from: private */
    public final SystemInfoBridgeExtension length;
    private final getForegroundBetweenScanPeriod setMax;
    private final removeMonitorNotifier setMin;
    /* access modifiers changed from: private */
    public Context toFloatRange;
    private getJSBridge toIntRange;

    @Inject
    setRightText(getModifiedTime.getMax getmax, removeAllRangeNotifiers removeallrangenotifiers, getSharedPreferenceForApp getsharedpreferenceforapp, removeMonitorNotifier removemonitornotifier, SystemInfoBridgeExtension systemInfoBridgeExtension, getForegroundBetweenScanPeriod getforegroundbetweenscanperiod, Context context, getJSBridge getjsbridge) {
        this.IsOverlapping = getmax;
        this.getMin = removeallrangenotifiers;
        this.getMax = getsharedpreferenceforapp;
        this.setMin = removemonitornotifier;
        this.length = systemInfoBridgeExtension;
        this.setMax = getforegroundbetweenscanperiod;
        this.toFloatRange = context;
        this.toIntRange = getjsbridge;
    }

    public final void length() {
        removeAllRangeNotifiers removeallrangenotifiers = this.getMin;
        if (this.equals == null) {
            this.equals = new GriverAppVirtualHostProxy<GriverAMCSLiteAppUpdater>() {
                public final /* synthetic */ void onNext(Object obj) {
                    getSharedPreferenceForApp min = setRightText.this.getMax;
                    setRightText.this.IsOverlapping.setMax((LoadingBridgeExtension) min.apply((GriverAMCSLiteAppUpdater) obj));
                }

                public final void onError(Throwable th) {
                    super.onError(th);
                    setRightText.this.IsOverlapping.onError("");
                    StringBuilder sb = new StringBuilder();
                    sb.append(getClass().getName());
                    sb.append(", on Error: ");
                    sb.append(th);
                    updateActionSheetContent.e(DanaLogConstants.TAG.USER_EDUCATION_TAG, sb.toString());
                }
            };
        }
        removeallrangenotifiers.execute(this.equals);
    }

    public final void setMin() {
        this.setMin.execute(new GriverAppVirtualHostProxy<List<calculateLayoutSize>>() {
            public final /* synthetic */ void onNext(Object obj) {
                setRightText.this.IsOverlapping.dismissProgress();
                SystemInfoBridgeExtension min = setRightText.this.length;
                setRightText.this.IsOverlapping.getMin((List) min.apply((List) obj));
            }

            public final void onError(Throwable th) {
                String str;
                super.onError(th);
                setRightText.this.IsOverlapping.dismissProgress();
                getModifiedTime.getMax max = setRightText.this.IsOverlapping;
                Context length = setRightText.this.toFloatRange;
                if (th instanceof NetworkException) {
                    str = ((NetworkException) th).getMessage();
                } else {
                    str = length.getString(R.string.general_error_msg);
                }
                max.onError(str);
                StringBuilder sb = new StringBuilder();
                sb.append(getClass().getName());
                sb.append(", on Error: ");
                sb.append(th);
                updateActionSheetContent.e(DanaLogConstants.TAG.SEND_MONEY_TAG, sb.toString());
            }
        });
    }

    public final void setMin(final List<SendMoneyHomeMenuModel> list) {
        this.setMax.execute(new GriverAppVirtualHostProxy<Integer>() {
            public final /* synthetic */ void onNext(Object obj) {
                setRightText.this.IsOverlapping.length(onProviderEnabled.getMax(list, ((Integer) obj).intValue()));
            }

            public final void onError(Throwable th) {
                updateActionSheetContent.e(DanaLogConstants.TAG.SEND_MONEY_TAG, th.getMessage(), th);
            }
        });
    }

    public final void getMin() {
        this.toIntRange.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                setRightText.this.IsOverlapping.length((Boolean) obj);
            }

            public final void onError(Throwable th) {
                updateActionSheetContent.e(DanaLogConstants.TAG.GET_SEND_MONEY_BANNER_SWITCH, th.getMessage());
            }
        });
    }

    public final void setMax() {
        this.getMin.dispose();
        this.setMax.dispose();
        this.setMin.dispose();
    }
}
