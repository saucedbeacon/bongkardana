package o;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\tH\u0014¨\u0006\f"}, d2 = {"Lid/dana/scanner/handler/h5pages/ScannerH5TcicoQrHandler;", "Lid/dana/scanner/handler/h5pages/BaseScannerH5PageHandler;", "context", "Landroid/content/Context;", "h5Listener", "Lid/dana/danah5/DanaH5Listener;", "scanModel", "Lid/dana/model/ScanModel;", "viewType", "", "(Landroid/content/Context;Lid/dana/danah5/DanaH5Listener;Lid/dana/model/ScanModel;Ljava/lang/String;)V", "target", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class useSystemImageDecoderByte extends decodeByteArray {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public useSystemImageDecoderByte(@Nullable Context context, @NotNull setCancelOnTouchOutside$core setcancelontouchoutside_core, @NotNull fillPageCommonInfo fillpagecommoninfo, @NotNull String str) {
        super(context, setcancelontouchoutside_core, fillpagecommoninfo);
        Intrinsics.checkNotNullParameter(setcancelontouchoutside_core, "h5Listener");
        Intrinsics.checkNotNullParameter(fillpagecommoninfo, "scanModel");
        Intrinsics.checkNotNullParameter(str, "viewType");
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final String length() {
        fillPageCommonInfo max = setMax();
        Intrinsics.checkNotNullExpressionValue(max, "scanModel");
        String redirectUrl = max.getRedirectUrl();
        Intrinsics.checkNotNullExpressionValue(redirectUrl, "scanModel.redirectUrl");
        return redirectUrl;
    }
}
