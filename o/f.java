package o;

import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import id.dana.nearbyme.di.module.OtherStoreListModule;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import id.dana.nearbyme.model.ShopModel;
import io.split.android.client.dtos.Partition;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import o.OptionMenuRecyclerAdapter;
import o.b;
import o.distanceInfluenceForSnapDuration;
import org.jetbrains.annotations.NotNull;

public final class f implements getAdapterPosition<JsApiStatTrackServiceImpl> {
    private final b.C0007b<onAppResume> apSecurityFacadeProvider;
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<appxLoadFailed> executorProvider;
    private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\r\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\r\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lid/dana/home/view/OnboardingState;", "", "()V", "EddStep", "FaceLoginStep", "ForTestPurposeStep", "GnOnboardingStep", "InterstitialStep", "KycRenewalStep", "NormalTooltipStep", "PaymentSettingStep", "QcbOnboardingStep", "ReferralEngagementStep", "TncStep", "TwilioStep", "UgcStep", "Lid/dana/home/view/OnboardingState$TncStep;", "Lid/dana/home/view/OnboardingState$PaymentSettingStep;", "Lid/dana/home/view/OnboardingState$FaceLoginStep;", "Lid/dana/home/view/OnboardingState$KycRenewalStep;", "Lid/dana/home/view/OnboardingState$TwilioStep;", "Lid/dana/home/view/OnboardingState$EddStep;", "Lid/dana/home/view/OnboardingState$NormalTooltipStep;", "Lid/dana/home/view/OnboardingState$QcbOnboardingStep;", "Lid/dana/home/view/OnboardingState$GnOnboardingStep;", "Lid/dana/home/view/OnboardingState$InterstitialStep;", "Lid/dana/home/view/OnboardingState$UgcStep;", "Lid/dana/home/view/OnboardingState$ReferralEngagementStep;", "Lid/dana/home/view/OnboardingState$ForTestPurposeStep;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.f$2  reason: invalid class name */
    public abstract class AnonymousClass2 {
        private AnonymousClass2() {
        }

        public /* synthetic */ AnonymousClass2(byte b) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lid/dana/home/view/OnboardingState$TncStep;", "Lid/dana/home/view/OnboardingState;", "()V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.f$2$equals */
        public static final class equals extends AnonymousClass2 {
            @NotNull
            public static final equals setMax = new equals();

            private equals() {
                super((byte) 0);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lid/dana/home/view/OnboardingState$PaymentSettingStep;", "Lid/dana/home/view/OnboardingState;", "()V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.f$2$IsOverlapping */
        public static final class IsOverlapping extends AnonymousClass2 {
            @NotNull
            public static final IsOverlapping getMax = new IsOverlapping();

            private IsOverlapping() {
                super((byte) 0);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lid/dana/home/view/OnboardingState$FaceLoginStep;", "Lid/dana/home/view/OnboardingState;", "()V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.f$2$setMin */
        public static final class setMin extends AnonymousClass2 {
            @NotNull
            public static final setMin getMax = new setMin();

            private setMin() {
                super((byte) 0);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lid/dana/home/view/OnboardingState$KycRenewalStep;", "Lid/dana/home/view/OnboardingState;", "()V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.f$2$getMax */
        public static final class getMax extends AnonymousClass2 {
            @NotNull
            public static final getMax getMin = new getMax();

            private getMax() {
                super((byte) 0);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lid/dana/home/view/OnboardingState$TwilioStep;", "Lid/dana/home/view/OnboardingState;", "()V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.f$2$toString */
        public static final class toString extends AnonymousClass2 {
            @NotNull
            public static final toString getMax = new toString();

            private toString() {
                super((byte) 0);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lid/dana/home/view/OnboardingState$EddStep;", "Lid/dana/home/view/OnboardingState;", "()V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.f$2$length */
        public static final class length extends AnonymousClass2 {
            @NotNull
            public static final length length = new length();

            private length() {
                super((byte) 0);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lid/dana/home/view/OnboardingState$NormalTooltipStep;", "Lid/dana/home/view/OnboardingState;", "()V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.f$2$isInside */
        public static final class isInside extends AnonymousClass2 {
            @NotNull
            public static final isInside setMin = new isInside();

            private isInside() {
                super((byte) 0);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lid/dana/home/view/OnboardingState$QcbOnboardingStep;", "Lid/dana/home/view/OnboardingState;", "()V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.f$2$toFloatRange */
        public static final class toFloatRange extends AnonymousClass2 {
            @NotNull
            public static final toFloatRange length = new toFloatRange();

            private toFloatRange() {
                super((byte) 0);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lid/dana/home/view/OnboardingState$GnOnboardingStep;", "Lid/dana/home/view/OnboardingState;", "()V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.f$2$getMin */
        public static final class getMin extends AnonymousClass2 {
            @NotNull
            public static final getMin getMin = new getMin();

            private getMin() {
                super((byte) 0);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lid/dana/home/view/OnboardingState$InterstitialStep;", "Lid/dana/home/view/OnboardingState;", "()V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.f$2$setMax */
        public static final class setMax extends AnonymousClass2 {
            @NotNull
            public static final setMax getMin = new setMax();

            private setMax() {
                super((byte) 0);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lid/dana/home/view/OnboardingState$ReferralEngagementStep;", "Lid/dana/home/view/OnboardingState;", "()V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.f$2$toIntRange */
        public static final class toIntRange extends AnonymousClass2 {
            @NotNull
            public static final toIntRange setMin = new toIntRange();

            private toIntRange() {
                super((byte) 0);
            }
        }
    }

    public f(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        this.rpcConnectorProvider = bVar;
        this.executorProvider = bVar2;
        this.apSecurityFacadeProvider = bVar3;
        this.contextProvider = bVar4;
    }

    /* renamed from: o.f$4  reason: invalid class name */
    public final class AnonymousClass4 implements getAdapterPosition<distanceInfluenceForSnapDuration.setMin> {
        private final OtherStoreListModule getMin;

        public static distanceInfluenceForSnapDuration.setMin getMin(OtherStoreListModule otherStoreListModule) {
            distanceInfluenceForSnapDuration.setMin max = otherStoreListModule.setMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }

        public final /* synthetic */ Object get() {
            distanceInfluenceForSnapDuration.setMin max = this.getMin.setMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0006\u001a\n\u0010\u0007\u001a\u00020\u0004*\u00020\u0006\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0006\u001a\u0010\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\f\u001a\n\u0010\r\u001a\u00020\u000e*\u00020\u0006\u001a\n\u0010\u000f\u001a\u00020\u0010*\u00020\u0002\u001a \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\n*\b\u0012\u0004\u0012\u00020\u00130\n2\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u001a\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\n*\b\u0012\u0004\u0012\u00020\u00180\n\u001a\n\u0010\u0019\u001a\u00020\u001a*\u00020\u001b\u001a\u0010\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\n*\u00020\u001a¨\u0006\u001e"}, d2 = {"distanceToUser", "", "Landroid/location/Location;", "encodeBase64", "", "getDeeplinkUrl", "Lid/dana/nearbyme/model/ShopModel;", "getDeeplinkV2Url", "getDisplayedRating", "getItems", "", "Landroid/net/Uri;", "Landroid/content/ClipData;", "isRatingAndReviewExist", "", "toGoogleLatLng", "Lcom/google/android/gms/maps/model/LatLng;", "toMerchantImageModels", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "Lid/dana/domain/nearbyme/model/MerchantImage;", "type", "", "toMerchantReviewModels", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewModel;", "Lid/dana/domain/nearbyme/model/MerchantReview;", "toMerchantReviewResultModel", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewResultModel;", "Lid/dana/domain/nearbyme/model/MerchantReviews;", "toMerchantReviewViewModel", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewViewModel;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
    /* renamed from: o.f$5  reason: invalid class name */
    public final class AnonymousClass5 {
        @NotNull
        public static final List<MerchantImageModel> setMax(@NotNull List<getUtdid> list, int i) {
            Intrinsics.checkNotNullParameter(list, "$this$toMerchantImageModels");
            Iterable<getUtdid> iterable = list;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (getUtdid getutdid : iterable) {
                arrayList.add(new MerchantImageModel(getutdid.getUserId(), getutdid.getUserName(), getutdid.getAvatar(), getutdid.getImageUrl(), i));
            }
            return (List) arrayList;
        }

        @NotNull
        public static final List<OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1> getMin(@NotNull List<FileCache> list) {
            Intrinsics.checkNotNullParameter(list, "$this$toMerchantReviewModels");
            Iterable<FileCache> iterable = list;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (FileCache fileCache : iterable) {
                arrayList.add(new OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1(fileCache.getUserId(), fileCache.getUserName(), fileCache.getAvatar(), fileCache.getReview(), fileCache.getRating(), fileCache.getModifyDate(), fileCache.getCreatedDate(), setMax(fileCache.getImages(), 0)));
            }
            return (List) arrayList;
        }

        @NotNull
        public static final List<Uri> setMax(@NotNull ClipData clipData) {
            Intrinsics.checkNotNullParameter(clipData, "$this$getItems");
            List<Uri> arrayList = new ArrayList<>();
            int itemCount = clipData.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                ClipData.Item itemAt = clipData.getItemAt(i);
                Intrinsics.checkNotNullExpressionValue(itemAt, "this.getItemAt(i)");
                Uri uri = itemAt.getUri();
                Intrinsics.checkNotNullExpressionValue(uri, "this.getItemAt(i).uri");
                arrayList.add(uri);
            }
            return arrayList;
        }

        @NotNull
        public static final String length(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "$this$encodeBase64");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            byte[] encode = Base64.encode(bytes, 0);
            Intrinsics.checkNotNullExpressionValue(encode, "Base64.encode(toByteArray(), Base64.DEFAULT)");
            return StringsKt.trim((CharSequence) new String(encode, Charsets.UTF_8)).toString();
        }

        @NotNull
        public static final String getMax(@NotNull ShopModel shopModel) {
            Intrinsics.checkNotNullParameter(shopModel, "$this$getDisplayedRating");
            String format = new DecimalFormat("##.0").format(shopModel.create);
            Intrinsics.checkNotNullExpressionValue(format, "DecimalFormat(\"##.0\").format(rating)");
            return StringsKt.replace$default(format, ",", ".", false, 4, (Object) null);
        }

        @NotNull
        public static final List<OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3> setMax(@NotNull OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass2 r4) {
            Intrinsics.checkNotNullParameter(r4, "$this$toMerchantReviewViewModel");
            Iterable<OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1> iterable = r4.getMax;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1 r1 : iterable) {
                OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1.length length = OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1.equals;
                Intrinsics.checkNotNullParameter(r1, "data");
                arrayList.add(new OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3(0, r1));
            }
            return (List) arrayList;
        }

        public static final boolean setMin(@NotNull ShopModel shopModel) {
            Intrinsics.checkNotNullParameter(shopModel, "$this$isRatingAndReviewExist");
            return (shopModel.create == 0.0d || shopModel.onNavigationEvent == 0.0d) ? false : true;
        }
    }

    public final JsApiStatTrackServiceImpl get() {
        return newInstance(this.rpcConnectorProvider.get(), this.executorProvider.get(), this.apSecurityFacadeProvider.get(), this.contextProvider.get());
    }

    public final class a {
        public static long setMin(String str, int i, int i2) {
            return i2 != 2 ? (long) length(str, i) : showCommonDialog.murmurhash3_x86_32(str, 0, str.length(), i);
        }

        private static int length(String str, int i) {
            int i2 = 0;
            for (int i3 = 0; i3 < str.length(); i3++) {
                i2 = (i2 * 31) + str.charAt(i3);
            }
            return i2 ^ i;
        }

        public static boolean length(List<Partition> list) {
            return list.size() == 1 && list.get(0).size == 100;
        }
    }

    public static f create(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        return new f(bVar, bVar2, bVar3, bVar4);
    }

    public static JsApiStatTrackServiceImpl newInstance(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        return new JsApiStatTrackServiceImpl(setisurgentresource, appxloadfailed, onappresume, context);
    }
}
