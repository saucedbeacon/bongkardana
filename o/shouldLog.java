package o;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.component.cellcomponent.DanaCellSimpleView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.GyroscopeSensorService;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/home/reminderbanner/ReminderBannerView;", "Lid/dana/onboarding/view/BaseSimpleView;", "title", "", "subtitle", "reminderType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLayout", "", "getTitle", "init", "", "loadDataToView", "setReminderIcon", "showShimmer", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class shouldLog extends GyroscopeSensorService.SensorChangedListener {
    @NotNull
    public static final getMax setMin = new getMax((byte) 0);
    private final String getMin;
    private final String length;
    private final String setMax;

    public final int setMax() {
        return R.layout.view_reminder_banner;
    }

    @NotNull
    public final String setMin() {
        return "";
    }

    public shouldLog(@Nullable String str, @Nullable String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str3, "reminderType");
        this.setMax = str;
        this.getMin = str2;
        this.length = str3;
    }

    public final void getMin() {
        if (Intrinsics.areEqual((Object) this.length, (Object) "shimmerReminder")) {
            View view = this.toFloatRange;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("view");
            }
            containsFavoriteMenuItem.getMin((DanaCellSimpleView) view.findViewById(resetInternal.setMax.next), R.layout.view_reminder_banner_skeleton);
            return;
        }
        int i = (int) (Resources.getSystem().getDisplayMetrics().density * 56.0f);
        View view2 = this.toFloatRange;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        }
        DanaCellSimpleView danaCellSimpleView = (DanaCellSimpleView) view2.findViewById(resetInternal.setMax.next);
        danaCellSimpleView.setTitle(String.valueOf(this.setMax));
        danaCellSimpleView.setSubitle(String.valueOf(this.getMin));
        danaCellSimpleView.setIcon(StringsKt.equals(this.length, "PRE", true) ? R.drawable.ic_invoice_reminder : R.drawable.ic_biller_failed_reminder);
        danaCellSimpleView.setArrowIcon(R.drawable.ic_arrow_right_reminder);
        danaCellSimpleView.setRadius(6.0f);
        danaCellSimpleView.setIconSize(i, i);
        danaCellSimpleView.setParentHeight(-1);
        danaCellSimpleView.setDrawableBorder(R.drawable.rounded_grey_border);
        Context context = this.equals;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        danaCellSimpleView.setFontTitle(OptIn.length(context, R.font.f33672131296277));
        Context context2 = this.equals;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        danaCellSimpleView.setFontSubtitle(OptIn.length(context2, R.font.f33652131296275));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/home/reminderbanner/ReminderBannerView$Companion;", "", "()V", "POST_TYPE", "", "PRE_TYPE", "SHIMMER_REMINDER_TYPE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }
}
