package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AUHorizontalListView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J)\u0010\u001e\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u0007HÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003Jq\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032(\b\u0002\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R:\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006)"}, d2 = {"Lid/dana/social/utils/FeedRegexData;", "", "activityId", "", "textToProcess", "extendInfo", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "onFeedSpanClick", "Lkotlin/Function1;", "Lid/dana/social/utils/Content;", "", "context", "Landroid/content/Context;", "contentType", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lkotlin/jvm/functions/Function1;Landroid/content/Context;Ljava/lang/String;)V", "getActivityId", "()Ljava/lang/String;", "getContentType", "getContext", "()Landroid/content/Context;", "getExtendInfo", "()Ljava/util/HashMap;", "setExtendInfo", "(Ljava/util/HashMap;)V", "getOnFeedSpanClick", "()Lkotlin/jvm/functions/Function1;", "getTextToProcess", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AUMaskImage {
    @NotNull
    final Function1<AUHorizontalListView.SavedState.AnonymousClass1, Unit> getMax;
    @NotNull
    public HashMap<String, String> getMin;
    @NotNull
    final Context length;
    @NotNull
    public final String setMax;
    @NotNull
    final String setMin;
    @NotNull
    final String toIntRange;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AUMaskImage)) {
            return false;
        }
        AUMaskImage aUMaskImage = (AUMaskImage) obj;
        return Intrinsics.areEqual((Object) this.setMin, (Object) aUMaskImage.setMin) && Intrinsics.areEqual((Object) this.setMax, (Object) aUMaskImage.setMax) && Intrinsics.areEqual((Object) this.getMin, (Object) aUMaskImage.getMin) && Intrinsics.areEqual((Object) this.getMax, (Object) aUMaskImage.getMax) && Intrinsics.areEqual((Object) this.length, (Object) aUMaskImage.length) && Intrinsics.areEqual((Object) this.toIntRange, (Object) aUMaskImage.toIntRange);
    }

    public final int hashCode() {
        String str = this.setMin;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.setMax;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        HashMap<String, String> hashMap = this.getMin;
        int hashCode3 = (hashCode2 + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        Function1<AUHorizontalListView.SavedState.AnonymousClass1, Unit> function1 = this.getMax;
        int hashCode4 = (hashCode3 + (function1 != null ? function1.hashCode() : 0)) * 31;
        Context context = this.length;
        int hashCode5 = (hashCode4 + (context != null ? context.hashCode() : 0)) * 31;
        String str3 = this.toIntRange;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode5 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedRegexData(activityId=");
        sb.append(this.setMin);
        sb.append(", textToProcess=");
        sb.append(this.setMax);
        sb.append(", extendInfo=");
        sb.append(this.getMin);
        sb.append(", onFeedSpanClick=");
        sb.append(this.getMax);
        sb.append(", context=");
        sb.append(this.length);
        sb.append(", contentType=");
        sb.append(this.toIntRange);
        sb.append(")");
        return sb.toString();
    }

    public AUMaskImage(@NotNull String str, @NotNull String str2, @NotNull HashMap<String, String> hashMap, @NotNull Function1<? super AUHorizontalListView.SavedState.AnonymousClass1, Unit> function1, @NotNull Context context, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
        Intrinsics.checkNotNullParameter(str2, "textToProcess");
        Intrinsics.checkNotNullParameter(hashMap, "extendInfo");
        Intrinsics.checkNotNullParameter(function1, "onFeedSpanClick");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(str3, "contentType");
        this.setMin = str;
        this.setMax = str2;
        this.getMin = hashMap;
        this.getMax = function1;
        this.length = context;
        this.toIntRange = str3;
    }

    public /* synthetic */ AUMaskImage(String str, String str2, HashMap hashMap, Context context, String str3) {
        this(str, str2, hashMap, AnonymousClass1.INSTANCE, context, str3);
    }
}
