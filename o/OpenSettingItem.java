package o;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import id.dana.di.PerActivity;
import id.dana.domain.version.Version;
import id.dana.tracker.TrackerKey;
import id.dana.tracker.constant.TrackerType;
import io.reactivex.internal.functions.Functions;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.GriverMonitor;
import o.GriverOpenAuthExtension;
import o.GriverOpenSettingExtension;
import o.OptionMenu;
import o.ShareRecyclerAdapter;
import o.convertDipToPx;
import o.createBleDevice;
import o.createSplashView;
import o.defaultToolbarMenus;
import o.getTypefaceByCat;
import o.setMap;
import org.jetbrains.annotations.NotNull;

@PerActivity
public class OpenSettingItem implements setMap.getMax {
    private static final String getCause = OpenSettingItem.class.getSimpleName();
    BleDevice FastBitmap$CoordinateSystem;
    Context Grayscale$Algorithm;
    private final clearCache ICustomTabsCallback;
    /* access modifiers changed from: private */
    public int ICustomTabsCallback$Stub;
    GriverCreateDialogParam IsOverlapping;
    GriverMonitor Mean$Arithmetic;
    private final IRedDotManager asBinder = new IRedDotManager();
    /* access modifiers changed from: private */
    public boolean asInterface;
    private final setBuiltInZoomControls b;
    private final int create = 2;
    collect equals;
    private final int extraCallback = 0;
    private final setWebMessageCallback extraCallbackWithResult;
    GriverParseFailedPoint getMax;
    GriverOpenAuthExtension.RevokeCallback getMin;
    /* access modifiers changed from: package-private */
    public createBleDevice hashCode;
    /* access modifiers changed from: package-private */
    public ShareRecyclerAdapter.ShareViewHolder invoke;
    sendData invokeSuspend;
    StartRMData isInside;
    createSplashView length;
    private final int onMessageChannelReady = 4;
    private final GriverMonitor.AnonymousClass4 onNavigationEvent;
    /* access modifiers changed from: private */
    public final setMap.length onPostMessage;
    private final GriverInnerConfig onRelationshipValidationResult;
    /* access modifiers changed from: private */
    public int onTransact;
    OptionMenu setMax;
    /* access modifiers changed from: package-private */
    public GVErrorView setMin;
    setDefaultFixedFontSize toDoubleRange;
    setBlockNetworkImage toFloatRange;
    /* access modifiers changed from: package-private */
    public defaultToolbarMenus toIntRange;
    BetterBleServiceImpl toString;
    getPerformanceTracker valueOf;
    pageDown values;

    @Inject
    OpenSettingItem(setMap.length length2, GriverMonitor.AnonymousClass4 r3, clearCache clearcache, setBuiltInZoomControls setbuiltinzoomcontrols, setWebMessageCallback setwebmessagecallback, GriverInnerConfig griverInnerConfig) {
        this.onPostMessage = length2;
        this.onNavigationEvent = r3;
        this.ICustomTabsCallback = clearcache;
        this.b = setbuiltinzoomcontrols;
        this.extraCallbackWithResult = setwebmessagecallback;
        this.onRelationshipValidationResult = griverInnerConfig;
    }

    public final void setMin(boolean z, Context context) {
        final AnonymousClass3 r0 = new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                OpenSettingItem.this.onPostMessage.onAccountChecking(((Boolean) obj).booleanValue());
            }

            public final void onError(Throwable th) {
                OpenSettingItem.this.onPostMessage.onAccountChecking(false);
            }
        };
        if (z) {
            this.length.execute(new GriverAppVirtualHostProxy<GriverCommonResourceProxy>() {
                public final /* synthetic */ void onNext(Object obj) {
                    OpenSettingItem.this.toIntRange.execute(new GriverAppVirtualHostProxy<Boolean>() {
                        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                            r0.onNext((Boolean) obj);
                        }

                        public final void onError(Throwable th) {
                            super.onError(th);
                            r0.onNext(Boolean.FALSE);
                        }
                    }, defaultToolbarMenus.getMin.forAccount((GriverCommonResourceProxy) obj));
                }

                public final void onError(Throwable th) {
                    super.onError(th);
                    OpenSettingItem.this.setMin.execute(r0);
                }
            }, createSplashView.getMax.forContext(context));
        } else {
            this.setMin.execute(r0);
        }
    }

    public final void getMax() {
        this.getMax.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                OpenSettingItem.this.onPostMessage.onCheckActiveTime(((Boolean) obj).booleanValue());
            }
        });
    }

    public final void length() {
        this.setMax.execute(new GriverAppVirtualHostProxy<Long>() {
            public final /* synthetic */ void onNext(Object obj) {
                updateActionSheetContent.d("Last Active Time", "setLastActiveTime success");
            }
        }, OptionMenu.setMin.forLastActiveTime(Long.valueOf(System.currentTimeMillis())));
    }

    public final void getMin() {
        this.onNavigationEvent.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                OpenSettingItem.this.onPostMessage.onLoginNotify(((Boolean) obj).booleanValue());
            }
        });
    }

    public final void setMin() {
        this.toString.execute(new GriverAppVirtualHostProxy<Version>() {
            public final /* synthetic */ void onNext(@NotNull Object obj) {
                Version version = (Version) obj;
                int unused = OpenSettingItem.this.ICustomTabsCallback$Stub = version.getLatestVersion().toInt();
                int unused2 = OpenSettingItem.this.onTransact = version.getValidVersion().toInt();
                int i = AnonymousClass11.getMax[version.getUpdateOption(new ErrorConstants(2, 4, 0)).ordinal()];
                if (i == 1) {
                    OpenSettingItem.this.onPostMessage.onForcedAppUpdate();
                } else if (i != 2) {
                    OpenSettingItem.this.onPostMessage.onNonUpdate();
                } else {
                    OpenSettingItem.this.onPostMessage.onOptionalAppUpdate();
                }
            }

            public final void onError(Throwable th) {
                OpenSettingItem.this.onPostMessage.onNonUpdate();
            }
        });
    }

    /* renamed from: o.OpenSettingItem$11  reason: invalid class name */
    static /* synthetic */ class AnonymousClass11 {
        static final /* synthetic */ int[] getMax;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                id.dana.domain.version.Version$UpdateOption[] r0 = id.dana.domain.version.Version.UpdateOption.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                getMax = r0
                id.dana.domain.version.Version$UpdateOption r1 = id.dana.domain.version.Version.UpdateOption.FORCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x001d }
                id.dana.domain.version.Version$UpdateOption r1 = id.dana.domain.version.Version.UpdateOption.OPTIONAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.OpenSettingItem.AnonymousClass11.<clinit>():void");
        }
    }

    public final void IsOverlapping() {
        this.getMin.execute(new GriverAppVirtualHostProxy<String>() {
            public final /* synthetic */ void onNext(Object obj) {
                OpenSettingItem.this.onPostMessage.onGetPhoneNumber((String) obj);
            }
        });
    }

    public final void setMin(final String str) {
        this.getMin.execute(new GriverAppVirtualHostProxy<String>() {
            public final /* synthetic */ void onNext(Object obj) {
                OpenSettingItem.this.onPostMessage.onMatchPhoneNumberSuccess(isOriginHasAppInfo.getClearPhoneNumber(str).equals(isOriginHasAppInfo.getClearPhoneNumber((String) obj)));
            }

            public final void onError(Throwable th) {
                super.onError(th);
                OpenSettingItem.this.onPostMessage.onMatchPhoneNumberFailed();
            }
        });
    }

    public final void isInside() {
        this.IsOverlapping.execute(new GriverAppVirtualHostProxy<String>() {
            public final /* synthetic */ void onNext(Object obj) {
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    AppsFlyerLib.getInstance().setCustomerUserId(str);
                    OpenSettingItem.this.invokeSuspend.execute(new GriverAppVirtualHostProxy<disconnect>(str) {
                        public final /* synthetic */ void onNext(Object obj) {
                            OpenSettingItem.this.getMax(OpenSettingItem.this.invoke.setMin((disconnect) obj), r3);
                        }
                    });
                }
            }
        });
    }

    public final void toIntRange() {
        this.equals.execute(new GriverAppVirtualHostProxy());
        this.isInside.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final void onError(Throwable th) {
                super.onError(th);
                OpenSettingItem.this.onPostMessage.onCertificatePinned();
            }

            public final /* synthetic */ void onNext(Object obj) {
                OpenSettingItem.this.onPostMessage.onCertificatePinned();
            }
        });
    }

    public final void toFloatRange() {
        this.FastBitmap$CoordinateSystem.execute(new GriverAppVirtualHostProxy<Integer>() {
            public final /* synthetic */ void onNext(Object obj) {
                if (((Integer) obj).intValue() <= 0) {
                    OpenSettingItem.this.hashCode.execute(new GriverAppVirtualHostProxy(), createBleDevice.setMax.forVersion(1));
                    OpenSettingItem.this.onPostMessage.onStorageUpdateChecked(true);
                    return;
                }
                OpenSettingItem.this.onPostMessage.onStorageUpdateChecked(false);
            }

            public final void onError(Throwable th) {
                super.onError(th);
                OpenSettingItem.this.onPostMessage.onStorageUpdateChecked(true);
            }
        });
    }

    public final void equals() {
        this.toFloatRange.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                OpenSettingItem.this.onPostMessage.onCheckDoHoldLogin(((Boolean) obj).booleanValue());
            }

            public final void onError(Throwable th) {
                super.onError(th);
                OpenSettingItem.this.onPostMessage.onCheckDoHoldLogin(false);
            }
        });
    }

    public final void toDoubleRange() {
        this.ICustomTabsCallback.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                Boolean bool = (Boolean) obj;
                boolean unused = OpenSettingItem.this.asInterface = bool.booleanValue();
                OpenSettingItem.this.onPostMessage.onCheckAppFirstLaunch(bool.booleanValue());
                if (OpenSettingItem.this.asInterface) {
                    OpenSettingItem.this.getMax((getPagePerfKey) null, (String) null);
                }
            }

            public final void onError(Throwable th) {
                super.onError(th);
                OpenSettingItem.this.onPostMessage.onCheckAppFirstLaunch(false);
            }
        });
    }

    public final void values() {
        this.b.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                OpenSettingItem.this.onPostMessage.onCheckUnsafeDevice(((Boolean) obj).booleanValue());
            }

            public final void onError(Throwable th) {
                super.onError(th);
                OpenSettingItem.this.onPostMessage.onCheckUnsafeDevice(false);
            }
        });
    }

    public final void FastBitmap$CoordinateSystem() {
        this.toDoubleRange.execute(new GriverAppVirtualHostProxy<setWebChromeClient>() {
            public final /* synthetic */ void onNext(Object obj) {
                setWebChromeClient setwebchromeclient = (setWebChromeClient) obj;
                OpenSettingItem.this.onPostMessage.onCheckDexguardIntegrityCheckEnabled(setwebchromeclient.getDexguardRootCheckConfig(), setwebchromeclient.getDexguardHookCheckConfig(), setwebchromeclient.getDexguardTamperCheckConfig());
            }

            public final void onError(Throwable th) {
                OpenSettingItem.this.onPostMessage.onCheckDexguardIntegrityCheckEnabled(false, false, false);
            }
        });
    }

    public final void valueOf() {
        this.onNavigationEvent.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final void onError(Throwable th) {
                updateActionSheetContent.e("Notify Pay", "Error notifyPay in Splash Screen ", th);
            }
        });
    }

    public final void getMin(String str, String str2) {
        int i = this.ICustomTabsCallback$Stub;
        int i2 = this.onTransact;
        convertDipToPx.length length2 = new convertDipToPx.length(this.Grayscale$Algorithm.getApplicationContext());
        length2.getMax = TrackerKey.Event.APP_UPDATE;
        convertDipToPx.length max = length2.setMax(TrackerKey.AppUpdateProperty.LATEST_APP_VERSION, setMin(i)).setMax(TrackerKey.AppUpdateProperty.VALID_APP_VERSION, setMin(i2)).setMax(TrackerKey.AppUpdateProperty.APP_UPDATE_TYPE, str).setMax(TrackerKey.AppUpdateProperty.APP_UPDATE_ACTION, str2);
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    public final void Grayscale$Algorithm() {
        try {
            updateActionSheetContent.i(getCause, Boolean.TRUE.equals(this.extraCallbackWithResult.execute()) ? "Deeplink Payload removed" : "Deeplink Payload already removed");
        } catch (Exception e) {
            updateActionSheetContent.e(getCause, "Deeplink Payload already removed", e);
        }
    }

    public final void Mean$Arithmetic() {
        this.onPostMessage.showProgress();
        this.Mean$Arithmetic.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                OpenSettingItem.this.onPostMessage.onFinishLogout();
                OpenSettingItem.this.onPostMessage.dismissProgress();
            }
        });
    }

    public final void invokeSuspend() {
        this.values.execute(onReceivedIcon.INSTANCE, new GriverOpenSettingExtension(this), RVCommonAbilityProxy.length);
    }

    public final void invoke() {
        this.onRelationshipValidationResult.execute(onReceivedIcon.INSTANCE, new GriverImagePathProxy(this), getSnapShotImagePath.length);
    }

    public final void getCause() {
        setFavoriteBtnVisibility length2 = setFavoriteBtnVisibility.length(GriverOpenSettingExtension.SettingChangeCallback.getMin);
        getChildren min = Functions.getMin();
        setRefreshAnimation.getMax(min, "predicate is null");
        dismissBadgeView setonpullrefreshlistener = new setOnPullRefreshListener(length2, min);
        RedDotDrawable<? super setFavoriteBtnVisibility, ? extends setFavoriteBtnVisibility> redDotDrawable = SecuritySignature.valueOf;
        if (redDotDrawable != null) {
            setonpullrefreshlistener = (setFavoriteBtnVisibility) SecuritySignature.getMax(redDotDrawable, setonpullrefreshlistener);
        }
        hasCornerMarking min2 = getSecureSignatureComp.setMin();
        setRefreshAnimation.getMax(min2, "scheduler is null");
        dismissBadgeView setheaderviewheight = new setHeaderViewHeight(setonpullrefreshlistener, min2);
        RedDotDrawable<? super setFavoriteBtnVisibility, ? extends setFavoriteBtnVisibility> redDotDrawable2 = SecuritySignature.valueOf;
        if (redDotDrawable2 != null) {
            setheaderviewheight = (setFavoriteBtnVisibility) SecuritySignature.getMax(redDotDrawable2, setheaderviewheight);
        }
        hasCornerMarking length3 = hideProgress.length();
        setRefreshAnimation.getMax(length3, "scheduler is null");
        setFavoriteBtnVisibility setrefreshoffset = new setRefreshOffset(setheaderviewheight, length3);
        RedDotDrawable<? super setFavoriteBtnVisibility, ? extends setFavoriteBtnVisibility> redDotDrawable3 = SecuritySignature.valueOf;
        if (redDotDrawable3 != null) {
            setrefreshoffset = (setFavoriteBtnVisibility) SecuritySignature.getMax(redDotDrawable3, setrefreshoffset);
        }
        this.asBinder.getMin(setrefreshoffset.v_());
    }

    private static String setMin(int i) {
        String valueOf2 = String.valueOf(i);
        if (valueOf2.length() <= 1 || valueOf2.length() > 3) {
            return valueOf2.length() >= 5 ? valueOf2.replaceAll("0", ".") : valueOf2;
        }
        StringBuilder sb = new StringBuilder("0.");
        sb.append(valueOf2.replaceAll("0", "."));
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public void getMax(getPagePerfKey getpageperfkey, String str) {
        getTypefaceByCat.setMin setmin = new getTypefaceByCat.setMin();
        setmin.getMax = this.Grayscale$Algorithm.getApplicationContext();
        setmin.setMax = this.valueOf.getCurrentTrackerId();
        setmin.length = BlurProcess.setMax();
        setmin.setMin = str;
        setmin.toIntRange = this.asInterface;
        setmin.equals = BlurProcess.length();
        if (getpageperfkey != null) {
            if (!TextUtils.isEmpty(getpageperfkey.getMin)) {
                setmin.getMin = getpageperfkey.getMin;
            }
            if (getpageperfkey.setMax != null) {
                String str2 = getpageperfkey.setMax.getMax;
                if (!TextUtils.isEmpty(str2)) {
                    setmin.setMin(str2);
                }
            }
        }
        for (getTypeface max : judgeRes.getMin(new getTypefaceByCat(setmin, (byte) 0), this.valueOf, TrackerType.APPSFLYER, TrackerType.BRANCH, TrackerType.MIXPANEL)) {
            max.getMax();
        }
    }

    public void setMax() {
        this.setMin.dispose();
        this.getMax.dispose();
        this.toString.dispose();
        this.getMin.dispose();
        this.isInside.dispose();
        this.equals.dispose();
        this.onNavigationEvent.dispose();
        this.length.dispose();
        this.FastBitmap$CoordinateSystem.dispose();
        this.hashCode.dispose();
        this.toIntRange.dispose();
        this.toFloatRange.dispose();
        this.ICustomTabsCallback.dispose();
        this.b.dispose();
        this.IsOverlapping.dispose();
        this.invokeSuspend.dispose();
        this.toDoubleRange.dispose();
        this.values.dispose();
        this.onRelationshipValidationResult.dispose();
        this.asBinder.getMax();
        this.setMax.dispose();
    }

    static /* synthetic */ void create() {
        convertSpToPx[] convertsptopxArr = {new Helper("rds_on_page")};
        for (int i = 0; i <= 0; i++) {
            convertsptopxArr[0].length();
        }
    }
}
