package o;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.airbnb.lottie.LottieAnimationView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import id.dana.richview.CurrencyTextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.ConfirmPopup;
import o.GriverProgressBar;
import o.Ignore;
import o.WheelView;
import o.initContentView;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u000fH\u0002J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0006\u0010\u001c\u001a\u00020\u000fJ\b\u0010\u001d\u001a\u00020\u000fH\u0002J\b\u0010\u001e\u001a\u00020\u000fH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lid/dana/social/adapter/viewholder/RealTimeFeedViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/model/SocialFeedModel;", "onClickListener", "Lid/dana/social/adapter/SocialFeedClickListener;", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "(Lid/dana/social/adapter/SocialFeedClickListener;Landroid/content/Context;Landroid/view/ViewGroup;)V", "hasShowNewFeedAnimationOnce", "", "timerObservable", "Lio/reactivex/disposables/Disposable;", "bindData", "", "data", "createDateText", "", "createdTime", "", "extractFirstTwoName", "getHeight", "", "setContent", "Lid/dana/social/utils/FeedRegexData;", "setOnClickListeners", "setupFeedsData", "showNewFeedAnimation", "showNormalFeedState", "startAnimationTimer", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setCurrentIndex extends Ignore<access$2502> {
    @NotNull
    public static final getMin setMin = new getMin((byte) 0);
    /* access modifiers changed from: private */
    public final initContent getMax;
    public boolean getMin;
    public GriverProgressBar.UpdateRunnable setMax;

    public static final /* synthetic */ GriverProgressBar.UpdateRunnable getMin(setCurrentIndex setcurrentindex) {
        GriverProgressBar.UpdateRunnable updateRunnable = setcurrentindex.setMax;
        if (updateRunnable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timerObservable");
        }
        return updateRunnable;
    }

    public final /* synthetic */ void setMax(Object obj) {
        String str;
        long j;
        String str2;
        CharSequence charSequence;
        HashMap<String, String> hashMap;
        access$2502 access_2502 = (access$2502) obj;
        Intrinsics.checkNotNullParameter(access_2502, "data");
        super.setMax(access_2502);
        boolean z = false;
        this.getMin = false;
        View view = this.itemView;
        HashMap<String, String> hashMap2 = access_2502.length;
        String str3 = null;
        if (hashMap2 != null) {
            str = setBuildNumber.getDisplayName(hashMap2);
        } else {
            str = null;
        }
        CharSequence charSequence2 = str;
        if (!(charSequence2 == null || charSequence2.length() == 0) && (hashMap = access_2502.length) != null) {
            setBuildNumber.setDisplayName(hashMap, CollectionsKt.joinToString$default(CollectionsKt.take(StringsKt.split$default((CharSequence) setBuildNumber.getDisplayName(access_2502.length), new String[]{" "}, false, 0, 6, (Object) null), 2), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
        AUMaskImage min = access_2502.setMin(context, this.getMax);
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        TextView textView = (TextView) view2.findViewById(resetInternal.setMax.toggle);
        if (textView != null) {
            Map map = min.getMin;
            if (map == null || map.isEmpty()) {
                z = true;
            }
            if (!z) {
                initContentView.setMin setmin = initContentView.getMin;
                charSequence = initContentView.setMin.getMax(min, Integer.valueOf(R.font.f33542131296264), true);
            } else {
                charSequence = new SpannableString(min.setMax);
            }
            textView.setText(charSequence);
        }
        TextView textView2 = (TextView) view.findViewById(resetInternal.setMax.CustomTabsService$1);
        if (textView2 != null) {
            Long l = access_2502.setMin;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            if (ConfirmPopup.AnonymousClass1.setMin(new Date(), new Date(j)) > 0) {
                if (WheelView.OnWheelViewListener.getMax == null) {
                    WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
                }
                str2 = new SimpleDateFormat("dd/MM", WheelView.OnWheelViewListener.getMax).format(new Date(j));
                Intrinsics.checkNotNullExpressionValue(str2, "DateTimeUtil.getDateTime…ianLocale(), createdTime)");
            } else {
                Date date = new Date(j);
                if (WheelView.OnWheelViewListener.getMax == null) {
                    WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
                }
                str2 = new SimpleDateFormat("HH:mm", WheelView.OnWheelViewListener.getMax).format(new Date(date.getTime()));
                Intrinsics.checkNotNullExpressionValue(str2, "DateTimeUtil.getFeedDateFormat(Date(createdTime))");
            }
            textView2.setText(str2);
        }
        CircleImageView circleImageView = (CircleImageView) view.findViewById(resetInternal.setMax.setBackgroundResource);
        if (circleImageView != null) {
            ImageView imageView = circleImageView;
            HashMap<String, String> hashMap3 = access_2502.length;
            if (hashMap3 != null) {
                str3 = setBuildNumber.getProfileAvatar(hashMap3);
            }
            if (str3 == null) {
                str3 = "";
            }
            setOverScrollMode.getMax(imageView, str3, R.drawable.ic_avatar_grey_default);
        }
        setMin(new setMin(this));
        getMax();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setCurrentIndex(@NotNull initContent initcontent, @NotNull Context context, @NotNull ViewGroup viewGroup) {
        super(context, R.layout.real_time_feed_viewholder, viewGroup);
        Intrinsics.checkNotNullParameter(initcontent, "onClickListener");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        this.getMax = initcontent;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onItemClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements Ignore.setMin {
        final /* synthetic */ setCurrentIndex getMin;

        setMin(setCurrentIndex setcurrentindex) {
            this.getMin = setcurrentindex;
        }

        public final void length(int i) {
            this.getMin.getMax.setMax(this.getMin.getAbsoluteAdapterPosition());
        }
    }

    /* access modifiers changed from: private */
    public final void getMax() {
        ViewSwitcher viewSwitcher;
        View view = this.itemView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(resetInternal.setMax.onLayout);
        if (lottieAnimationView != null) {
            lottieAnimationView.pauseAnimation();
        }
        ViewSwitcher viewSwitcher2 = (ViewSwitcher) view.findViewById(resetInternal.setMax.RatingCompat);
        if ((!Intrinsics.areEqual((Object) viewSwitcher2 != null ? viewSwitcher2.getCurrentView() : null, (Object) (TextView) view.findViewById(resetInternal.setMax.CustomTabsService$1))) && (viewSwitcher = (ViewSwitcher) view.findViewById(resetInternal.setMax.RatingCompat)) != null) {
            viewSwitcher.showNext();
        }
        CircleImageView circleImageView = (CircleImageView) view.findViewById(resetInternal.setMax.setBackgroundResource);
        if (circleImageView != null) {
            circleImageView.setBorderColor(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/social/adapter/viewholder/RealTimeFeedViewHolder$Companion;", "", "()V", "NEW_FEED_STATE_DURATION", "", "getItemHeight", "", "context", "Landroid/content/Context;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 4, 2})
    public static final class length<T> implements RedDotManager<Long> {
        final /* synthetic */ setCurrentIndex getMin;

        public length(setCurrentIndex setcurrentindex) {
            this.getMin = setcurrentindex;
        }

        public final /* synthetic */ void accept(Object obj) {
            setCurrentIndex.getMin(this.getMin).dispose();
            this.getMin.getMax();
        }
    }
}
