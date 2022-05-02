package id.dana.social.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseRichView;
import id.dana.social.ReciprocalBottomSheetDialog;
import id.dana.social.RelationshipBottomSheetDialog;
import id.dana.social.model.RelationshipItemModel;
import id.dana.social.view.activity.SocialProfileActivity;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.order;
import o.performItemClick;
import o.resetInternal;
import o.resetTabView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u001d\u001a\u00020\u0013H\u0002J\b\u0010\u001e\u001a\u00020\u0007H\u0016J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0002J\u0014\u0010\"\u001a\u00020\u00132\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$J\b\u0010&\u001a\u00020\u0013H\u0016J\b\u0010'\u001a\u00020\u0013H\u0002R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R5\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006("}, d2 = {"Lid/dana/social/view/FriendsFeedsHeaderView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "friendsFeedsHeaderAdapter", "Lid/dana/social/adapter/friendsheader/FriendsFeedsHeaderAdapter;", "setEnableRefresh", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "b", "", "getSetEnableRefresh", "()Lkotlin/jvm/functions/Function1;", "setSetEnableRefresh", "(Lkotlin/jvm/functions/Function1;)V", "showReciprocalRelationship", "getShowReciprocalRelationship", "()Z", "setShowReciprocalRelationship", "(Z)V", "createFriendsFeeds", "getLayout", "openProfileActivity", "data", "Lid/dana/social/model/RelationshipItemModel;", "setItems", "items", "", "Lid/dana/social/model/FriendModel;", "setup", "showRelationshipDialog", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class FriendsFeedsHeaderView extends BaseRichView {
    private boolean getMax;
    private HashMap getMin;
    public Function1<? super Boolean, Unit> setEnableRefresh;
    private resetTabView setMin;

    @JvmOverloads
    public FriendsFeedsHeaderView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public FriendsFeedsHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
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
        return R.layout.view_friends_feeds_header;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Lid/dana/social/model/RelationshipItemModel;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class getMax extends FunctionReferenceImpl implements Function1<RelationshipItemModel, Unit> {
        getMax(FriendsFeedsHeaderView friendsFeedsHeaderView) {
            super(1, friendsFeedsHeaderView, FriendsFeedsHeaderView.class, "openProfileActivity", "openProfileActivity(Lid/dana/social/model/RelationshipItemModel;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((RelationshipItemModel) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull RelationshipItemModel relationshipItemModel) {
            Intrinsics.checkNotNullParameter(relationshipItemModel, "p1");
            FriendsFeedsHeaderView.access$openProfileActivity((FriendsFeedsHeaderView) this.receiver, relationshipItemModel);
        }
    }

    @NotNull
    public final Function1<Boolean, Unit> getSetEnableRefresh() {
        Function1<? super Boolean, Unit> function1 = this.setEnableRefresh;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setEnableRefresh");
        }
        return function1;
    }

    public final void setSetEnableRefresh(@NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.setEnableRefresh = function1;
    }

    public final boolean getShowReciprocalRelationship() {
        return this.getMax;
    }

    public final void setShowReciprocalRelationship(boolean z) {
        this.getMax = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FriendsFeedsHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FriendsFeedsHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public FriendsFeedsHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final void setItems(@NotNull List<performItemClick> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        resetTabView resettabview = this.setMin;
        if (resettabview == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendsFeedsHeaderAdapter");
        }
        resettabview.getMin(list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onItemClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements Ignore.setMin {
        final /* synthetic */ FriendsFeedsHeaderView getMax;

        getMin(FriendsFeedsHeaderView friendsFeedsHeaderView) {
            this.getMax = friendsFeedsHeaderView;
        }

        public final void length(int i) {
            FriendsFeedsHeaderView.access$showRelationshipDialog(this.getMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"id/dana/social/view/FriendsFeedsHeaderView$createFriendsFeeds$4", "Landroidx/recyclerview/widget/RecyclerView$OnItemTouchListener;", "onInterceptTouchEvent", "", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "e", "Landroid/view/MotionEvent;", "onRequestDisallowInterceptTouchEvent", "", "disallowIntercept", "onTouchEvent", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements RecyclerView.equals {
        final /* synthetic */ FriendsFeedsHeaderView setMax;

        public final void getMin(@NotNull RecyclerView recyclerView, @NotNull MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(recyclerView, "rv");
            Intrinsics.checkNotNullParameter(motionEvent, "e");
        }

        length(FriendsFeedsHeaderView friendsFeedsHeaderView) {
            this.setMax = friendsFeedsHeaderView;
        }

        public final boolean setMax(@NotNull RecyclerView recyclerView, @NotNull MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(recyclerView, "rv");
            Intrinsics.checkNotNullParameter(motionEvent, "e");
            Function1<Boolean, Unit> setEnableRefresh = this.setMax.getSetEnableRefresh();
            boolean z = true;
            if (!(motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
                z = false;
            }
            setEnableRefresh.invoke(Boolean.valueOf(z));
            return false;
        }
    }

    public final void setup() {
        this.setMin = new resetTabView(new getMin(this), new getMax(this));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setAutoSizeTextTypeWithDefaults);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        resetTabView resettabview = this.setMin;
        if (resettabview == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendsFeedsHeaderAdapter");
        }
        recyclerView.setAdapter(resettabview);
        ((RecyclerView) _$_findCachedViewById(resetInternal.setMax.setAutoSizeTextTypeWithDefaults)).addOnItemTouchListener(new length(this));
    }

    public static final /* synthetic */ void access$showRelationshipDialog(FriendsFeedsHeaderView friendsFeedsHeaderView) {
        order order;
        if (friendsFeedsHeaderView.getMax) {
            order = new ReciprocalBottomSheetDialog();
        } else {
            order = new RelationshipBottomSheetDialog();
        }
        BaseActivity baseActivity = friendsFeedsHeaderView.getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        order.show(baseActivity.getSupportFragmentManager(), "");
    }

    public static final /* synthetic */ void access$openProfileActivity(FriendsFeedsHeaderView friendsFeedsHeaderView, RelationshipItemModel relationshipItemModel) {
        SocialProfileActivity.getMin getmin = SocialProfileActivity.Companion;
        Context context = friendsFeedsHeaderView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
        SocialProfileActivity.getMin.setMin(context, relationshipItemModel);
    }
}
