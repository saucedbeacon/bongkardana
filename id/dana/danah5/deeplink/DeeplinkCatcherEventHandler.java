package id.dana.danah5.deeplink;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.griver.base.common.utils.H5UrlHelper;
import id.dana.danah5.base.UrlTransportEventHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.MyBeaconServiceImpl;
import o.WindowBridgeExtension;
import o.dispatchOnCancelled;
import o.message;
import o.onCancelLoad;
import o.onCanceled;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u000b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\f\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u0013"}, d2 = {"Lid/dana/danah5/deeplink/DeeplinkCatcherEventHandler;", "Lid/dana/danah5/base/UrlTransportEventHandler;", "()V", "handleDeepLinkIntent", "", "activity", "Landroid/app/Activity;", "url", "", "page", "Lcom/alibaba/ariver/app/api/Page;", "interceptUrl", "onPageFinished", "", "uriContainsDeepLink", "deeplink", "uri", "Landroid/net/Uri;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DeeplinkCatcherEventHandler extends UrlTransportEventHandler {
    private static final String ACTION = "deepLinkH5_broadcast_filter";
    @NotNull
    public static final getMin Companion = new getMin((DefaultConstructorMarker) null);
    private static final String TAG;
    private static final String URL_DEEPLINK_EXTRA = "urlDeepLinkH5";

    public final boolean interceptUrl(@Nullable Page page, @Nullable String str) {
        if (page != null) {
            Intrinsics.checkNotNullParameter(page, "$this$activity");
            PageContext pageContext = page.getPageContext();
            Activity activity = pageContext != null ? pageContext.getActivity() : null;
            if (activity == null || str == null) {
                return false;
            }
            return handleDeepLinkIntent(activity, str, page);
        }
        return false;
    }

    public final void onPageFinished(@Nullable Page page, @Nullable String str) {
        PageContext pageContext;
        Activity activity;
        Uri parse = Uri.parse(page != null ? page.getPageURI() : null);
        Intrinsics.checkNotNullExpressionValue(parse, "Uri.parse(page?.pageURI)");
        if (uriContainsDeepLink("https://tixid.onelink.me", parse)) {
            updateActionSheetContent.d(TAG, "Deeplik TIX url");
            if (!(page == null || (pageContext = page.getPageContext()) == null || (activity = pageContext.getActivity()) == null)) {
                activity.finish();
            }
        }
        message.Cdefault.closePushWindow(page, str);
    }

    private final boolean handleDeepLinkIntent(Activity activity, String str, Page page) {
        boolean z = false;
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1696347300, oncanceled);
            onCancelLoad.getMin(1696347300, oncanceled);
        }
        Uri parseUrl = H5UrlHelper.parseUrl(str);
        if (parseUrl == null) {
            return false;
        }
        CharSequence host = parseUrl.getHost();
        if (host == null || StringsKt.isBlank(host)) {
            z = true;
        }
        if (z || !uriContainsDeepLink("https://link.dana.id/", parseUrl)) {
            message.Cdefault.closePushWindow(page, str);
            updateActionSheetContent.d(TAG, "not deeplink url ".concat(String.valueOf(str)));
            return message.Cdefault.resolveUrl(WindowBridgeExtension.AnonymousClass1.getMax(), str, page);
        }
        updateActionSheetContent.d(TAG, "deeplink url ".concat(String.valueOf(str)));
        Intent putExtra = new Intent(ACTION).putExtra(URL_DEEPLINK_EXTRA, parseUrl.toString());
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(ACTION).putExtra(…NK_EXTRA, uri.toString())");
        activity.sendBroadcast(putExtra);
        return true;
    }

    private final boolean uriContainsDeepLink(String str, Uri uri) {
        String obj = uri.toString();
        Intrinsics.checkNotNullExpressionValue(obj, "uri.toString()");
        return StringsKt.contains$default((CharSequence) MyBeaconServiceImpl.length(obj), (CharSequence) str, false, 2, (Object) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/danah5/deeplink/DeeplinkCatcherEventHandler$Companion;", "", "()V", "ACTION", "", "TAG", "URL_DEEPLINK_EXTRA", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String simpleName = DeeplinkCatcherEventHandler.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "DeeplinkCatcherEventHandler::class.java.simpleName");
        TAG = simpleName;
    }
}
