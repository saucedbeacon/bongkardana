package o;

import android.content.Context;
import android.location.Location;
import id.dana.R;
import id.dana.data.base.NetworkException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.domain.foundation.logger.PerformanceConstant;
import id.dana.nearbyme.model.ShopModel;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import o.AppInfoUtils;
import o.DeviceManifest;
import o.GriverProgressBar;
import o.a;
import o.g;
import o.getOffscreenPageLimit;
import o.isEmbeddedApp;
import o.setGriverAppVirtualHostProxy;

public final class setOffscreenPageLimit implements getOffscreenPageLimit.getMax, GriverProgressBar.UpdateRunnable {
    private final getAllInstallFiles FastBitmap$CoordinateSystem;
    private final AppInfoUtils.AnonymousClass2 Grayscale$Algorithm;
    private int ICustomTabsCallback = 0;
    private final transferApPathToLocalPath IsOverlapping;
    /* access modifiers changed from: private */
    public final fetchAppList Mean$Arithmetic;
    private int b = 0;
    private GriverProgressBar.UpdateRunnable create;
    private final isEmbeddedApp equals;
    private IRedDotManager getCause;
    private final GriverRVKVStorageProxyImpl getMax;
    private final IRedDotManager getMin;
    /* access modifiers changed from: private */
    public final setUserId hashCode;
    /* access modifiers changed from: private */
    public final getOffscreenPageLimit.setMax invoke;
    private final DeviceManifest.AnonymousClass2 invokeSuspend;
    private final setGriverAppVirtualHostProxy isInside;
    private final getPluginState length;
    private GriverAppVirtualHostProxy<H5FileUtil> onNavigationEvent;
    private final setPluginState setMax;
    /* access modifiers changed from: private */
    public final Context setMin;
    private final getInstallThreadName toDoubleRange;
    private final installPathValid toFloatRange;
    private final getLocalPathFromId toIntRange;
    private final deletePreDownloadFileByAppId toString;
    private final IComponent<List<g.AnonymousClass1>> valueOf = IComponent.setMax();
    private final IComponent<List<ShopModel>> values = IComponent.setMax();

    @Inject
    public setOffscreenPageLimit(Context context, getPluginState getpluginstate, setPluginState setpluginstate, installPathValid installpathvalid, setGriverAppVirtualHostProxy setgriverappvirtualhostproxy, getOffscreenPageLimit.setMax setmax, fetchAppList fetchapplist, getInstallThreadName getinstallthreadname, getLocalPathFromId getlocalpathfromid, isEmbeddedApp isembeddedapp, setUserId setuserid, deletePreDownloadFileByAppId deletepredownloadfilebyappid, transferApPathToLocalPath transferappathtolocalpath, AppInfoUtils.AnonymousClass2 r16, GriverRVKVStorageProxyImpl griverRVKVStorageProxyImpl, getAllInstallFiles getallinstallfiles, DeviceManifest.AnonymousClass2 r19) {
        this.isInside = setgriverappvirtualhostproxy;
        this.length = getpluginstate;
        this.setMax = setpluginstate;
        this.toFloatRange = installpathvalid;
        this.invoke = setmax;
        this.Mean$Arithmetic = fetchapplist;
        this.setMin = context;
        this.toDoubleRange = getinstallthreadname;
        this.toIntRange = getlocalpathfromid;
        this.equals = isembeddedapp;
        this.IsOverlapping = transferappathtolocalpath;
        this.hashCode = setuserid;
        this.toString = deletepredownloadfilebyappid;
        this.Grayscale$Algorithm = r16;
        this.getMax = griverRVKVStorageProxyImpl;
        this.FastBitmap$CoordinateSystem = getallinstallfiles;
        this.getMin = new IRedDotManager();
        this.invokeSuspend = r19;
    }

    public final void setMax() {
        dispose();
    }

    public final void dispose() {
        if (!isDisposed()) {
            this.getMin.dispose();
        }
        GriverAppVirtualHostProxy<H5FileUtil> griverAppVirtualHostProxy = this.onNavigationEvent;
        if (griverAppVirtualHostProxy != null) {
            griverAppVirtualHostProxy.dispose();
            this.onNavigationEvent = null;
        }
        this.length.dispose();
        this.setMax.dispose();
        this.toFloatRange.dispose();
        this.isInside.dispose();
        this.toDoubleRange.dispose();
        this.toIntRange.dispose();
        this.equals.dispose();
        this.Grayscale$Algorithm.dispose();
        this.toString.dispose();
        this.IsOverlapping.dispose();
        this.getMax.dispose();
        GriverProgressBar.UpdateRunnable updateRunnable = this.create;
        if (updateRunnable != null) {
            updateRunnable.dispose();
        }
        this.FastBitmap$CoordinateSystem.dispose();
    }

    public final boolean isDisposed() {
        return this.getMin.isDisposed();
    }

    public final void length() {
        this.length.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                Boolean bool = (Boolean) obj;
                setOffscreenPageLimit.this.invoke.getMin(bool.booleanValue());
                if (bool.booleanValue()) {
                    setOffscreenPageLimit.this.setMax.execute(onReceivedIcon.INSTANCE, new setPageMarginDrawable(setOffscreenPageLimit.this), addNewItem.setMin);
                    setOffscreenPageLimit.this.FastBitmap$CoordinateSystem.execute(onReceivedIcon.INSTANCE, new setPageMargin(setOffscreenPageLimit.this), getPageMargin.length);
                }
            }
        });
    }

    public final void getMax(Location location) {
        this.invoke.showProgress();
        this.isInside.execute(new GriverAppVirtualHostProxy<H5FileUtil>() {
            public final /* synthetic */ void onNext(Object obj) {
                H5FileUtil h5FileUtil = (H5FileUtil) obj;
                setOffscreenPageLimit.this.invoke.dismissProgress();
                if (h5FileUtil.getShops() != null) {
                    setOffscreenPageLimit.this.invoke.getMin((a.C0056a) setOffscreenPageLimit.this.Mean$Arithmetic.apply(h5FileUtil));
                }
            }

            public final void onError(Throwable th) {
                String str;
                super.onError(th);
                setOffscreenPageLimit.this.invoke.dismissProgress();
                getOffscreenPageLimit.setMax max = setOffscreenPageLimit.this.invoke;
                Context length2 = setOffscreenPageLimit.this.setMin;
                if (th instanceof NetworkException) {
                    str = ((NetworkException) th).getMessage();
                } else {
                    str = length2.getString(R.string.general_error_msg);
                }
                max.onError(str);
            }
        }, new setGriverAppVirtualHostProxy.length(location.getLatitude(), location.getLongitude(), 1, 7, "", false, PerformanceConstant.PAGE_HOME));
    }

    private static boolean setMax(List<ShopModel> list) {
        return list.size() % 5 > 0;
    }

    public final void setMin(final List<ShopModel> list) {
        int i;
        IRedDotManager iRedDotManager = this.getCause;
        if (iRedDotManager != null) {
            iRedDotManager.dispose();
            this.getCause = null;
        }
        int i2 = 0;
        this.ICustomTabsCallback = 0;
        this.b = 0;
        while (true) {
            if (setMax(list)) {
                i = list.size() / 5;
            } else {
                i = (list.size() / 5) - 1;
            }
            if (i2 <= i) {
                int i3 = this.ICustomTabsCallback + 5;
                this.b = i3;
                List<ShopModel> subList = list.subList(this.ICustomTabsCallback, Math.min(i3, list.size()));
                this.ICustomTabsCallback = this.b;
                ArrayList arrayList = new ArrayList();
                for (ShopModel next : subList) {
                    arrayList.add(new getUtdidEncrypt(next.Grayscale$Algorithm, next.b));
                }
                AnonymousClass1 r1 = new GriverAppVirtualHostProxy<List<getTempPath>>() {
                    public final /* synthetic */ void onNext(Object obj) {
                        setOffscreenPageLimit.this.invoke.getMin(setOffscreenPageLimit.this.hashCode.setMax(list, (List) obj));
                    }

                    public final void onError(Throwable th) {
                        super.onError(th);
                        updateActionSheetContent.logNetworkException(DanaLogConstants.ExceptionType.NEARBY_EXCEPTION, DanaLogConstants.Prefix.GET_NEARBY_PROMO, th);
                    }
                };
                this.equals.execute(r1, new isEmbeddedApp.getMax(arrayList));
                if (this.getCause == null) {
                    this.getCause = new IRedDotManager();
                }
                this.getCause.getMin(r1);
                i2++;
            } else {
                return;
            }
        }
    }

    static /* synthetic */ Unit setMax(setOffscreenPageLimit setoffscreenpagelimit, clearExpired clearexpired) {
        setoffscreenpagelimit.invokeSuspend.setMin = clearexpired.getNearbyRevamp();
        setoffscreenpagelimit.invoke.setMin(clearexpired.getNearbyRevamp());
        return Unit.INSTANCE;
    }
}
