package id.dana.social.view;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.home.HomeTabActivity;
import id.dana.social.PrivacySettingActivity;
import id.dana.tracker.TrackerKey;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.onMovedToScrapHeap;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u000bH\u0002J\b\u0010\u0011\u001a\u00020\u000bH\u0002J\b\u0010\u0012\u001a\u00020\u000bH\u0002J\b\u0010\u0013\u001a\u00020\u000bH\u0016¨\u0006\u0014"}, d2 = {"Lid/dana/social/view/FeedSharingView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getLayout", "openHomeToActivate", "", "openPrivacySetting", "render", "state", "Lid/dana/social/state/InitFeedState;", "renderActivatedState", "renderNoWordingState", "renderNotActivatedState", "setup", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class FeedSharingView extends BaseRichView {
    private HashMap setMax;

    @JvmOverloads
    public FeedSharingView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public FeedSharingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
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
        return R.layout.view_feed_sharing;
    }

    public final void setup() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeedSharingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FeedSharingView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final void render(@NotNull onMovedToScrapHeap onmovedtoscrapheap) {
        Intrinsics.checkNotNullParameter(onmovedtoscrapheap, "state");
        if (onmovedtoscrapheap instanceof onMovedToScrapHeap.setMax) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.setImeVisibility);
            if (appCompatTextView != null) {
                Context context = getContext();
                appCompatTextView.setText(context != null ? context.getString(R.string.feed_sharing_state_not_activated) : null);
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.PlaybackStateCompat$ShuffleMode);
            if (constraintLayout != null) {
                constraintLayout.setOnClickListener(new length(this));
            }
        } else if (onmovedtoscrapheap instanceof onMovedToScrapHeap.length) {
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.setImeVisibility);
            if (appCompatTextView2 != null) {
                appCompatTextView2.setText("");
            }
        } else if (onmovedtoscrapheap instanceof onMovedToScrapHeap.setMin) {
            AppCompatTextView appCompatTextView3 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.setImeVisibility);
            if (appCompatTextView3 != null) {
                appCompatTextView3.setText("");
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.PlaybackStateCompat$ShuffleMode);
            if (constraintLayout2 != null) {
                constraintLayout2.setOnClickListener(new setMax(this));
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ FeedSharingView getMax;

        length(FeedSharingView feedSharingView) {
            this.getMax = feedSharingView;
        }

        public final void onClick(View view) {
            FeedSharingView.access$openHomeToActivate(this.getMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ FeedSharingView getMin;

        setMax(FeedSharingView feedSharingView) {
            this.getMin = feedSharingView;
        }

        public final void onClick(View view) {
            this.getMin.getBaseActivity().startActivityForResult(new Intent(this.getMin.getContext(), PrivacySettingActivity.class), 11);
        }
    }

    public static final /* synthetic */ void access$openHomeToActivate(FeedSharingView feedSharingView) {
        Context context = feedSharingView.getContext();
        Intent intent = new Intent(feedSharingView.getContext(), HomeTabActivity.class);
        intent.putExtra("target", "friends");
        intent.putExtra("Source", TrackerKey.SourceType.FEED_SETTINGS);
        intent.setFlags(131072);
        Unit unit = Unit.INSTANCE;
        context.startActivity(intent);
        feedSharingView.getBaseActivity().finish();
    }
}
