package o;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.RawRes;
import androidx.recyclerview.widget.RecyclerView;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.zoloz.android.phone.zdoc.service.ZdocRecordService;
import id.dana.R;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.domain.social.ModifyRelationOperationType;
import id.dana.social.di.module.RelationshipBottomSheetModule;
import id.dana.social.model.FeedModel;
import id.dana.social.model.RelationshipItemModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AUSegment;
import o.IMultiInstanceInvalidationCallback;
import o.Logger;
import o.ModelSpecificDistanceUpdater;
import o.RegionMonitoringState;
import o.RunningAverageRssiFilter;
import o.b;
import o.confirmCheckedPositionsById;
import o.getLastMonitoringStatusUpdateTime;
import o.getLeftButton;
import o.getTitleText;
import o.infoLogger;
import o.setBtnImage;
import o.setFocusable;
import o.setLeftButtonUnicode;
import o.setRightButtonStyle;
import o.setRightButtonUnicode;
import o.stateOf;
import o.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class AUHorizontalListView implements getAdapterPosition<getTitleText.length> {
    private final RelationshipBottomSheetModule setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H&J0\u0010\b\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0012\u0010\u0013\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0014\u001a\u00020\u0003H&J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H&J\b\u0010\u0017\u001a\u00020\u0003H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0012\u0010\u001b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0005H&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0005H&J\b\u0010\u001f\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006 À\u0006\u0001"}, d2 = {"Lid/dana/social/tracker/FriendshipAnalyticTracker;", "", "trackFeedActivityOpen", "", "source", "", "trackFeedCommentAdd", "contentType", "trackFeedRead", "feedHighlightModel", "Lid/dana/social/model/FeedHighlightModel;", "feedModel", "Lid/dana/social/model/FeedModel;", "content", "Lid/dana/social/utils/Content;", "eventName", "notificationId", "redirectType", "redirectValue", "trackFriendFeedOpen", "trackFriendProfileOpen", "trackFriendshipEmojiAdd", "emojiType", "trackFriendshipNotificationOpen", "trackFriendshipSetPrivacy", "isSharedToFriend", "", "trackMyFeedOpen", "trackOnFollowerModifyRelationship", "active", "trackOnFollowingModifyRelationship", "trackOnFriendshipBottomSheetShow", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface SelectionNotifier {
        void getMax();

        void getMax(@NotNull String str);

        void getMin();

        void getMin(@NotNull String str);

        void getMin(@NotNull String str, @NotNull String str2);

        void length(@NotNull FeedModel feedModel);

        void length(@Nullable String str);

        void length(@NotNull SavedState.AnonymousClass1 r1, @NotNull String str);

        void setMax();

        void setMax(@NotNull String str);

        void setMin(@Nullable String str);

        void setMin(@NotNull getContextMenuInfo getcontextmenuinfo);

        void setMin(boolean z);

        void toFloatRange(@NotNull String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lid/dana/social/utils/EmojiUtil;", "", "()V", "getEmoji", "", "codePoint", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class SavedState {
        @NotNull
        public static final SavedState length = new SavedState();

        private SavedState() {
        }

        @NotNull
        public static String getMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "codePoint");
            String obj = new StringBuilder().appendCodePoint(Integer.parseInt(str, 16)).toString();
            Intrinsics.checkNotNullExpressionValue(obj, "StringBuilder()\n        …odePoint, 16)).toString()");
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f¨\u0006\u001e"}, d2 = {"Lid/dana/social/onboarding/model/FeedOnboardingModel;", "", "resId", "", "title", "", "description", "playAnimation", "Lkotlin/Function0;", "", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getDescription", "()Ljava/lang/String;", "getPlayAnimation", "()Lkotlin/jvm/functions/Function0;", "setPlayAnimation", "(Lkotlin/jvm/functions/Function0;)V", "getResId", "()I", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class CheckForTap {
        @NotNull
        private Function0<Unit> getMax;
        public final int getMin;
        @NotNull
        public final String length;
        @NotNull
        public final String setMin;

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckForTap)) {
                return false;
            }
            CheckForTap checkForTap = (CheckForTap) obj;
            return this.getMin == checkForTap.getMin && Intrinsics.areEqual((Object) this.length, (Object) checkForTap.length) && Intrinsics.areEqual((Object) this.setMin, (Object) checkForTap.setMin) && Intrinsics.areEqual((Object) this.getMax, (Object) checkForTap.getMax);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("FeedOnboardingModel(resId=");
            sb.append(this.getMin);
            sb.append(", title=");
            sb.append(this.length);
            sb.append(", description=");
            sb.append(this.setMin);
            sb.append(", playAnimation=");
            sb.append(this.getMax);
            sb.append(")");
            return sb.toString();
        }

        private CheckForTap(@RawRes int i, @NotNull String str, @NotNull String str2, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "title");
            Intrinsics.checkNotNullParameter(str2, "description");
            Intrinsics.checkNotNullParameter(function0, "playAnimation");
            this.getMin = i;
            this.length = str;
            this.setMin = str2;
            this.getMax = function0;
        }

        public /* synthetic */ CheckForTap(int i, String str, String str2) {
            this(i, str, str2, AnonymousClass1.INSTANCE);
        }

        public final int hashCode() {
            int hashCode = Integer.valueOf(this.getMin).hashCode() * 31;
            String str = this.length;
            int i = 0;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.setMin;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            Function0<Unit> function0 = this.getMax;
            if (function0 != null) {
                i = function0.hashCode();
            }
            return hashCode3 + i;
        }
    }

    public final class WindowRunnnable implements getAdapterPosition<rememberWindowAttachCount> {
        private final b.C0007b<Context> setMin;

        private WindowRunnnable(b.C0007b<Context> bVar) {
            this.setMin = bVar;
        }

        public static WindowRunnnable length(b.C0007b<Context> bVar) {
            return new WindowRunnnable(bVar);
        }

        public final /* synthetic */ Object get() {
            return new rememberWindowAttachCount(this.setMin.get());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\u0004\u0004\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lid/dana/social/state/ViewHolderState;", "T", "", "()V", "Empty", "Item", "LoadingMore", "Shimmer", "Lid/dana/social/state/ViewHolderState$Item;", "Lid/dana/social/state/ViewHolderState$LoadingMore;", "Lid/dana/social/state/ViewHolderState$Shimmer;", "Lid/dana/social/state/ViewHolderState$Empty;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public abstract class RecyclerListener<T> {
        private RecyclerListener() {
        }

        public /* synthetic */ RecyclerListener(byte b) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\n\b\u0001\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lid/dana/social/state/ViewHolderState$Item;", "T", "", "Lid/dana/social/state/ViewHolderState;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lid/dana/social/state/ViewHolderState$Item;", "equals", "", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class length<T> extends RecyclerListener<T> {
            @NotNull
            public final T length;

            public final boolean equals(@Nullable Object obj) {
                if (this != obj) {
                    return (obj instanceof length) && Intrinsics.areEqual((Object) this.length, (Object) ((length) obj).length);
                }
                return true;
            }

            public final int hashCode() {
                T t = this.length;
                if (t != null) {
                    return t.hashCode();
                }
                return 0;
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("Item(data=");
                sb.append(this.length);
                sb.append(")");
                return sb.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public length(@NotNull T t) {
                super((byte) 0);
                Intrinsics.checkNotNullParameter(t, "data");
                this.length = t;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lid/dana/social/state/ViewHolderState$LoadingMore;", "Lid/dana/social/state/ViewHolderState;", "", "()V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMax extends RecyclerListener {
            @NotNull
            public static final getMax getMax = new getMax();

            private getMax() {
                super((byte) 0);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lid/dana/social/state/ViewHolderState$Shimmer;", "Lid/dana/social/state/ViewHolderState;", "", "()V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class setMin extends RecyclerListener {
            @NotNull
            public static final setMin setMin = new setMin();

            private setMin() {
                super((byte) 0);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lid/dana/social/state/ViewHolderState$Empty;", "Lid/dana/social/state/ViewHolderState;", "", "()V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMin extends RecyclerListener {
            @NotNull
            public static final getMin getMax = new getMin();

            private getMin() {
                super((byte) 0);
            }
        }
    }

    public final class AdapterDataSetObserver implements getAdapterPosition<access$3500> {
        private final b.C0007b<access$3800> getMin;
        private final b.C0007b<Context> length;

        private AdapterDataSetObserver(b.C0007b<Context> bVar, b.C0007b<access$3800> bVar2) {
            this.length = bVar;
            this.getMin = bVar2;
        }

        public static AdapterDataSetObserver length(b.C0007b<Context> bVar, b.C0007b<access$3800> bVar2) {
            return new AdapterDataSetObserver(bVar, bVar2);
        }

        public final /* synthetic */ Object get() {
            return new access$3500(this.length.get(), this.getMin.get());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 :2\u00020\u0001:\u0001:B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0016\u0010+\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u001e\u0010.\u001a\u00020/2\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f01H\u0016J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u000fH\u0016J\b\u00102\u001a\u00020/H\u0016J\b\u00103\u001a\u00020\u000fH\u0016J\b\u00104\u001a\u00020/H\u0007J\b\u00105\u001a\u00020\"H\u0016J\b\u00106\u001a\u00020\"H\u0016J\b\u00107\u001a\u00020\"H\u0016J\b\u00108\u001a\u00020/H\u0016J\u0016\u00109\u001a\u00020/2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016R*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R0\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u001c@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010#\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\"@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010'\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f@GX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010(\"\u0004\b)\u0010*R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lid/dana/social/presenter/ContentGroupingDetailPresenter;", "Lid/dana/social/contract/ContentGroupingDetailContract$Presenter;", "view", "Lid/dana/social/contract/ContentGroupingDetailContract$View;", "getTimeline", "Lid/dana/domain/social/interactor/GetTimeline;", "feedMapper", "Lid/dana/social/model/mapper/FeedMapper;", "feedsContentAction", "Lid/dana/social/utils/FeedsContentAction;", "getUserId", "Lid/dana/domain/account/interactor/GetUserId;", "(Lid/dana/social/contract/ContentGroupingDetailContract$View;Lid/dana/domain/social/interactor/GetTimeline;Lid/dana/social/model/mapper/FeedMapper;Lid/dana/social/utils/FeedsContentAction;Lid/dana/domain/account/interactor/GetUserId;)V", "_activityIds", "", "", "get_activityIds$annotations", "()V", "get_activityIds", "()Ljava/util/List;", "set_activityIds", "(Ljava/util/List;)V", "<set-?>", "", "Lid/dana/domain/social/model/ActivityResponse;", "activitiesData", "getActivitiesData", "setActivitiesData", "", "index", "getIndex", "()I", "setIndex", "(I)V", "", "isLoading", "()Z", "setLoading", "(Z)V", "userId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "createTimelineParams", "Lid/dana/domain/social/interactor/GetTimeline$Params;", "activityIds", "doFeedsContentAction", "", "redirectValue", "Ljava/util/HashMap;", "fetchGroupedActivities", "getCurrentUserId", "getCurrentlyLoggedInUserId", "hasData", "hasMoreData", "isHasMore", "onDestroy", "setActivityIds", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class ListItemAccessibilityDelegate implements setLeftButtonUnicode.length {
        @NotNull
        public static final getMax setMin = new getMax((byte) 0);
        private final AUIconDrawable IsOverlapping;
        /* access modifiers changed from: private */
        public final setLeftButtonUnicode.setMin equals;
        boolean getMax;
        @NotNull
        List<RssiFilter> getMin = new ArrayList();
        @NotNull
        private List<String> isInside = CollectionsKt.emptyList();
        public String length;
        int setMax;
        private final GriverCreateDialogParam toDoubleRange;
        /* access modifiers changed from: private */
        public final access$3600 toFloatRange;
        private final stateOf toIntRange;

        @Inject
        public ListItemAccessibilityDelegate(@NotNull setLeftButtonUnicode.setMin setmin, @NotNull stateOf stateof, @NotNull access$3600 access_3600, @NotNull AUIconDrawable aUIconDrawable, @NotNull GriverCreateDialogParam griverCreateDialogParam) {
            Intrinsics.checkNotNullParameter(setmin, "view");
            Intrinsics.checkNotNullParameter(stateof, "getTimeline");
            Intrinsics.checkNotNullParameter(access_3600, "feedMapper");
            Intrinsics.checkNotNullParameter(aUIconDrawable, "feedsContentAction");
            Intrinsics.checkNotNullParameter(griverCreateDialogParam, "getUserId");
            this.equals = setmin;
            this.toIntRange = stateof;
            this.toFloatRange = access_3600;
            this.IsOverlapping = aUIconDrawable;
            this.toDoubleRange = griverCreateDialogParam;
            this.toDoubleRange.execute(new getMin(this));
        }

        public final void getMax(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "activityIds");
            this.isInside = list;
        }

        public final void length() {
            List<String> list;
            if (!this.getMax) {
                this.getMax = true;
                int i = this.setMax * 10;
                if (setMin()) {
                    int i2 = i + 10;
                    if (i2 > this.isInside.size()) {
                        List<String> list2 = this.isInside;
                        list = list2.subList(i, list2.size());
                    } else {
                        list = this.isInside.subList(i, i2);
                    }
                    this.toIntRange.execute(new setMax(this), new stateOf.setMin(10, "", (String) null, 2, list));
                    return;
                }
                this.equals.length(CollectionsKt.emptyList());
                this.getMax = false;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/presenter/ContentGroupingDetailPresenter$fetchGroupedActivities$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/social/model/SocialFeed;", "onError", "", "e", "", "onNext", "t", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class setMax extends GriverAppVirtualHostProxy<getScanCallbackIntent> {
            final /* synthetic */ ListItemAccessibilityDelegate getMin;

            setMax(ListItemAccessibilityDelegate listItemAccessibilityDelegate) {
                this.getMin = listItemAccessibilityDelegate;
            }

            public final /* synthetic */ void onNext(Object obj) {
                getScanCallbackIntent getscancallbackintent = (getScanCallbackIntent) obj;
                Intrinsics.checkNotNullParameter(getscancallbackintent, SecurityConstants.KEY_TEXT);
                if (!getscancallbackintent.getActivities().isEmpty()) {
                    this.getMin.setMax++;
                    this.getMin.getMin.addAll(getscancallbackintent.getActivities());
                }
                this.getMin.equals.length(this.getMin.toFloatRange.getMin(getscancallbackintent.getActivities()));
                this.getMin.getMax = false;
            }

            public final void onError(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "e");
                this.getMin.equals.setMax();
                this.getMin.getMax = false;
            }
        }

        public final boolean setMin() {
            return this.setMax * 10 < this.isInside.size();
        }

        public final boolean toIntRange() {
            return !this.getMin.isEmpty();
        }

        @NotNull
        public final String getMin() {
            String str = this.length;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userId");
            }
            return str;
        }

        public final boolean getMax() {
            return this.setMax * 10 < this.isInside.size();
        }

        public final void getMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "redirectValue");
            this.IsOverlapping.getMax(str);
        }

        public final void getMax(@NotNull HashMap<String, String> hashMap) {
            Intrinsics.checkNotNullParameter(hashMap, "redirectValue");
            this.IsOverlapping.getMax(hashMap);
        }

        public final void setMax() {
            this.IsOverlapping.setMin.dispose();
            this.toDoubleRange.dispose();
            this.toIntRange.dispose();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/social/presenter/ContentGroupingDetailPresenter$getCurrentlyLoggedInUserId$1", "Lid/dana/domain/DefaultObserver;", "", "onNext", "", "userId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMin extends GriverAppVirtualHostProxy<String> {
            final /* synthetic */ ListItemAccessibilityDelegate getMin;

            getMin(ListItemAccessibilityDelegate listItemAccessibilityDelegate) {
                this.getMin = listItemAccessibilityDelegate;
            }

            public final /* synthetic */ void onNext(Object obj) {
                String str = (String) obj;
                Intrinsics.checkNotNullParameter(str, "userId");
                super.onNext(str);
                ListItemAccessibilityDelegate listItemAccessibilityDelegate = this.getMin;
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                listItemAccessibilityDelegate.length = str;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/social/presenter/ContentGroupingDetailPresenter$Companion;", "", "()V", "FEED_VERSION", "", "PAGE_SIZE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMax {
            private getMax() {
            }

            public /* synthetic */ getMax(byte b) {
                this();
            }
        }
    }

    public final class OnScrollListener implements getAdapterPosition<ChoiceMode> {
        private final b.C0007b<regionsCount> length;
        private final b.C0007b<setBtnImage.setMin> setMin;

        private OnScrollListener(b.C0007b<setBtnImage.setMin> bVar, b.C0007b<regionsCount> bVar2) {
            this.setMin = bVar;
            this.length = bVar2;
        }

        public static OnScrollListener getMax(b.C0007b<setBtnImage.setMin> bVar, b.C0007b<regionsCount> bVar2) {
            return new OnScrollListener(bVar, bVar2);
        }

        public final /* synthetic */ Object get() {
            return new ChoiceMode(this.setMin.get(), this.length.get());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b¨\u0006\u0010"}, d2 = {"Lid/dana/social/onboarding/adapter/FeedOnboardingAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/social/onboarding/viewholder/FeedOnboardingViewHolder;", "Lid/dana/social/onboarding/model/FeedOnboardingModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "playAnimation", "", "position", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class CheckForLongPress extends IMultiInstanceInvalidationCallback.Stub<getSelectedPosition, CheckForTap> {
        @NotNull
        public static final length getMin = new length((byte) 0);

        public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-2111344813, oncanceled);
                onCancelLoad.getMin(-2111344813, oncanceled);
            }
            int max2 = dispatchOnCancelled.setMax(i);
            if (i != max2) {
                onCanceled oncanceled2 = new onCanceled(i, max2, 1);
                onCancelLoad.setMax(1877055617, oncanceled2);
                onCancelLoad.getMin(1877055617, oncanceled2);
            }
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
            return new getSelectedPosition(viewGroup);
        }

        public CheckForLongPress(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            String string = context.getString(R.string.feed_onboarding_first_page_title);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…oarding_first_page_title)");
            String string2 = context.getString(R.string.feed_onboarding_first_page_description);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…g_first_page_description)");
            String string3 = context.getString(R.string.feed_onboarding_second_page_title);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…arding_second_page_title)");
            String string4 = context.getString(R.string.feed_onboarding_second_page_description);
            Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…_second_page_description)");
            String string5 = context.getString(R.string.feed_onboarding_third_page_title);
            Intrinsics.checkNotNullExpressionValue(string5, "context.getString(R.stri…oarding_third_page_title)");
            String string6 = context.getString(R.string.feed_onboarding_third_page_description);
            Intrinsics.checkNotNullExpressionValue(string6, "context.getString(R.stri…g_third_page_description)");
            getMin(CollectionsKt.listOf(new CheckForTap(R.raw.f75542131820565, string, string2), new CheckForTap(R.raw.f75532131820564, string3, string4), new CheckForTap(R.raw.f75552131820566, string5, string6)));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"Lid/dana/social/onboarding/adapter/FeedOnboardingAdapter$Companion;", "", "()V", "getDefaultOnboardingData", "", "Lid/dana/social/onboarding/model/FeedOnboardingModel;", "context", "Landroid/content/Context;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class length {
            private length() {
            }

            public /* synthetic */ length(byte b) {
                this();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/social/presenter/FeedsCommentReportPresenter;", "Lid/dana/social/contract/FeedsCommentReportContract$Presenter;", "view", "Lid/dana/social/contract/FeedsCommentReportContract$View;", "getReportReasonsConfig", "Lid/dana/domain/social/interactor/GetReportReasonsConfig;", "(Lid/dana/social/contract/FeedsCommentReportContract$View;Lid/dana/domain/social/interactor/GetReportReasonsConfig;)V", "getReportReason", "", "onDestroy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class ChoiceMode implements setBtnImage.getMin {
        private final regionsCount getMax;
        /* access modifiers changed from: private */
        public final setBtnImage.setMin getMin;

        @Inject
        public ChoiceMode(@NotNull setBtnImage.setMin setmin, @NotNull regionsCount regionscount) {
            Intrinsics.checkNotNullParameter(setmin, "view");
            Intrinsics.checkNotNullParameter(regionscount, "getReportReasonsConfig");
            this.getMin = setmin;
            this.getMax = regionscount;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"id/dana/social/presenter/FeedsCommentReportPresenter$getReportReason$1", "Lid/dana/domain/DefaultObserver;", "", "Lid/dana/domain/social/model/ReportReasons;", "onError", "", "e", "", "onNext", "reasons", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class length extends GriverAppVirtualHostProxy<List<setSimulatedScanData>> {
            final /* synthetic */ ChoiceMode getMax;

            length(ChoiceMode choiceMode) {
                this.getMax = choiceMode;
            }

            public final /* synthetic */ void onNext(Object obj) {
                List list = (List) obj;
                Intrinsics.checkNotNullParameter(list, "reasons");
                if (!list.isEmpty()) {
                    this.getMax.getMin.getMax(list);
                } else {
                    setBtnImage.setMin unused = this.getMax.getMin;
                }
            }

            public final void onError(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "e");
                this.getMax.getMin.onError("");
                updateActionSheetContent.e(DanaLogConstants.TAG.GET_FEEDS_REPORT_REASON, th.getMessage(), th);
            }
        }

        public final void setMin() {
            this.getMax.execute(new length(this));
        }

        public final void setMax() {
            this.getMax.dispose();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J \u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u0006\u001a\u00020\u0010H\u0016J\u0018\u0010\u001b\u001a\u00020\u000e2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0010H\u0016J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0002R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lid/dana/social/presenter/ActivityReactionsPresenter;", "Lid/dana/social/contract/ActivityReactionsContract$Presenter;", "view", "Lid/dana/social/contract/ActivityReactionsContract$View;", "getActivityReactions", "Lid/dana/domain/social/interactor/GetActivityReactions;", "getMyActivityReactionInfo", "Lid/dana/domain/social/interactor/GetMyActivityReactionInfo;", "(Lid/dana/social/contract/ActivityReactionsContract$View;Lid/dana/domain/social/interactor/GetActivityReactions;Lid/dana/domain/social/interactor/GetMyActivityReactionInfo;)V", "currentActivityReactionsModel", "Lid/dana/social/model/ActivityReactionsModel;", "myActivityReactionInfo", "Lid/dana/domain/social/model/MyActivityReactionInfo;", "selectedKind", "", "checkIfMyReactionExists", "", "activityReactionsModel", "forPagination", "activityId", "", "kind", "getActivityReactionsPagination", "getCurrentUserSize", "", "getMyActivity", "Lid/dana/social/model/ActivityReactionsUserModel;", "isMyUserIdExists", "users", "", "onDestroy", "setSelectedKind", "updateCurrentActivityReactionsModel", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class CheckForKeyLongPress implements AUSegment.TabSwitchListener.getMin {
        private final getLastDetectionTime IsOverlapping;
        private boolean getMax;
        /* access modifiers changed from: private */
        public setRangedRegionState getMin;
        /* access modifiers changed from: private */
        public final AUSegment.TabSwitchListener.getMax length;
        private final Logger setMax;
        private dispatchSetPressed setMin = new dispatchSetPressed((byte) 0);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class getMax extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ CheckForKeyLongPress this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMax(CheckForKeyLongPress checkForKeyLongPress) {
                super(1);
                this.this$0 = checkForKeyLongPress;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, th.getMessage());
                this.this$0.length.getMax();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/social/model/MyActivityReactionInfo;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class getMin extends Lambda implements Function1<setRangedRegionState, Unit> {
            final /* synthetic */ CheckForKeyLongPress this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMin(CheckForKeyLongPress checkForKeyLongPress) {
                super(1);
                this.this$0 = checkForKeyLongPress;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((setRangedRegionState) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull setRangedRegionState setrangedregionstate) {
                Intrinsics.checkNotNullParameter(setrangedregionstate, "it");
                this.this$0.getMin = setrangedregionstate;
                this.this$0.length.getMax();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class length extends Lambda implements Function1<Throwable, Unit> {
            public static final length INSTANCE = new length();

            length() {
                super(1);
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                updateActionSheetContent.e(DanaLogConstants.TAG.ACTIVITY_REACTIONS, th.getMessage());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/social/model/ActivityReactions;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class setMin extends Lambda implements Function1<markInside, Unit> {
            final /* synthetic */ boolean $forPagination;
            final /* synthetic */ CheckForKeyLongPress this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMin(CheckForKeyLongPress checkForKeyLongPress, boolean z) {
                super(1);
                this.this$0 = checkForKeyLongPress;
                this.$forPagination = z;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((markInside) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull markInside markinside) {
                Intrinsics.checkNotNullParameter(markinside, "it");
                CheckForKeyLongPress checkForKeyLongPress = this.this$0;
                Intrinsics.checkNotNullParameter(markinside, "$this$toActivityReactionsModel");
                CheckForKeyLongPress.getMax(checkForKeyLongPress, new dispatchSetPressed(markinside.getKind(), setSelectionInt.setMax(markinside.getUsers()), markinside.getMaxId(), markinside.getHasNext()), this.$forPagination);
            }
        }

        @Inject
        public CheckForKeyLongPress(@NotNull AUSegment.TabSwitchListener.getMax getmax, @NotNull Logger logger, @NotNull getLastDetectionTime getlastdetectiontime) {
            Intrinsics.checkNotNullParameter(getmax, "view");
            Intrinsics.checkNotNullParameter(logger, "getActivityReactions");
            Intrinsics.checkNotNullParameter(getlastdetectiontime, "getMyActivityReactionInfo");
            this.length = getmax;
            this.setMax = logger;
            this.IsOverlapping = getlastdetectiontime;
        }

        public final void length() {
            this.IsOverlapping.execute(onReceivedIcon.INSTANCE, new getMin(this), new getMax(this));
        }

        public final int getMin() {
            List<recycleOnMeasure> list = this.setMin.getMin;
            if (list != null) {
                return list.size() - 1;
            }
            return 0;
        }

        public final void setMin(boolean z) {
            this.getMax = z;
        }

        public final void setMin(@NotNull String str, @NotNull String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
            Intrinsics.checkNotNullParameter(str2, "kind");
            this.setMax.execute(new Logger.setMin(str, str2, this.setMin.length), new setMin(this, z), length.INSTANCE);
        }

        public final void getMax(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
            Intrinsics.checkNotNullParameter(str2, "kind");
            if (this.setMin.getMin()) {
                setMin(str, str2, true);
            }
        }

        public final void setMax() {
            this.setMax.dispose();
        }

        private final boolean length(List<recycleOnMeasure> list) {
            if (list != null) {
                Iterator<recycleOnMeasure> it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    recycleOnMeasure next = it.next();
                    setRangedRegionState setrangedregionstate = this.getMin;
                    if (setrangedregionstate == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("myActivityReactionInfo");
                    }
                    if (Intrinsics.areEqual((Object) setrangedregionstate.getUserId(), (Object) next.getMax)) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    return true;
                }
            }
            return false;
        }

        public static final /* synthetic */ void getMax(CheckForKeyLongPress checkForKeyLongPress, dispatchSetPressed dispatchsetpressed, boolean z) {
            List<recycleOnMeasure> list;
            List mutableList;
            List<recycleOnMeasure> list2;
            List mutableList2;
            if (!z && checkForKeyLongPress.getMax && !checkForKeyLongPress.length(dispatchsetpressed.getMin) && (list2 = dispatchsetpressed.getMin) != null && (mutableList2 = CollectionsKt.toMutableList(list2)) != null) {
                recycleOnMeasure recycleonmeasure = new recycleOnMeasure((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127);
                setRangedRegionState setrangedregionstate = checkForKeyLongPress.getMin;
                if (setrangedregionstate == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("myActivityReactionInfo");
                }
                recycleonmeasure.getMin = setrangedregionstate.getNickname();
                setRangedRegionState setrangedregionstate2 = checkForKeyLongPress.getMin;
                if (setrangedregionstate2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("myActivityReactionInfo");
                }
                recycleonmeasure.toIntRange = setrangedregionstate2.getAvatarUrl();
                mutableList2.add(0, recycleonmeasure);
            }
            dispatchSetPressed dispatchsetpressed2 = checkForKeyLongPress.setMin;
            List<recycleOnMeasure> list3 = dispatchsetpressed.getMin;
            if (!(list3 == null || (list = dispatchsetpressed2.getMin) == null || (mutableList = CollectionsKt.toMutableList(list)) == null)) {
                mutableList.addAll(list3);
            }
            dispatchsetpressed2.getMax = dispatchsetpressed.getMin();
            String str = dispatchsetpressed.length;
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            dispatchsetpressed2.length = str;
            checkForKeyLongPress.length.setMin(dispatchsetpressed.getMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J<\u0010\u0005\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b`\t0\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u0002J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lid/dana/social/model/mapper/GroupedFeedNotificationMapper;", "", "feedModelMapper", "Lid/dana/social/model/mapper/FeedModelMapper;", "(Lid/dana/social/model/mapper/FeedModelMapper;)V", "getOrderedNonDuplicateActors", "", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "mappedActivities", "Lid/dana/social/model/FeedModel;", "map", "Lid/dana/social/model/FeedViewHolderModel;", "dateNow", "Ljava/util/Date;", "oldItem", "Lid/dana/domain/social/model/GroupedActivity;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class ArrowScrollFocusResult {
        private final access$3800 getMax;

        @Inject
        public ArrowScrollFocusResult(@NotNull access$3800 access_3800) {
            Intrinsics.checkNotNullParameter(access_3800, "feedModelMapper");
            this.getMax = access_3800;
        }

        @NotNull
        public final List<setEmptyView> getMax(@NotNull Date date, @NotNull List<onCycleEnd> list) {
            setEmptyView setemptyview;
            Date date2 = date;
            List<onCycleEnd> list2 = list;
            Intrinsics.checkNotNullParameter(date2, "dateNow");
            Intrinsics.checkNotNullParameter(list2, "oldItem");
            ArrayList arrayList = new ArrayList();
            for (onCycleEnd oncycleend : list2) {
                Iterable<RssiFilter> activities = oncycleend.getActivities();
                Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(activities, 10));
                for (RssiFilter max : activities) {
                    FeedModel max2 = this.getMax.setMax(date2, max);
                    max2.toFloatRange = oncycleend.getId();
                    max2.isInside = oncycleend.getRead();
                    arrayList2.add(max2);
                }
                List list3 = (List) arrayList2;
                List<HashMap<String, String>> length = length(list3);
                if (oncycleend.getActorCount() > 1) {
                    setemptyview = new setEmptyView(13, (FeedModel) null, new setFocusableInTouchMode(oncycleend.getId(), oncycleend.getGroup(), oncycleend.getActivityCount(), oncycleend.getActorCount(), list3, new HashMap(MapsKt.toMap(length.get(0))), length, oncycleend.getRead()), (List) null, (RelationshipItemModel) null, 24);
                } else {
                    setemptyview = new setEmptyView(15, (FeedModel) list3.get(0), (setFocusableInTouchMode) null, (List) null, (RelationshipItemModel) null, 24);
                }
                arrayList.add(setemptyview);
            }
            return arrayList;
        }

        private static List<HashMap<String, String>> length(List<FeedModel> list) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (FeedModel feedModel : list) {
                HashMap<String, String> hashMap = feedModel.IsOverlapping;
                if (hashMap != null) {
                    linkedHashMap.put(setBuildNumber.getUserId(hashMap), hashMap);
                }
            }
            Map map = linkedHashMap;
            Collection arrayList = new ArrayList(map.size());
            for (Map.Entry value : map.entrySet()) {
                arrayList.add((HashMap) value.getValue());
            }
            return (List) arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\b\t*\u0001\u0015\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\r\u0010\u0014\u001a\u00020\u0015H\u0002¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u000eH\u0016R(\u0010\u000b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e \u000f*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\r0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lid/dana/social/presenter/BlockedFragmentPresenter;", "Lid/dana/social/contract/BlockedFragmentContract$Presenter;", "view", "Lid/dana/social/contract/BlockedFragmentContract$View;", "getBlockedFollower", "Lid/dana/domain/social/interactor/GetBlockedFollower;", "modifyFollowerRelationship", "Lid/dana/domain/social/interactor/ModifyFollowerRelationship;", "startFollowerFullSync", "Lid/dana/domain/social/interactor/StartFollowerFullSync;", "(Lid/dana/social/contract/BlockedFragmentContract$View;Lid/dana/domain/social/interactor/GetBlockedFollower;Lid/dana/domain/social/interactor/ModifyFollowerRelationship;Lid/dana/domain/social/interactor/StartFollowerFullSync;)V", "blockedFollowingPublishSubject", "Lio/reactivex/subjects/PublishSubject;", "", "Lid/dana/social/model/RelationshipItemModel;", "kotlin.jvm.PlatformType", "getView", "()Lid/dana/social/contract/BlockedFragmentContract$View;", "getBlockedFollowerList", "", "getBlockedFollowingObserver", "id/dana/social/presenter/BlockedFragmentPresenter$getBlockedFollowingObserver$1", "()Lid/dana/social/presenter/BlockedFragmentPresenter$getBlockedFollowingObserver$1;", "observeBlockedFollowingData", "onDestroy", "startFetchingFollower", "unblockFollower", "relationshipItemModel", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class PerformClick implements setRightButtonUnicode.getMin {
        @NotNull
        public static final setMax setMin = new setMax((byte) 0);
        private final getTrackingAge equals;
        @NotNull
        final setRightButtonUnicode.length getMax;
        private final Loggers getMin;
        private final getUseTrackingCache length;
        /* access modifiers changed from: private */
        public final IComponent<List<RelationshipItemModel>> setMax;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class IsOverlapping extends Lambda implements Function1<Boolean, Unit> {
            final /* synthetic */ RelationshipItemModel $relationshipItemModel;
            final /* synthetic */ PerformClick this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            IsOverlapping(PerformClick performClick, RelationshipItemModel relationshipItemModel) {
                super(1);
                this.this$0 = performClick;
                this.$relationshipItemModel = relationshipItemModel;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                this.this$0.getMax.setMax(this.$relationshipItemModel);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class getMax extends Lambda implements Function1<Exception, Unit> {
            public static final getMax INSTANCE = new getMax();

            getMax() {
                super(1);
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Exception) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Exception exc) {
                Intrinsics.checkNotNullParameter(exc, "it");
                updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, exc.getMessage(), exc);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class isInside extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ PerformClick this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            isInside(PerformClick performClick) {
                super(1);
                this.this$0 = performClick;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                this.this$0.getMax.setMin();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/social/model/Follower;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class length extends Lambda implements Function1<getCycledScanner, Unit> {
            final /* synthetic */ PerformClick this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            length(PerformClick performClick) {
                super(1);
                this.this$0 = performClick;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((getCycledScanner) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull getCycledScanner getcycledscanner) {
                Intrinsics.checkNotNullParameter(getcycledscanner, "it");
                this.this$0.setMax.onNext(setSelectionFromOffset.setMax(getcycledscanner.getFollowerItemList()));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class setMin extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ PerformClick this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMin(PerformClick performClick) {
                super(1);
                this.this$0 = performClick;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                this.this$0.getMax.length();
                StringBuilder sb = new StringBuilder("onError: ");
                sb.append(th.getMessage());
                updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, sb.toString(), th);
            }
        }

        @Inject
        public PerformClick(@NotNull setRightButtonUnicode.length length2, @NotNull Loggers loggers, @NotNull getUseTrackingCache getusetrackingcache, @NotNull getTrackingAge gettrackingage) {
            Intrinsics.checkNotNullParameter(length2, "view");
            Intrinsics.checkNotNullParameter(loggers, "getBlockedFollower");
            Intrinsics.checkNotNullParameter(getusetrackingcache, "modifyFollowerRelationship");
            Intrinsics.checkNotNullParameter(gettrackingage, "startFollowerFullSync");
            this.getMax = length2;
            this.getMin = loggers;
            this.length = getusetrackingcache;
            this.equals = gettrackingage;
            IComponent<List<RelationshipItemModel>> max = IComponent.setMax();
            Intrinsics.checkNotNullExpressionValue(max, "PublishSubject.create<Li…RelationshipItemModel>>()");
            this.setMax = max;
            max.observeOn(hideProgress.length()).subscribeOn(hideProgress.length()).throttleLatest(1000, TimeUnit.MILLISECONDS).subscribe(new getMin(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"id/dana/social/presenter/BlockedFragmentPresenter$getBlockedFollowingObserver$1", "Lid/dana/domain/DefaultObserver;", "", "Lid/dana/social/model/RelationshipItemModel;", "onNext", "", "blockedFollowing", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMin extends GriverAppVirtualHostProxy<List<? extends RelationshipItemModel>> {
            final /* synthetic */ PerformClick setMax;

            getMin(PerformClick performClick) {
                this.setMax = performClick;
            }

            public final /* synthetic */ void onNext(Object obj) {
                List list = (List) obj;
                Intrinsics.checkNotNullParameter(list, "blockedFollowing");
                this.setMax.getMax.setMin(list);
            }
        }

        public final void length() {
            this.getMin.execute(onReceivedIcon.INSTANCE, new length(this), new setMin(this));
        }

        public final void length(@NotNull RelationshipItemModel relationshipItemModel) {
            Intrinsics.checkNotNullParameter(relationshipItemModel, "relationshipItemModel");
            this.length.execute(MapsKt.mapOf(new Pair(relationshipItemModel.length, ModifyRelationOperationType.UNBLOCK)), new IsOverlapping(this, relationshipItemModel), new isInside(this));
        }

        public final void getMin() {
            this.equals.execute(Unit.INSTANCE, getMax.INSTANCE);
        }

        public final void setMax() {
            this.getMin.dispose();
            this.length.dispose();
            this.equals.dispose();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/social/presenter/BlockedFragmentPresenter$Companion;", "", "()V", "DEFAULT_THROTTLE_TIME", "", "ON_ERROR", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class setMax {
            private setMax() {
            }

            public /* synthetic */ setMax(byte b) {
                this();
            }
        }
    }

    public static getTitleText.length setMax(RelationshipBottomSheetModule relationshipBottomSheetModule) {
        getTitleText.length max = relationshipBottomSheetModule.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\r\u0018\u0000 A2\u00020\u0001:\u0001ABW\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u0018\u0010\u0004\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020(H\u0002J\u0010\u00100\u001a\u00020-2\u0006\u0010/\u001a\u00020(H\u0002J\b\u00101\u001a\u00020-H\u0016J\u0016\u00102\u001a\u0002032\f\u00104\u001a\b\u0012\u0004\u0012\u00020(05H\u0002J\u0010\u0010\n\u001a\u00020-2\u0006\u00106\u001a\u00020(H\u0016J\u0016\u00107\u001a\u00020-2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020(05H\u0016J\b\u00108\u001a\u00020(H\u0016J\b\u00109\u001a\u00020-H\u0007J\u0010\u0010\u0006\u001a\u00020-2\u0006\u0010/\u001a\u00020(H\u0016J\b\u0010:\u001a\u00020-H\u0016J\b\u0010;\u001a\u00020\u001dH\u0016J\u0010\u0010<\u001a\u00020-2\u0006\u0010/\u001a\u00020(H\u0016J\b\u0010=\u001a\u00020-H\u0016J\u0018\u0010>\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020(H\u0016J \u0010?\u001a\u00020-2\u0006\u00106\u001a\u00020(2\u0006\u0010@\u001a\u00020(2\u0006\u0010/\u001a\u00020(H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R$\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u001c\u001a\u0004\u0018\u00010\"@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R$\u0010)\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020(@GX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010*\"\u0004\b+\u0010,R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lid/dana/social/presenter/FeedCommentPresenter;", "Lid/dana/social/contract/FeedCommentContract$Presenter;", "view", "Lid/dana/social/contract/FeedCommentContract$View;", "addActivityComment", "Lid/dana/domain/social/interactor/AddActivityComment;", "getFeedComment", "Lid/dana/domain/social/interactor/GetFeedComment;", "submitFeedCommentReport", "Lid/dana/domain/social/interactor/SubmitFeedCommentReport;", "deleteComment", "Lid/dana/domain/social/interactor/DeleteComment;", "getMyFeedsHeaderInfo", "Lid/dana/domain/social/interactor/GetMyFeedsHeaderInfo;", "getTimeline", "Lid/dana/domain/social/interactor/GetTimeline;", "feedMapper", "Lid/dana/social/model/mapper/FeedMapper;", "getUserId", "Lid/dana/domain/account/interactor/GetUserId;", "markAsReadNotification", "Lid/dana/domain/social/interactor/MarkAsReadNotification;", "(Lid/dana/social/contract/FeedCommentContract$View;Lid/dana/domain/social/interactor/AddActivityComment;Lid/dana/domain/social/interactor/GetFeedComment;Lid/dana/domain/social/interactor/SubmitFeedCommentReport;Lid/dana/domain/social/interactor/DeleteComment;Lid/dana/domain/social/interactor/GetMyFeedsHeaderInfo;Lid/dana/domain/social/interactor/GetTimeline;Lid/dana/social/model/mapper/FeedMapper;Lid/dana/domain/account/interactor/GetUserId;Lid/dana/domain/social/interactor/MarkAsReadNotification;)V", "feedCommentModelQueue", "Ljava/util/Queue;", "Lid/dana/social/model/FeedCommentModel;", "getFeedCommentModelQueue", "()Ljava/util/Queue;", "<set-?>", "", "isLoadingComment", "()Z", "setLoadingComment", "(Z)V", "Lid/dana/domain/social/model/FeedCommentResult;", "lastFeedData", "getLastFeedData", "()Lid/dana/domain/social/model/FeedCommentResult;", "setLastFeedData", "(Lid/dana/domain/social/model/FeedCommentResult;)V", "", "userId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "", "feedCommentModel", "activityId", "callAddActivityCommentRecursively", "clearLastFeedData", "createTimelineParams", "Lid/dana/domain/social/interactor/GetTimeline$Params;", "activityIds", "", "commentId", "fetchDataBubble", "getCurrentUserId", "getCurrentlyLoggedInUserId", "getUserInfo", "hasMoreData", "markAsRead", "onDestroy", "submitComment", "submitReportComment", "reason", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class LayoutParams implements setRightButtonStyle.getMin {
        @NotNull
        public static final getMax setMax = new getMax((byte) 0);
        private final GriverCreateDialogParam FastBitmap$CoordinateSystem;
        private final v IsOverlapping;
        /* access modifiers changed from: private */
        public final setRightButtonStyle.length equals;
        boolean getMax;
        public String getMin;
        private final stateOf hashCode;
        private final ModelSpecificDistanceUpdater isInside;
        @NotNull
        final Queue<resurrectSelectionIfNeeded> length = new LinkedList();
        @Nullable
        RunningAverageRssiFilter.Measurement setMin;
        private final fromBundle toDoubleRange;
        private final infoLogger toFloatRange;
        private final RegionMonitoringState toIntRange;
        private final getLastMonitoringStatusUpdateTime toString;
        /* access modifiers changed from: private */
        public final access$3600 values;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/social/model/AddActivityCommentInfo;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class getMin extends Lambda implements Function1<RunningAverageRssiFilter.AnonymousClass1, Unit> {
            final /* synthetic */ String $activityId;
            final /* synthetic */ LayoutParams this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMin(LayoutParams layoutParams, String str) {
                super(1);
                this.this$0 = layoutParams;
                this.$activityId = str;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((RunningAverageRssiFilter.AnonymousClass1) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull RunningAverageRssiFilter.AnonymousClass1 r10) {
                Intrinsics.checkNotNullParameter(r10, "it");
                setRightButtonStyle.length max = this.this$0.equals;
                resurrectSelectionIfNeeded poll = this.this$0.length.poll();
                Intrinsics.checkNotNullExpressionValue(poll, "feedCommentModelQueue.poll()");
                Intrinsics.checkNotNullParameter(r10, "$this$toAddActivityCommentModel");
                max.getMin(poll, new fillGap(r10.getId(), r10.getUserId(), r10.getActivityId(), r10.getContent(), r10.getCreatedTime()));
                LayoutParams.length(this.this$0, this.$activityId);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class hashCode extends Lambda implements Function1<Throwable, Unit> {
            public static final hashCode INSTANCE = new hashCode();

            hashCode() {
                super(1);
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class length extends Lambda implements Function1<Boolean, Unit> {
            final /* synthetic */ LayoutParams this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            length(LayoutParams layoutParams) {
                super(1);
                this.this$0 = layoutParams;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                this.this$0.equals.setMin();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class setMax extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ String $activityId;
            final /* synthetic */ LayoutParams this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMax(LayoutParams layoutParams, String str) {
                super(1);
                this.this$0 = layoutParams;
                this.$activityId = str;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                setRightButtonStyle.length max = this.this$0.equals;
                resurrectSelectionIfNeeded poll = this.this$0.length.poll();
                Intrinsics.checkNotNullExpressionValue(poll, "feedCommentModelQueue.poll()");
                max.getMin(poll);
                StringBuilder sb = new StringBuilder("[FeedInputComment] ");
                sb.append(th.getLocalizedMessage());
                updateActionSheetContent.e(DanaLogConstants.TAG.FEED_INPUT_COMMENT, sb.toString());
                LayoutParams.length(this.this$0, this.$activityId);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class setMin extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ LayoutParams this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMin(LayoutParams layoutParams) {
                super(1);
                this.this$0 = layoutParams;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                this.this$0.equals.getMin();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class toDoubleRange extends Lambda implements Function1<Boolean, Unit> {
            final /* synthetic */ LayoutParams this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            toDoubleRange(LayoutParams layoutParams) {
                super(1);
                this.this$0 = layoutParams;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                if (z) {
                    this.this$0.equals.setMax();
                } else {
                    this.this$0.equals.length();
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class toString extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ LayoutParams this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            toString(LayoutParams layoutParams) {
                super(1);
                this.this$0 = layoutParams;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                this.this$0.equals.length();
                updateActionSheetContent.e(DanaLogConstants.TAG.TWILIO_CONSULT, th.getMessage(), th);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class values extends Lambda implements Function1<Boolean, Unit> {
            public static final values INSTANCE = new values();

            values() {
                super(1);
            }

            public final void invoke(boolean z) {
            }

            public final /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }
        }

        @Inject
        public LayoutParams(@NotNull setRightButtonStyle.length length2, @NotNull ModelSpecificDistanceUpdater modelSpecificDistanceUpdater, @NotNull infoLogger infologger, @NotNull RegionMonitoringState regionMonitoringState, @NotNull v vVar, @NotNull fromBundle frombundle, @NotNull stateOf stateof, @NotNull access$3600 access_3600, @NotNull GriverCreateDialogParam griverCreateDialogParam, @NotNull getLastMonitoringStatusUpdateTime getlastmonitoringstatusupdatetime) {
            Intrinsics.checkNotNullParameter(length2, "view");
            Intrinsics.checkNotNullParameter(modelSpecificDistanceUpdater, "addActivityComment");
            Intrinsics.checkNotNullParameter(infologger, "getFeedComment");
            Intrinsics.checkNotNullParameter(regionMonitoringState, "submitFeedCommentReport");
            Intrinsics.checkNotNullParameter(vVar, "deleteComment");
            Intrinsics.checkNotNullParameter(frombundle, "getMyFeedsHeaderInfo");
            Intrinsics.checkNotNullParameter(stateof, "getTimeline");
            Intrinsics.checkNotNullParameter(access_3600, "feedMapper");
            Intrinsics.checkNotNullParameter(griverCreateDialogParam, "getUserId");
            Intrinsics.checkNotNullParameter(getlastmonitoringstatusupdatetime, "markAsReadNotification");
            this.equals = length2;
            this.isInside = modelSpecificDistanceUpdater;
            this.toFloatRange = infologger;
            this.toIntRange = regionMonitoringState;
            this.IsOverlapping = vVar;
            this.toDoubleRange = frombundle;
            this.hashCode = stateof;
            this.values = access_3600;
            this.FastBitmap$CoordinateSystem = griverCreateDialogParam;
            this.toString = getlastmonitoringstatusupdatetime;
            this.FastBitmap$CoordinateSystem.execute(new toIntRange(this));
        }

        @NotNull
        public final String getMin() {
            String str = this.getMin;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userId");
            }
            return str;
        }

        public final void length(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
            this.toString.execute(new getLastMonitoringStatusUpdateTime.setMin(CollectionsKt.listOf(str)), values.INSTANCE, hashCode.INSTANCE);
        }

        public final boolean setMin() {
            RunningAverageRssiFilter.Measurement measurement = this.setMin;
            if (measurement != null) {
                return measurement.getHasNext();
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
            if ((r3.length() == 0) != false) goto L_0x001e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void setMax(@org.jetbrains.annotations.NotNull o.resurrectSelectionIfNeeded r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            /*
                r1 = this;
                java.lang.String r0 = "feedCommentModel"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "activityId"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                boolean r0 = r2.setMin()
                if (r0 != 0) goto L_0x001e
                r0 = r3
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                int r0 = r0.length()
                if (r0 != 0) goto L_0x001b
                r0 = 1
                goto L_0x001c
            L_0x001b:
                r0 = 0
            L_0x001c:
                if (r0 == 0) goto L_0x0023
            L_0x001e:
                o.setRightButtonStyle$length r0 = r1.equals
                r0.getMin((o.resurrectSelectionIfNeeded) r2)
            L_0x0023:
                java.util.Queue<o.resurrectSelectionIfNeeded> r0 = r1.length
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0034
                java.util.Queue<o.resurrectSelectionIfNeeded> r0 = r1.length
                r0.add(r2)
                r1.length((o.resurrectSelectionIfNeeded) r2, (java.lang.String) r3)
                return
            L_0x0034:
                java.util.Queue<o.resurrectSelectionIfNeeded> r3 = r1.length
                r3.add(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AUHorizontalListView.LayoutParams.setMax(o.resurrectSelectionIfNeeded, java.lang.String):void");
        }

        private final void length(resurrectSelectionIfNeeded resurrectselectionifneeded, String str) {
            this.isInside.execute(new ModelSpecificDistanceUpdater.length(String.valueOf(resurrectselectionifneeded.length.getMax), str, resurrectselectionifneeded.setMax), new getMin(this, str), new setMax(this, str));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/presenter/FeedCommentPresenter$getUserInfo$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/social/model/MyFeedsHeaderInfo;", "onError", "", "throwable", "", "onNext", "userInfo", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class isInside extends GriverAppVirtualHostProxy<setMonitoringStatus> {
            final /* synthetic */ LayoutParams getMin;

            isInside(LayoutParams layoutParams) {
                this.getMin = layoutParams;
            }

            public final /* synthetic */ void onNext(Object obj) {
                setMonitoringStatus setmonitoringstatus = (setMonitoringStatus) obj;
                Intrinsics.checkNotNullParameter(setmonitoringstatus, "userInfo");
                setRightButtonStyle.length max = this.getMin.equals;
                setFocusable.setMax setmax = setFocusable.setMin;
                setFocusable.setMax setmax2 = setFocusable.setMin;
                setFocusable min = setFocusable.setMax.setMin(setmonitoringstatus);
                Intrinsics.checkNotNullParameter(min, "$this$toActivityReactionsUserModel");
                max.setMin(new recycleOnMeasure(min.length, (String) null, min.getMin, min.length, (String) null, min.getMax, min.setMax, 18));
            }

            public final void onError(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "throwable");
                super.onError(th);
                StringBuilder sb = new StringBuilder("[FeedComment] : ");
                sb.append(th.getMessage());
                updateActionSheetContent.e(DanaLogConstants.TAG.FEED_COMMENT, sb.toString());
            }
        }

        public final void getMax() {
            this.toDoubleRange.execute(new isInside(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/social/presenter/FeedCommentPresenter$fetchDataBubble$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/social/model/SocialFeed;", "onError", "", "e", "", "onNext", "t", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class toFloatRange extends GriverAppVirtualHostProxy<getScanCallbackIntent> {
            final /* synthetic */ LayoutParams length;

            toFloatRange(LayoutParams layoutParams) {
                this.length = layoutParams;
            }

            public final /* synthetic */ void onNext(Object obj) {
                getScanCallbackIntent getscancallbackintent = (getScanCallbackIntent) obj;
                Intrinsics.checkNotNullParameter(getscancallbackintent, SecurityConstants.KEY_TEXT);
                if (getscancallbackintent.getActivities().isEmpty()) {
                    this.length.equals.getMax();
                    return;
                }
                setEmptyView setemptyview = (setEmptyView) CollectionsKt.first(this.length.values.getMin(getscancallbackintent.getActivities()));
                if (setemptyview != null) {
                    this.length.equals.setMin(setemptyview);
                }
            }

            public final void onError(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "e");
                this.length.equals.getMax();
            }
        }

        public final void setMin(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
            this.hashCode.execute(new toFloatRange(this), new stateOf.setMin(10, "", (String) null, 3, list));
        }

        public final void getMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "commentId");
            this.IsOverlapping.execute(new v.setMax(str), new length(this), new setMin(this));
        }

        public final void length() {
            this.setMin = null;
            this.getMax = false;
        }

        public final void setMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
            if (!this.getMax) {
                if (!(str.length() == 0)) {
                    this.getMax = true;
                    infoLogger infologger = this.toFloatRange;
                    RunningAverageRssiFilter.Measurement measurement = this.setMin;
                    String maxId = measurement != null ? measurement.getMaxId() : null;
                    if (maxId == null) {
                        maxId = "";
                    }
                    infologger.execute(new infoLogger.setMin(str, maxId), new IsOverlapping(this), new equals(this));
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0004J\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¨\u0006\u0007"}, d2 = {"id/dana/social/presenter/FeedCommentPresenter$getFeedComment$1", "Lkotlin/Function1;", "Lid/dana/domain/social/model/FeedCommentResult;", "", "Lid/dana/domain/core/usecase/OnSuccessCallback;", "invoke", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class IsOverlapping implements Function1<RunningAverageRssiFilter.Measurement, Unit> {
            final /* synthetic */ LayoutParams getMin;

            IsOverlapping(LayoutParams layoutParams) {
                this.getMin = layoutParams;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                RunningAverageRssiFilter.Measurement measurement = (RunningAverageRssiFilter.Measurement) obj;
                Intrinsics.checkNotNullParameter(measurement, "data");
                this.getMin.getMax = false;
                this.getMin.setMin = measurement;
                setRightButtonStyle.length max = this.getMin.equals;
                confirmCheckedPositionsById.getMax getmax = confirmCheckedPositionsById.getMax;
                Intrinsics.checkNotNullParameter(measurement, "feedCommentResult");
                max.getMin(new confirmCheckedPositionsById(resurrectSelection.setMin(measurement.getComments()), measurement.getMaxId(), measurement.getHasNext()));
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004J\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¨\u0006\u0007"}, d2 = {"id/dana/social/presenter/FeedCommentPresenter$getFeedComment$2", "Lkotlin/Function1;", "", "", "Lid/dana/domain/core/usecase/OnErrorCallback;", "invoke", "e", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class equals implements Function1<Throwable, Unit> {
            final /* synthetic */ LayoutParams setMin;

            equals(LayoutParams layoutParams) {
                this.setMin = layoutParams;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                Throwable th = (Throwable) obj;
                Intrinsics.checkNotNullParameter(th, "e");
                this.setMin.getMax = false;
                this.setMin.equals.length(th);
                StringBuilder sb = new StringBuilder("[FeedComment] ");
                sb.append(th.getMessage());
                updateActionSheetContent.e(DanaLogConstants.TAG.FEED_COMMENT, sb.toString());
                return Unit.INSTANCE;
            }
        }

        public final void getMax(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "commentId");
            Intrinsics.checkNotNullParameter(str2, ZdocRecordService.REASON);
            Intrinsics.checkNotNullParameter(str3, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
            this.toIntRange.execute(new RegionMonitoringState.setMax(str, str2, str3), new toDoubleRange(this), new toString(this));
        }

        public final void setMax() {
            this.toFloatRange.dispose();
            this.isInside.dispose();
            this.toIntRange.dispose();
            this.IsOverlapping.dispose();
            this.toDoubleRange.dispose();
            this.length.clear();
            this.toString.dispose();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/social/presenter/FeedCommentPresenter$getCurrentlyLoggedInUserId$1", "Lid/dana/domain/DefaultObserver;", "", "onNext", "", "userId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class toIntRange extends GriverAppVirtualHostProxy<String> {
            final /* synthetic */ LayoutParams getMin;

            toIntRange(LayoutParams layoutParams) {
                this.getMin = layoutParams;
            }

            public final /* synthetic */ void onNext(Object obj) {
                String str = (String) obj;
                int length = str != null ? str.length() : 0;
                int max = dispatchOnCancelled.setMax(length);
                if (length != max) {
                    onCanceled oncanceled = new onCanceled(length, max, 1);
                    onCancelLoad.setMax(-313942059, oncanceled);
                    onCancelLoad.getMin(-313942059, oncanceled);
                }
                Intrinsics.checkNotNullParameter(str, "userId");
                super.onNext(str);
                LayoutParams layoutParams = this.getMin;
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                layoutParams.getMin = str;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/social/presenter/FeedCommentPresenter$Companion;", "", "()V", "FEED_VERSION", "", "PAGE_SIZE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMax {
            private getMax() {
            }

            public /* synthetic */ getMax(byte b) {
                this();
            }
        }

        public static final /* synthetic */ void length(LayoutParams layoutParams, String str) {
            if (!layoutParams.length.isEmpty()) {
                resurrectSelectionIfNeeded peek = layoutParams.length.peek();
                Intrinsics.checkNotNullExpressionValue(peek, "feedCommentModelQueue.peek()");
                layoutParams.length(peek, str);
            }
        }
    }

    public final class RecycleBin implements getAdapterPosition<fillActiveViews> {
        private final b.C0007b<isVerboseLoggingEnabled> IsOverlapping;
        private final b.C0007b<setSampleExpirationMilliseconds> equals;
        private final b.C0007b<markOutside> getMax;
        private final b.C0007b<getTrackingAge> getMin;
        private final b.C0007b<getUseTrackingCache> isInside;
        private final b.C0007b<commitMeasurements> length;
        private final b.C0007b<addBeacon> setMax;
        private final b.C0007b<getLeftButton.setMax> setMin;
        private final b.C0007b<setVerboseLoggingEnabled> toFloatRange;
        private final b.C0007b<finalizeBeacons> toIntRange;
        private final b.C0007b<addLocalRegion> toString;

        private RecycleBin(b.C0007b<getLeftButton.setMax> bVar, b.C0007b<addBeacon> bVar2, b.C0007b<getTrackingAge> bVar3, b.C0007b<commitMeasurements> bVar4, b.C0007b<markOutside> bVar5, b.C0007b<setVerboseLoggingEnabled> bVar6, b.C0007b<isVerboseLoggingEnabled> bVar7, b.C0007b<getUseTrackingCache> bVar8, b.C0007b<setSampleExpirationMilliseconds> bVar9, b.C0007b<finalizeBeacons> bVar10, b.C0007b<addLocalRegion> bVar11) {
            this.setMin = bVar;
            this.setMax = bVar2;
            this.getMin = bVar3;
            this.length = bVar4;
            this.getMax = bVar5;
            this.toFloatRange = bVar6;
            this.IsOverlapping = bVar7;
            this.isInside = bVar8;
            this.equals = bVar9;
            this.toIntRange = bVar10;
            this.toString = bVar11;
        }

        public static RecycleBin setMax(b.C0007b<getLeftButton.setMax> bVar, b.C0007b<addBeacon> bVar2, b.C0007b<getTrackingAge> bVar3, b.C0007b<commitMeasurements> bVar4, b.C0007b<markOutside> bVar5, b.C0007b<setVerboseLoggingEnabled> bVar6, b.C0007b<isVerboseLoggingEnabled> bVar7, b.C0007b<getUseTrackingCache> bVar8, b.C0007b<setSampleExpirationMilliseconds> bVar9, b.C0007b<finalizeBeacons> bVar10, b.C0007b<addLocalRegion> bVar11) {
            return new RecycleBin(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11);
        }

        public final /* synthetic */ Object get() {
            return new fillActiveViews(this.setMin.get(), this.setMax.get(), this.getMin.get(), this.length.get(), this.getMax.get(), this.toFloatRange.get(), this.IsOverlapping.get(), this.isInside.get(), this.equals.get(), this.toIntRange.get(), this.toString.get());
        }
    }

    public final /* synthetic */ Object get() {
        getTitleText.length max = this.setMax.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
