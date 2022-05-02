package id.dana.notification;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import id.dana.base.BaseActivity;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.danah5.DanaH5;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.OauthModule;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import o.ArcMotion;
import o.BindView;
import o.PrepareException;
import o.R;
import o.TinyAppHostApduService;
import o.VisitUrlPoint;
import o.convertDipToPx;
import o.convertSpToPx;
import o.dispatchOnCancelled;
import o.genTextSelector;
import o.getDuration;
import o.getRunningAnimators;
import o.getSetupLock;
import o.hideProgress;
import o.onCancelLoad;
import o.onCanceled;
import o.setIsRecyclable;
import o.showSoftInput;
import o.stopIgnoring;

public class NotificationActivity extends BaseActivity {
    @Inject
    public getRunningAnimators.setMax featurePresenter;
    @Inject
    public getDuration.length readDeepLinkPropertiesPresenter;
    @Inject
    public BindView.setMin restoreUrlPresenter;
    @Inject
    public R.id.getMax scanQrPresenter;

    public int getLayout() {
        return id.dana.R.layout.activity_notification;
    }

    private void setMin(String str, String str2, String str3) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1039095691, oncanceled);
            onCancelLoad.getMin(1039095691, oncanceled);
        }
        convertDipToPx.length length2 = new convertDipToPx.length(getApplication());
        length2.getMax = TrackerKey.Event.NOTIFICATION_PUSH_READ;
        if (str != null) {
            length2.setMax(TrackerKey.Property.CONTEXT_CODE, str);
        }
        if (str2 != null) {
            length2.setMax(TrackerKey.Property.CONTEXT_VALUE, str2);
        }
        length2.setMax(TrackerKey.Property.PAYLOAD, str3);
        length2.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(length2, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    public void init() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 426765197 == (max = dispatchOnCancelled.getMax(applicationContext, 426765197)))) {
            onCanceled oncanceled = new onCanceled(426765197, max, 512);
            onCancelLoad.setMax(426765197, oncanceled);
            onCancelLoad.getMin(426765197, oncanceled);
        }
        getSetupLock.getMin getmin = new getSetupLock.getMin((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            getmin.IsOverlapping = applicationComponent;
            getmin.toFloatRange = new ServicesModule();
            DeepLinkModule.setMin max2 = DeepLinkModule.getMax();
            max2.getMax = this;
            max2.length = "Notification";
            max2.setMin = new ArcMotion() {
                public final void getMin(showSoftInput showsoftinput) {
                }

                public final void setMax() {
                    NotificationActivity.this.finish();
                }

                public final void length(String str) {
                    NotificationActivity.this.finish();
                }
            };
            getmin.length = new DeepLinkModule(max2, (byte) 0);
            ScanQrModule.setMin max3 = ScanQrModule.getMax();
            max3.setMin = this;
            getmin.getMin = new ScanQrModule(max3, (byte) 0);
            RestoreUrlModule.setMin min = RestoreUrlModule.setMin();
            min.getMax = this;
            getmin.setMax = new RestoreUrlModule(min, (byte) 0);
            FeatureModule.length length = FeatureModule.length();
            length.setMax = this;
            getmin.setMin = new FeatureModule(length, (byte) 0);
            OauthModule.getMax min2 = OauthModule.setMin();
            min2.setMin = this;
            getmin.getMax = new OauthModule(min2, (byte) 0);
            stopIgnoring.setMin(getmin.length, DeepLinkModule.class);
            stopIgnoring.setMin(getmin.getMin, ScanQrModule.class);
            stopIgnoring.setMin(getmin.setMax, RestoreUrlModule.class);
            stopIgnoring.setMin(getmin.setMin, FeatureModule.class);
            stopIgnoring.setMin(getmin.getMax, OauthModule.class);
            if (getmin.toFloatRange == null) {
                getmin.toFloatRange = new ServicesModule();
            }
            stopIgnoring.setMin(getmin.IsOverlapping, PrepareException.AnonymousClass1.class);
            new getSetupLock(getmin.length, getmin.getMin, getmin.setMax, getmin.setMin, getmin.getMax, getmin.toFloatRange, getmin.IsOverlapping, (byte) 0).getMin(this);
            registerPresenter(this.readDeepLinkPropertiesPresenter, this.scanQrPresenter, this.restoreUrlPresenter, this.featurePresenter);
            NotificationData notificationData = (NotificationData) getIntent().getParcelableExtra(DanaFirebaseMessagingService.MESSAGE_DATA);
            if (notificationData != null) {
                addDisposable(setIsRecyclable.getMax().observeOn(hideProgress.length()).subscribe(new TinyAppHostApduService(this, notificationData.isInside)));
                int max4 = dispatchOnCancelled.getMax(0);
                if (max4 != 0) {
                    onCanceled oncanceled2 = new onCanceled(0, max4, 16);
                    onCancelLoad.setMax(-381668367, oncanceled2);
                    onCancelLoad.getMin(-381668367, oncanceled2);
                }
                if (notificationData != null) {
                    String str = notificationData.setMax;
                    String str2 = notificationData.getMin;
                    HashMap hashMap = new HashMap();
                    hashMap.put(DanaFirebaseMessagingService.REPORT_PUSH_TITLE_KEY, str);
                    hashMap.put(DanaFirebaseMessagingService.REPORT_PUSH_MESSAGE_KEY, str2);
                    if (notificationData.FastBitmap$CoordinateSystem != null) {
                        hashMap.putAll(notificationData.FastBitmap$CoordinateSystem);
                    }
                    VisitUrlPoint.behaviour(DanaLogConstants.SeedId.PUSH_CLICKED, DanaLogConstants.BizType.PUSH_NOTIFICATION, hashMap);
                }
                if (TextUtils.isEmpty(notificationData.equals) || TextUtils.isEmpty(notificationData.hashCode)) {
                    Uri parse = Uri.parse(notificationData.isInside);
                    setMin(parse.getQueryParameter("contextCode"), parse.getQueryParameter("contextValue"), notificationData.FastBitmap$CoordinateSystem.toString());
                    return;
                }
                setMin(notificationData.equals, notificationData.hashCode, notificationData.FastBitmap$CoordinateSystem.toString());
                return;
            }
            return;
        }
        throw null;
    }

    public static /* synthetic */ void getMax(NotificationActivity notificationActivity, String str, Boolean bool) {
        int length;
        int min;
        Context baseContext = notificationActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1502473219, oncanceled);
            onCancelLoad.getMin(-1502473219, oncanceled);
        }
        if (!bool.booleanValue()) {
            return;
        }
        if (str.trim().contains("https://link.dana.id/")) {
            notificationActivity.readDeepLinkPropertiesPresenter.setMax(str);
            return;
        }
        DanaH5.closeAllContainers();
        DanaH5.startContainerFullUrl(str);
        notificationActivity.finish();
    }
}
