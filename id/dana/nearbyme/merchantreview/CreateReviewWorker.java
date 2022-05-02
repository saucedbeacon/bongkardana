package id.dana.nearbyme.merchantreview;

import android.content.Context;
import androidx.work.ArrayCreatingInputMerger;
import androidx.work.BackoffPolicy;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.contract.deeplink.path.FeatureParams;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.BridgeUtils;
import o.PrepareException;
import o.forThisDevice;
import o.getSerialNumber;
import o.onTextChanged;
import o.setBackgroundDrawable;
import o.updateAppearance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0014¢\u0006\u0002\u0010\u001bJ\f\u0010\u001c\u001a\u00020\u001d*\u00020\u001eH\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fXD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lid/dana/nearbyme/merchantreview/CreateReviewWorker;", "Lid/dana/nearbyme/merchantreview/MerchantReviewWorker;", "", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "createReview", "Lid/dana/domain/nearbyme/interactor/merchantreview/CreateMerchantReview;", "getCreateReview", "()Lid/dana/domain/nearbyme/interactor/merchantreview/CreateMerchantReview;", "setCreateReview", "(Lid/dana/domain/nearbyme/interactor/merchantreview/CreateMerchantReview;)V", "maxRetry", "", "getMaxRetry", "()I", "execute", "Lid/dana/domain/social/Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "injectDependency", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "onSuccess", "Landroidx/work/ListenableWorker$Result;", "data", "(Lkotlin/Unit;)Landroidx/work/ListenableWorker$Result;", "toMerchantReview", "Lid/dana/domain/nearbyme/model/MerchantCreateReview;", "Landroidx/work/Data;", "Companion", "Param", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class CreateReviewWorker extends MerchantReviewWorker<Unit> {
    @NotNull
    public static final setMin setMin = new setMin((byte) 0);
    @Inject
    public BridgeUtils createReview;
    private final int getMax = 3;

    public final /* synthetic */ ListenableWorker.setMax getMax(Object obj) {
        Intrinsics.checkNotNullParameter((Unit) obj, "data");
        ListenableWorker.setMax min = ListenableWorker.setMax.getMin();
        Intrinsics.checkNotNullExpressionValue(min, "Result.success()");
        return min;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateReviewWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(workerParameters, "params");
    }

    /* access modifiers changed from: protected */
    public final int setMax() {
        return this.getMax;
    }

    /* access modifiers changed from: protected */
    public final void setMax(@NotNull PrepareException.AnonymousClass1 r2) {
        Intrinsics.checkNotNullParameter(r2, "applicationComponent");
        r2.getMin(this);
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final Object length(@NotNull Continuation<? super forThisDevice<Unit>> continuation) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String str;
        BridgeUtils bridgeUtils = this.createReview;
        if (bridgeUtils == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createReview");
        }
        updateAppearance inputData = getInputData();
        Intrinsics.checkNotNullExpressionValue(inputData, "inputData");
        Object obj = inputData.setMin.get("review");
        String str2 = null;
        if (obj instanceof String[]) {
            strArr = (String[]) obj;
        } else {
            strArr = null;
        }
        String str3 = strArr != null ? strArr[0] : null;
        String str4 = str3 == null ? "" : str3;
        int[] max = inputData.setMax("rating");
        int i = max != null ? max[0] : 0;
        Object obj2 = inputData.setMin.get("positiveTags");
        if (obj2 instanceof String[]) {
            strArr2 = (String[]) obj2;
        } else {
            strArr2 = null;
        }
        if (strArr2 == null) {
            strArr2 = new String[0];
        }
        List list = ArraysKt.toList((T[]) strArr2);
        Object obj3 = inputData.setMin.get("negativeTags");
        if (obj3 instanceof String[]) {
            strArr3 = (String[]) obj3;
        } else {
            strArr3 = null;
        }
        if (strArr3 == null) {
            strArr3 = new String[0];
        }
        List list2 = ArraysKt.toList((T[]) strArr3);
        Object obj4 = inputData.setMin.get("imageUrl");
        if (obj4 instanceof String[]) {
            strArr4 = (String[]) obj4;
        } else {
            strArr4 = null;
        }
        if (strArr4 == null) {
            strArr4 = new String[0];
        }
        List list3 = ArraysKt.toList((T[]) strArr4);
        Object obj5 = inputData.setMin.get(FeatureParams.SHOP_ID);
        if (obj5 instanceof String[]) {
            strArr5 = (String[]) obj5;
        } else {
            strArr5 = null;
        }
        if (strArr5 != null) {
            str2 = strArr5[0];
        }
        if (str2 == null) {
            str = "";
        } else {
            str = str2;
        }
        boolean[] length = inputData.length("shareToFeed");
        return bridgeUtils.invoke(new getSerialNumber(str4, i, list, list2, list3, str, length != null ? length[0] : false), continuation);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/nearbyme/merchantreview/CreateReviewWorker$Companion;", "", "()V", "KEY_NEGATIVE_TAGS", "", "KEY_POSITIVE_TAGS", "KEY_RATING", "KEY_REVIEW", "KEY_SHARE_TO_FEED", "KEY_SHOP_ID", "invoke", "Landroidx/work/OneTimeWorkRequest;", "param", "Lid/dana/nearbyme/merchantreview/CreateReviewWorker$Param;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }

        @NotNull
        public static setBackgroundDrawable setMax(@NotNull getMin getmin) {
            Intrinsics.checkNotNullParameter(getmin, "param");
            setBackgroundDrawable.getMin getmin2 = (setBackgroundDrawable.getMin) new setBackgroundDrawable.getMin(CreateReviewWorker.class).length(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
            getmin2.setMin.length = ArrayCreatingInputMerger.class.getName();
            updateAppearance.getMin getmin3 = new updateAppearance.getMin();
            getmin3.length.put("review", getmin.setMin);
            getmin3.length.put("rating", Integer.valueOf(getmin.getMax));
            Object[] array = getmin.length.toArray(new String[0]);
            if (array != null) {
                getmin3.length.put("positiveTags", (String[]) array);
                Object[] array2 = getmin.getMin.toArray(new String[0]);
                if (array2 != null) {
                    getmin3.length.put("negativeTags", (String[]) array2);
                    getmin3.length.put(FeatureParams.SHOP_ID, getmin.setMax);
                    getmin3.length.put("shareToFeed", Boolean.valueOf(getmin.toIntRange));
                    updateAppearance updateappearance = new updateAppearance((Map<String, ?>) getmin3.length);
                    updateAppearance.setMax(updateappearance);
                    Intrinsics.checkNotNullExpressionValue(updateappearance, "Data.Builder()\n         …eed)\n            .build()");
                    getmin2.setMin.setMin = updateappearance;
                    onTextChanged min = ((setBackgroundDrawable.getMin) getmin2.getMax()).setMin();
                    Intrinsics.checkNotNullExpressionValue(min, "OneTimeWorkRequest.Build…\n                .build()");
                    return (setBackgroundDrawable) min;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\u0006\u0010!\u001a\u00020\"J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006$"}, d2 = {"Lid/dana/nearbyme/merchantreview/CreateReviewWorker$Param;", "", "review", "", "rating", "", "positiveTags", "", "negativeTags", "shopId", "shareToFeed", "", "(Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Z)V", "getNegativeTags", "()Ljava/util/List;", "getPositiveTags", "getRating", "()I", "getReview", "()Ljava/lang/String;", "getShareToFeed", "()Z", "getShopId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toInputData", "Landroidx/work/Data;", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        final int getMax;
        @NotNull
        final List<String> getMin;
        @NotNull
        final List<String> length;
        @NotNull
        final String setMax;
        @NotNull
        final String setMin;
        final boolean toIntRange;

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMin)) {
                return false;
            }
            getMin getmin = (getMin) obj;
            return Intrinsics.areEqual((Object) this.setMin, (Object) getmin.setMin) && this.getMax == getmin.getMax && Intrinsics.areEqual((Object) this.length, (Object) getmin.length) && Intrinsics.areEqual((Object) this.getMin, (Object) getmin.getMin) && Intrinsics.areEqual((Object) this.setMax, (Object) getmin.setMax) && this.toIntRange == getmin.toIntRange;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Param(review=");
            sb.append(this.setMin);
            sb.append(", rating=");
            sb.append(this.getMax);
            sb.append(", positiveTags=");
            sb.append(this.length);
            sb.append(", negativeTags=");
            sb.append(this.getMin);
            sb.append(", shopId=");
            sb.append(this.setMax);
            sb.append(", shareToFeed=");
            sb.append(this.toIntRange);
            sb.append(")");
            return sb.toString();
        }

        public getMin(@NotNull String str, int i, @NotNull List<String> list, @NotNull List<String> list2, @NotNull String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "review");
            Intrinsics.checkNotNullParameter(list, "positiveTags");
            Intrinsics.checkNotNullParameter(list2, "negativeTags");
            Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
            this.setMin = str;
            this.getMax = i;
            this.length = list;
            this.getMin = list2;
            this.setMax = str2;
            this.toIntRange = z;
        }

        public final int hashCode() {
            String str = this.setMin;
            int i = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.getMax).hashCode()) * 31;
            List<String> list = this.length;
            int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            List<String> list2 = this.getMin;
            int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
            String str2 = this.setMax;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int i2 = (hashCode3 + i) * 31;
            boolean z = this.toIntRange;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }
    }
}
