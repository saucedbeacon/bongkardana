package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import de.hdodenhof.circleimageview.CircleImageView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.GriverProgressBar;
import o.IMultiInstanceInvalidationCallback;
import o.TitleBarRightButtonView;
import o.resetInternal;
import o.setCurrentIndex;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u001e\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u001e\u0010\u0019\u001a\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lid/dana/social/adapter/RealTimeFeedAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/model/SocialFeedModel;", "context", "Landroid/content/Context;", "onFeedClickListener", "Lid/dana/social/adapter/SocialFeedClickListener;", "(Landroid/content/Context;Lid/dana/social/adapter/SocialFeedClickListener;)V", "showNewItemAnimationOnAddItem", "", "getShowNewItemAnimationOnAddItem", "()Z", "setShowNewItemAnimationOnAddItem", "(Z)V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "showNewFeedAnimationForTopmostItem", "view", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isAP extends IMultiInstanceInvalidationCallback.Stub<Ignore<access$2502>, access$2502> {
    @NotNull
    public static final length getMax = new length((byte) 0);
    public boolean getMin = true;
    private final Context setMax;
    private final initContent setMin;

    public final int getItemViewType(int i) {
        return 1;
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.valueOf valueof, int i) {
        onBindViewHolder((Ignore) valueof, i);
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new setCurrentIndex(this.setMin, this.setMax, viewGroup);
    }

    public isAP(@NotNull Context context, @NotNull initContent initcontent) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(initcontent, "onFeedClickListener");
        this.setMax = context;
        this.setMin = initcontent;
        getMin(new ArrayList());
    }

    public final void getMax(@NotNull Ignore<access$2502> ignore, int i) {
        ViewSwitcher viewSwitcher;
        Intrinsics.checkNotNullParameter(ignore, "holder");
        super.onBindViewHolder(ignore, i);
        if (this.getMin) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(1827847262, oncanceled);
                onCancelLoad.getMin(1827847262, oncanceled);
            }
            if ((ignore instanceof setCurrentIndex) && i == 0) {
                setCurrentIndex setcurrentindex = (setCurrentIndex) ignore;
                if (!setcurrentindex.getMin) {
                    setcurrentindex.getMin = true;
                    View view = setcurrentindex.itemView;
                    ViewSwitcher viewSwitcher2 = (ViewSwitcher) view.findViewById(resetInternal.setMax.RatingCompat);
                    if ((!Intrinsics.areEqual((Object) viewSwitcher2 != null ? viewSwitcher2.getCurrentView() : null, (Object) (LottieAnimationView) view.findViewById(resetInternal.setMax.onLayout))) && (viewSwitcher = (ViewSwitcher) view.findViewById(resetInternal.setMax.RatingCompat)) != null) {
                        viewSwitcher.showNext();
                    }
                    CircleImageView circleImageView = (CircleImageView) view.findViewById(resetInternal.setMax.setBackgroundResource);
                    if (circleImageView != null) {
                        circleImageView.setBorderColor(-65536);
                    }
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(resetInternal.setMax.onLayout);
                    if (lottieAnimationView != null) {
                        lottieAnimationView.playAnimation();
                    }
                    GriverProgressBar.UpdateRunnable subscribe = TitleBarRightButtonView.AnonymousClass1.timer(3, TimeUnit.SECONDS).subscribeOn(getSecureSignatureComp.length()).observeOn(hideProgress.length()).subscribe(new setCurrentIndex.length(setcurrentindex));
                    Intrinsics.checkNotNullExpressionValue(subscribe, "Observable.timer(NEW_FEE…FeedState()\n            }");
                    setcurrentindex.setMax = subscribe;
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/social/adapter/RealTimeFeedAdapter$Companion;", "", "()V", "ITEM_TYPE_REAL_TIME_FEED", "", "MAX_ITEM_SIZE", "getItemHeight", "context", "Landroid/content/Context;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }
}
