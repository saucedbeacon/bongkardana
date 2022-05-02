package o;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import id.dana.R;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001a"}, d2 = {"Lid/dana/promocode/views/PromoCodeBottomSheet;", "Lid/dana/base/BaseBottomSheetDialogFragment;", "()V", "promocodeBottomSheetListener", "Lid/dana/promocode/views/PromoCodeBottomSheet$PromocodeBottomSheetListener;", "getPromocodeBottomSheetListener", "()Lid/dana/promocode/views/PromoCodeBottomSheet$PromocodeBottomSheetListener;", "setPromocodeBottomSheetListener", "(Lid/dana/promocode/views/PromoCodeBottomSheet$PromocodeBottomSheetListener;)V", "getBottomSheet", "Landroid/widget/FrameLayout;", "getBtnNegativeText", "", "title", "getDimAmount", "", "getLayout", "", "init", "", "setOnButtonClicked", "show", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "Companion", "PromocodeBottomSheetListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setLandscape extends order {
    @NotNull
    public static final setMax getMin = new setMax((byte) 0);
    @Nullable
    public getMin getMax;
    private HashMap isInside;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lid/dana/promocode/views/PromoCodeBottomSheet$PromocodeBottomSheetListener;", "", "onNegativeButtonClicked", "", "onPositiveButtonClicked", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin {
        void getMax();

        void setMin();
    }

    private View setMax(int i) {
        if (this.isInside == null) {
            this.isInside = new HashMap();
        }
        View view = (View) this.isInside.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.isInside.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Nullable
    public final FrameLayout getMax() {
        return null;
    }

    public final int getMin() {
        return R.layout.view_bottomsheet_promocode_info;
    }

    public final float length() {
        return 0.0f;
    }

    public final void setMax() {
        super.setMax();
        Bundle arguments = getArguments();
        if (arguments != null) {
            TextView textView = (TextView) setMax(resetInternal.setMax.setHoverListener);
            Intrinsics.checkNotNullExpressionValue(textView, "tvInfoTitle");
            textView.setText(arguments.getString("promo_code_title_key"));
            TextView textView2 = (TextView) setMax(resetInternal.setMax.clearSelection);
            Intrinsics.checkNotNullExpressionValue(textView2, "tvInfoDesc");
            textView2.setText(arguments.getString("promo_code_desc_key"));
            ((DanaButtonPrimaryView) setMax(resetInternal.setMax.asInterface)).setActiveButton(arguments.getString("promo_code_positive_button_key"), (Drawable) null);
            DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) setMax(resetInternal.setMax.extraCallbackWithResult);
            String string = arguments.getString("promo_code_negative_button_key");
            if (string == null) {
                string = getString(R.string.promocode_bottomsheet_back);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.promocode_bottomsheet_back)");
            }
            danaButtonSecondaryView.setActiveButton(string, (Drawable) null);
            ((ImageView) setMax(resetInternal.setMax.onSupportActionModeFinished)).setImageResource(arguments.getInt("promo_code_image_resource_key"));
        }
        ((DanaButtonPrimaryView) setMax(resetInternal.setMax.asInterface)).setOnClickListener(new setMin(this));
        ((DanaButtonSecondaryView) setMax(resetInternal.setMax.extraCallbackWithResult)).setOnClickListener(new length(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ setLandscape length;

        setMin(setLandscape setlandscape) {
            this.length = setlandscape;
        }

        public final void onClick(View view) {
            getMin getmin = this.length.getMax;
            if (getmin != null) {
                getmin.getMax();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ setLandscape getMin;

        length(setLandscape setlandscape) {
            this.getMin = setlandscape;
        }

        public final void onClick(View view) {
            this.getMin.dismiss();
            getMin getmin = this.getMin.getMax;
            if (getmin != null) {
                getmin.setMin();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004J2\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lid/dana/promocode/views/PromoCodeBottomSheet$Companion;", "", "()V", "PROMO_CODE_BOTTOMSHEET_TAG", "", "PROMO_CODE_DESC_KEY", "PROMO_CODE_IMAGE_RESOURCE_KEY", "PROMO_CODE_NEGATIVE_BUTTON_KEY", "PROMO_CODE_POSITIVE_BUTTON_KEY", "PROMO_CODE_TITLE_KEY", "createPromoCodeBottomSheet", "Lid/dana/promocode/views/PromoCodeBottomSheet;", "imgRes", "", "title", "desc", "positiveButtonText", "negativeButtonText", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }

        @NotNull
        public static setLandscape length(@DrawableRes int i, @NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "title");
            Intrinsics.checkNotNullParameter(str2, SecurityConstants.KEY_DESC);
            Intrinsics.checkNotNullParameter(str3, "positiveButtonText");
            setLandscape setlandscape = new setLandscape();
            Bundle bundle = new Bundle();
            bundle.putString("promo_code_title_key", str);
            bundle.putString("promo_code_desc_key", str2);
            bundle.putString("promo_code_positive_button_key", str3);
            bundle.putString("promo_code_negative_button_key", (String) null);
            bundle.putInt("promo_code_image_resource_key", i);
            Unit unit = Unit.INSTANCE;
            setlandscape.setArguments(bundle);
            return setlandscape;
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.isInside;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
