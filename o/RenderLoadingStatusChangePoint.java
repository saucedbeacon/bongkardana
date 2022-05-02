package o;

import android.location.Location;
import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.oauth.OAuthResult;
import id.dana.domain.globalsearch.model.AutoCompleteResult;
import id.dana.domain.globalsearch.model.SearchResultResponse;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0015\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, d2 = {"Lid/dana/domain/globalnetwork/model/Auth;", "", "clientId", "", "scope", "appName", "iconUrl", "authCallback", "Lcom/alipay/iap/android/wallet/acl/base/Callback;", "Lcom/alipay/iap/android/wallet/acl/oauth/OAuthResult;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/alipay/iap/android/wallet/acl/base/Callback;)V", "getAppName", "()Ljava/lang/String;", "setAppName", "(Ljava/lang/String;)V", "getAuthCallback", "()Lcom/alipay/iap/android/wallet/acl/base/Callback;", "setAuthCallback", "(Lcom/alipay/iap/android/wallet/acl/base/Callback;)V", "getClientId", "setClientId", "displayName", "getDisplayName", "getIconUrl", "setIconUrl", "getScope", "setScope", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class RenderLoadingStatusChangePoint {
    @Nullable
    private String appName;
    @Nullable
    private Callback<OAuthResult> authCallback;
    @Nullable
    private String clientId;
    @Nullable
    private String iconUrl;
    @Nullable
    private String scope;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J,\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\b\b\u0002\u0010\u0015\u001a\u00020\fH&J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00120\u0003H&J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H&J*\u0010\u0018\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a0\u0019j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a`\u001b0\u0003H&JD\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00120\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010 H&J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00032\u0006\u0010$\u001a\u00020\u0004H&J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u001aH&J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010(\u001a\u00020\u0004H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006)À\u0006\u0001"}, d2 = {"Lid/dana/domain/globalsearch/GlobalSearchRepository;", "", "shouldSuggestLocationPermissionDialog", "Lio/reactivex/Observable;", "", "getShouldSuggestLocationPermissionDialog", "()Lio/reactivex/Observable;", "getAutoComplete", "Lid/dana/domain/globalsearch/model/AutoCompleteResult;", "keyword", "", "page", "", "size", "getGlobalSearchConfig", "Lid/dana/domain/featureconfig/model/GlobalSearchConfig;", "getHintSwipeVisibilityState", "getHistoricalSku", "", "Lid/dana/domain/globalsearch/model/ProductBizId;", "profileKeys", "profileKeyMaxResult", "getPopularSearch", "getPopularSearchPlaceholder", "getRecentSearch", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getSearchResult", "Lid/dana/domain/globalsearch/model/SearchResultResponse;", "categories", "location", "Landroid/location/Location;", "isFeatureGlobalSearchEnable", "saveLocationPermissionSuggestionState", "", "neverShow", "saveRecentSearch", "timeSearch", "setHintSwipeVisibilityState", "isVisible", "domain_release"}, k = 1, mv = {1, 4, 2})
    public interface LoadingStatusChangeListener {
        @NotNull
        TitleBarRightButtonView.AnonymousClass1<AutoCompleteResult> getAutoComplete(@NotNull String str, int i, int i2);

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<APWebViewClient> getGlobalSearchConfig();

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<Boolean> getHintSwipeVisibilityState();

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<List<performRequest>> getHistoricalSku(@NotNull List<String> list, int i);

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<List<String>> getPopularSearch();

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<String> getPopularSearchPlaceholder();

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<HashMap<String, Long>> getRecentSearch();

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<List<SearchResultResponse>> getSearchResult(@NotNull String str, int i, int i2, @NotNull List<String> list, @Nullable Location location);

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<Boolean> getShouldSuggestLocationPermissionDialog();

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureGlobalSearchEnable();

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<Unit> saveLocationPermissionSuggestionState(boolean z);

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<Unit> saveRecentSearch(@NotNull String str, long j);

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<Boolean> setHintSwipeVisibilityState(boolean z);
    }

    public RenderLoadingStatusChangePoint() {
        this((String) null, (String) null, (String) null, (String) null, (Callback) null, 31, (DefaultConstructorMarker) null);
    }

    public RenderLoadingStatusChangePoint(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Callback<OAuthResult> callback) {
        this.clientId = str;
        this.scope = str2;
        this.appName = str3;
        this.iconUrl = str4;
        this.authCallback = callback;
    }

    @Nullable
    public final String getClientId() {
        return this.clientId;
    }

    public final void setClientId(@Nullable String str) {
        this.clientId = str;
    }

    @Nullable
    public final String getScope() {
        return this.scope;
    }

    public final void setScope(@Nullable String str) {
        this.scope = str;
    }

    @Nullable
    public final String getAppName() {
        return this.appName;
    }

    public final void setAppName(@Nullable String str) {
        this.appName = str;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final void setIconUrl(@Nullable String str) {
        this.iconUrl = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RenderLoadingStatusChangePoint(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, com.alipay.iap.android.wallet.acl.base.Callback r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RenderLoadingStatusChangePoint.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.alipay.iap.android.wallet.acl.base.Callback, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final Callback<OAuthResult> getAuthCallback() {
        return this.authCallback;
    }

    public final void setAuthCallback(@Nullable Callback<OAuthResult> callback) {
        this.authCallback = callback;
    }

    @NotNull
    public final String getDisplayName() {
        String str = this.appName;
        return str == null ? "Global Network" : str;
    }
}
