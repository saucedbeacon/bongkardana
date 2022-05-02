package id.dana.social.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import id.dana.R;
import id.dana.base.BaseRichView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AUSegment;
import o.resetInternal;
import o.setOnWheelViewListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u001a\u0010\u000b\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lid/dana/social/view/FeedInputCommentView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "listener", "Lid/dana/social/common/FeedInputCommentListener;", "getListener", "()Lid/dana/social/common/FeedInputCommentListener;", "setListener", "(Lid/dana/social/common/FeedInputCommentListener;)V", "getLayout", "initInputComment", "", "initSubmitButton", "setup", "setupKeyboardListener", "showSubmitButton", "isShow", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class FeedInputCommentView extends BaseRichView {
    public AUSegment.AnonymousClass4 listener;
    private HashMap setMin;

    @JvmOverloads
    public FeedInputCommentView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public FeedInputCommentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.setMin == null) {
            this.setMin = new HashMap();
        }
        View view = (View) this.setMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_feed_input_comment;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e¸\u0006\u000f"}, d2 = {"id/dana/component/extension/InputExtKt$onTextChanged$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "design_release", "id/dana/social/view/FeedInputCommentView$$special$$inlined$onTextChanged$1"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements TextWatcher {
        final /* synthetic */ FeedInputCommentView setMin;

        public final void afterTextChanged(@Nullable Editable editable) {
        }

        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        public getMax(FeedInputCommentView feedInputCommentView) {
            this.setMin = feedInputCommentView;
        }

        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            String obj = charSequence != null ? charSequence.toString() : null;
            if (obj == null) {
                obj = "";
            }
            if (!StringsKt.isBlank(obj)) {
                FeedInputCommentView.access$showSubmitButton(this.setMin, true);
            } else {
                FeedInputCommentView.access$showSubmitButton(this.setMin, false);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeedInputCommentView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FeedInputCommentView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public FeedInputCommentView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final AUSegment.AnonymousClass4 getListener() {
        AUSegment.AnonymousClass4 r0 = this.listener;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
        return r0;
    }

    public final void setListener(@NotNull AUSegment.AnonymousClass4 r2) {
        Intrinsics.checkNotNullParameter(r2, "<set-?>");
        this.listener = r2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"id/dana/social/view/FeedInputCommentView$setupKeyboardListener$1", "Lid/dana/utils/KeyboardHelper$KeyboardVisibilityListener;", "onKeyboardHide", "", "onKeyboardShow", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements setOnWheelViewListener.length {
        final /* synthetic */ FeedInputCommentView length;

        public final void length() {
        }

        setMin(FeedInputCommentView feedInputCommentView) {
            this.length = feedInputCommentView;
        }

        public final void setMax() {
            AppCompatEditText appCompatEditText = (AppCompatEditText) this.length._$_findCachedViewById(resetInternal.setMax.LongDef);
            if (appCompatEditText != null) {
                appCompatEditText.clearFocus();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ FeedInputCommentView length;

        length(FeedInputCommentView feedInputCommentView) {
            this.length = feedInputCommentView;
        }

        public final void onClick(View view) {
            AppCompatEditText appCompatEditText = (AppCompatEditText) this.length._$_findCachedViewById(resetInternal.setMax.LongDef);
            String valueOf = String.valueOf(appCompatEditText != null ? appCompatEditText.getText() : null);
            if (valueOf != null) {
                String obj = StringsKt.trim((CharSequence) valueOf).toString();
                if (!StringsKt.isBlank(obj)) {
                    this.length.getListener().setMax(obj);
                    setOnWheelViewListener.length(view);
                    AppCompatEditText appCompatEditText2 = (AppCompatEditText) this.length._$_findCachedViewById(resetInternal.setMax.LongDef);
                    if (appCompatEditText2 != null) {
                        TextView textView = appCompatEditText2;
                        Intrinsics.checkNotNullParameter(textView, "$this$clearText");
                        textView.setText("");
                    }
                    AppCompatEditText appCompatEditText3 = (AppCompatEditText) this.length._$_findCachedViewById(resetInternal.setMax.LongDef);
                    if (appCompatEditText3 != null) {
                        appCompatEditText3.clearFocus();
                    }
                    FeedInputCommentView.access$showSubmitButton(this.length, false);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    public final void setup() {
        AppCompatEditText appCompatEditText = (AppCompatEditText) _$_findCachedViewById(resetInternal.setMax.LongDef);
        if (appCompatEditText != null) {
            appCompatEditText.addTextChangedListener(new getMax(this));
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.needsDividerAfter);
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new length(this));
        }
        setOnWheelViewListener.getMax(getView(), new setMin(this));
    }

    public static final /* synthetic */ void access$showSubmitButton(FeedInputCommentView feedInputCommentView, boolean z) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) feedInputCommentView._$_findCachedViewById(resetInternal.setMax.needsDividerAfter);
        if (appCompatImageView != null) {
            View view = appCompatImageView;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z ? 0 : 8);
        }
    }
}
