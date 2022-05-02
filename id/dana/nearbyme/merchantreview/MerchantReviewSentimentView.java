package id.dana.nearbyme.merchantreview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.flexbox.FlexboxLayoutManager;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.nearbyme.merchantreview.model.MerchantReviewTagModel;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AndroidWebView;
import o.GriverWebChromeClientExtension;
import o.IMultiInstanceInvalidationCallback;
import o.i;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\u0007H\u0016J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0002\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0002\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lid/dana/nearbyme/merchantreview/MerchantReviewSentimentView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "reviewTagAdapter", "Lid/dana/nearbyme/merchantreview/adapter/MerchantReviewTagAdapter;", "getLayout", "getSelectedTags", "", "Lid/dana/nearbyme/merchantreview/model/MerchantReviewTagModel;", "renderNegativeSentiment", "", "()Lkotlin/Unit;", "renderPositiveSentiment", "setup", "updateSentiment", "sentimentState", "Lid/dana/nearbyme/merchantreview/model/SentimentState;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantReviewSentimentView extends BaseRichView {
    private AndroidWebView.AnonymousClass2 setMax;
    private HashMap setMin;

    @JvmOverloads
    public MerchantReviewSentimentView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.setMin == null) {
            this.setMin = new HashMap();
        }
        View view = (View) this.setMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_merchant_review_sentiment;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MerchantReviewSentimentView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MerchantReviewSentimentView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
    }

    public final void setup() {
        RecyclerView recyclerView;
        Context context = getContext();
        if (context != null && (recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.onDraw)) != null) {
            FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(context);
            flexboxLayoutManager.setFlexDirection(0);
            flexboxLayoutManager.setFlexWrap(1);
            Unit unit = Unit.INSTANCE;
            recyclerView.setLayoutManager(flexboxLayoutManager);
            AndroidWebView.AnonymousClass2 r0 = new IMultiInstanceInvalidationCallback.Stub<i.AnonymousClass1, MerchantReviewTagModel>() {
                @NotNull
                public static final length getMin = new length((byte) 0);
                public final Lazy getMax = LazyKt.lazy(setMax.INSTANCE);

                public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
                    Intrinsics.checkNotNullParameter(viewGroup, "parent");
                    return new Ignore<MerchantReviewTagModel>(viewGroup, new getMin(this)) {
                        public final /* synthetic */ void setMax(
/*
Method generation error in method: o.i.1.setMax(java.lang.Object):void, dex: classes3.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.i.1.setMax(java.lang.Object):void, class status: UNLOADED
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
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
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
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/
                    };
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/LinkedList;", "Lid/dana/nearbyme/merchantreview/model/MerchantReviewTagModel;", "invoke"}, k = 3, mv = {1, 4, 2})
                /* renamed from: o.AndroidWebView$2$setMax */
                static final class setMax extends Lambda implements Function0<LinkedList<MerchantReviewTagModel>> {
                    public static final setMax INSTANCE = new setMax();

                    setMax() {
                        super(0);
                    }

                    @NotNull
                    public final LinkedList<MerchantReviewTagModel> invoke() {
                        return new LinkedList<>();
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/nearbyme/merchantreview/adapter/MerchantReviewTagAdapter$onCreateViewHolder$1", "Lid/dana/nearbyme/merchantreview/MerchantReviewTagListener;", "onTagClick", "", "position", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
                /* renamed from: o.AndroidWebView$2$getMin */
                public static final class getMin implements dispatchWindowFocusChanged {
                    final /* synthetic */ AnonymousClass2 length;

                    getMin(AnonymousClass2 r1) {
                        this.length = r1;
                    }

                    public final void length(int i) {
                        AnonymousClass2.getMax(this.length, i);
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/nearbyme/merchantreview/adapter/MerchantReviewTagAdapter$Companion;", "", "()V", "MAX_TAGS", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
                /* renamed from: o.AndroidWebView$2$length */
                public static final class length {
                    private length() {
                    }

                    public /* synthetic */ length(byte b) {
                        this();
                    }
                }

                public static final /* synthetic */ void getMax(AnonymousClass2 r4, int i) {
                    MerchantReviewTagModel merchantReviewTagModel;
                    MerchantReviewTagModel merchantReviewTagModel2 = (MerchantReviewTagModel) r4.setMin(i);
                    if (merchantReviewTagModel2 != null) {
                        if (merchantReviewTagModel2.setMin()) {
                            ((LinkedList) r4.getMax.getValue()).remove(merchantReviewTagModel2);
                            merchantReviewTagModel2.length = false;
                        } else {
                            if (((LinkedList) r4.getMax.getValue()).size() == 3 && (merchantReviewTagModel = (MerchantReviewTagModel) ((LinkedList) r4.getMax.getValue()).pollFirst()) != null) {
                                merchantReviewTagModel.length = false;
                                List max = r4.getMax();
                                if (max != null) {
                                    r4.notifyItemChanged(max.indexOf(merchantReviewTagModel));
                                    Unit unit = Unit.INSTANCE;
                                }
                            }
                            ((LinkedList) r4.getMax.getValue()).addLast(merchantReviewTagModel2);
                            merchantReviewTagModel2.length = true;
                        }
                        r4.notifyItemChanged(i);
                    }
                }
            };
            this.setMax = r0;
            if (r0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("reviewTagAdapter");
            }
            recyclerView.setAdapter(r0);
        }
    }

    public final void updateSentiment(@NotNull GriverWebChromeClientExtension griverWebChromeClientExtension) {
        List<MerchantReviewTagModel> list;
        Intrinsics.checkNotNullParameter(griverWebChromeClientExtension, "sentimentState");
        AndroidWebView.AnonymousClass2 r0 = this.setMax;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reviewTagAdapter");
        }
        LinkedList<MerchantReviewTagModel> linkedList = (LinkedList) r0.getMax.getValue();
        for (MerchantReviewTagModel merchantReviewTagModel : linkedList) {
            merchantReviewTagModel.length = false;
        }
        linkedList.clear();
        if (griverWebChromeClientExtension instanceof GriverWebChromeClientExtension.getMin) {
            Context context = getContext();
            if (context != null) {
                AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.cleanUpSession);
                if (appCompatTextView != null) {
                    appCompatTextView.setText(context.getString(R.string.merchant_review_positive_title));
                }
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.saveBitmap);
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setText(context.getString(R.string.merchant_review_positive_subtitle));
                }
                Unit unit = Unit.INSTANCE;
            }
            list = ((GriverWebChromeClientExtension.getMin) griverWebChromeClientExtension).setMin;
        } else if (griverWebChromeClientExtension instanceof GriverWebChromeClientExtension.length) {
            Context context2 = getContext();
            if (context2 != null) {
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.cleanUpSession);
                if (appCompatTextView3 != null) {
                    appCompatTextView3.setText(context2.getString(R.string.merchant_review_negative_title));
                }
                AppCompatTextView appCompatTextView4 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.saveBitmap);
                if (appCompatTextView4 != null) {
                    appCompatTextView4.setText(context2.getString(R.string.merchant_review_negative_subtitle));
                }
                Unit unit2 = Unit.INSTANCE;
            }
            list = ((GriverWebChromeClientExtension.length) griverWebChromeClientExtension).setMin;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        r0.getMin(list);
    }

    @NotNull
    public final List<MerchantReviewTagModel> getSelectedTags() {
        AndroidWebView.AnonymousClass2 r0 = this.setMax;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reviewTagAdapter");
        }
        return CollectionsKt.toList((LinkedList) r0.getMax.getValue());
    }
}
