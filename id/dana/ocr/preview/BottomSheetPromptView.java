package id.dana.ocr.preview;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.base.LockableBaseBottomSheetBehavior;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.Retention;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.PrepareException;
import o.deleteDownloadPackage;
import o.isPrerunWorkerApp;
import o.resetInternal;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002$%B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0014J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001cJ\u000e\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u001cJ\b\u0010\"\u001a\u00020\u0014H\u0016J\u0006\u0010#\u001a\u00020\u0014R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lid/dana/ocr/preview/BottomSheetPromptView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "bottomSheetBehavior", "Lid/dana/base/LockableBaseBottomSheetBehavior;", "Landroidx/cardview/widget/CardView;", "bottomSheetPromptCallback", "Lid/dana/ocr/preview/BottomSheetPromptView$BottomSheetPromptCallback;", "bottomSheetPromptComponent", "Lid/dana/di/component/BottomSheetPromptComponent;", "getLayout", "hide", "", "initBottomSheet", "initViews", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "setHeader", "headerText", "", "setListener", "setNegativeButtonText", "negativeButtonMessage", "setPositiveButtonText", "positiveButtonMessage", "setup", "show", "BottomSheetPromptCallback", "Result", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BottomSheetPromptView extends BaseRichView {
    private LockableBaseBottomSheetBehavior<CardView> getMax;
    private HashMap getMin;
    /* access modifiers changed from: private */
    public BottomSheetPromptCallback length;
    /* access modifiers changed from: private */
    public isPrerunWorkerApp setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/ocr/preview/BottomSheetPromptView$BottomSheetPromptCallback;", "", "onAction", "", "result", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface BottomSheetPromptCallback {
        void setMax(@NotNull String str);
    }

    @JvmOverloads
    public BottomSheetPromptView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public BottomSheetPromptView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.getMin == null) {
            this.getMin = new HashMap();
        }
        View view = (View) this.getMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_bottomsheet_prompt;
    }

    public static final /* synthetic */ isPrerunWorkerApp access$getBottomSheetPromptComponent$p(BottomSheetPromptView bottomSheetPromptView) {
        isPrerunWorkerApp isprerunworkerapp = bottomSheetPromptView.setMin;
        if (isprerunworkerapp == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetPromptComponent");
        }
        return isprerunworkerapp;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BottomSheetPromptView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BottomSheetPromptView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public BottomSheetPromptView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final void setup() {
        initBottomSheet();
        initViews();
    }

    public final void injectComponent(@Nullable PrepareException.AnonymousClass1 r2) {
        super.injectComponent(r2);
        if (this.setMin == null) {
            deleteDownloadPackage.getMin min = deleteDownloadPackage.setMin();
            if (r2 != null) {
                min.setMax = r2;
                stopIgnoring.setMin(min.setMax, PrepareException.AnonymousClass1.class);
                deleteDownloadPackage deletedownloadpackage = new deleteDownloadPackage();
                Intrinsics.checkNotNullExpressionValue(deletedownloadpackage, "DaggerBottomSheetPromptC…\n                .build()");
                this.setMin = deletedownloadpackage;
            } else {
                throw null;
            }
        }
        if (this.setMin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetPromptComponent");
        }
    }

    public final void initBottomSheet() {
        BottomSheetBehavior from = LockableBaseBottomSheetBehavior.from((CardView) _$_findCachedViewById(resetInternal.setMax.codename));
        if (from != null) {
            this.getMax = (LockableBaseBottomSheetBehavior) from;
            hide();
            LockableBaseBottomSheetBehavior<CardView> lockableBaseBottomSheetBehavior = this.getMax;
            if (lockableBaseBottomSheetBehavior == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            }
            lockableBaseBottomSheetBehavior.getMin = true;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.base.LockableBaseBottomSheetBehavior<androidx.cardview.widget.CardView>");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ BottomSheetPromptView getMax;

        setMin(BottomSheetPromptView bottomSheetPromptView) {
            this.getMax = bottomSheetPromptView;
        }

        public final void onClick(View view) {
            this.getMax.hide();
            BottomSheetPromptCallback access$getBottomSheetPromptCallback$p = this.getMax.length;
            if (access$getBottomSheetPromptCallback$p != null) {
                access$getBottomSheetPromptCallback$p.setMax(Result.POSITIVE_BUTTON_CLICKED);
            }
        }
    }

    public final void initViews() {
        ((Button) _$_findCachedViewById(resetInternal.setMax.INotificationSideChannel$Stub$Proxy)).setOnClickListener(new setMin(this));
        ((Button) _$_findCachedViewById(resetInternal.setMax.ITrustedWebActivityService$Default)).setOnClickListener(new setMax(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ BottomSheetPromptView getMin;

        setMax(BottomSheetPromptView bottomSheetPromptView) {
            this.getMin = bottomSheetPromptView;
        }

        public final void onClick(View view) {
            this.getMin.hide();
            BottomSheetPromptCallback access$getBottomSheetPromptCallback$p = this.getMin.length;
            if (access$getBottomSheetPromptCallback$p != null) {
                access$getBottomSheetPromptCallback$p.setMax(Result.NEGATIVE_BUTTON_CLICKED);
            }
        }
    }

    public final void show() {
        LockableBaseBottomSheetBehavior<CardView> lockableBaseBottomSheetBehavior = this.getMax;
        if (lockableBaseBottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
        }
        lockableBaseBottomSheetBehavior.setState(3);
    }

    public final void hide() {
        LockableBaseBottomSheetBehavior<CardView> lockableBaseBottomSheetBehavior = this.getMax;
        if (lockableBaseBottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
        }
        lockableBaseBottomSheetBehavior.setState(5);
    }

    public final void setListener(@NotNull BottomSheetPromptCallback bottomSheetPromptCallback) {
        Intrinsics.checkNotNullParameter(bottomSheetPromptCallback, "bottomSheetPromptCallback");
        this.length = bottomSheetPromptCallback;
    }

    public final void setHeader(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "headerText");
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.TransitionRes);
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setPositiveButtonText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "positiveButtonMessage");
        Button button = (Button) _$_findCachedViewById(resetInternal.setMax.INotificationSideChannel$Stub$Proxy);
        if (button != null) {
            button.setText(str);
        }
    }

    public final void setNegativeButtonText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "negativeButtonMessage");
        Button button = (Button) _$_findCachedViewById(resetInternal.setMax.ITrustedWebActivityService$Default);
        if (button != null) {
            button.setText(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lid/dana/ocr/preview/BottomSheetPromptView$Result;", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @Retention(AnnotationRetention.SOURCE)
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface Result {
        @NotNull
        public static final String CANCEL = "CANCEL";
        @NotNull
        public static final Companion Companion = Companion.length;
        @NotNull
        public static final String NEGATIVE_BUTTON_CLICKED = "NEGATIVE_BUTTON_CLICKED";
        @NotNull
        public static final String POSITIVE_BUTTON_CLICKED = "POSITIVE_BUTTON_CLICKED";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/ocr/preview/BottomSheetPromptView$Result$Companion;", "", "()V", "CANCEL", "", "NEGATIVE_BUTTON_CLICKED", "POSITIVE_BUTTON_CLICKED", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class Companion {
            static final /* synthetic */ Companion length = new Companion();

            private Companion() {
            }
        }
    }
}
