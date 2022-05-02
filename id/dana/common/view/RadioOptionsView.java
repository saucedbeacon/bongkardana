package id.dana.common.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CornerMarkingDataProvider;
import o.OptionPickerDialog;
import o.isLayoutRtlSupport;
import o.onMenuItemSelected;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ$\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\u0006\u0010\u0012\u001a\u00020\u0007J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\nH\u0003J(\u0010\u0015\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00172\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eJ\b\u0010\u0018\u001a\u00020\u0010H\u0016¨\u0006\u0019"}, d2 = {"Lid/dana/common/view/RadioOptionsView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "createRadioButton", "Landroidx/appcompat/widget/AppCompatRadioButton;", "optionModel", "Lid/dana/common/model/OptionModel;", "onOptionClicked", "Lkotlin/Function1;", "Landroid/view/View;", "", "getLayout", "getSelectedOption", "setColorState", "radioButton", "setItems", "options", "", "setup", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RadioOptionsView extends BaseRichView {
    private HashMap setMax;

    @JvmOverloads
    public RadioOptionsView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public RadioOptionsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

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

    public final int getLayout() {
        return R.layout.view_radio_options;
    }

    public final void setup() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RadioOptionsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RadioOptionsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final int getSelectedOption() {
        RadioGroup radioGroup = (RadioGroup) _$_findCachedViewById(resetInternal.setMax.ActionMenuPresenter$SavedState);
        Intrinsics.checkNotNullExpressionValue(radioGroup, "rgOptions");
        ViewGroup viewGroup = radioGroup;
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        int i = -1;
        int i2 = 0;
        for (Object next : new onMenuItemSelected.getMax(viewGroup)) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            View view = (View) next;
            if ((view instanceof RadioButton) && ((RadioButton) view).isChecked()) {
                i = i2;
            }
            i2 = i3;
        }
        return i;
    }

    public final void setItems(@NotNull List<isLayoutRtlSupport> list, @NotNull Function1<? super View, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, SecurityConstants.KEY_OPTIONS);
        Intrinsics.checkNotNullParameter(function1, "onOptionClicked");
        RadioGroup radioGroup = (RadioGroup) _$_findCachedViewById(resetInternal.setMax.ActionMenuPresenter$SavedState);
        if (radioGroup != null) {
            for (isLayoutRtlSupport islayoutrtlsupport : list) {
                AppCompatRadioButton appCompatRadioButton = new AppCompatRadioButton(getContext());
                appCompatRadioButton.setText(islayoutrtlsupport.setMax);
                OptionPickerDialog.OnOptionPickListener onOptionPickListener = OptionPickerDialog.OnOptionPickListener.getMin;
                String string = appCompatRadioButton.getContext().getString(R.string.cd_promo_center_sort_item_prefix);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…_center_sort_item_prefix)");
                appCompatRadioButton.setContentDescription(OptionPickerDialog.OnOptionPickListener.getMax(string, islayoutrtlsupport.setMax));
                if (CornerMarkingDataProvider.length()) {
                    appCompatRadioButton.setSupportButtonTintList(new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{16842912}}, new int[]{R.color.f20402131099954, Color.rgb(16, 142, 233)}));
                    appCompatRadioButton.invalidate();
                }
                appCompatRadioButton.setOnClickListener(new length(this, islayoutrtlsupport, function1));
                radioGroup.addView(appCompatRadioButton);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/common/view/RadioOptionsView$createRadioButton$1$1"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ Function1 getMin;
        final /* synthetic */ isLayoutRtlSupport length;
        final /* synthetic */ RadioOptionsView setMax;

        length(RadioOptionsView radioOptionsView, isLayoutRtlSupport islayoutrtlsupport, Function1 function1) {
            this.setMax = radioOptionsView;
            this.length = islayoutrtlsupport;
            this.getMin = function1;
        }

        public final void onClick(View view) {
            Function1 function1 = this.getMin;
            Intrinsics.checkNotNullExpressionValue(view, "it");
            function1.invoke(view);
        }
    }
}
