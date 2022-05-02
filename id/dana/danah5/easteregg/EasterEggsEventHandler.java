package id.dana.danah5.easteregg;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.api.common.view.GriverTitleBarEvent;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.webview.GriverWebviewSetting;
import com.alipay.iap.android.common.utils.MiscUtils;
import com.iap.ac.config.lite.ConfigCenter;
import com.iap.ac.config.lite.ConfigCenterContext;
import com.iap.ac.config.lite.delegate.ConfigIdentifierProvider;
import id.dana.DanaApplication;
import id.dana.danah5.base.UrlTransportEventHandler;
import id.dana.di.modules.GContainerModule;
import id.dana.myprofile.EasterEggActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.H5TinyPopMenu;
import o.PrepareException;
import o.WindowBridgeExtension;
import o.getPerformanceTracker;
import o.message;
import o.saveSnapshot;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0003J\u001c\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\u001a\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001c\u001a\u00020\u000fH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lid/dana/danah5/easteregg/EasterEggsEventHandler;", "Lcom/alibaba/griver/api/common/view/GriverTitleBarEvent;", "Lid/dana/danah5/base/UrlTransportEventHandler;", "()V", "activity", "Landroid/app/Activity;", "deviceInformationProvider", "Lid/dana/data/config/DeviceInformationProvider;", "getDeviceInformationProvider", "()Lid/dana/data/config/DeviceInformationProvider;", "setDeviceInformationProvider", "(Lid/dana/data/config/DeviceInformationProvider;)V", "quickTap", "Lid/dana/danah5/easteregg/QuickTap;", "url", "", "getInfoId", "getVersionInformation", "interceptUrl", "", "page", "Lcom/alibaba/ariver/app/api/Page;", "onFinalized", "", "onInitialized", "onTitleClick", "openEasterEggActivity", "versionInformation", "infoIdCopy", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class EasterEggsEventHandler extends UrlTransportEventHandler implements GriverTitleBarEvent {
    private static final String CLIP_BOARD_HINT = "The reference is also copied in clipboard :)";
    @NotNull
    public static final length Companion = new length((DefaultConstructorMarker) null);
    private Activity activity;
    @Inject
    public getPerformanceTracker deviceInformationProvider;
    private message quickTap;
    private String url = "";

    public final void onFinalized() {
    }

    @NotNull
    public final getPerformanceTracker getDeviceInformationProvider() {
        getPerformanceTracker getperformancetracker = this.deviceInformationProvider;
        if (getperformancetracker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceInformationProvider");
        }
        return getperformancetracker;
    }

    public final void setDeviceInformationProvider(@NotNull getPerformanceTracker getperformancetracker) {
        Intrinsics.checkNotNullParameter(getperformancetracker, "<set-?>");
        this.deviceInformationProvider = getperformancetracker;
    }

    public final boolean interceptUrl(@Nullable Page page, @Nullable String str) {
        this.url = page != null ? page.getPageURI() : null;
        return false;
    }

    public final void onInitialized() {
        super.onInitialized();
        saveSnapshot.getMax getmax = new saveSnapshot.getMax((byte) 0);
        Application applicationContext = GriverEnv.getApplicationContext();
        if (applicationContext != null) {
            PrepareException.AnonymousClass1 applicationComponent = ((DanaApplication) applicationContext).getApplicationComponent();
            if (applicationComponent != null) {
                getmax.setMin = applicationComponent;
                getmax.getMin = new GContainerModule();
                getmax.getMin().getMax(this);
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }

    public final void onTitleClick() {
        if (this.quickTap == null) {
            this.quickTap = new message(2000, 5, new setMax(this));
        }
        if (Intrinsics.areEqual((Object) "https://m.dana.id/m/standalone/help", (Object) this.url)) {
            message message = this.quickTap;
            if (message != null) {
                message.process();
            }
            this.activity = GriverEnv.getTopActivity().get();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onQuickTap"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements message.getMin {
        final /* synthetic */ EasterEggsEventHandler this$0;

        setMax(EasterEggsEventHandler easterEggsEventHandler) {
            this.this$0 = easterEggsEventHandler;
        }

        public final void onQuickTap() {
            EasterEggsEventHandler easterEggsEventHandler = this.this$0;
            easterEggsEventHandler.openEasterEggActivity(easterEggsEventHandler.getVersionInformation(), this.this$0.getInfoId());
        }
    }

    /* access modifiers changed from: private */
    public final String getInfoId() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("utdid: ");
        ConfigCenter instance = ConfigCenter.getInstance();
        String str = "";
        sb2.append(instance.isInitialized() ? instance.getConfigContext().getIdentifierProvider().getUtdId(WindowBridgeExtension.AnonymousClass1.getMax()) : str);
        sb.append(sb2.toString());
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        StringsKt.appendln(sb);
        StringBuilder sb3 = new StringBuilder("local-utdid: ");
        getPerformanceTracker getperformancetracker = this.deviceInformationProvider;
        if (getperformancetracker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceInformationProvider");
        }
        sb3.append(getperformancetracker.getDeviceUtdId());
        sb.append(sb3.toString());
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        StringsKt.appendln(sb);
        StringBuilder sb4 = new StringBuilder("reference-utdid: ");
        ConfigCenter instance2 = ConfigCenter.getInstance();
        String md5 = MiscUtils.md5(instance2.isInitialized() ? instance2.getConfigContext().getIdentifierProvider().getUtdId(WindowBridgeExtension.AnonymousClass1.getMax()) : str);
        if (md5.length() >= 16) {
            str = md5.substring(0, 16).toUpperCase();
        }
        sb4.append(str);
        sb.append(sb4.toString());
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        StringsKt.appendln(sb);
        StringBuilder sb5 = new StringBuilder("local-reference-utdid: ");
        getPerformanceTracker getperformancetracker2 = this.deviceInformationProvider;
        if (getperformancetracker2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceInformationProvider");
        }
        sb5.append(getperformancetracker2.getReferenceUtdId());
        sb.append(sb5.toString());
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        StringsKt.appendln(sb);
        ConfigCenter instance3 = ConfigCenter.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance3, "it");
        if (!instance3.isInitialized()) {
            instance3 = null;
        }
        if (instance3 != null) {
            Intrinsics.checkNotNullExpressionValue(instance3, "it");
            ConfigCenterContext configContext = instance3.getConfigContext();
            Intrinsics.checkNotNullExpressionValue(configContext, "it.configContext");
            ConfigIdentifierProvider identifierProvider = configContext.getIdentifierProvider();
            Intrinsics.checkNotNullExpressionValue(identifierProvider, "it.configContext.identifierProvider");
            String configUserId = identifierProvider.getConfigUserId(WindowBridgeExtension.AnonymousClass1.getMax());
            Intrinsics.checkNotNullExpressionValue(configUserId, "provider.getConfigUserId…ainer.applicationContext)");
            sb.append("reference-uid: ".concat(String.valueOf(configUserId)));
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            StringsKt.appendln(sb);
        }
        String obj = sb.toString();
        Intrinsics.checkNotNullExpressionValue(obj, "StringBuilder().apply(builderAction).toString()");
        return obj;
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SimpleDateFormat"})
    public final String getVersionInformation() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("App Version: ");
        sb2.append(H5TinyPopMenu.TitleBarTheme.length(GriverEnv.getApplicationContext(), false));
        sb.append(sb2.toString());
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        StringsKt.appendln(sb);
        StringBuilder sb3 = new StringBuilder("User Agent: ");
        sb3.append(GriverWebviewSetting.getUserAgent());
        sb.append(sb3.toString());
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        StringsKt.appendln(sb);
        ConfigCenter instance = ConfigCenter.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "ConfigCenter.getInstance()");
        if (instance.isInitialized()) {
            StringBuilder sb4 = new StringBuilder("utdid: ");
            ConfigCenter instance2 = ConfigCenter.getInstance();
            String str = "";
            sb4.append(instance2.isInitialized() ? instance2.getConfigContext().getIdentifierProvider().getUtdId(WindowBridgeExtension.AnonymousClass1.getMax()) : str);
            sb.append(sb4.toString());
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            StringsKt.appendln(sb);
            StringBuilder sb5 = new StringBuilder("local-utdid: ");
            getPerformanceTracker getperformancetracker = this.deviceInformationProvider;
            if (getperformancetracker == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deviceInformationProvider");
            }
            sb5.append(getperformancetracker.getDeviceUtdId());
            sb.append(sb5.toString());
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            StringsKt.appendln(sb);
            StringBuilder sb6 = new StringBuilder("reference-utdid: ");
            ConfigCenter instance3 = ConfigCenter.getInstance();
            String md5 = MiscUtils.md5(instance3.isInitialized() ? instance3.getConfigContext().getIdentifierProvider().getUtdId(WindowBridgeExtension.AnonymousClass1.getMax()) : str);
            if (md5.length() >= 16) {
                str = md5.substring(0, 16).toUpperCase();
            }
            sb6.append(str);
            sb.append(sb6.toString());
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            StringsKt.appendln(sb);
            StringBuilder sb7 = new StringBuilder("local-reference-utdid: ");
            getPerformanceTracker getperformancetracker2 = this.deviceInformationProvider;
            if (getperformancetracker2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deviceInformationProvider");
            }
            sb7.append(getperformancetracker2.getReferenceUtdId());
            sb.append(sb7.toString());
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            StringsKt.appendln(sb);
            ConfigCenterContext configContext = instance.getConfigContext();
            Intrinsics.checkNotNullExpressionValue(configContext, "configCenter.configContext");
            ConfigIdentifierProvider identifierProvider = configContext.getIdentifierProvider();
            Intrinsics.checkNotNullExpressionValue(identifierProvider, "configCenter.configContext.identifierProvider");
            String configUserId = identifierProvider.getConfigUserId(WindowBridgeExtension.AnonymousClass1.getMax());
            Intrinsics.checkNotNullExpressionValue(configUserId, "provider.getConfigUserId…ainer.applicationContext)");
            long lastUpdateVersion = instance.getLastUpdateVersion();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            sb.append("reference-uid: ".concat(String.valueOf(configUserId)));
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            StringsKt.appendln(sb);
            sb.append("version: ".concat(String.valueOf(lastUpdateVersion)));
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            StringsKt.appendln(sb);
            StringBuilder sb8 = new StringBuilder("versionDate: ");
            sb8.append(simpleDateFormat.format(new Date(lastUpdateVersion)));
            sb.append(sb8.toString());
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            StringsKt.appendln(sb);
            StringsKt.appendln(sb);
            StringsKt.appendln(sb);
            sb.append("apps: ");
            JSONObject sectionConfig = instance.getSectionConfig(GriverConfigConstants.KEY_APP_CONFIGURATION);
            if (sectionConfig == null) {
                sb.append("null");
                Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
                StringsKt.appendln(sb);
            } else {
                Iterator<String> keys = sectionConfig.keys();
                Intrinsics.checkNotNullExpressionValue(keys, "apps.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next != null) {
                        String obj = sectionConfig.get(next).toString();
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append(next);
                        sb9.append(obj);
                        sb.append(sb9.toString());
                        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
                        StringsKt.appendln(sb);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
            }
            StringsKt.appendln(sb);
            StringsKt.appendln(sb);
            sb.append(CLIP_BOARD_HINT);
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            StringsKt.appendln(sb);
        } else {
            sb.append("AMCS ConfigSdk not initialized!");
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            StringsKt.appendln(sb);
        }
        String obj2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(obj2, "StringBuilder().apply(builderAction).toString()");
        return obj2;
    }

    /* access modifiers changed from: private */
    public final void openEasterEggActivity(String str, String str2) {
        if (this.activity != null) {
            Intent intent = new Intent(this.activity, EasterEggActivity.class);
            intent.putExtra("egg_message", str);
            intent.putExtra(EasterEggActivity.INFO_COPY, str2);
            Activity activity2 = this.activity;
            if (activity2 != null) {
                activity2.startActivity(intent);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/danah5/easteregg/EasterEggsEventHandler$Companion;", "", "()V", "CLIP_BOARD_HINT", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
