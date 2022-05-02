package id.dana.social.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.MetricAffectingSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ap.zoloz.hummer.biz.HummerConstants;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.richview.CurrencyTextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ConfirmPopup;
import o.OptIn;
import o.WheelView;
import o.initContentView;
import o.resetInternal;
import o.resurrectSelectionIfNeeded;
import o.setNeedMask;
import o.setOverScrollMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\u0006\u0010\u0015\u001a\u00020\u000eJ\u0006\u0010\u0016\u001a\u00020\u000eJ\u0006\u0010\u0017\u001a\u00020\u000eJ\u0006\u0010\u0018\u001a\u00020\u000eJ\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u000eH\u0016J\u0006\u0010\u001e\u001a\u00020\u000eJ\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lid/dana/social/view/FeedCommentView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "feedUtils", "Lid/dana/social/utils/FeedUtils;", "bind", "", "feedCommentModel", "Lid/dana/social/model/FeedCommentModel;", "bindAvatar", "bindContent", "bindDate", "getLayout", "renderDefaultComment", "renderFailedSubmitComment", "renderSendingSubmitComment", "renderSuccessSubmitComment", "replaceOwnCommentDisplayName", "setStateText", "state", "", "setup", "showDim", "showSendingState", "isVisible", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class FeedCommentView extends BaseRichView {
    private HashMap getMin;
    private final setNeedMask setMin;

    @JvmOverloads
    public FeedCommentView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public FeedCommentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
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
        return R.layout.view_feed_comment;
    }

    public final void setup() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeedCommentView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FeedCommentView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, HummerConstants.CONTEXT);
        this.setMin = new setNeedMask(context2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public FeedCommentView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, HummerConstants.CONTEXT);
        this.setMin = new setNeedMask(context2);
    }

    public final void renderSuccessSubmitComment() {
        showDim();
        getMax(false);
    }

    public final void renderSendingSubmitComment() {
        getMax(true);
        String string = getResources().getString(R.string.feed_comment_sending);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.feed_comment_sending)");
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.CustomTabsClient$2);
        if (textView != null) {
            textView.setText(string);
        }
    }

    public final void renderFailedSubmitComment() {
        showDim();
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setTintMode);
        if (appCompatImageView != null) {
            View view = appCompatImageView;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(0);
        }
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(resetInternal.setMax.isTitleOptional);
        if (progressBar != null) {
            View view2 = progressBar;
            Intrinsics.checkNotNullParameter(view2, "<this>");
            view2.setVisibility(8);
        }
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.CustomTabsClient$2);
        if (textView != null) {
            View view3 = textView;
            Intrinsics.checkNotNullParameter(view3, "<this>");
            view3.setVisibility(0);
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.createCheckBox);
        if (appCompatImageView2 != null) {
            View view4 = appCompatImageView2;
            Intrinsics.checkNotNullParameter(view4, "<this>");
            view4.setVisibility(0);
        }
        String string = getResources().getString(R.string.feed_comment_sending_failed);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…d_comment_sending_failed)");
        TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.CustomTabsClient$2);
        if (textView2 != null) {
            textView2.setText(string);
        }
    }

    public final void showDim() {
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.PlaybackStateCompat$State);
        Drawable drawable = null;
        if (constraintLayout != null) {
            constraintLayout.setBackground(OptIn.getMax(getResources(), (int) R.drawable.bg_feed_comment_dim, (Resources.Theme) null));
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.PlaybackStateCompat$State);
        if (constraintLayout2 != null) {
            drawable = constraintLayout2.getBackground();
        }
        if (drawable != null) {
            ((TransitionDrawable) drawable).startTransition(300);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.TransitionDrawable");
    }

    public final void renderDefaultComment() {
        getMax(false);
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.PlaybackStateCompat$State);
        if (constraintLayout != null) {
            constraintLayout.setBackground(OptIn.getMax(getResources(), (int) R.color.f19052131099800, (Resources.Theme) null));
        }
    }

    private final void getMax(boolean z) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setTintMode);
        int i = 0;
        if (appCompatImageView != null) {
            View view = appCompatImageView;
            boolean z2 = !z;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z2 ? 0 : 8);
        }
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getThumbTintList);
        if (textView != null) {
            View view2 = textView;
            boolean z3 = !z;
            Intrinsics.checkNotNullParameter(view2, "<this>");
            view2.setVisibility(z3 ? 0 : 8);
        }
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(resetInternal.setMax.isTitleOptional);
        if (progressBar != null) {
            View view3 = progressBar;
            Intrinsics.checkNotNullParameter(view3, "<this>");
            view3.setVisibility(z ? 0 : 8);
        }
        TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.CustomTabsClient$2);
        if (textView2 != null) {
            View view4 = textView2;
            Intrinsics.checkNotNullParameter(view4, "<this>");
            if (!z) {
                i = 8;
            }
            view4.setVisibility(i);
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.createCheckBox);
        if (appCompatImageView2 != null) {
            View view5 = appCompatImageView2;
            Intrinsics.checkNotNullParameter(view5, "<this>");
            view5.setVisibility(8);
        }
    }

    public final void bind(@NotNull resurrectSelectionIfNeeded resurrectselectionifneeded) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(resurrectselectionifneeded, "feedCommentModel");
        if (resurrectselectionifneeded.length()) {
            resurrectselectionifneeded.length.setMax = getResources().getString(R.string.you);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(resurrectselectionifneeded.length.setMax);
        sb.append(' ');
        sb.append(resurrectselectionifneeded.setMax);
        String obj = sb.toString();
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.applyTrackTint);
        boolean z = false;
        if (textView != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(obj);
            initContentView.setMin setmin = initContentView.getMin;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            MetricAffectingSpan setmin2 = new initContentView.setMin.C0061setMin(context, R.font.f33542131296264);
            String str3 = resurrectselectionifneeded.length.setMax;
            spannableStringBuilder.setSpan(setmin2, 0, str3 != null ? str3.length() : 0, 18);
            Unit unit = Unit.INSTANCE;
            textView.setText(spannableStringBuilder);
        }
        if (resurrectselectionifneeded.setMin.length() > 0) {
            z = true;
        }
        String str4 = "";
        if (z) {
            Date date = new Date(Long.parseLong(resurrectselectionifneeded.setMin));
            TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.getThumbTintList);
            if (textView2 != null) {
                setNeedMask setneedmask = this.setMin;
                long time = date.getTime();
                int min = (int) ConfirmPopup.AnonymousClass1.setMin(new Date(), new Date(time));
                Date date2 = new Date(time);
                Function2 function2 = setNeedMask.length.INSTANCE;
                if (min == 0) {
                    str = setneedmask.setMin.getString(R.string.feed_section_today);
                } else if (min != 1) {
                    str = new SimpleDateFormat("dd MMMM", Locale.getDefault()).format(new Date(date2.getTime()));
                } else {
                    str = setneedmask.setMin.getString(R.string.feed_section_yesterday);
                }
                if (setNeedMask.length(date2)) {
                    Intrinsics.checkNotNullExpressionValue(str, "it");
                    str = (String) function2.invoke(str, date2);
                }
                if (str != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(", ");
                    Date date3 = new Date(time);
                    if (WheelView.OnWheelViewListener.getMax == null) {
                        WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
                    }
                    sb2.append(new SimpleDateFormat("HH:mm", WheelView.OnWheelViewListener.getMax).format(new Date(date3.getTime())));
                    str2 = sb2.toString();
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = str4;
                }
                textView2.setText(str2);
            }
        }
        CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(resetInternal.setMax.getPlaybackState);
        if (circleImageView != null) {
            ImageView imageView = circleImageView;
            String str5 = resurrectselectionifneeded.length.toIntRange;
            if (str5 != null) {
                str4 = str5;
            }
            setOverScrollMode.getMax(imageView, str4, R.drawable.avatar_placeholder);
        }
    }
}
