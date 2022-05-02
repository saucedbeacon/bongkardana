package id.dana.danah5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import com.ap.zoloz.hummer.biz.HummerConstants;
import dagger.Lazy;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.domain.homeinfo.ThirdPartyServiceResponse;
import id.dana.model.ThirdPartyService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.APWebChromeClient;
import o.BaseGriverRpcRequest;
import o.ErrorConstants;
import o.WindowBridgeExtension;
import o.closeCurrentWindow;
import o.getLeftSelectedIndex;
import o.onInput;
import o.onJsPrompt;
import o.onShowCustomView;
import o.setCancelOnTouchOutside$core;
import o.setCancelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002#$B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0007J\u001e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0016H\u0007J\u001c\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J$\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u001a\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0004H\u0007J\u001a\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007J,\u0010 \u001a\u00020\u000e2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J\f\u0010\"\u001a\u00020\u0004*\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lid/dana/danah5/DanaH5;", "", "()V", "SERVICE_KEY", "", "context", "Landroid/content/Context;", "openH5", "Lid/dana/domain/danah5/interactor/OpenH5;", "checkVersionRequirements", "Lid/dana/danah5/DanaH5$H5Requirement;", "requirements", "Lid/dana/domain/miniprogram/model/MiniProgramVersionRequirements;", "closeAllContainers", "", "dispose", "initialize", "openH5Lazy", "Ldagger/Lazy;", "openApp", "service", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "Lid/dana/model/ThirdPartyService;", "appId", "bundle", "Landroid/os/Bundle;", "openUrlWithBundleListener", "url", "danaH5Listener", "Lid/dana/danah5/DanaH5Listener;", "startContainerActivity", "startContainerFullUrl", "startContainerFullUrlWithSendCredentials", "listener", "correctedUrl", "CheckAppUpdatesMessageEvent", "H5Requirement", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@SuppressLint({"StaticFieldLeak"})
public final class DanaH5 {
    @NotNull
    public static final DanaH5 INSTANCE = new DanaH5();
    @NotNull
    public static final String SERVICE_KEY = "serviceKey";
    private static Context context;
    /* access modifiers changed from: private */
    public static onShowCustomView openH5;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lid/dana/danah5/DanaH5$CheckAppUpdatesMessageEvent;", "", "()V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lid/dana/danah5/DanaH5$H5Requirement;", "", "(Ljava/lang/String;I)V", "UPDATE_OS", "UPDATE_APP", "NOTHING", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public enum H5Requirement {
        UPDATE_OS,
        UPDATE_APP,
        NOTHING
    }

    @JvmStatic
    @JvmOverloads
    public static final void openApp(@NotNull String str) {
        openApp$default(str, (Bundle) null, 2, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void startContainerFullUrlWithSendCredentials() {
        startContainerFullUrlWithSendCredentials$default((String) null, (setCancelOnTouchOutside$core) null, (Bundle) null, 7, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void startContainerFullUrlWithSendCredentials(@Nullable String str) {
        startContainerFullUrlWithSendCredentials$default(str, (setCancelOnTouchOutside$core) null, (Bundle) null, 6, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void startContainerFullUrlWithSendCredentials(@Nullable String str, @Nullable setCancelOnTouchOutside$core setcancelontouchoutside_core) {
        startContainerFullUrlWithSendCredentials$default(str, setcancelontouchoutside_core, (Bundle) null, 4, (Object) null);
    }

    private DanaH5() {
    }

    @JvmStatic
    public static final void initialize(@NotNull Context context2, @NotNull Lazy<onShowCustomView> lazy) {
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(lazy, "openH5Lazy");
        Context applicationContext = context2.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        context = applicationContext;
        openH5 = lazy.get();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $url;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(String str) {
            super(0);
            this.$url = str;
        }

        public final void invoke() {
            WindowBridgeExtension.AnonymousClass1.setMin(DanaH5.correctedUrl(this.$url), new Bundle(), (closeCurrentWindow) null, 12);
        }
    }

    @JvmStatic
    public static final void startContainerFullUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "url");
        getLeftSelectedIndex.setMin(new setMin(str));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function0<Unit> {
        final /* synthetic */ setCancelOnTouchOutside$core $danaH5Listener;
        final /* synthetic */ String $url;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(String str, setCancelOnTouchOutside$core setcancelontouchoutside_core) {
            super(0);
            this.$url = str;
            this.$danaH5Listener = setcancelontouchoutside_core;
        }

        public final void invoke() {
            DanaH5.INSTANCE.openUrlWithBundleListener(DanaH5.correctedUrl(this.$url), new Bundle(), this.$danaH5Listener);
        }
    }

    @JvmStatic
    public static final void startContainerFullUrl(@NotNull String str, @Nullable setCancelOnTouchOutside$core setcancelontouchoutside_core) {
        Intrinsics.checkNotNullParameter(str, "url");
        getLeftSelectedIndex.setMin(new toFloatRange(str, setcancelontouchoutside_core));
    }

    public static /* synthetic */ void startContainerFullUrlWithSendCredentials$default(String str, setCancelOnTouchOutside$core setcancelontouchoutside_core, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            setcancelontouchoutside_core = null;
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        startContainerFullUrlWithSendCredentials(str, setcancelontouchoutside_core, bundle);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function0<Unit> {
        final /* synthetic */ Bundle $bundle;
        final /* synthetic */ setCancelOnTouchOutside$core $listener;
        final /* synthetic */ String $url;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IsOverlapping(String str, Bundle bundle, setCancelOnTouchOutside$core setcancelontouchoutside_core) {
            super(0);
            this.$url = str;
            this.$bundle = bundle;
            this.$listener = setcancelontouchoutside_core;
        }

        public final void invoke() {
            onShowCustomView access$getOpenH5$p;
            final String str = this.$url;
            if (str == null) {
                Bundle bundle = this.$bundle;
                str = bundle != null ? bundle.getString("url") : null;
            }
            if (str != null && (access$getOpenH5$p = DanaH5.openH5) != null) {
                APWebChromeClient.execute$default(access$getOpenH5$p, new onShowCustomView.length(str, this.$bundle), new Function1<onJsPrompt, Unit>(this) {
                    final /* synthetic */ IsOverlapping this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((onJsPrompt) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull onJsPrompt onjsprompt) {
                        Intrinsics.checkNotNullParameter(onjsprompt, "it");
                        if (onjsprompt.getAppId() != null || StringsKt.startsWith$default(str, "mini://", false, 2, (Object) null)) {
                            int i = setCancelable.core.$EnumSwitchMapping$0[DanaH5.INSTANCE.checkVersionRequirements(onjsprompt.getVersionRequirements()).ordinal()];
                            if (i == 1) {
                                return;
                            }
                            if (i == 2) {
                                onInput.getDefault().post(new length());
                                return;
                            } else if (i == 3 && TextUtils.isDigitsOnly(str)) {
                                WindowBridgeExtension.AnonymousClass1.setMin(str, onjsprompt.getH5ShareData());
                                return;
                            }
                        }
                        DanaH5.INSTANCE.openUrlWithBundleListener(DanaH5.correctedUrl(str), onjsprompt.getH5ShareData(), this.this$0.$listener);
                    }
                }, (Function1) null, 4, (Object) null);
            }
        }
    }

    @JvmStatic
    @JvmOverloads
    public static final void startContainerFullUrlWithSendCredentials(@Nullable String str, @Nullable setCancelOnTouchOutside$core setcancelontouchoutside_core, @Nullable Bundle bundle) {
        getLeftSelectedIndex.setMin(new IsOverlapping(str, bundle, setcancelontouchoutside_core));
    }

    public static /* synthetic */ void openApp$default(String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        openApp(str, bundle);
    }

    @JvmStatic
    @JvmOverloads
    public static final void openApp(@NotNull String str, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "appId");
        startContainerFullUrlWithSendCredentials$default(str, (setCancelOnTouchOutside$core) null, bundle, 2, (Object) null);
    }

    @JvmStatic
    public static final void openApp(@NotNull ThirdPartyService thirdPartyService) {
        Intrinsics.checkNotNullParameter(thirdPartyService, FeatureParams.OPEN_SERVICE);
        Bundle bundle = new Bundle();
        bundle.putString(SERVICE_KEY, thirdPartyService.setMax);
        String str = thirdPartyService.setMin;
        Intrinsics.checkNotNull(str);
        openApp(str, bundle);
    }

    @JvmStatic
    public static final void openApp(@NotNull ThirdPartyServiceResponse thirdPartyServiceResponse) {
        Intrinsics.checkNotNullParameter(thirdPartyServiceResponse, FeatureParams.OPEN_SERVICE);
        Bundle bundle = new Bundle();
        bundle.putString(SERVICE_KEY, thirdPartyServiceResponse.getKey());
        String appId = thirdPartyServiceResponse.getAppId();
        Intrinsics.checkNotNull(appId);
        openApp(appId, bundle);
    }

    /* access modifiers changed from: private */
    public final H5Requirement checkVersionRequirements(BaseGriverRpcRequest baseGriverRpcRequest) {
        ErrorConstants.length length2 = ErrorConstants.Companion;
        String str = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(str, "Build.VERSION.RELEASE");
        ErrorConstants fromVersion = length2.fromVersion(str);
        fromVersion.setPatch(0);
        if (fromVersion.compareTo(baseGriverRpcRequest.getMinOsVersion()) < 0) {
            return H5Requirement.UPDATE_OS;
        }
        if (new ErrorConstants(2, 4, 0).compareTo(baseGriverRpcRequest.getMinAppVersion()) < 0) {
            return H5Requirement.UPDATE_APP;
        }
        return H5Requirement.NOTHING;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function0<Unit> {
        final /* synthetic */ Bundle $bundle;
        final /* synthetic */ setCancelOnTouchOutside$core $danaH5Listener;
        final /* synthetic */ String $url;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(String str, Bundle bundle, setCancelOnTouchOutside$core setcancelontouchoutside_core) {
            super(0);
            this.$url = str;
            this.$bundle = bundle;
            this.$danaH5Listener = setcancelontouchoutside_core;
        }

        public final void invoke() {
            if (TextUtils.isDigitsOnly(this.$url)) {
                WindowBridgeExtension.AnonymousClass1.setMin(this.$url, this.$bundle);
            } else {
                WindowBridgeExtension.AnonymousClass1.setMin(this.$url, this.$bundle, new closeCurrentWindow(this) {
                    final /* synthetic */ getMin this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onContainerActivityLifecycleEvent(@NotNull Lifecycle.Event event) {
                        setCancelOnTouchOutside$core setcancelontouchoutside_core;
                        Intrinsics.checkNotNullParameter(event, "activityState");
                        if (event == Lifecycle.Event.ON_CREATE) {
                            setCancelOnTouchOutside$core setcancelontouchoutside_core2 = this.this$0.$danaH5Listener;
                            if (setcancelontouchoutside_core2 != null) {
                                setcancelontouchoutside_core2.onContainerCreated(this.this$0.$bundle);
                            }
                        } else if (event == Lifecycle.Event.ON_DESTROY && (setcancelontouchoutside_core = this.this$0.$danaH5Listener) != null) {
                            setcancelontouchoutside_core.onContainerDestroyed(this.this$0.$bundle);
                        }
                    }
                }, 4);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void openUrlWithBundleListener(String str, Bundle bundle, setCancelOnTouchOutside$core setcancelontouchoutside_core) {
        getLeftSelectedIndex.setMin(new getMin(str, bundle, setcancelontouchoutside_core));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<Unit> {
        final /* synthetic */ Bundle $bundle;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(Bundle bundle) {
            super(0);
            this.$bundle = bundle;
        }

        public final void invoke() {
            WindowBridgeExtension.AnonymousClass1.setMin(this.$bundle, (closeCurrentWindow) null, 6);
        }
    }

    @JvmStatic
    public static final void startContainerActivity(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, HummerConstants.BUNDLE);
        getLeftSelectedIndex.setMin(new setMax(bundle));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<Unit> {
        final /* synthetic */ Bundle $bundle;
        final /* synthetic */ setCancelOnTouchOutside$core $danaH5Listener;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(Bundle bundle, setCancelOnTouchOutside$core setcancelontouchoutside_core) {
            super(0);
            this.$bundle = bundle;
            this.$danaH5Listener = setcancelontouchoutside_core;
        }

        public final void invoke() {
            WindowBridgeExtension.AnonymousClass1.setMin(this.$bundle, (closeCurrentWindow) new closeCurrentWindow(this) {
                final /* synthetic */ getMax this$0;

                {
                    this.this$0 = r1;
                }

                public final void onContainerActivityLifecycleEvent(@NotNull Lifecycle.Event event) {
                    setCancelOnTouchOutside$core setcancelontouchoutside_core;
                    Intrinsics.checkNotNullParameter(event, "activityState");
                    if (event == Lifecycle.Event.ON_CREATE) {
                        setCancelOnTouchOutside$core setcancelontouchoutside_core2 = this.this$0.$danaH5Listener;
                        if (setcancelontouchoutside_core2 != null) {
                            setcancelontouchoutside_core2.onContainerCreated(this.this$0.$bundle);
                        }
                    } else if (event == Lifecycle.Event.ON_DESTROY && (setcancelontouchoutside_core = this.this$0.$danaH5Listener) != null) {
                        setcancelontouchoutside_core.onContainerDestroyed(this.this$0.$bundle);
                    }
                }
            }, 2);
        }
    }

    @JvmStatic
    public static final void startContainerActivity(@NotNull Bundle bundle, @Nullable setCancelOnTouchOutside$core setcancelontouchoutside_core) {
        Intrinsics.checkNotNullParameter(bundle, HummerConstants.BUNDLE);
        getLeftSelectedIndex.setMin(new getMax(bundle, setcancelontouchoutside_core));
    }

    @JvmStatic
    @NotNull
    public static final String correctedUrl(@NotNull String str) {
        String str2 = str;
        Intrinsics.checkNotNullParameter(str2, "$this$correctedUrl");
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str2, "http", 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return str2;
        }
        String substring = str2.substring(0, lastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String substring2 = str2.substring(lastIndexOf$default, str.length());
        Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        CharSequence charSequence = substring2;
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i >= charSequence.length()) {
                break;
            }
            if (charSequence.charAt(i) != '?') {
                z = false;
            }
            if (z) {
                i2++;
            }
            i++;
        }
        if (i2 <= 1) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(substring);
        sb.append(StringsKt.replaceFirst$default(StringsKt.replace$default(substring2, "?", "&", false, 4, (Object) null), "&", "?", false, 4, (Object) null));
        return sb.toString();
    }

    @JvmStatic
    public static final void closeAllContainers() {
        WindowBridgeExtension.AnonymousClass1.length();
    }

    @JvmStatic
    public static final void dispose() {
        onShowCustomView onshowcustomview = openH5;
        if (onshowcustomview != null) {
            onshowcustomview.dispose();
        }
    }
}
