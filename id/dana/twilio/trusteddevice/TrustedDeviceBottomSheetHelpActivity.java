package id.dana.twilio.trusteddevice;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.usereducation.BottomSheetHelpActivity;
import id.dana.usereducation.model.OnBoardingModel;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lid/dana/twilio/trusteddevice/TrustedDeviceBottomSheetHelpActivity;", "Lid/dana/usereducation/BottomSheetHelpActivity;", "()V", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class TrustedDeviceBottomSheetHelpActivity extends BottomSheetHelpActivity {
    @NotNull
    public static final getMax Companion = new getMax((byte) 0);
    private HashMap setMax;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.setMax == null) {
            this.setMax = new HashMap();
        }
        View view = (View) this.setMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lid/dana/twilio/trusteddevice/TrustedDeviceBottomSheetHelpActivity$Companion;", "", "()V", "createBottomSheetHelpIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "onBoardingModel", "Lid/dana/usereducation/model/OnBoardingModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }

        @NotNull
        public static Intent getMin(@NotNull Context context, @NotNull OnBoardingModel onBoardingModel) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(onBoardingModel, "onBoardingModel");
            Intent intent = new Intent(context, TrustedDeviceBottomSheetHelpActivity.class);
            intent.putExtra("data", onBoardingModel);
            return intent;
        }
    }
}
