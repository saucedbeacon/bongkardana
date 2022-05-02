package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import com.alibaba.ariver.app.api.Page;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.danah5.DanaH5;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.DatePickerBridgeExtension;
import o.WindowBridgeExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class message {
    private int count;
    private getMin onQuickTapListener;
    private long previousTime;
    private int tapAmount;
    private int tapDuration;

    public interface getMin {
        void onQuickTap();
    }

    public message(int i, int i2, @NonNull getMin getmin) {
        this.tapDuration = i;
        this.tapAmount = i2;
        this.onQuickTapListener = getmin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u001c\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0012\u0010\u0016\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u001a\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\u001a\u0010\u001e\u001a\u00020\u00182\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0012\u0010!\u001a\u00020\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0012\u0010\"\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u001a\u0010#\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0018\u0010$\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J \u0010$\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010%\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lid/dana/danah5/deeplink/DeeplinkResolver;", "", "()V", "DEEPLINK_BASE_URL_PARKEE", "", "FALLBACK_URL_EXTRA_KEY", "LANDINGPAGE_OPEN_PARKEE_APP", "MARKET_DETAILS_URL_SCHEME", "PACKAGE_PARKEE_APP", "TAG", "whitelistedThirdPartyDeepLinks", "", "closeAllGContainer", "", "url", "closePushWindow", "page", "Lcom/alibaba/ariver/app/api/Page;", "getFallbackUrl", "uriSchemeIntent", "Landroid/content/Intent;", "getMarketIntentWithPackage", "handleToOpenScanner", "hasActivityToOpen", "", "context", "Landroid/content/Context;", "hasAppToOpenWithIntentScheme", "isMarketProtocol", "fallbackUrl", "isParkeeNotInstalled", "packageManager", "Landroid/content/pm/PackageManager;", "openFallbackUrlFromIntent", "parseIntentScheme", "playstoreCanOpen", "resolveUrl", "skipThirdPartyAppDeepLinkIfNotInstalled", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.message$default  reason: invalid class name */
    public final class Cdefault {
        private static final String DEEPLINK_BASE_URL_PARKEE = "parkee://open?link_click_id";
        private static final String FALLBACK_URL_EXTRA_KEY = "browser_fallback_url";
        @NotNull
        public static final Cdefault INSTANCE = new Cdefault();
        private static final String LANDINGPAGE_OPEN_PARKEE_APP = "https://parkee.app.link/selectedWalletConfiguration?wallet=dana";
        private static final String MARKET_DETAILS_URL_SCHEME = "market://details";
        private static final String PACKAGE_PARKEE_APP = "com.parkee";
        private static final String TAG;
        private static final List<String> whitelistedThirdPartyDeepLinks = CollectionsKt.listOf("bukalapak://", "lazada://");

        static {
            String simpleName = Cdefault.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "DeeplinkResolver::class.java.simpleName");
            TAG = simpleName;
        }

        private Cdefault() {
        }

        @JvmStatic
        public static final boolean resolveUrl(@NotNull Context context, @NotNull String str) {
            Intent parseIntentScheme;
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(str, "url");
            if ((URLUtil.isNetworkUrl(str) && !StringsKt.contains$default((CharSequence) str, (CharSequence) "https://tixid.onelink.me", false, 2, (Object) null)) || (parseIntentScheme = INSTANCE.parseIntentScheme(str)) == null) {
                return false;
            }
            if (INSTANCE.hasActivityToOpen(context, str) || INSTANCE.hasAppToOpenWithIntentScheme(context, parseIntentScheme) || INSTANCE.playstoreCanOpen(context, parseIntentScheme) || INSTANCE.openFallbackUrlFromIntent(parseIntentScheme) || INSTANCE.skipThirdPartyAppDeepLinkIfNotInstalled(str)) {
                return true;
            }
            return false;
        }

        @JvmStatic
        public static final boolean resolveUrl(@NotNull Context context, @NotNull String str, @NotNull Page page) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(str, "url");
            Intrinsics.checkNotNullParameter(page, "page");
            Cdefault defaultR = INSTANCE;
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
            if (!defaultR.isParkeeNotInstalled(str, packageManager)) {
                return resolveUrl(context, str);
            }
            updateActionSheetContent.d(TAG, "Treatment parkee app when not installed");
            handleToOpenScanner(page);
            closePushWindow(page, str);
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
        @kotlin.jvm.JvmStatic
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final void handleToOpenScanner(@org.jetbrains.annotations.Nullable com.alibaba.ariver.app.api.Page r5) {
            /*
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "$this$activity"
                r2 = 0
                if (r5 == 0) goto L_0x0015
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
                com.alibaba.ariver.app.api.PageContext r3 = r5.getPageContext()
                if (r3 == 0) goto L_0x0015
                android.app.Activity r3 = r3.getActivity()
                goto L_0x0016
            L_0x0015:
                r3 = r2
            L_0x0016:
                android.content.Context r3 = (android.content.Context) r3
                java.lang.Class<id.dana.scanner.ScannerActivity> r4 = id.dana.scanner.ScannerActivity.class
                r0.<init>(r3, r4)
                if (r5 == 0) goto L_0x0031
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
                com.alibaba.ariver.app.api.PageContext r5 = r5.getPageContext()
                if (r5 == 0) goto L_0x002c
                android.app.Activity r2 = r5.getActivity()
            L_0x002c:
                if (r2 == 0) goto L_0x0031
                r2.startActivity(r0)
            L_0x0031:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.message.Cdefault.handleToOpenScanner(com.alibaba.ariver.app.api.Page):void");
        }

        @JvmStatic
        public static final void closePushWindow(@Nullable Page page, @Nullable String str) {
            if (StringsKt.contains$default((CharSequence) String.valueOf(str), (CharSequence) DEEPLINK_BASE_URL_PARKEE, false, 2, (Object) null)) {
                if (page != null) {
                    page.exit(false);
                }
                updateActionSheetContent.d(TAG, "Close new tab push window griver");
            }
        }

        private final Intent parseIntentScheme(String str) {
            try {
                Intent parseUri = Intent.parseUri(str, 1);
                Intrinsics.checkNotNullExpressionValue(parseUri, "uriSchemeIntent");
                parseUri.setFlags(268435456);
                return parseUri;
            } catch (Exception e) {
                updateActionSheetContent.e("DeeplinkResolver", "Error parsing Uri", e);
                return null;
            }
        }

        private final boolean hasActivityToOpen(Context context, String str) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            if (!DatePickerBridgeExtension.AnonymousClass8.length(intent, context)) {
                return false;
            }
            intent.setFlags(268435456);
            context.startActivity(intent);
            closeAllGContainer(str);
            return true;
        }

        private final void closeAllGContainer(String str) {
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) "https://tixid.onelink.me", false, 2, (Object) null)) {
                WindowBridgeExtension.AnonymousClass1.length();
            }
        }

        private final boolean hasAppToOpenWithIntentScheme(Context context, Intent intent) {
            if (!DatePickerBridgeExtension.AnonymousClass8.length(intent, context)) {
                return false;
            }
            context.startActivity(intent);
            return true;
        }

        private final boolean playstoreCanOpen(Context context, Intent intent) {
            if (!isMarketProtocol(getFallbackUrl(intent))) {
                return false;
            }
            Intent marketIntentWithPackage = getMarketIntentWithPackage(intent);
            if (!DatePickerBridgeExtension.AnonymousClass8.length(marketIntentWithPackage, context)) {
                return false;
            }
            marketIntentWithPackage.setFlags(268435456);
            context.startActivity(marketIntentWithPackage);
            return true;
        }

        private final boolean openFallbackUrlFromIntent(Intent intent) {
            String fallbackUrl = getFallbackUrl(intent);
            if (TextUtils.isEmpty(fallbackUrl)) {
                return false;
            }
            DanaH5.startContainerFullUrl(fallbackUrl);
            return false;
        }

        private final boolean isMarketProtocol(String str) {
            return StringsKt.isBlank(str) && StringsKt.startsWith$default(str, MARKET_DETAILS_URL_SCHEME, false, 2, (Object) null);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
            r2 = r2.getStringExtra(FALLBACK_URL_EXTRA_KEY);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final java.lang.String getFallbackUrl(android.content.Intent r2) {
            /*
                r1 = this;
                if (r2 == 0) goto L_0x000a
                java.lang.String r0 = "browser_fallback_url"
                java.lang.String r2 = r2.getStringExtra(r0)
                if (r2 != 0) goto L_0x000c
            L_0x000a:
                java.lang.String r2 = ""
            L_0x000c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.message.Cdefault.getFallbackUrl(android.content.Intent):java.lang.String");
        }

        private final Intent getMarketIntentWithPackage(Intent intent) {
            StringBuilder sb = new StringBuilder("market://details?id=");
            sb.append(intent != null ? intent.getPackage() : null);
            return new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
        }

        private final boolean skipThirdPartyAppDeepLinkIfNotInstalled(String str) {
            Iterable<String> iterable = whitelistedThirdPartyDeepLinks;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (String startsWith$default : iterable) {
                    if (StringsKt.startsWith$default(str, startsWith$default, false, 2, (Object) null)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private final boolean isParkeeNotInstalled(String str, PackageManager packageManager) {
            return Intrinsics.areEqual((Object) str, (Object) LANDINGPAGE_OPEN_PARKEE_APP) && !setLineColor.setMax(PACKAGE_PARKEE_APP, packageManager);
        }
    }

    public void process() {
        if (this.previousTime == 0 || System.currentTimeMillis() - this.previousTime < ((long) this.tapDuration)) {
            this.previousTime = System.currentTimeMillis();
            this.count++;
        } else {
            clear();
            process();
        }
        if (this.count >= this.tapAmount) {
            this.onQuickTapListener.onQuickTap();
            clear();
        }
    }

    private void clear() {
        this.previousTime = 0;
        this.count = 0;
    }
}
