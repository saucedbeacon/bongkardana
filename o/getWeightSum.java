package o;

import android.graphics.Typeface;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.annotation.CheckResult;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.isMeasureWithLargestChildEnabled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0002`\u000b\u001a\f\u0010\f\u001a\u00020\r*\u00020\u0001H\u0007\u001a\f\u0010\u000e\u001a\u00020\u0007*\u00020\u0001H\u0007*&\u0010\u000f\"\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t¨\u0006\u0010"}, d2 = {"checkBoxPrompt", "Lcom/afollestad/materialdialogs/MaterialDialog;", "res", "", "text", "", "isCheckedDefault", "", "onToggle", "Lkotlin/Function1;", "", "Lcom/afollestad/materialdialogs/checkbox/BooleanCallback;", "getCheckBoxPrompt", "Landroid/widget/CheckBox;", "isCheckPromptChecked", "BooleanCallback", "core"}, k = 2, mv = {1, 1, 16})
public final class getWeightSum {
    @CheckResult
    @NotNull
    public static final CheckBox getCheckBoxPrompt(@NotNull isBaselineAligned isbaselinealigned) {
        AppCompatCheckBox checkBoxPrompt;
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$getCheckBoxPrompt");
        DialogActionButtonLayout buttonsLayout = isbaselinealigned.getView().getButtonsLayout();
        if (buttonsLayout != null && (checkBoxPrompt = buttonsLayout.getCheckBoxPrompt()) != null) {
            return checkBoxPrompt;
        }
        throw new IllegalStateException("The dialog does not have an attached buttons layout.");
    }

    @CheckResult
    public static final boolean isCheckPromptChecked(@NotNull isBaselineAligned isbaselinealigned) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$isCheckPromptChecked");
        return getCheckBoxPrompt(isbaselinealigned).isChecked();
    }

    public static /* synthetic */ isBaselineAligned checkBoxPrompt$default(isBaselineAligned isbaselinealigned, int i, String str, boolean z, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return checkBoxPrompt(isbaselinealigned, i, str, z, function1);
    }

    @NotNull
    public static final isBaselineAligned checkBoxPrompt(@NotNull isBaselineAligned isbaselinealigned, @StringRes int i, @Nullable String str, boolean z, @Nullable Function1<? super Boolean, Unit> function1) {
        AppCompatCheckBox checkBoxPrompt;
        CharSequence charSequence;
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$checkBoxPrompt");
        layoutVertical.INSTANCE.assertOneSet("checkBoxPrompt", str, Integer.valueOf(i));
        DialogActionButtonLayout buttonsLayout = isbaselinealigned.getView().getButtonsLayout();
        if (!(buttonsLayout == null || (checkBoxPrompt = buttonsLayout.getCheckBoxPrompt()) == null)) {
            checkBoxPrompt.setVisibility(0);
            if (str != null) {
                charSequence = str;
            } else {
                charSequence = layoutVertical.resolveString$default(layoutVertical.INSTANCE, isbaselinealigned, Integer.valueOf(i), (Integer) null, false, 12, (Object) null);
            }
            checkBoxPrompt.setText(charSequence);
            checkBoxPrompt.setChecked(z);
            checkBoxPrompt.setOnCheckedChangeListener(new getMax(isbaselinealigned, str, i, z, function1));
            layoutVertical.maybeSetTextColor$default(layoutVertical.INSTANCE, checkBoxPrompt, isbaselinealigned.getWindowContext(), Integer.valueOf(isMeasureWithLargestChildEnabled.getMax.md_color_content), (Integer) null, 4, (Object) null);
            Typeface bodyFont = isbaselinealigned.getBodyFont();
            if (bodyFont != null) {
                checkBoxPrompt.setTypeface(bodyFont);
            }
            int[] resolveColors$default = getLocationOffset.resolveColors$default(isbaselinealigned, new int[]{isMeasureWithLargestChildEnabled.getMax.md_color_widget, isMeasureWithLargestChildEnabled.getMax.md_color_widget_unchecked}, (Function1) null, 2, (Object) null);
            supportNavigateUpTo.setMin(checkBoxPrompt, layoutVertical.INSTANCE.createColorSelector(isbaselinealigned.getWindowContext(), resolveColors$default[1], resolveColors$default[0]));
        }
        return isbaselinealigned;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "checked", "", "onCheckedChanged", "com/afollestad/materialdialogs/checkbox/DialogCheckboxExtKt$checkBoxPrompt$1$1"}, k = 3, mv = {1, 1, 16})
    static final class getMax implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ boolean $isCheckedDefault$inlined;
        final /* synthetic */ Function1 $onToggle$inlined;
        final /* synthetic */ int $res$inlined;
        final /* synthetic */ String $text$inlined;
        final /* synthetic */ isBaselineAligned $this_checkBoxPrompt$inlined;

        getMax(isBaselineAligned isbaselinealigned, String str, int i, boolean z, Function1 function1) {
            this.$this_checkBoxPrompt$inlined = isbaselinealigned;
            this.$text$inlined = str;
            this.$res$inlined = i;
            this.$isCheckedDefault$inlined = z;
            this.$onToggle$inlined = function1;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Function1 function1 = this.$onToggle$inlined;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(z));
            }
        }
    }
}
