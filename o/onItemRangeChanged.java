package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJM\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000e0\u00132\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0\u0013J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/twilio/verify/api/ServiceAPIClient;", "Lcom/twilio/verify/api/BaseAPIClient;", "networkProvider", "Lcom/twilio/verify/networking/NetworkProvider;", "context", "Landroid/content/Context;", "authentication", "Lcom/twilio/verify/networking/Authentication;", "baseUrl", "", "dateProvider", "Lcom/twilio/verify/data/DateProvider;", "(Lcom/twilio/verify/networking/NetworkProvider;Landroid/content/Context;Lcom/twilio/verify/networking/Authentication;Ljava/lang/String;Lcom/twilio/verify/data/DateProvider;)V", "get", "", "serviceSid", "factor", "Lcom/twilio/verify/models/Factor;", "success", "Lkotlin/Function1;", "Lorg/json/JSONObject;", "Lkotlin/ParameterName;", "name", "response", "error", "Lcom/twilio/verify/TwilioVerifyException;", "getServiceURL", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class onItemRangeChanged extends notifyItemRangeRemoved {
    private final String getMax;
    private final Context getMin;
    private final shouldReMeasureChild length;
    private final ignoreView setMin;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ onItemRangeChanged(o.shouldReMeasureChild r10, android.content.Context r11, o.ignoreView r12, java.lang.String r13) {
        /*
            r9 = this;
            o.onItemRangeInserted r0 = new o.onItemRangeInserted
            android.content.SharedPreferences r1 = o.canRestoreState.getMax(r11)
            java.lang.String r2 = "storagePreferences(context)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r0.<init>(r1)
            r8 = r0
            o.RecyclerView$ItemAnimator$AdapterChanges r8 = (o.RecyclerView$ItemAnimator$AdapterChanges) r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onItemRangeChanged.<init>(o.shouldReMeasureChild, android.content.Context, o.ignoreView, java.lang.String):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private onItemRangeChanged(@NotNull shouldReMeasureChild shouldremeasurechild, @NotNull Context context, @NotNull ignoreView ignoreview, @NotNull String str, @NotNull RecyclerView$ItemAnimator$AdapterChanges recyclerView$ItemAnimator$AdapterChanges) {
        super(recyclerView$ItemAnimator$AdapterChanges);
        Intrinsics.checkParameterIsNotNull(shouldremeasurechild, "networkProvider");
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        Intrinsics.checkParameterIsNotNull(ignoreview, "authentication");
        Intrinsics.checkParameterIsNotNull(str, "baseUrl");
        Intrinsics.checkParameterIsNotNull(recyclerView$ItemAnimator$AdapterChanges, "dateProvider");
        this.length = shouldremeasurechild;
        this.getMin = context;
        this.setMin = ignoreview;
        this.getMax = str;
    }
}
