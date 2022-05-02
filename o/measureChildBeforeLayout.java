package o;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.afollestad.materialdialogs.internal.message.DialogContentLayout;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u001c\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u001a/\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\u0010\u000e\u001aQ\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0003\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u001b"}, d2 = {"hideKeyboard", "", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invalidateDividers", "showTop", "", "showBottom", "populateIcon", "imageView", "Landroid/widget/ImageView;", "iconRes", "", "icon", "Landroid/graphics/drawable/Drawable;", "(Lcom/afollestad/materialdialogs/MaterialDialog;Landroid/widget/ImageView;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)V", "populateText", "textView", "Landroid/widget/TextView;", "textRes", "text", "", "fallback", "typeface", "Landroid/graphics/Typeface;", "textColor", "(Lcom/afollestad/materialdialogs/MaterialDialog;Landroid/widget/TextView;Ljava/lang/Integer;Ljava/lang/CharSequence;ILandroid/graphics/Typeface;Ljava/lang/Integer;)V", "preShow", "core"}, k = 2, mv = {1, 1, 16})
public final class measureChildBeforeLayout {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final void invalidateDividers(@NotNull isBaselineAligned isbaselinealigned, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$invalidateDividers");
        isbaselinealigned.getView().invalidateDividers(z, z2);
    }

    public static final void preShow(@NotNull isBaselineAligned isbaselinealigned) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$preShow");
        Object obj = isbaselinealigned.getConfig().get(setBaselineAlignedChildIndex.CUSTOM_VIEW_NO_VERTICAL_PADDING);
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        boolean areEqual = Intrinsics.areEqual((Object) (Boolean) obj, (Object) Boolean.TRUE);
        getVirtualChildAt.invokeAll(isbaselinealigned.getPreShowListeners$core(), isbaselinealigned);
        DialogLayout view = isbaselinealigned.getView();
        if (view.getTitleLayout().shouldNotBeVisible() && !areEqual) {
            view.getContentLayout().modifyFirstAndLastPadding(view.getFrameMarginVertical$core(), view.getFrameMarginVertical$core());
        }
        if (layoutHorizontal.isVisible(getWeightSum.getCheckBoxPrompt(isbaselinealigned))) {
            DialogContentLayout.modifyFirstAndLastPadding$default(view.getContentLayout(), 0, 0, 1, (Object) null);
        } else if (view.getContentLayout().haveMoreThanOneChild()) {
            DialogContentLayout.modifyScrollViewPadding$default(view.getContentLayout(), 0, view.getFrameMarginVerticalLess$core(), 1, (Object) null);
        }
    }

    public static final void populateIcon(@NotNull isBaselineAligned isbaselinealigned, @NotNull ImageView imageView, @Nullable @DrawableRes Integer num, @Nullable Drawable drawable) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$populateIcon");
        Intrinsics.checkParameterIsNotNull(imageView, "imageView");
        Drawable resolveDrawable$default = layoutVertical.resolveDrawable$default(layoutVertical.INSTANCE, isbaselinealigned.getWindowContext(), num, (Integer) null, drawable, 4, (Object) null);
        if (resolveDrawable$default != null) {
            ViewParent parent = imageView.getParent();
            if (parent != null) {
                ((View) parent).setVisibility(0);
                imageView.setVisibility(0);
                imageView.setImageDrawable(resolveDrawable$default);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
        imageView.setVisibility(8);
    }

    public static /* synthetic */ void populateText$default(isBaselineAligned isbaselinealigned, TextView textView, Integer num, CharSequence charSequence, int i, Typeface typeface, Integer num2, int i2, Object obj) {
        populateText(isbaselinealigned, textView, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : charSequence, (i2 & 8) != 0 ? 0 : i, typeface, (i2 & 32) != 0 ? null : num2);
    }

    public static final void populateText(@NotNull isBaselineAligned isbaselinealigned, @NotNull TextView textView, @Nullable @StringRes Integer num, @Nullable CharSequence charSequence, @StringRes int i, @Nullable Typeface typeface, @Nullable Integer num2) {
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$populateText");
        Intrinsics.checkParameterIsNotNull(textView, "textView");
        if (charSequence == null) {
            charSequence = layoutVertical.resolveString$default(layoutVertical.INSTANCE, isbaselinealigned, num, Integer.valueOf(i), false, 8, (Object) null);
        }
        if (charSequence != null) {
            ViewParent parent = textView.getParent();
            if (parent != null) {
                ((View) parent).setVisibility(0);
                textView.setVisibility(0);
                textView.setText(charSequence);
                if (typeface != null) {
                    textView.setTypeface(typeface);
                }
                layoutVertical.maybeSetTextColor$default(layoutVertical.INSTANCE, textView, isbaselinealigned.getWindowContext(), num2, (Integer) null, 4, (Object) null);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
        textView.setVisibility(8);
    }

    public static final void hideKeyboard(@NotNull isBaselineAligned isbaselinealigned) {
        IBinder iBinder;
        Intrinsics.checkParameterIsNotNull(isbaselinealigned, "$this$hideKeyboard");
        Object systemService = isbaselinealigned.getWindowContext().getSystemService("input_method");
        if (systemService != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            View currentFocus = isbaselinealigned.getCurrentFocus();
            if (currentFocus != null) {
                iBinder = currentFocus.getWindowToken();
            } else {
                iBinder = isbaselinealigned.getView().getWindowToken();
            }
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }
}
