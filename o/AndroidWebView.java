package o;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import dagger.internal.InjectedFieldSignature;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.nearbyme.merchantreview.UploadImageWorker;
import id.dana.nearbyme.merchantreview.model.MerchantConsultReviewModel;
import id.dana.nearbyme.merchantreview.model.MerchantReviewDialogDismissState;
import id.dana.nearbyme.merchantreview.model.MerchantReviewTagModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.GriverWebChromeClientExtension;
import o.IMultiInstanceInvalidationCallback;
import o.j;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lid/dana/nearbyme/merchantreview/MerchantReviewFormPresenter;", "Lid/dana/nearbyme/merchantreview/MerchantReviewFormContract$Presenter;", "saveLastTimeMerchantReviewFormShown", "Lid/dana/domain/nearbyme/interactor/merchantreview/SaveLastTimeMerchantReviewFormShown;", "saveDismissedMerchantReviewForm", "Lid/dana/domain/nearbyme/interactor/merchantreview/SaveDismissedMerchantReviewForm;", "saveShareFeedConsent", "Lid/dana/domain/social/interactor/SaveShareFeedConsent;", "(Lid/dana/domain/nearbyme/interactor/merchantreview/SaveLastTimeMerchantReviewFormShown;Lid/dana/domain/nearbyme/interactor/merchantreview/SaveDismissedMerchantReviewForm;Lid/dana/domain/social/interactor/SaveShareFeedConsent;)V", "saveLastTimeMerchantReviewShown", "", "saveMerchantDismissed", "shopId", "", "setShareToFeedConfig", "activate", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AndroidWebView implements j.AnonymousClass1.length {
    @NotNull
    public static final setMax getMax = new setMax((byte) 0);
    private final CommonUtils length;
    private final isAppPermissionOPen setMax;
    private final getBeacons setMin;

    @JvmDefault
    public final void setMax() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lid/dana/nearbyme/merchantreview/adapter/MerchantReviewPhotosAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/nearbyme/merchantreview/viewholder/MerchantReviewPhotosViewHolder;", "Landroid/net/Uri;", "()V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class b extends IMultiInstanceInvalidationCallback.Stub<setAndroidWebView, Uri> {
        public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(2014963410, oncanceled);
                onCancelLoad.getMin(2014963410, oncanceled);
            }
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
            setAndroidWebView setandroidwebview = new setAndroidWebView(viewGroup);
            View view = setandroidwebview.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            ((CircleImageView) view.findViewById(resetInternal.setMax.createImageView)).setOnClickListener(new setMin(setandroidwebview, this));
            return setandroidwebview;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/nearbyme/merchantreview/adapter/MerchantReviewPhotosAdapter$onCreateViewHolder$1$1"}, k = 3, mv = {1, 4, 2})
        static final class setMin implements View.OnClickListener {
            final /* synthetic */ setAndroidWebView length;
            final /* synthetic */ b setMin;

            setMin(setAndroidWebView setandroidwebview, b bVar) {
                this.length = setandroidwebview;
                this.setMin = bVar;
            }

            public final void onClick(View view) {
                this.setMin.getMax(this.length.getAdapterPosition());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010-\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0016H\u0002J\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0/J\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000b0/J\u0016\u00101\u001a\u00020\u000b2\f\u00102\u001a\b\u0012\u0004\u0012\u0002030/H\u0002J\u0006\u00104\u001a\u000205J\u0014\u00106\u001a\u0002072\f\u00102\u001a\b\u0012\u0004\u0012\u0002030/J\u0010\u00108\u001a\u00020$2\u0006\u0010\u0014\u001a\u00020\u0016H\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u001dR(\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00070\u00070\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0019\"\u0004\b \u0010!R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010\rR\u0011\u0010)\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010\rR\u0011\u0010+\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b,\u0010\r¨\u00069"}, d2 = {"Lid/dana/nearbyme/merchantreview/MerchantReviewViewState;", "", "merchantConsultReviewModel", "Lid/dana/nearbyme/merchantreview/model/MerchantConsultReviewModel;", "(Lid/dana/nearbyme/merchantreview/model/MerchantConsultReviewModel;)V", "allowSubmit", "Landroidx/lifecycle/MediatorLiveData;", "", "getAllowSubmit", "()Landroidx/lifecycle/MediatorLiveData;", "avatarUrl", "", "getAvatarUrl", "()Ljava/lang/String;", "dismissState", "Lid/dana/nearbyme/merchantreview/model/MerchantReviewDialogDismissState;", "getDismissState", "()Lid/dana/nearbyme/merchantreview/model/MerchantReviewDialogDismissState;", "setDismissState", "(Lid/dana/nearbyme/merchantreview/model/MerchantReviewDialogDismissState;)V", "rating", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getRating", "()Landroidx/lifecycle/MutableLiveData;", "review", "getReview", "setReview", "(Ljava/lang/String;)V", "reviewExceedsMaximumCount", "getReviewExceedsMaximumCount", "setReviewExceedsMaximumCount", "(Landroidx/lifecycle/MutableLiveData;)V", "sentiment", "Landroidx/lifecycle/LiveData;", "Lid/dana/nearbyme/merchantreview/model/SentimentState;", "getSentiment", "()Landroidx/lifecycle/LiveData;", "shopId", "getShopId", "shopName", "getShopName", "transactionDate", "getTransactionDate", "checkAllowSubmit", "getNegativeTags", "", "getPositiveTags", "getSelectedTagForAnalytic", "selectedTags", "Lid/dana/nearbyme/merchantreview/model/MerchantReviewTagModel;", "resetTags", "", "submitAnalyticModel", "Lid/dana/nearbyme/merchantreview/model/MerchantReviewFormAnalyticModel;", "updateSentiment", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class a {
        @NotNull
        public final onRestoreInstanceState<Boolean> equals;
        @NotNull
        public final LiveData<GriverWebChromeClientExtension> getMax;
        @NotNull
        public MerchantReviewDialogDismissState getMin = MerchantReviewDialogDismissState.EMPTY;
        @NotNull
        public String length;
        @NotNull
        public final CascadingMenuPopup$HorizPosition<Integer> setMax;
        @NotNull
        public CascadingMenuPopup$HorizPosition<Boolean> setMin;
        public final MerchantConsultReviewModel toFloatRange;

        /* access modifiers changed from: private */
        public static boolean getMax(boolean z, int i) {
            return !z && i > 0;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "reviewExceedsMaximumCount", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V", "id/dana/nearbyme/merchantreview/MerchantReviewViewState$allowSubmit$1$2"}, k = 3, mv = {1, 4, 2})
        static final class getMax<T> implements onMeasure<Boolean> {
            final /* synthetic */ onRestoreInstanceState length;
            final /* synthetic */ a setMax;

            getMax(onRestoreInstanceState onrestoreinstancestate, a aVar) {
                this.length = onrestoreinstancestate;
                this.setMax = aVar;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                Boolean bool = (Boolean) obj;
                onRestoreInstanceState onrestoreinstancestate = this.length;
                Intrinsics.checkNotNullExpressionValue(bool, "reviewExceedsMaximumCount");
                boolean booleanValue = bool.booleanValue();
                Object obj2 = this.setMax.setMax.setMin;
                if (obj2 == LiveData.setMax) {
                    obj2 = null;
                }
                Integer num = (Integer) obj2;
                if (num == null) {
                    num = 0;
                }
                Intrinsics.checkNotNullExpressionValue(num, "rating.value ?: 0");
                onrestoreinstancestate.getMax(Boolean.valueOf(a.getMax(booleanValue, num.intValue())));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "rating", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V", "id/dana/nearbyme/merchantreview/MerchantReviewViewState$allowSubmit$1$1"}, k = 3, mv = {1, 4, 2})
        static final class setMin<T> implements onMeasure<Integer> {
            final /* synthetic */ a getMin;
            final /* synthetic */ onRestoreInstanceState setMin;

            setMin(onRestoreInstanceState onrestoreinstancestate, a aVar) {
                this.setMin = onrestoreinstancestate;
                this.getMin = aVar;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                Integer num = (Integer) obj;
                onRestoreInstanceState onrestoreinstancestate = this.setMin;
                Object obj2 = this.getMin.setMin.setMin;
                if (obj2 == LiveData.setMax) {
                    obj2 = null;
                }
                Boolean bool = (Boolean) obj2;
                if (bool == null) {
                    bool = Boolean.FALSE;
                }
                Intrinsics.checkNotNullExpressionValue(bool, "reviewExceedsMaximumCount.value?: false");
                boolean booleanValue = bool.booleanValue();
                Intrinsics.checkNotNullExpressionValue(num, "rating");
                onrestoreinstancestate.getMax(Boolean.valueOf(a.getMax(booleanValue, num.intValue())));
            }
        }

        public a(@NotNull MerchantConsultReviewModel merchantConsultReviewModel) {
            Intrinsics.checkNotNullParameter(merchantConsultReviewModel, "merchantConsultReviewModel");
            this.toFloatRange = merchantConsultReviewModel;
            CascadingMenuPopup$HorizPosition<Integer> cascadingMenuPopup$HorizPosition = new CascadingMenuPopup$HorizPosition<>(0);
            this.setMax = cascadingMenuPopup$HorizPosition;
            onRestoreInstanceState onrestoreinstancestate = new onRestoreInstanceState();
            onrestoreinstancestate.setMax(cascadingMenuPopup$HorizPosition, new onMeasure<X>(onrestoreinstancestate, new length(this)) {
                final /* synthetic */ next getMax;
                final /* synthetic */ onRestoreInstanceState setMin;

                public final void onChanged(
/*
Method generation error in method: o.ExpandedMenuView.3.onChanged(java.lang.Object):void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.ExpandedMenuView.3.onChanged(java.lang.Object):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
            Intrinsics.checkExpressionValueIsNotNull(onrestoreinstancestate, "Transformations.map(this) { transform(it) }");
            this.getMax = onrestoreinstancestate;
            this.length = "";
            this.setMin = new CascadingMenuPopup$HorizPosition<>(Boolean.FALSE);
            onRestoreInstanceState<Boolean> onrestoreinstancestate2 = new onRestoreInstanceState<>();
            onrestoreinstancestate2.setMax(this.setMax, new setMin(onrestoreinstancestate2, this));
            onrestoreinstancestate2.setMax(this.setMin, new getMax(onrestoreinstancestate2, this));
            Unit unit = Unit.INSTANCE;
            this.equals = onrestoreinstancestate2;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0004\n\u0002\b\b\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "Y", "X", "it", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "androidx/lifecycle/TransformationsKt$map$1"}, k = 3, mv = {1, 4, 2})
        public static final class length<I, O> implements next<Integer, GriverWebChromeClientExtension> {
            final /* synthetic */ a getMin;

            public length(a aVar) {
                this.getMin = aVar;
            }

            public final GriverWebChromeClientExtension length(Integer num) {
                int intValue = num.intValue();
                a aVar = this.getMin;
                if (intValue == 4 || intValue == 5) {
                    return new GriverWebChromeClientExtension.getMin(aVar.toFloatRange.getMin);
                }
                return new GriverWebChromeClientExtension.length(aVar.toFloatRange.length);
            }
        }

        @NotNull
        public final List<String> getMin() {
            Collection arrayList = new ArrayList();
            for (Object next : this.toFloatRange.getMin) {
                if (((MerchantReviewTagModel) next).setMin()) {
                    arrayList.add(next);
                }
            }
            Iterable<MerchantReviewTagModel> iterable = (List) arrayList;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (MerchantReviewTagModel merchantReviewTagModel : iterable) {
                arrayList2.add(merchantReviewTagModel.getMax);
            }
            return (List) arrayList2;
        }

        @NotNull
        public final List<String> length() {
            Collection arrayList = new ArrayList();
            for (Object next : this.toFloatRange.length) {
                if (((MerchantReviewTagModel) next).setMin()) {
                    arrayList.add(next);
                }
            }
            Iterable<MerchantReviewTagModel> iterable = (List) arrayList;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (MerchantReviewTagModel merchantReviewTagModel : iterable) {
                arrayList2.add(merchantReviewTagModel.getMax);
            }
            return (List) arrayList2;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/nearbyme/merchantreview/model/MerchantReviewTagModel;", "invoke"}, k = 3, mv = {1, 4, 2})
        public static final class getMin extends Lambda implements Function1<MerchantReviewTagModel, CharSequence> {
            public static final getMin INSTANCE = new getMin();

            getMin() {
                super(1);
            }

            @NotNull
            public final CharSequence invoke(@NotNull MerchantReviewTagModel merchantReviewTagModel) {
                Intrinsics.checkNotNullParameter(merchantReviewTagModel, "it");
                return merchantReviewTagModel.getMax;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<Exception, Unit> {
        public static final equals INSTANCE = new equals();

        equals() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.SHARE_TO_FEEDS_TAG, exc.getMessage(), exc);
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
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            updateActionSheetContent.e("Nearby", message, exc);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Boolean, Unit> {
        public static final getMin INSTANCE = new getMin();

        getMin() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            updateActionSheetContent.d("Nearby", "Success save dismissed merchant");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Boolean, Unit> {
        public static final length INSTANCE = new length();

        length() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            updateActionSheetContent.d("Nearby", "Success save last time merchant review");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<Exception, Unit> {
        public static final setMin INSTANCE = new setMin();

        setMin() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "it");
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            updateActionSheetContent.e("Nearby", message, exc);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<Unit, Unit> {
        public static final toIntRange INSTANCE = new toIntRange();

        toIntRange() {
            super(1);
        }

        public final void invoke(@NotNull Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "it");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Unit) obj);
            return Unit.INSTANCE;
        }
    }

    @Inject
    public AndroidWebView(@NotNull isAppPermissionOPen isapppermissionopen, @NotNull CommonUtils commonUtils, @NotNull getBeacons getbeacons) {
        Intrinsics.checkNotNullParameter(isapppermissionopen, "saveLastTimeMerchantReviewFormShown");
        Intrinsics.checkNotNullParameter(commonUtils, "saveDismissedMerchantReviewForm");
        Intrinsics.checkNotNullParameter(getbeacons, "saveShareFeedConsent");
        this.setMax = isapppermissionopen;
        this.length = commonUtils;
        this.setMin = getbeacons;
    }

    public final void getMax() {
        this.setMax.execute(Long.valueOf(System.currentTimeMillis()), length.INSTANCE, getMax.INSTANCE);
    }

    public final class EmbedViewRenderCallback implements getBindingAdapter<UploadImageWorker> {
        @InjectedFieldSignature("id.dana.nearbyme.merchantreview.UploadImageWorker.uploadImage")
        public static void length(UploadImageWorker uploadImageWorker, getMac getmac) {
            uploadImageWorker.uploadImage = getmac;
        }
    }

    public final void getMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, FeatureParams.SHOP_ID);
        this.length.execute(str, getMin.INSTANCE, setMin.INSTANCE);
    }

    public final void setMin() {
        this.setMin.execute(Boolean.TRUE, toIntRange.INSTANCE, equals.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/nearbyme/merchantreview/MerchantReviewFormPresenter$Companion;", "", "()V", "SUCCESS_SAVE_DISMISS_MERCHANT", "", "SUCCESS_SAVE_LAST_TIME", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }
}
