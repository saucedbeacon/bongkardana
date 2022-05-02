package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AUHorizontalListView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 82\u00020\u0001:\u00018B\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012,\b\u0002\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\tj\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010 \u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\tj\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\nHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0001\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032,\b\u0002\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\tj\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u001a\u0010(\u001a\u0004\u0018\u00010\u00032\u0006\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020+H\u0002J\u000e\u0010,\u001a\u00020\u00032\u0006\u0010*\u001a\u00020+J\"\u0010-\u001a\u0004\u0018\u00010\u00032\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010*\u001a\u00020+H\u0002J\t\u00102\u001a\u00020/HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u0010*\u001a\u00020+2\u0006\u00105\u001a\u000206J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R5\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\tj\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u00069"}, d2 = {"Lid/dana/social/model/SocialFeedModel;", "", "id", "", "iconUrl", "description", "redirectType", "redirectValue", "extendInfo", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "createdTime", "", "contentType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/Long;Ljava/lang/String;)V", "getContentType", "()Ljava/lang/String;", "getCreatedTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDescription", "getExtendInfo", "()Ljava/util/HashMap;", "getIconUrl", "getId", "getRedirectType", "getRedirectValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/Long;Ljava/lang/String;)Lid/dana/social/model/SocialFeedModel;", "equals", "", "other", "getContentDate", "dateTime", "context", "Landroid/content/Context;", "getFullCreateDateStringFormat", "getSectionText", "diffDay", "", "date", "Ljava/util/Date;", "hashCode", "toFeedRegexData", "Lid/dana/social/utils/FeedRegexData;", "socialFeedListener", "Lid/dana/social/adapter/SocialFeedClickListener;", "toString", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class access$2502 {
    @NotNull
    public static final setMin getMin = new setMin((byte) 0);
    @Nullable
    private final String IsOverlapping;
    @Nullable
    private final String getMax;
    @Nullable
    private final String isInside;
    @Nullable
    public final HashMap<String, String> length;
    @Nullable
    private final String setMax;
    @Nullable
    public final Long setMin;
    @Nullable
    private final String toFloatRange;
    @Nullable
    private final String toIntRange;

    public access$2502() {
        this((byte) 0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof access$2502)) {
            return false;
        }
        access$2502 access_2502 = (access$2502) obj;
        return Intrinsics.areEqual((Object) this.setMax, (Object) access_2502.setMax) && Intrinsics.areEqual((Object) this.getMax, (Object) access_2502.getMax) && Intrinsics.areEqual((Object) this.isInside, (Object) access_2502.isInside) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) access_2502.toFloatRange) && Intrinsics.areEqual((Object) this.toIntRange, (Object) access_2502.toIntRange) && Intrinsics.areEqual((Object) this.length, (Object) access_2502.length) && Intrinsics.areEqual((Object) this.setMin, (Object) access_2502.setMin) && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) access_2502.IsOverlapping);
    }

    public final int hashCode() {
        String str = this.setMax;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.getMax;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.isInside;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.toFloatRange;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.toIntRange;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        HashMap<String, String> hashMap = this.length;
        int hashCode6 = (hashCode5 + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        Long l = this.setMin;
        int hashCode7 = (hashCode6 + (l != null ? l.hashCode() : 0)) * 31;
        String str6 = this.IsOverlapping;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode7 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SocialFeedModel(id=");
        sb.append(this.setMax);
        sb.append(", iconUrl=");
        sb.append(this.getMax);
        sb.append(", description=");
        sb.append(this.isInside);
        sb.append(", redirectType=");
        sb.append(this.toFloatRange);
        sb.append(", redirectValue=");
        sb.append(this.toIntRange);
        sb.append(", extendInfo=");
        sb.append(this.length);
        sb.append(", createdTime=");
        sb.append(this.setMin);
        sb.append(", contentType=");
        sb.append(this.IsOverlapping);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Lid/dana/social/utils/Content;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class length extends FunctionReferenceImpl implements Function1<AUHorizontalListView.SavedState.AnonymousClass1, Unit> {
        length(initContent initcontent) {
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

    public access$2502(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable HashMap<String, String> hashMap, @Nullable Long l, @Nullable String str6) {
        this.setMax = str;
        this.getMax = str2;
        this.isInside = str3;
        this.toFloatRange = str4;
        this.toIntRange = str5;
        this.length = hashMap;
        this.setMin = l;
        this.IsOverlapping = str6;
    }

    public /* synthetic */ access$2502(byte b) {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (HashMap<String, String>) null, (Long) null, (String) null);
    }

    public static String getMin(int i, Date date, Context context) {
        String str;
        String string = context.getResources().getString(R.string.feed_section_today);
        Intrinsics.checkNotNullExpressionValue(string, "context.resources.getStr…tring.feed_section_today)");
        String string2 = context.getResources().getString(R.string.feed_section_yesterday);
        Intrinsics.checkNotNullExpressionValue(string2, "context.resources.getStr…g.feed_section_yesterday)");
        if (i == 0) {
            str = string;
        } else if (i != 1) {
            Locale locale = Locale.getDefault();
            str = new SimpleDateFormat("dd MMMM", locale).format(new Date(date.getTime()));
        } else {
            str = string2;
        }
        if (Intrinsics.areEqual((Object) str, (Object) string) || Intrinsics.areEqual((Object) str, (Object) string2)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        sb.append(String.valueOf(instance.get(1)));
        return sb.toString();
    }

    @NotNull
    public final AUMaskImage setMin(@NotNull Context context, @NotNull initContent initcontent) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(initcontent, "socialFeedListener");
        String str3 = this.setMax;
        String str4 = str3 == null ? "" : str3;
        String str5 = this.isInside;
        if (str5 == null) {
            str = "";
        } else {
            str = str5;
        }
        HashMap<String, String> hashMap = this.length;
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        HashMap<String, String> hashMap2 = hashMap;
        Function1 length2 = new length(initcontent);
        String str6 = this.IsOverlapping;
        if (str6 == null) {
            str2 = "";
        } else {
            str2 = str6;
        }
        return new AUMaskImage(str4, str, hashMap2, length2, context, str2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\nH\u0007J\b\u0010\u000f\u001a\u00020\nH\u0007J\b\u0010\u0010\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lid/dana/social/model/SocialFeedModel$Companion;", "", "()V", "EMPTY_STATE_ITEM", "", "ERROR_STATE_ITEM", "ONBOARDING_ITEM_1", "ONBOARDING_ITEM_2", "ONBOARDING_ITEM_3", "createEmptyStateItem", "Lid/dana/social/model/SocialFeedModel;", "createErrorItem", "createItem", "itemId", "createOnboarding1", "createOnboarding2", "createOnboarding3", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }
}
