package id.dana.sendmoney_v2.landing.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.sendmoney.feed.ShareToFeedsView;
import id.dana.sendmoney.summary.SummaryActivity;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AUBaseDialog;
import o.evaluate;
import o.getProgressViewStartOffset;
import o.isBaselineAligned;
import o.resetInternal;
import o.updateCornerMarking;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0006\u0010\u001a\u001a\u00020\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010 J\b\u0010!\u001a\u00020\u0016H\u0016R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lid/dana/sendmoney_v2/landing/view/NewShareToFeedsView;", "Lid/dana/sendmoney/feed/ShareToFeedsView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "feedSharingDialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "getFeedSharingDialog", "()Lcom/afollestad/materialdialogs/MaterialDialog;", "feedSharingDialog$delegate", "Lkotlin/Lazy;", "onCheckListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "getOnCheckListener", "()Landroid/widget/CompoundButton$OnCheckedChangeListener;", "disableShareToFeed", "", "displayUserAvatar", "url", "", "enableShareToFeed", "getLayout", "getSummaryActivity", "Lid/dana/sendmoney/summary/SummaryActivity;", "setDesc", "textSpan", "Landroid/text/Spannable;", "setup", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NewShareToFeedsView extends ShareToFeedsView {
    private HashMap length;
    private final Lazy setMin;

    @JvmOverloads
    public NewShareToFeedsView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public NewShareToFeedsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.length;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.length == null) {
            this.length = new HashMap();
        }
        View view = (View) this.length.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.length.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_share_to_feeds_new;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function0<isBaselineAligned> {
        final /* synthetic */ NewShareToFeedsView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(NewShareToFeedsView newShareToFeedsView) {
            super(0);
            this.this$0 = newShareToFeedsView;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "invoke", "id/dana/sendmoney_v2/landing/view/NewShareToFeedsView$feedSharingDialog$2$1$1"}, k = 3, mv = {1, 4, 2})
        static final class getMin extends Lambda implements Function1<View, Unit> {
            final /* synthetic */ setMin this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMin(setMin setmin) {
                super(1);
                this.this$0 = setmin;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                this.this$0.this$0.disableShareToFeed();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "id/dana/sendmoney_v2/landing/view/NewShareToFeedsView$feedSharingDialog$2$1$2"}, k = 3, mv = {1, 4, 2})
        /* renamed from: id.dana.sendmoney_v2.landing.view.NewShareToFeedsView$setMin$setMin  reason: collision with other inner class name */
        static final class C0104setMin extends Lambda implements Function1<View, Unit> {
            final /* synthetic */ setMin this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0104setMin(setMin setmin) {
                super(1);
                this.this$0 = setmin;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                this.this$0.this$0.enableShareToFeed();
                NewShareToFeedsView.access$getSummaryActivity(this.this$0.this$0).getShareToFeedsPresenter().length();
            }
        }

        @NotNull
        public final isBaselineAligned invoke() {
            Context context = this.this$0.getContext();
            Context context2 = this.this$0.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, HummerConstants.CONTEXT);
            getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(context2);
            getmax.toFloatRange = context.getString(R.string.feed_sharing_activation_dialog_title);
            getProgressViewStartOffset.getMax getmax2 = getmax;
            getmax2.isInside = context.getString(R.string.feed_sharing_activation_dialog_desc);
            getProgressViewStartOffset.getMax min = getmax2.getMax(context.getString(R.string.option_cancel), new getMin(this)).setMin(context.getString(R.string.activate), new C0104setMin(this));
            min.toIntRange = 0;
            getProgressViewStartOffset.getMax max = min.setMax(false);
            return new getProgressViewStartOffset(max.invoke, max.length, max, max.equals, (byte) 0).getMin();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewShareToFeedsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewShareToFeedsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMin = LazyKt.lazy(new setMin(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public NewShareToFeedsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMin = LazyKt.lazy(new setMin(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ NewShareToFeedsView setMax;

        getMin(NewShareToFeedsView newShareToFeedsView) {
            this.setMax = newShareToFeedsView;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z && !this.setMax.getShareFeedConsent()) {
                NewShareToFeedsView.access$getFeedSharingDialog$p(this.setMax).show();
            } else if (z) {
                this.setMax.enableShareToFeed();
            } else {
                this.setMax.disableShareToFeed();
            }
        }
    }

    public final void setup() {
        super.setup();
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) _$_findCachedViewById(resetInternal.setMax.getPackageName);
        if (appCompatCheckBox != null) {
            appCompatCheckBox.setOnCheckedChangeListener(new getMin(this));
        }
    }

    public final void displayUserAvatar(@Nullable String str) {
        ((updateCornerMarking) Glide.getMax(getContext())).setMax(str).setMax(evaluate.setMin).setMax((int) R.drawable.avatar_placeholder).setMin((int) R.drawable.avatar_placeholder).length((ImageView) (CircleImageView) _$_findCachedViewById(resetInternal.setMax.parameter));
    }

    public final void setDesc(@Nullable Spannable spannable) {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getSplitTrack);
        if (textView != null) {
            textView.setText(spannable);
            AUBaseDialog.getMax getmax = AUBaseDialog.length;
            textView.setMovementMethod(AUBaseDialog.getMax.getMax());
            textView.setClickable(false);
            textView.setLongClickable(false);
        }
    }

    public final void enableShareToFeed() {
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) _$_findCachedViewById(resetInternal.setMax.getPackageName);
        if (appCompatCheckBox != null) {
            appCompatCheckBox.setChecked(true);
        }
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity != null) {
            ((SummaryActivity) baseActivity).getSendMoneySummaryPresenter().length(SummaryActivity.CHECKED);
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.PlaybackStateCompat$RepeatMode);
            if (constraintLayout != null) {
                constraintLayout.setBackgroundResource(R.drawable.bg_rounded_8dp_blue20);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.sendmoney.summary.SummaryActivity");
    }

    public final void disableShareToFeed() {
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) _$_findCachedViewById(resetInternal.setMax.getPackageName);
        if (appCompatCheckBox != null) {
            appCompatCheckBox.setChecked(false);
        }
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity != null) {
            ((SummaryActivity) baseActivity).getSendMoneySummaryPresenter().length("false");
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.PlaybackStateCompat$RepeatMode);
            if (constraintLayout != null) {
                constraintLayout.setBackgroundResource(R.drawable.bg_rounded_8dp_grey10);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.sendmoney.summary.SummaryActivity");
    }

    public static final /* synthetic */ isBaselineAligned access$getFeedSharingDialog$p(NewShareToFeedsView newShareToFeedsView) {
        return (isBaselineAligned) newShareToFeedsView.setMin.getValue();
    }

    public static final /* synthetic */ SummaryActivity access$getSummaryActivity(NewShareToFeedsView newShareToFeedsView) {
        BaseActivity baseActivity = newShareToFeedsView.getBaseActivity();
        if (baseActivity != null) {
            return (SummaryActivity) baseActivity;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.sendmoney.summary.SummaryActivity");
    }
}
