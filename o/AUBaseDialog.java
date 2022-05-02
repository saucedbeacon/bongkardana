package o;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import dagger.internal.InjectedFieldSignature;
import id.dana.social.view.NewSocialWidgetView;
import id.dana.social.view.activity.AccountDeactivationActivity;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AUTitleBar;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J-\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u0011J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0014"}, d2 = {"Lid/dana/social/view/ClickableMovementMethod;", "Landroid/text/method/BaseMovementMethod;", "()V", "canSelectArbitrarily", "", "initialize", "", "widget", "Landroid/widget/TextView;", "text", "Landroid/text/Spannable;", "initializeLink", "", "Landroid/text/style/ClickableSpan;", "event", "Landroid/view/MotionEvent;", "buffer", "(Landroid/widget/TextView;Landroid/view/MotionEvent;Landroid/text/Spannable;)[Landroid/text/style/ClickableSpan;", "onTouchEvent", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AUBaseDialog extends BaseMovementMethod {
    @NotNull
    public static final getMax length = new getMax((byte) 0);
    /* access modifiers changed from: private */
    public static AUBaseDialog setMin;

    public final boolean canSelectArbitrarily() {
        return false;
    }

    /* renamed from: o.AUBaseDialog$1  reason: invalid class name */
    public final class AnonymousClass1 implements getBindingAdapter<NewSocialWidgetView> {
        @InjectedFieldSignature("id.dana.social.view.NewSocialWidgetView.presenter")
        @Named("newSocialWidgetPresenter")
        public static void setMax(NewSocialWidgetView newSocialWidgetView, setViewTypeCount setviewtypecount) {
            newSocialWidgetView.presenter = setviewtypecount;
        }
    }

    public final boolean onTouchEvent(@NotNull TextView textView, @NotNull Spannable spannable, @NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(textView, "widget");
        Intrinsics.checkNotNullParameter(spannable, "buffer");
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 0) {
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) motionEvent.getY()), motionEvent.getX());
            Object[] spans = spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            Intrinsics.checkNotNullExpressionValue(spans, "buffer.getSpans(\n       …pan::class.java\n        )");
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spans;
            if (!(clickableSpanArr.length == 0)) {
                if (actionMasked == 1) {
                    clickableSpanArr[0].onClick(textView);
                } else {
                    Selection.setSelection(spannable, spannable.getSpanStart(clickableSpanArr[0]), spannable.getSpanEnd(clickableSpanArr[0]));
                }
                return true;
            }
            Selection.removeSelection(spannable);
        }
        return false;
    }

    /* renamed from: o.AUBaseDialog$2  reason: invalid class name */
    public final class AnonymousClass2 implements getBindingAdapter<AccountDeactivationActivity> {
        @InjectedFieldSignature("id.dana.social.view.activity.AccountDeactivationActivity.accountDeactivationPresenter")
        public static void length(AccountDeactivationActivity accountDeactivationActivity, AUTitleBar.setMin setmin) {
            accountDeactivationActivity.accountDeactivationPresenter = setmin;
        }
    }

    public final void initialize(@NotNull TextView textView, @NotNull Spannable spannable) {
        Intrinsics.checkNotNullParameter(textView, "widget");
        Intrinsics.checkNotNullParameter(spannable, "text");
        Selection.removeSelection(spannable);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lid/dana/social/view/ClickableMovementMethod$Companion;", "", "()V", "clickableMovementMethod", "Lid/dana/social/view/ClickableMovementMethod;", "instance", "getInstance", "()Lid/dana/social/view/ClickableMovementMethod;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }

        @Nullable
        public static AUBaseDialog getMax() {
            getMax getmax = AUBaseDialog.length;
            if (AUBaseDialog.setMin == null) {
                AUBaseDialog.setMin = new AUBaseDialog();
            }
            AUBaseDialog max = AUBaseDialog.setMin;
            if (max == null) {
                Intrinsics.throwUninitializedPropertyAccessException("clickableMovementMethod");
            }
            return max;
        }
    }
}
