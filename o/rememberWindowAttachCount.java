package o;

import android.content.Context;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import id.dana.sendmoney.summary.SummaryActivity;
import id.dana.social.model.FeedModel;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AUHorizontalListView;
import o.convertDipToPx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J!\u0010\u0007\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\fH\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J0\u0010\u0014\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0012\u0010\u001e\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u001f\u001a\u00020\bH\u0016J\u0018\u0010 \u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000fH\u0016J\b\u0010\"\u001a\u00020\bH\u0016J\u0010\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020%H\u0016J\u0012\u0010&\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u000fH\u0016J\u0010\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u000fH\u0016J\b\u0010*\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006,"}, d2 = {"Lid/dana/social/tracker/FriendshipMixpanelTracker;", "Lid/dana/social/tracker/FriendshipAnalyticTracker;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "execute", "", "composeEvent", "Lkotlin/Function1;", "Lid/dana/tracker/EventTrackerModel$Builder;", "Lkotlin/ExtensionFunctionType;", "trackFeedActivityOpen", "source", "", "trackFeedCommentAdd", "contentType", "trackFeedOpen", "eventName", "trackFeedRead", "feedHighlightModel", "Lid/dana/social/model/FeedHighlightModel;", "feedModel", "Lid/dana/social/model/FeedModel;", "content", "Lid/dana/social/utils/Content;", "notificationId", "redirectType", "redirectValue", "trackFriendFeedOpen", "trackFriendProfileOpen", "trackFriendshipEmojiAdd", "emojiType", "trackFriendshipNotificationOpen", "trackFriendshipSetPrivacy", "isSharedToFriend", "", "trackMyFeedOpen", "trackOnFollowerModifyRelationship", "active", "trackOnFollowingModifyRelationship", "trackOnFriendshipBottomSheetShow", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class rememberWindowAttachCount implements AUHorizontalListView.SelectionNotifier {
    @NotNull
    public static final setMax getMax = new setMax((byte) 0);
    @NotNull
    private final Context length;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<convertDipToPx.length, Unit> {
        public static final IsOverlapping INSTANCE = new IsOverlapping();

        IsOverlapping() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((convertDipToPx.length) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull convertDipToPx.length length) {
            Intrinsics.checkNotNullParameter(length, "$receiver");
            length.getMax = TrackerKey.Event.FRIENDSHIP_NOTIFICATION_OPEN;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<convertDipToPx.length, Unit> {
        final /* synthetic */ String $contentType;
        final /* synthetic */ String $emojiType;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(String str, String str2) {
            super(1);
            this.$contentType = str;
            this.$emojiType = str2;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((convertDipToPx.length) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull convertDipToPx.length length) {
            Intrinsics.checkNotNullParameter(length, "$receiver");
            length.getMax = TrackerKey.Event.FRIENDSHIP_EMOJI_ADD;
            length.setMax(TrackerKey.NotificationInboxProperty.EMOJI_CONTENT_TYPE, this.$contentType);
            length.setMax(TrackerKey.Property.EMOJI_TYPE, this.$emojiType);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<convertDipToPx.length, Unit> {
        final /* synthetic */ String $eventName;
        final /* synthetic */ String $source;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(String str, String str2) {
            super(1);
            this.$eventName = str;
            this.$source = str2;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((convertDipToPx.length) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull convertDipToPx.length length) {
            Intrinsics.checkNotNullParameter(length, "$receiver");
            length.getMax = this.$eventName;
            length.setMax("Source", this.$source);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<convertDipToPx.length, Unit> {
        final /* synthetic */ String $contentType;
        final /* synthetic */ String $contentTypeKey;
        final /* synthetic */ String $eventName;
        final /* synthetic */ String $notificationId;
        final /* synthetic */ String $redirectType;
        final /* synthetic */ String $redirectValue;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(String str, String str2, String str3, String str4, String str5, String str6) {
            super(1);
            this.$eventName = str;
            this.$notificationId = str2;
            this.$redirectType = str3;
            this.$redirectValue = str4;
            this.$contentTypeKey = str5;
            this.$contentType = str6;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((convertDipToPx.length) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull convertDipToPx.length length) {
            Intrinsics.checkNotNullParameter(length, "$receiver");
            length.getMax = this.$eventName;
            length.setMax(TrackerKey.NotificationInboxProperty.NOTIFICATION_ID, this.$notificationId);
            length.setMax(TrackerKey.NotificationInboxProperty.REDIRECT_TYPE, this.$redirectType);
            length.setMax(TrackerKey.NotificationInboxProperty.REDIRECT_VALUE, this.$redirectValue);
            length.setMax(this.$contentTypeKey, this.$contentType);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<convertDipToPx.length, Unit> {
        final /* synthetic */ boolean $isSharedToFriend;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(boolean z) {
            super(1);
            this.$isSharedToFriend = z;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((convertDipToPx.length) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull convertDipToPx.length length) {
            Intrinsics.checkNotNullParameter(length, "$receiver");
            length.getMax = TrackerKey.Event.FRIENDSHIP_SET_PRIVACY;
            length.setMax(TrackerKey.Property.IS_SHARED_TO_FRIEND, String.valueOf(this.$isSharedToFriend));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<convertDipToPx.length, Unit> {
        final /* synthetic */ String $contentType;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(String str) {
            super(1);
            this.$contentType = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((convertDipToPx.length) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull convertDipToPx.length length) {
            Intrinsics.checkNotNullParameter(length, "$receiver");
            length.getMax = TrackerKey.Event.FRIENDSHIP_FEEDS_COMMENT_ADD;
            length.setMax(TrackerKey.Property.COMMENT_CONTENT_TYPE, this.$contentType);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<convertDipToPx.length, Unit> {
        final /* synthetic */ String $source;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(String str) {
            super(1);
            this.$source = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((convertDipToPx.length) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull convertDipToPx.length length) {
            Intrinsics.checkNotNullParameter(length, "$receiver");
            length.getMax = TrackerKey.Event.FRIENDSHIP_ACTIVITY_OPEN;
            length.setMax("Source", this.$source);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange extends Lambda implements Function1<convertDipToPx.length, Unit> {
        public static final toDoubleRange INSTANCE = new toDoubleRange();

        toDoubleRange() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((convertDipToPx.length) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull convertDipToPx.length length) {
            Intrinsics.checkNotNullParameter(length, "$receiver");
            length.getMax = TrackerKey.Event.FRIENDSHIP_INTRODUCTION_OPEN;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function1<convertDipToPx.length, Unit> {
        final /* synthetic */ String $active;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(String str) {
            super(1);
            this.$active = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((convertDipToPx.length) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull convertDipToPx.length length) {
            Intrinsics.checkNotNullParameter(length, "$receiver");
            length.getMax = TrackerKey.Event.FRIENDSHIP_SET_BLOCK;
            if (Intrinsics.areEqual((Object) this.$active, (Object) "ACTIVE")) {
                length.setMax(TrackerKey.Property.IS_BLOCKED, "false");
            } else {
                length.setMax(TrackerKey.Property.IS_BLOCKED, SummaryActivity.CHECKED);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<convertDipToPx.length, Unit> {
        public static final toIntRange INSTANCE = new toIntRange();

        toIntRange() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((convertDipToPx.length) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull convertDipToPx.length length) {
            Intrinsics.checkNotNullParameter(length, "$receiver");
            length.getMax = TrackerKey.Event.FRIENDSHIP_FRIEND_PROFILE_OPEN;
        }
    }

    @Inject
    public rememberWindowAttachCount(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.length = context;
    }

    public final void getMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
        convertDipToPx.length min = convertDipToPx.length.setMin(this.length);
        Intrinsics.checkNotNullExpressionValue(min, "builder");
        new toFloatRange(str).invoke(min);
        min.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
        List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
    }

    public final void getMin(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "contentType");
        Intrinsics.checkNotNullParameter(str2, "emojiType");
        convertDipToPx.length min = convertDipToPx.length.setMin(this.length);
        Intrinsics.checkNotNullExpressionValue(min, "builder");
        new equals(str, str2).invoke(min);
        min.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
        List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
    }

    public final void getMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
        convertDipToPx.length min = convertDipToPx.length.setMin(this.length);
        Intrinsics.checkNotNullExpressionValue(min, "builder");
        new rememberWindowAttachCount$FastBitmap$CoordinateSystem(str).invoke(min);
        min.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
        List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
    }

    private final void setMax(Function1<? super convertDipToPx.length, Unit> function1) {
        convertDipToPx.length min = convertDipToPx.length.setMin(this.length);
        Intrinsics.checkNotNullExpressionValue(min, "builder");
        function1.invoke(min);
        min.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
        List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
    }

    public final void setMax() {
        setMax((Function1<? super convertDipToPx.length, Unit>) toIntRange.INSTANCE);
    }

    public final void setMin(boolean z) {
        setMax((Function1<? super convertDipToPx.length, Unit>) new isInside(z));
    }

    public final void length(@Nullable String str) {
        CharSequence charSequence = str;
        if (!(charSequence == null || charSequence.length() == 0)) {
            setMax((Function1<? super convertDipToPx.length, Unit>) new getMax(TrackerKey.Event.FRIENDSHIP_FEEDS_OPEN, str));
        }
    }

    public final void getMin() {
        setMax((Function1<? super convertDipToPx.length, Unit>) toDoubleRange.INSTANCE);
    }

    private void setMin(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "notificationId");
        Intrinsics.checkNotNullParameter(str2, "redirectType");
        Intrinsics.checkNotNullParameter(str3, "redirectValue");
        Intrinsics.checkNotNullParameter(str4, IpcMessageConstants.EXTRA_EVENT);
        Intrinsics.checkNotNullParameter(str5, "contentType");
        setMax((Function1<? super convertDipToPx.length, Unit>) new getMin(str4, str, str2, str3, (str4.hashCode() == 1940230501 && str4.equals(TrackerKey.Event.NOTIFICATION_INBOX_READ)) ? TrackerKey.NotificationInboxProperty.CONTENT_TYPE : TrackerKey.Property.FEED_CONTENT_TYPE, str5));
    }

    public final void setMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "source");
        setMax((Function1<? super convertDipToPx.length, Unit>) new setMin(str));
    }

    public final void toFloatRange(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "contentType");
        if (str.length() > 0) {
            setMax((Function1<? super convertDipToPx.length, Unit>) new length(str));
        }
    }

    public final void getMax() {
        setMax((Function1<? super convertDipToPx.length, Unit>) IsOverlapping.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/social/tracker/FriendshipMixpanelTracker$Companion;", "", "()V", "ACTIVE", "", "INACTIVE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public final void setMin(@Nullable String str) {
        if (str != null) {
            setMax((Function1<? super convertDipToPx.length, Unit>) new getMax(TrackerKey.Event.NOTIFICATION_INBOX_OPEN, str));
        }
    }

    public final void length(@NotNull AUHorizontalListView.SavedState.AnonymousClass1 r8, @NotNull String str) {
        Intrinsics.checkNotNullParameter(r8, "content");
        Intrinsics.checkNotNullParameter(str, IpcMessageConstants.EXTRA_EVENT);
        String str2 = r8.setMax;
        String str3 = r8.length;
        String str4 = r8.getMin;
        if (str4 == null) {
            str4 = "";
        }
        setMin(str2, str3, str4, str, r8.setMin);
    }

    public final void length(@NotNull FeedModel feedModel) {
        String str;
        Intrinsics.checkNotNullParameter(feedModel, "feedModel");
        HashMap<String, String> hashMap = feedModel.IsOverlapping;
        if (hashMap != null) {
            String str2 = feedModel.setMin;
            String str3 = hashMap.get("redirectType");
            String str4 = str3 == null ? "" : str3;
            String str5 = hashMap.get("redirectValue");
            if (str5 == null) {
                str5 = "";
            }
            String str6 = feedModel.toIntRange;
            if (str6 == null) {
                str = "";
            } else {
                str = str6;
            }
            setMin(str2, str4, str5, TrackerKey.Event.NOTIFICATION_INBOX_READ, str);
        }
    }

    public final void setMin(@NotNull getContextMenuInfo getcontextmenuinfo) {
        Intrinsics.checkNotNullParameter(getcontextmenuinfo, "feedHighlightModel");
        HashMap<String, String> hashMap = getcontextmenuinfo.getMin;
        String str = getcontextmenuinfo.setMax;
        String str2 = hashMap.get("redirectType");
        String str3 = str2 == null ? "" : str2;
        String str4 = hashMap.get("redirectValue");
        if (str4 == null) {
            str4 = "";
        }
        setMin(str, str3, str4, TrackerKey.Event.NOTIFICATION_INBOX_READ, getcontextmenuinfo.IsOverlapping);
    }
}
