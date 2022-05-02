package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.social.model.FeedModel;
import id.dana.social.model.RelationshipItemModel;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AUHorizontalListView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003JG\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0006\u0010&\u001a\u00020#J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020.J\t\u0010/\u001a\u000200HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00061"}, d2 = {"Lid/dana/social/model/FeedViewHolderModel;", "", "type", "", "feedModel", "Lid/dana/social/model/FeedModel;", "groupedFeedModel", "Lid/dana/social/model/GroupedFeedModel;", "topFriends", "", "Lid/dana/social/model/FriendModel;", "topProfile", "Lid/dana/social/model/RelationshipItemModel;", "(ILid/dana/social/model/FeedModel;Lid/dana/social/model/GroupedFeedModel;Ljava/util/List;Lid/dana/social/model/RelationshipItemModel;)V", "getFeedModel", "()Lid/dana/social/model/FeedModel;", "setFeedModel", "(Lid/dana/social/model/FeedModel;)V", "getGroupedFeedModel", "()Lid/dana/social/model/GroupedFeedModel;", "setGroupedFeedModel", "(Lid/dana/social/model/GroupedFeedModel;)V", "getTopFriends", "()Ljava/util/List;", "getTopProfile", "()Lid/dana/social/model/RelationshipItemModel;", "getType", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "isFriendData", "toFeedRegexData", "Lid/dana/social/utils/FeedRegexData;", "context", "Landroid/content/Context;", "socialFeedListener", "Lid/dana/social/adapter/SocialFeedClickListener;", "toSocialFeedModel", "Lid/dana/social/model/SocialFeedModel;", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setEmptyView {
    @Nullable
    public setFocusableInTouchMode getMax;
    public final int getMin;
    @NotNull
    public final List<performItemClick> length;
    @Nullable
    public FeedModel setMax;
    @Nullable
    public final RelationshipItemModel setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setEmptyView)) {
            return false;
        }
        setEmptyView setemptyview = (setEmptyView) obj;
        return this.getMin == setemptyview.getMin && Intrinsics.areEqual((Object) this.setMax, (Object) setemptyview.setMax) && Intrinsics.areEqual((Object) this.getMax, (Object) setemptyview.getMax) && Intrinsics.areEqual((Object) this.length, (Object) setemptyview.length) && Intrinsics.areEqual((Object) this.setMin, (Object) setemptyview.setMin);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedViewHolderModel(type=");
        sb.append(this.getMin);
        sb.append(", feedModel=");
        sb.append(this.setMax);
        sb.append(", groupedFeedModel=");
        sb.append(this.getMax);
        sb.append(", topFriends=");
        sb.append(this.length);
        sb.append(", topProfile=");
        sb.append(this.setMin);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Lid/dana/social/utils/Content;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class getMax extends FunctionReferenceImpl implements Function1<AUHorizontalListView.SavedState.AnonymousClass1, Unit> {
        getMax(initContent initcontent) {
            super(1, initcontent, initContent.class, "onSocialFeedSpanClicked", "onSocialFeedSpanClicked(Lid/dana/social/utils/Content;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AUHorizontalListView.SavedState.AnonymousClass1) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull AUHorizontalListView.SavedState.AnonymousClass1 r2) {
            Intrinsics.checkNotNullParameter(r2, "p1");
            ((initContent) this.receiver).setMax(r2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Lid/dana/social/utils/Content;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class setMax extends FunctionReferenceImpl implements Function1<AUHorizontalListView.SavedState.AnonymousClass1, Unit> {
        setMax(initContent initcontent) {
            super(1, initcontent, initContent.class, "onSocialFeedSpanClicked", "onSocialFeedSpanClicked(Lid/dana/social/utils/Content;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AUHorizontalListView.SavedState.AnonymousClass1) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull AUHorizontalListView.SavedState.AnonymousClass1 r2) {
            Intrinsics.checkNotNullParameter(r2, "p1");
            ((initContent) this.receiver).setMax(r2);
        }
    }

    private setEmptyView(int i, @Nullable FeedModel feedModel, @Nullable setFocusableInTouchMode setfocusableintouchmode, @NotNull List<performItemClick> list, @Nullable RelationshipItemModel relationshipItemModel) {
        Intrinsics.checkNotNullParameter(list, "topFriends");
        this.getMin = i;
        this.setMax = feedModel;
        this.getMax = setfocusableintouchmode;
        this.length = list;
        this.setMin = relationshipItemModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setEmptyView(int i, FeedModel feedModel, setFocusableInTouchMode setfocusableintouchmode, List list, RelationshipItemModel relationshipItemModel, int i2) {
        this(i, (i2 & 2) != 0 ? null : feedModel, (i2 & 4) != 0 ? null : setfocusableintouchmode, (i2 & 8) != 0 ? CollectionsKt.emptyList() : list, (i2 & 16) != 0 ? null : relationshipItemModel);
    }

    @NotNull
    public final access$2502 length() {
        access$2502 access_2502;
        FeedModel feedModel;
        setFocusableInTouchMode setfocusableintouchmode = this.getMax;
        if (setfocusableintouchmode == null || (feedModel = (FeedModel) CollectionsKt.firstOrNull(setfocusableintouchmode.setMin)) == null) {
            FeedModel feedModel2 = this.setMax;
            access_2502 = feedModel2 != null ? new access$2502(feedModel2.setMin, feedModel2.equals, feedModel2.length, feedModel2.values, feedModel2.hashCode, feedModel2.IsOverlapping, feedModel2.setMax, feedModel2.toIntRange) : null;
        } else {
            access_2502 = new access$2502(feedModel.setMin, feedModel.equals, feedModel.length, feedModel.values, feedModel.hashCode, feedModel.IsOverlapping, feedModel.setMax, feedModel.toIntRange);
        }
        return access_2502 == null ? new access$2502((byte) 0) : access_2502;
    }

    @NotNull
    public final AUMaskImage getMax(@NotNull Context context, @NotNull initContent initcontent) {
        String str;
        String str2;
        HashMap<String, String> hashMap;
        String str3;
        String str4;
        String str5;
        HashMap<String, String> hashMap2;
        String str6;
        List<FeedModel> list;
        FeedModel feedModel;
        List<FeedModel> list2;
        FeedModel feedModel2;
        List<FeedModel> list3;
        FeedModel feedModel3;
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(initcontent, "socialFeedListener");
        FeedModel feedModel4 = this.setMax;
        String str7 = null;
        if (feedModel4 == null) {
            setFocusableInTouchMode setfocusableintouchmode = this.getMax;
            if (setfocusableintouchmode == null || (list3 = setfocusableintouchmode.setMin) == null || (feedModel3 = (FeedModel) CollectionsKt.firstOrNull(list3)) == null) {
                str4 = null;
            } else {
                str4 = feedModel3.setMin;
            }
            if (str4 == null) {
                str4 = "";
            }
            setFocusableInTouchMode setfocusableintouchmode2 = this.getMax;
            if (setfocusableintouchmode2 == null || (list2 = setfocusableintouchmode2.setMin) == null || (feedModel2 = (FeedModel) CollectionsKt.firstOrNull(list2)) == null) {
                str5 = null;
            } else {
                str5 = feedModel2.length;
            }
            if (str5 == null) {
                str5 = "";
            }
            setFocusableInTouchMode setfocusableintouchmode3 = this.getMax;
            if (setfocusableintouchmode3 == null || (hashMap2 = setfocusableintouchmode3.length) == null) {
                hashMap2 = new HashMap<>();
            }
            Function1 getmax = new getMax(initcontent);
            setFocusableInTouchMode setfocusableintouchmode4 = this.getMax;
            if (!(setfocusableintouchmode4 == null || (list = setfocusableintouchmode4.setMin) == null || (feedModel = (FeedModel) CollectionsKt.firstOrNull(list)) == null)) {
                str7 = feedModel.toIntRange;
            }
            if (str7 == null) {
                str6 = "";
            } else {
                str6 = str7;
            }
            return new AUMaskImage(str4, str5, hashMap2, getmax, context, str6);
        }
        if (feedModel4 != null) {
            str = feedModel4.setMin;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        FeedModel feedModel5 = this.setMax;
        if (feedModel5 != null) {
            str2 = feedModel5.length;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        FeedModel feedModel6 = this.setMax;
        if (feedModel6 == null || (hashMap = feedModel6.IsOverlapping) == null) {
            hashMap = new HashMap<>();
        }
        Function1 setmax = new setMax(initcontent);
        FeedModel feedModel7 = this.setMax;
        if (feedModel7 != null) {
            str7 = feedModel7.toIntRange;
        }
        if (str7 == null) {
            str3 = "";
        } else {
            str3 = str7;
        }
        return new AUMaskImage(str, str2, hashMap, setmax, context, str3);
    }

    public final boolean getMax() {
        return this.setMin != null;
    }

    public final int hashCode() {
        int hashCode = Integer.valueOf(this.getMin).hashCode() * 31;
        FeedModel feedModel = this.setMax;
        int i = 0;
        int hashCode2 = (hashCode + (feedModel != null ? feedModel.hashCode() : 0)) * 31;
        setFocusableInTouchMode setfocusableintouchmode = this.getMax;
        int hashCode3 = (hashCode2 + (setfocusableintouchmode != null ? setfocusableintouchmode.hashCode() : 0)) * 31;
        List<performItemClick> list = this.length;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        RelationshipItemModel relationshipItemModel = this.setMin;
        if (relationshipItemModel != null) {
            i = relationshipItemModel.hashCode();
        }
        return hashCode4 + i;
    }
}
