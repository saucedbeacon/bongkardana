package id.dana.nearbyme.summary;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.OnClick;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.danah5.DanaH5;
import id.dana.data.constant.UrlTag;
import id.dana.nearbyme.NearbyMeActivity;
import id.dana.nearbyme.model.ShopModel;
import id.dana.nearbyme.summary.NearbyMeSummaryFragment;
import id.dana.tracker.mixpanel.TopupSource;
import o.CornerMarkingDataProvider;
import o.DeviceManifest;
import o.FtsOptions$Order;
import o.IntRange;
import o.Popup;
import o.PrepareException;
import o.RewriteQueriesToDropUnusedColumns;
import o.connectWithSSL;
import o.evaluate;
import o.getInsetDodgeRect;
import o.hotUpdateApp;
import o.n;
import o.q;
import o.setActionOn;
import o.setH5MenuList;
import o.setH5OptionMenuTextFlag;
import o.stopIgnoring;
import o.updateCornerMarking;

public class NearbyMeSummaryFragment extends FtsOptions$Order {
    @BindView(2131362144)
    Button btnTopUp;
    @BindView(2131362466)
    ConstraintLayout clNearbyMeEmpty;
    @BindView(2131362469)
    ConstraintLayout clNearbyMeNormal;
    @BindView(2131362508)
    ViewGroup clRibbonContainer;
    @BindView(2131362759)
    View dividerPromoRibbon;
    private boolean equals;
    private ShopModel getMin;
    private String isInside;
    @BindView(2131363422)
    ImageView ivEmptyImage;
    @BindView(2131363647)
    ImageView ivStoreImage;
    @BindView(2131363667)
    ImageView ivViewNearbyMeSummaryInfoIcon;
    @BindView(2131363960)
    LottieAnimationView lottieNearbyRibbon;
    private int setMax = 0;
    private boolean setMin;
    private connectWithSSL toIntRange;
    @BindView(2131365193)
    TextView tvDescription;
    @BindView(2131365223)
    TextView tvEmptyDescription;
    @BindView(2131365234)
    TextView tvEmptyTitle;
    @BindView(2131365354)
    TextView tvMerchantSubCategory;
    @BindView(2131365527)
    TextView tvRibbonLineBottom;
    @BindView(2131365528)
    TextView tvRibbonLineTop;
    @BindView(2131365576)
    TextView tvStoreDistance;
    @BindView(2131365577)
    TextView tvStoreName;

    public final int setMin() {
        return R.layout.view_nearby_me_summary;
    }

    public static NearbyMeSummaryFragment getMax(int i, ShopModel shopModel) {
        NearbyMeSummaryFragment nearbyMeSummaryFragment = new NearbyMeSummaryFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("PAGE_POSITION_ON_ADAPTER", i);
        bundle.putParcelable("MERCHANT_PARCELABLE", shopModel);
        bundle.putBoolean("EMPTY_MERCHANT", false);
        bundle.putBoolean("LOADING_VIEW", false);
        nearbyMeSummaryFragment.setArguments(bundle);
        return nearbyMeSummaryFragment;
    }

    public static NearbyMeSummaryFragment getMax() {
        NearbyMeSummaryFragment nearbyMeSummaryFragment = new NearbyMeSummaryFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("EMPTY_MERCHANT_ON_ERROR", false);
        bundle.putBoolean("EMPTY_MERCHANT", true);
        bundle.putBoolean("LOADING_VIEW", false);
        nearbyMeSummaryFragment.setArguments(bundle);
        return nearbyMeSummaryFragment;
    }

    public static NearbyMeSummaryFragment equals() {
        NearbyMeSummaryFragment nearbyMeSummaryFragment = new NearbyMeSummaryFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("EMPTY_MERCHANT_ON_ERROR", true);
        bundle.putBoolean("EMPTY_MERCHANT", true);
        bundle.putBoolean("LOADING_VIEW", false);
        nearbyMeSummaryFragment.setArguments(bundle);
        return nearbyMeSummaryFragment;
    }

    public static NearbyMeSummaryFragment toDoubleRange() {
        NearbyMeSummaryFragment nearbyMeSummaryFragment = new NearbyMeSummaryFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("EMPTY_MERCHANT", false);
        bundle.putBoolean("LOADING_VIEW", true);
        nearbyMeSummaryFragment.setArguments(bundle);
        return nearbyMeSummaryFragment;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (setMax(getArguments())) {
            this.getMin = (ShopModel) getArguments().getParcelable("MERCHANT_PARCELABLE");
            this.setMax = getArguments().getInt("PAGE_POSITION_ON_ADAPTER", 0);
        }
        if (bundle != null) {
            this.setMin = bundle.getBoolean("SAVED_INSTANCE_KEY_DONE_PLAYING", false);
        }
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        bundle.putBoolean("SAVED_INSTANCE_KEY_DONE_PLAYING", this.setMin);
        super.onSaveInstanceState(bundle);
    }

    public final void o_() {
        super.o_();
        ShopModel shopModel = this.getMin;
        if (shopModel != null) {
            getMax(shopModel.equals(), true);
        }
    }

    private static boolean setMax(Bundle bundle) {
        return bundle != null && !bundle.getBoolean("EMPTY_MERCHANT") && !bundle.getBoolean("LOADING_VIEW");
    }

    private void values() {
        String str;
        if (this.tvRibbonLineTop != null) {
            ShopModel shopModel = this.getMin;
            if (shopModel.equals()) {
                str = shopModel.Mean$Arithmetic.get(0).length;
            } else {
                str = "";
            }
            this.tvRibbonLineTop.setText(CornerMarkingDataProvider.AnonymousClass3.setMin(getContext(), str, str));
        }
        if (this.tvRibbonLineBottom != null) {
            this.tvRibbonLineBottom.setText(this.getMin.IsOverlapping());
        }
    }

    private void getMax(boolean z, boolean z2) {
        long j = z2 ? 0 : 150;
        int i = 0;
        this.clRibbonContainer.setVisibility(z ? 0 : 8);
        View view = this.dividerPromoRibbon;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
        if (z) {
            values();
            LottieAnimationView lottieAnimationView = this.lottieNearbyRibbon;
            if (lottieAnimationView == null || this.setMin) {
                setMin(true);
            } else {
                lottieAnimationView.postDelayed(new q(this), j);
            }
            this.equals = true;
        }
    }

    private void setMin(boolean z) {
        if (!Grayscale$Algorithm()) {
            if (z) {
                this.tvRibbonLineTop.setAlpha(1.0f);
                this.tvRibbonLineBottom.setAlpha(1.0f);
                this.ivViewNearbyMeSummaryInfoIcon.setAlpha(1.0f);
                this.setMin = true;
                return;
            }
            this.tvRibbonLineTop.postDelayed(new DeviceManifest(this), 350);
        }
    }

    private boolean Grayscale$Algorithm() {
        return this.tvRibbonLineTop == null || this.tvRibbonLineBottom == null || this.ivViewNearbyMeSummaryInfoIcon == null;
    }

    @OnClick({2131362144})
    public void onTopUpClicked() {
        DanaH5.startContainerFullUrl(this.isInside);
    }

    @OnClick({2131362074})
    public void onDirectionClicked() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format(getContext().getString(R.string.google_navigation_uri), new Object[]{String.valueOf(this.getMin.values), String.valueOf(this.getMin.toString)})));
        intent.setPackage("com.google.android.apps.maps");
        if (setActionOn.getMin(getContext(), intent)) {
            startActivity(intent);
        }
    }

    public final boolean FastBitmap$CoordinateSystem() {
        return this.equals;
    }

    public final void setMax() {
        ShopModel shopModel;
        PrepareException.AnonymousClass1 r2;
        if (this.toIntRange == null) {
            hotUpdateApp.getMin getmin = new hotUpdateApp.getMin((byte) 0);
            if (this.getMax != null) {
                r2 = this.getMax.getApplicationComponent();
            } else {
                r2 = null;
            }
            if (r2 != null) {
                getmin.getMax = r2;
                stopIgnoring.setMin(getmin.getMax, PrepareException.AnonymousClass1.class);
                this.toIntRange = new hotUpdateApp();
            } else {
                throw null;
            }
        }
        if (getArguments() == null) {
            return;
        }
        if (!setMax(getArguments()) || (shopModel = this.getMin) == null) {
            if (getArguments().getBoolean("LOADING_VIEW")) {
                getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(this.clNearbyMeNormal);
                setmax.getMax = R.layout.view_nearby_me_summary_skeleton;
                setmax.setMax = 1500;
                setmax.length = true;
                setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
                setmax.isInside = 0;
                new getInsetDodgeRect(setmax, (byte) 0).getMin();
                return;
            }
            if (getArguments() != null && getArguments().getBoolean("EMPTY_MERCHANT_ON_ERROR")) {
                this.ivEmptyImage.setImageResource(R.drawable.ic_bad_internet_connection);
                this.tvEmptyTitle.setText(R.string.nearby_me_error_title);
                this.tvEmptyDescription.setText(R.string.nearby_me_error_description);
            }
            this.clNearbyMeNormal.setVisibility(8);
            this.clNearbyMeEmpty.setVisibility(0);
        } else if (shopModel != null) {
            if (shopModel.equals()) {
                values();
                if (this.setMax == 0 || getUserVisibleHint()) {
                    getMax(true, false);
                }
            }
            this.lottieNearbyRibbon.setOnClickListener(new n(this));
            String length = shopModel.length();
            this.tvStoreName.setText(shopModel.invoke);
            if (!TextUtils.isEmpty(length)) {
                this.tvMerchantSubCategory.setText(length);
            } else {
                this.tvMerchantSubCategory.setVisibility(8);
            }
            this.tvDescription.setText(shopModel.setMax().setMin);
            this.tvStoreDistance.setText(setH5MenuList.length(getContext(), shopModel.toFloatRange));
            String str = shopModel.hashCode;
            if (RewriteQueriesToDropUnusedColumns.setMax(str)) {
                RewriteQueriesToDropUnusedColumns.getMax getmax = new RewriteQueriesToDropUnusedColumns.getMax(getContext(), (byte) 0);
                getmax.getMin = str;
                getmax.setMax = R.drawable.marker_placeholder;
                getmax.setMin = this.ivStoreImage;
                new RewriteQueriesToDropUnusedColumns(getmax, (byte) 0);
            } else {
                Popup.setMin(str, this.ivStoreImage, new Popup.getMax(this, str) {
                    private final NearbyMeSummaryFragment getMin;
                    private final String setMin;

                    public final void setMin(
/*
Method generation error in method: o.b.5.1.setMin(java.lang.String, android.widget.ImageView):void, dex: classes6.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.b.5.1.setMin(java.lang.String, android.widget.ImageView):void, class status: UNLOADED
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
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
                });
            }
            if (shopModel.getMin()) {
                this.btnTopUp.setVisibility(0);
                this.isInside = setH5OptionMenuTextFlag.setMin("https://m.dana.id/m/portal/topup?entryPoint={entryPoint}&payMethod=OTC&instId={instId}&fromSKW=true").getMin(UrlTag.INSTID, shopModel.toDoubleRange).getMin(UrlTag.ENTRY_POINT, TopupSource.NEARBY).getMax();
                return;
            }
            this.btnTopUp.setVisibility(8);
        }
    }

    public static /* synthetic */ void getMax(NearbyMeSummaryFragment nearbyMeSummaryFragment) {
        TextView textView = nearbyMeSummaryFragment.tvRibbonLineTop;
        if (textView != null) {
            textView.animate().alpha(1.0f).start();
        }
        TextView textView2 = nearbyMeSummaryFragment.tvRibbonLineBottom;
        if (textView2 != null) {
            textView2.animate().alpha(1.0f).start();
        }
        ImageView imageView = nearbyMeSummaryFragment.ivViewNearbyMeSummaryInfoIcon;
        if (imageView != null) {
            imageView.animate().alpha(1.0f).start();
        }
        nearbyMeSummaryFragment.setMin = true;
    }

    public static /* synthetic */ void getMin(NearbyMeSummaryFragment nearbyMeSummaryFragment) {
        if (nearbyMeSummaryFragment.getActivity() != null) {
            ((NearbyMeActivity) nearbyMeSummaryFragment.getActivity()).showPromoBottomSheet(nearbyMeSummaryFragment.getMin.Mean$Arithmetic);
        }
    }

    public static /* synthetic */ void setMax(NearbyMeSummaryFragment nearbyMeSummaryFragment, String str) {
        if (nearbyMeSummaryFragment.isAdded()) {
            ((updateCornerMarking) Glide.setMin(nearbyMeSummaryFragment.getActivity())).setMax(str).setMax(evaluate.setMin).setMax((int) R.drawable.marker_placeholder).setMin((int) R.drawable.marker_placeholder).length(nearbyMeSummaryFragment.ivStoreImage);
        }
    }

    public static /* synthetic */ void setMax(NearbyMeSummaryFragment nearbyMeSummaryFragment) {
        LottieAnimationView lottieAnimationView = nearbyMeSummaryFragment.lottieNearbyRibbon;
        if (lottieAnimationView != null) {
            lottieAnimationView.playAnimation();
        }
        nearbyMeSummaryFragment.setMin(false);
    }
}
