package o;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.danah5.DanaH5;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.lazada.LazadaGuideActivity;
import id.dana.notification.RedirectType;
import java.util.Arrays;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import o.AutoTransition;
import o.LocationBridgeExtension;
import o.onMessage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u001c\u0010\u0010\u001a\u00020\u000e2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u001c\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lid/dana/social/utils/FeedsContentAction;", "", "context", "Landroid/content/Context;", "readDeeplinkProperties", "Lid/dana/domain/deeplink/interactor/ReadDeepLinkProperties;", "view", "Lid/dana/contract/deeplink/DeepLinkContract$View;", "deepLinkPayloadModelMapper", "Lid/dana/mapper/DeepLinkPayloadModelMapper;", "dynamicUrlWrapper", "Lid/dana/data/dynamicurl/DynamicUrlWrapper;", "(Landroid/content/Context;Lid/dana/domain/deeplink/interactor/ReadDeepLinkProperties;Lid/dana/contract/deeplink/DeepLinkContract$View;Lid/dana/mapper/DeepLinkPayloadModelMapper;Lid/dana/data/dynamicurl/DynamicUrlWrapper;)V", "dismissProgress", "", "dispose", "doFeedsContentAction", "extendInfo", "Ljava/util/HashMap;", "", "redirectUrl", "getContentUrl", "redirectType", "redirectValue", "getH5AppListener", "Lid/dana/danah5/DanaH5Listener;", "isLazadaRegistrationActivity", "", "startlazadaActivity", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AUIconDrawable {
    @NotNull
    public static final setMin length = new setMin((byte) 0);
    private final getShortName equals;
    private final Context getMax;
    private final LocationBridgeExtension.AnonymousClass2 getMin;
    final AutoTransition.setMax setMax;
    public final onMessage setMin;

    @Inject
    public AUIconDrawable(@NotNull Context context, @NotNull onMessage onmessage, @NotNull AutoTransition.setMax setmax, @NotNull LocationBridgeExtension.AnonymousClass2 r5, @NotNull getShortName getshortname) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(onmessage, "readDeeplinkProperties");
        Intrinsics.checkNotNullParameter(setmax, "view");
        Intrinsics.checkNotNullParameter(r5, "deepLinkPayloadModelMapper");
        Intrinsics.checkNotNullParameter(getshortname, "dynamicUrlWrapper");
        this.getMax = context;
        this.setMin = onmessage;
        this.setMax = setmax;
        this.getMin = r5;
        this.equals = getshortname;
    }

    public final void getMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BranchLinkConstant.OauthParams.REDIRECT_URL);
        this.setMax.showProgress();
        if (str.length() == 0) {
            this.setMax.dismissProgress();
        } else if (isShowMenu.length(str)) {
            onMessage onmessage = this.setMin;
            AutoTransition.setMax setmax = this.setMax;
            onmessage.execute(new PatternPathMotion(setmax, false, setmax.length(), this.getMin), onMessage.getMax.Companion.forLinkRead(str));
        } else {
            String min = isShowMenu.setMin(str);
            Intrinsics.checkNotNullExpressionValue(min, "UrlUtil.getCleanUrl(redirectUrl)");
            DanaH5.startContainerFullUrl(min, new getMax(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"id/dana/social/utils/FeedsContentAction$getH5AppListener$1", "Lid/dana/danah5/DanaH5Listener;", "onContainerCreated", "", "p0", "Landroid/os/Bundle;", "onContainerDestroyed", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements setCancelOnTouchOutside$core {
        final /* synthetic */ AUIconDrawable setMax;

        public final void onContainerDestroyed(@Nullable Bundle bundle) {
        }

        getMax(AUIconDrawable aUIconDrawable) {
            this.setMax = aUIconDrawable;
        }

        public final void onContainerCreated(@Nullable Bundle bundle) {
            this.setMax.setMax.dismissProgress();
        }
    }

    public final void getMax(@NotNull HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "extendInfo");
        String str = hashMap.get("redirectType");
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        Intrinsics.checkNotNullExpressionValue(str, "get(REDIRECT_TYPE_KEY) ?: \"\"");
        String str3 = hashMap.get("redirectValue");
        if (str3 != null) {
            str2 = str3;
        }
        Intrinsics.checkNotNullExpressionValue(str2, "get(REDIRECT_VALUE_KEY) ?: \"\"");
        if (length(str, str2)) {
            Context context = this.getMax;
            Intent createIntent = LazadaGuideActivity.createIntent(context);
            createIntent.setFlags(268435456);
            Unit unit = Unit.INSTANCE;
            context.startActivity(createIntent);
            return;
        }
        getMax(setMin(str, str2));
    }

    private static boolean length(String str, String str2) {
        return Intrinsics.areEqual((Object) str, (Object) "ipgRegistration") && Intrinsics.areEqual((Object) str2, (Object) "lazada");
    }

    private final String setMin(String str, String str2) {
        switch (str.hashCode()) {
            case -2035039290:
                if (str.equals("INNER_URL")) {
                    return "https://m.dana.id".concat(String.valueOf(str2));
                }
                break;
            case -805752590:
                if (str.equals("TRANSACTION_DETAIL")) {
                    StringBuilder sb = new StringBuilder("https://m.dana.id");
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String format = String.format("/m/portal/transaction?bizOrderId=%s&isClosable=true", Arrays.copyOf(new Object[]{str2}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                    sb.append(format);
                    return sb.toString();
                }
                break;
            case 66575:
                if (str.equals(RedirectType.CDP)) {
                    StringBuilder sb2 = new StringBuilder("https://m.dana.id");
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String format2 = String.format("/m/notifications/detail?spaceCode=%s&isClosable=true", Arrays.copyOf(new Object[]{str2}, 1));
                    Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
                    sb2.append(format2);
                    return sb2.toString();
                }
                break;
            case 191796002:
                if (str.equals("VOUCHER_DETAIL")) {
                    StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                    String voucherDetail = this.equals.getVoucherDetail();
                    Intrinsics.checkNotNullExpressionValue(voucherDetail, "dynamicUrlWrapper.voucherDetail");
                    String format3 = String.format(voucherDetail, Arrays.copyOf(new Object[]{str2}, 1));
                    Intrinsics.checkNotNullExpressionValue(format3, "java.lang.String.format(format, *args)");
                    return format3;
                }
                break;
        }
        return str2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/social/utils/FeedsContentAction$Companion;", "", "()V", "REDIRECT_TYPE_KEY", "", "REDIRECT_VALUE_KEY", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }
}
