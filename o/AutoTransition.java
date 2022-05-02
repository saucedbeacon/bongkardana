package o;

import android.app.Activity;
import android.content.Intent;
import java.util.Map;
import kotlin.Metadata;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/contract/deeplink/DeepLinkContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface AutoTransition {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lid/dana/contract/deeplink/DeepLinkContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "getPayload", "", "fromRoot", "", "initSession", "activity", "Landroid/app/Activity;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface length extends parentColumns.setMin {
        void getMin(@NotNull Activity activity);

        void setMin(boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J2\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H&J\u001e\u0010\u000e\u001a\u00020\t2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fH&J\u001a\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\u0012\u0010\u0013\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H&J\"\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H&J\u0012\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H&J4\u0010\u0019\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00032\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H&J \u0010\u001a\u001a\u00020\t2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\fH&JB\u0010\u001b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\f2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\"H&J\u0012\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010%H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006&À\u0006\u0001"}, d2 = {"Lid/dana/contract/deeplink/DeepLinkContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "source", "", "getSource", "()Ljava/lang/String;", "setSource", "(Ljava/lang/String;)V", "onCheckKycStatusForPathFeature", "", "action", "params", "", "promoCode", "onCheckKycStatusForPathGn", "onGetSuccessDeepLinkPathContainer", "url", "intent", "Landroid/content/Intent;", "onGetSuccessDeepLinkPathCustomContainer", "onGetSuccessDeepLinkPathDecode", "urlDecode", "scene", "onGetSuccessDeepLinkPathExpand", "shortCode", "onGetSuccessDeepLinkPathFeature", "onGetSuccessDeepLinkPathGn", "onGetSuccessDeepLinkPathMiniProgram", "extendedInfo", "Lorg/json/JSONObject;", "destinationPath", "orderId", "onGetSuccessDeepLinkPathOauth", "oauthParams", "Lid/dana/domain/deeplink/model/OauthParams;", "onSessionInitialized", "deepLinkPayloadModel", "Lid/dana/model/DeepLinkPayloadModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMax extends parentColumns.getMax {
        void getMax(@Nullable String str);

        void getMax(@NotNull String str, @NotNull String str2, @Nullable String str3);

        void getMax(@Nullable String str, @Nullable Map<String, String> map, @Nullable String str2);

        void getMax(@NotNull isForMainFrame isformainframe);

        @Nullable
        String length();

        void setMax(@NotNull String str, @Nullable Intent intent);

        void setMax(@NotNull String str, @NotNull Map<String, String> map, @NotNull JSONObject jSONObject, @Nullable String str2);

        void setMax(@Nullable showSoftInput showsoftinput);

        void setMin(@Nullable String str);

        void setMin(@Nullable Map<String, String> map);
    }
}
