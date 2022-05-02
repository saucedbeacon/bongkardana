package id.dana.social.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.emoji.widget.EmojiAppCompatTextView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.IntRange;
import o.MyBeaconServiceImpl;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000  2\u00020\u0001:\u0001 B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0007H\u0016J\u001c\u0010\f\u001a\u00020\r2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u0010\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013J\u0015\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\rH\u0002J\b\u0010\u0018\u001a\u00020\rH\u0002J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0013H\u0002J\b\u0010\u001a\u001a\u00020\rH\u0002J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0010H\u0002J\b\u0010\u001c\u001a\u00020\rH\u0002J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0013H\u0002J\b\u0010\u001e\u001a\u00020\rH\u0002J\b\u0010\u001f\u001a\u00020\rH\u0016¨\u0006!"}, d2 = {"Lid/dana/social/view/ReactionView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "getLayout", "parseAttrs", "", "setEmoji", "unicode", "", "setReactionActive", "selected", "", "setReactionCount", "reactionCount", "(Ljava/lang/Integer;)V", "setReactionEmojiByUnicodeCodePoint", "setReactionIconOnlyMode", "iconOnlyMode", "setReactionLabel", "label", "setReactionPermanentButtonMode", "permanentButton", "setReactionView", "setup", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ReactionView extends BaseRichView {
    @NotNull
    public static final setMin Companion = new setMin((byte) 0);
    private HashMap setMax;

    @JvmOverloads
    public ReactionView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public ReactionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-506531572, oncanceled);
            onCancelLoad.getMin(-506531572, oncanceled);
        }
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
        return R.layout.view_feed_reaction;
    }

    public final void setup() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReactionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ReactionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public ReactionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final void parseAttrs(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        if (attributeSet != null) {
            setStyledAttributes(context, attributeSet, resetInternal.getMin.onSaveInstanceState);
            try {
                boolean z = true;
                String string = getStyledAttributes().getString(1);
                if (string == null) {
                    string = "1F600";
                }
                setEmoji(string);
                String string2 = getStyledAttributes().getString(3);
                if (string2 == null) {
                    string2 = "-";
                }
                Intrinsics.checkNotNullExpressionValue(string2, "styledAttributes.getStri…: REACTION_LABEL_FALLBACK");
                TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getTargetCheckedState);
                if (textView != null) {
                    textView.setText(string2);
                }
                boolean z2 = getStyledAttributes().getBoolean(2, false);
                EmojiAppCompatTextView emojiAppCompatTextView = (EmojiAppCompatTextView) _$_findCachedViewById(resetInternal.setMax.setThumbPosition);
                if (emojiAppCompatTextView != null) {
                    View view = emojiAppCompatTextView;
                    boolean z3 = !z2;
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    view.setVisibility(z3 ? 0 : 8);
                }
                TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.getTargetCheckedState);
                if (textView2 != null) {
                    View view2 = textView2;
                    if (z2) {
                        z = false;
                    }
                    Intrinsics.checkNotNullParameter(view2, "<this>");
                    view2.setVisibility(z ? 0 : 8);
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.createSeekBar);
                if (appCompatImageView != null) {
                    View view3 = appCompatImageView;
                    Intrinsics.checkNotNullParameter(view3, "<this>");
                    view3.setVisibility(z2 ? 0 : 8);
                }
                if (getStyledAttributes().getBoolean(4, false)) {
                    EmojiAppCompatTextView emojiAppCompatTextView2 = (EmojiAppCompatTextView) _$_findCachedViewById(resetInternal.setMax.setThumbPosition);
                    if (emojiAppCompatTextView2 != null) {
                        emojiAppCompatTextView2.setVisibility(4);
                    }
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.createToggleButton);
                    if (appCompatImageView2 != null) {
                        View view4 = appCompatImageView2;
                        Intrinsics.checkNotNullParameter(view4, "<this>");
                        view4.setVisibility(0);
                    }
                    ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.getPreventCornerOverlap);
                    if (constraintLayout != null) {
                        constraintLayout.setBackground(IntRange.length(getContext(), (int) R.drawable.bg_rounded_corner_feed_reaction_grey));
                    }
                    EmojiAppCompatTextView emojiAppCompatTextView3 = (EmojiAppCompatTextView) _$_findCachedViewById(resetInternal.setMax.setThumbPosition);
                    if (emojiAppCompatTextView3 != null) {
                        emojiAppCompatTextView3.setTextColor(IntRange.setMax(getContext(), R.color.f20382131099951));
                    }
                    TextView textView3 = (TextView) _$_findCachedViewById(resetInternal.setMax.getTargetCheckedState);
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                }
            } finally {
                getStyledAttributes().recycle();
            }
        }
    }

    public final void setEmoji(@Nullable String str) {
        EmojiAppCompatTextView emojiAppCompatTextView = (EmojiAppCompatTextView) _$_findCachedViewById(resetInternal.setMax.setThumbPosition);
        if (emojiAppCompatTextView != null) {
            MyBeaconServiceImpl.AnonymousClass1.C00531.getMin(emojiAppCompatTextView, str);
        }
    }

    public final void setReactionCount(@Nullable Integer num) {
        CharSequence charSequence;
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getTargetCheckedState);
        if (textView != null) {
            int i = 0;
            if ((num != null ? num.intValue() : 0) <= 99) {
                if (num != null) {
                    i = num.intValue();
                }
                charSequence = String.valueOf(i);
            }
            textView.setText(charSequence);
        }
    }

    public final void setReactionActive(boolean z) {
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.getPreventCornerOverlap);
        if (constraintLayout != null) {
            constraintLayout.setSelected(z);
        }
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getTargetCheckedState);
        if (textView != null) {
            textView.setTextColor(IntRange.setMax(getContext(), z ? R.color.f18632131099744 : R.color.f20382131099951));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/social/view/ReactionView$Companion;", "", "()V", "EMOJI_FALLBACK", "", "MAX_VISIBLE_REACTION_COUNTER", "", "REACTION_COUNT_OVER_99_LABEL", "REACTION_LABEL_FALLBACK", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }
}
