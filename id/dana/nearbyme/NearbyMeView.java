package id.dana.nearbyme;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.di.modules.NearbyMeModule;
import id.dana.dialog.DialogPermission;
import id.dana.nearbyme.merchantdetail.MerchantDetailActivity;
import id.dana.nearbyme.model.ShopModel;
import id.dana.nearbyrevamp.NewNearbyMeActivity;
import java.util.List;
import javax.inject.Inject;
import o.CornerMarkingDataProvider;
import o.FetchAppInfo;
import o.FetchAppListResult;
import o.GriverCommonResourceProxy;
import o.GriverProgressBar;
import o.IntRange;
import o.PrepareException;
import o.RedDotDrawable;
import o.TitleBarRightButtonView;
import o.WheelView;
import o.a;
import o.appendAppLog;
import o.getCatogory;
import o.getScrimColor;
import o.prepareContent;
import o.setAppSlogan;
import o.setCatogory;
import o.setCreateTime;
import o.setSiteName;
import o.setStateOn;
import o.setTextSpacing;
import o.stopIgnoring;
import o.uploadCoreByStartService;

public class NearbyMeView extends BaseRichView {
    public static final int MAX_RETRY = 5;
    private setMin FastBitmap$CoordinateSystem;
    private NearbyShopsAdapter IsOverlapping;
    @BindView(2131362057)
    Button btnCheckMyArea;
    @BindView(2131362158)
    DanaButtonSecondaryView btnViewAll;
    @BindView(2131362467)
    ConstraintLayout clNearbyMeEntryPointParent;
    @BindView(2131362473)
    ConstraintLayout clNoPermissionContainer;
    private boolean equals;
    private boolean getMax;
    private int getMin;
    /* access modifiers changed from: private */
    public boolean hashCode;
    private GriverProgressBar.UpdateRunnable isInside;
    private String length = "";
    @BindView(2131365902)
    NearbyWidgetEmptyStateView nearbyWidgetEmptyStateView;
    @Inject
    public setTextSpacing.setMin presenter;
    @BindView(2131364535)
    RecyclerView rvNearbyShop;
    private boolean setMax;
    /* access modifiers changed from: private */
    public DialogPermission setMin;
    /* access modifiers changed from: private */
    public DialogPermission toDoubleRange;
    /* access modifiers changed from: private */
    public boolean toFloatRange;
    private GriverProgressBar.UpdateRunnable toIntRange;
    private getScrimColor toString;

    public interface setMin {
        void setMax();

        void setMax(IntentSender intentSender);
    }

    public int getLayout() {
        return R.layout.view_nearby_me_entry_point;
    }

    public NearbyMeView(@NonNull Context context) {
        super(context);
    }

    public NearbyMeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NearbyMeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NearbyMeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setSource(String str) {
        this.length = str;
    }

    public void checkPermission(boolean z) {
        if (!CornerMarkingDataProvider.IsOverlapping() || setStateOn.getMin(getBaseActivity(), "android.permission.ACCESS_FINE_LOCATION") || this.FastBitmap$CoordinateSystem == null) {
            onRequestPermissionResult(true, z);
            return;
        }
        this.btnViewAll.setVisibility(8);
        this.rvNearbyShop.setVisibility(8);
        this.nearbyWidgetEmptyStateView.setVisibility(0);
        this.nearbyWidgetEmptyStateView.display(2, new FetchAppInfo.CategoryInfo(this, 2));
        if (!z) {
            if (this.setMax) {
                this.FastBitmap$CoordinateSystem.setMax();
            }
            this.setMax = true;
        }
    }

    public void onRequestPermissionResult(boolean z, boolean z2) {
        if (this.toFloatRange) {
            if (!z) {
                this.btnViewAll.setVisibility(8);
                this.rvNearbyShop.setVisibility(8);
                this.nearbyWidgetEmptyStateView.setVisibility(0);
                this.nearbyWidgetEmptyStateView.display(2, new FetchAppInfo.CategoryInfo(this, 2));
            } else if (WheelView.ScrollerTask.length(getContext())) {
                getMin();
                if (!this.equals || z2) {
                    this.getMax = true;
                    setMin(z2);
                    return;
                }
                this.equals = false;
                setMax();
            } else {
                this.btnViewAll.setVisibility(8);
                this.rvNearbyShop.setVisibility(8);
                this.nearbyWidgetEmptyStateView.setVisibility(0);
                this.nearbyWidgetEmptyStateView.display(2, new FetchAppInfo.CategoryInfo(this, 2));
                if (!z2) {
                    if (this.setMax) {
                        DanaButtonSecondaryView danaButtonSecondaryView = this.btnViewAll;
                        if (danaButtonSecondaryView != null) {
                            danaButtonSecondaryView.setEnabled(false);
                            this.btnViewAll.setDanaButtonView(0, getContext().getString(R.string.view_all), "", (Drawable) null);
                        }
                        this.getMax = true;
                        GriverProgressBar.UpdateRunnable updateRunnable = this.toIntRange;
                        if (updateRunnable != null) {
                            updateRunnable.dispose();
                            this.toIntRange = null;
                        }
                        WheelView.ScrollerTask.getMax getmax = new WheelView.ScrollerTask.getMax(getContext());
                        getmax.setMin.setAlwaysShow(true);
                        LocationSettingsRequest.Builder builder = getmax.setMin;
                        LocationRequest create = LocationRequest.create();
                        create.setPriority(100);
                        create.setInterval(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                        create.setFastestInterval(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                        builder.addLocationRequest(create);
                        uploadCoreByStartService uploadcorebystartservice = getmax.getMax;
                        LocationSettingsRequest build = getmax.setMin.build();
                        GriverProgressBar.UpdateRunnable subscribe = appendAppLog.setMax(uploadcorebystartservice.setMin, uploadcorebystartservice.setMax, LocationServices.API).flatMap(new RedDotDrawable<GoogleApiClient, TitleBarRightButtonView.AnonymousClass1<LocationSettingsResult>>(build) {
                            final /* synthetic */ LocationSettingsRequest getMin;

                            /*  JADX ERROR: Method generation error
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.uploadCoreByStartService.4.apply(java.lang.Object):java.lang.Object, class status: UNLOADED
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
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
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
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                */
                            /*  JADX ERROR: Method generation error: Method args not loaded: o.uploadCoreByStartService.4.apply(java.lang.Object):java.lang.Object, class status: UNLOADED
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.uploadCoreByStartService.4.apply(java.lang.Object):java.lang.Object, class status: UNLOADED
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
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
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
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                */
                            public final /* synthetic */ java.lang.Object apply(
/*
Method generation error in method: o.uploadCoreByStartService.4.apply(java.lang.Object):java.lang.Object, dex: classes4.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.uploadCoreByStartService.4.apply(java.lang.Object):java.lang.Object, class status: UNLOADED
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
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
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
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                        }).subscribe(new setCatogory(this));
                        this.toIntRange = subscribe;
                        addDisposable(subscribe);
                    }
                    this.setMax = true;
                }
            }
        }
    }

    private void getMin() {
        DanaButtonSecondaryView danaButtonSecondaryView = this.btnViewAll;
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setEnabled(true);
            this.btnViewAll.setDanaButtonView(1, getContext().getString(R.string.view_all), "", (Drawable) null);
        }
    }

    private void setMax() {
        Intent intent;
        if (this.hashCode) {
            intent = new Intent(getContext(), NewNearbyMeActivity.class);
        } else {
            intent = new Intent(getContext(), NearbyMeActivity.class);
        }
        intent.putExtra("EXTRA_SOURCE", this.length);
        getContext().startActivity(intent);
    }

    private void isInside() {
        if (this.toDoubleRange == null) {
            DialogPermission.setMin setmin = new DialogPermission.setMin(getBaseActivity(), new getCatogory(this));
            setmin.setMin = R.drawable.ic_location_graphic;
            String string = getContext().getString(R.string.t_n_c);
            setCreateTime setcreatetime = new setCreateTime(this);
            setmin.equals = string;
            setmin.toIntRange = setcreatetime;
            setmin.getMax = getContext().getString(R.string.msg_location_dialog_desc);
            setmin.IsOverlapping = getContext().getString(R.string.msg_check_permission);
            setmin.FastBitmap$CoordinateSystem = new DialogPermission.length() {
                public final void onDialogDismissed() {
                }

                public final void onPositiveButtonClicked() {
                    NearbyMeView.this.getContext().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    NearbyMeView.access$100(NearbyMeView.this);
                }

                public final void onNegativeButtonClicked() {
                    NearbyMeView.access$100(NearbyMeView.this);
                }
            };
            this.toDoubleRange = new DialogPermission(setmin.getMin, setmin.setMax, setmin, (byte) 0);
        }
        this.toDoubleRange.setMin();
    }

    /* access modifiers changed from: protected */
    @OnClick({2131362158})
    public void onViewAllClicked() {
        this.equals = true;
        checkPermission(false);
    }

    /* access modifiers changed from: private */
    public void IsOverlapping() {
        getScrimColor getscrimcolor = this.toString;
        if (getscrimcolor == null) {
            getScrimColor.getMax getmax = new getScrimColor.getMax(this.rvNearbyShop);
            getmax.length = this.IsOverlapping;
            getmax.getMax = R.layout.view_skeleton_nearby_shops;
            getmax.IsOverlapping = 1500;
            getmax.getMin = true;
            getmax.toFloatRange = IntRange.setMax(getmax.setMax.getContext(), R.color.f24782131100433);
            getmax.setMin = 3;
            getScrimColor getscrimcolor2 = new getScrimColor(getmax, (byte) 0);
            getscrimcolor2.getMin();
            this.toString = getscrimcolor2;
            return;
        }
        getscrimcolor.getMin();
    }

    public void onLocationUpdate(Location location, boolean z) {
        int i = this.getMin;
        if (i >= 5) {
            this.getMin = 0;
            GriverProgressBar.UpdateRunnable updateRunnable = this.isInside;
            if (updateRunnable != null) {
                updateRunnable.dispose();
                this.isInside = null;
            }
            getScrimColor getscrimcolor = this.toString;
            if (getscrimcolor != null) {
                getscrimcolor.getMax.setAdapter(getscrimcolor.length);
            }
            equals();
            getMin();
        } else if (location != null) {
            if (this.getMax) {
                getMin();
                if (!this.equals || z) {
                    if (location != null) {
                        this.presenter.setMax(location);
                    } else {
                        this.btnViewAll.setVisibility(8);
                        this.rvNearbyShop.setVisibility(8);
                        this.nearbyWidgetEmptyStateView.setVisibility(0);
                        this.nearbyWidgetEmptyStateView.display(2, new FetchAppInfo.CategoryInfo(this, 2));
                    }
                    length();
                } else {
                    this.equals = false;
                    setMax();
                }
            }
            this.getMax = false;
            GriverProgressBar.UpdateRunnable updateRunnable2 = this.isInside;
            if (updateRunnable2 != null) {
                updateRunnable2.dispose();
                this.isInside = null;
            }
        } else {
            this.getMin = i + 1;
        }
    }

    /* access modifiers changed from: private */
    public void equals() {
        this.clNoPermissionContainer.setVisibility(8);
        this.btnViewAll.setVisibility(8);
        this.rvNearbyShop.setVisibility(8);
        this.nearbyWidgetEmptyStateView.setVisibility(0);
        this.nearbyWidgetEmptyStateView.display(1, new FetchAppInfo.CategoryInfo(this, 1));
    }

    public void setOnNearbyMeEntryView(setMin setmin) {
        this.FastBitmap$CoordinateSystem = setmin;
    }

    private void length() {
        this.nearbyWidgetEmptyStateView.setVisibility(8);
        this.clNoPermissionContainer.setVisibility(8);
        this.btnViewAll.setVisibility(0);
        this.rvNearbyShop.setVisibility(0);
    }

    public void injectComponent(PrepareException.AnonymousClass1 r4) {
        prepareContent.setMin setmin = new prepareContent.setMin((byte) 0);
        if (r4 != null) {
            setmin.setMin = r4;
            setmin.setMax = new NearbyMeModule(new setTextSpacing.getMin() {
                public final void getMax(String str) {
                }

                public final void getMax(List<ShopModel> list) {
                }

                public final void getMin(List<ShopModel> list) {
                }

                public final void length(List<ShopModel> list) {
                }

                public final void setMin(List<ShopModel> list, boolean z) {
                }

                public final void setMin(GriverCommonResourceProxy griverCommonResourceProxy) {
                }

                public final void setMin(boolean z) {
                }

                public final void getMax(boolean z) {
                    boolean unused = NearbyMeView.this.toFloatRange = z;
                    if (z) {
                        NearbyMeView.this.clNearbyMeEntryPointParent.setVisibility(0);
                        NearbyMeView.this.checkPermission(false);
                        return;
                    }
                    NearbyMeView.this.clNearbyMeEntryPointParent.setVisibility(8);
                }

                public final void getMin(a.C0056a aVar) {
                    NearbyMeView.access$300(NearbyMeView.this, aVar.getMax);
                }

                public final void getMin(boolean z) {
                    boolean unused = NearbyMeView.this.hashCode = z;
                }

                public final void showProgress() {
                    NearbyMeView.this.IsOverlapping();
                }

                public final void dismissProgress() {
                    NearbyMeView.access$600(NearbyMeView.this);
                }

                public final void onError(String str) {
                    NearbyMeView.this.equals();
                }
            });
            stopIgnoring.setMin(setmin.setMax, NearbyMeModule.class);
            stopIgnoring.setMin(setmin.setMin, PrepareException.AnonymousClass1.class);
            new prepareContent(setmin.setMax, setmin.setMin, (byte) 0).getMin(this);
            registerPresenter(this.presenter);
            return;
        }
        throw null;
    }

    public void setup() {
        this.IsOverlapping = new NearbyShopsAdapter(new setSiteName(this));
        this.rvNearbyShop.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.rvNearbyShop.setAdapter(this.IsOverlapping);
        this.presenter.getMin();
    }

    public void onRequestPermissionResult(setStateOn.setMin setmin) {
        if ("android.permission.ACCESS_FINE_LOCATION".equals(setmin.getMin)) {
            onRequestPermissionResult(setmin.setMax(), true);
        }
    }

    public void onLocationResolutionResult(int i) {
        GriverProgressBar.UpdateRunnable updateRunnable = this.toIntRange;
        if (updateRunnable != null) {
            updateRunnable.dispose();
            this.toIntRange = null;
        }
        if (i == -1) {
            if (!this.equals) {
                length();
                IsOverlapping();
            }
            setMin(false);
            return;
        }
        getMin();
    }

    private void setMin(boolean z) {
        GriverProgressBar.UpdateRunnable updateRunnable = this.isInside;
        if (updateRunnable != null) {
            updateRunnable.dispose();
            this.isInside = null;
        }
        GriverProgressBar.UpdateRunnable subscribe = new WheelView.ScrollerTask.getMax(getContext()).getMin().subscribe(new FetchAppListResult(this, z));
        this.isInside = subscribe;
        addDisposable(subscribe);
    }

    static /* synthetic */ void access$100(NearbyMeView nearbyMeView) {
        DialogPermission dialogPermission = nearbyMeView.toDoubleRange;
        if (dialogPermission != null) {
            dialogPermission.setMax();
            nearbyMeView.toDoubleRange = null;
        }
    }

    static /* synthetic */ void access$300(NearbyMeView nearbyMeView, List list) {
        if (list.isEmpty()) {
            nearbyMeView.equals();
            return;
        }
        nearbyMeView.length();
        nearbyMeView.IsOverlapping.getMin();
        nearbyMeView.IsOverlapping.length(list);
    }

    static /* synthetic */ void access$600(NearbyMeView nearbyMeView) {
        getScrimColor getscrimcolor = nearbyMeView.toString;
        if (getscrimcolor != null) {
            getscrimcolor.getMax.setAdapter(getscrimcolor.length);
        }
    }

    public static /* synthetic */ void setMax(NearbyMeView nearbyMeView, int i) {
        ShopModel shopModel = (ShopModel) nearbyMeView.IsOverlapping.setMin(i);
        if (nearbyMeView.hashCode) {
            NewNearbyMeActivity.openMerchantDetailBottomsheet(nearbyMeView.getContext(), shopModel, "Home");
            return;
        }
        MerchantDetailActivity.setMin setmin = MerchantDetailActivity.Companion;
        MerchantDetailActivity.setMin.setMax(nearbyMeView.getContext(), shopModel, "Home");
    }

    public static /* synthetic */ void length(NearbyMeView nearbyMeView, int i) {
        if (i == 1) {
            nearbyMeView.equals = true;
            nearbyMeView.checkPermission(false);
            return;
        }
        if (nearbyMeView.setMin == null) {
            DialogPermission.setMin setmin = new DialogPermission.setMin(nearbyMeView.getBaseActivity(), new FetchAppInfo(nearbyMeView));
            setmin.setMin = R.drawable.ic_request_location;
            setmin.length = nearbyMeView.getBaseActivity().getString(R.string.allow_location_access_question);
            setmin.toDoubleRange = Typeface.DEFAULT_BOLD;
            setmin.getMax = nearbyMeView.getBaseActivity().getString(R.string.request_permission_desc_nearbyme);
            setmin.IsOverlapping = nearbyMeView.getBaseActivity().getString(R.string.allow);
            setmin.isInside = nearbyMeView.getBaseActivity().getString(R.string.maybe_later);
            setmin.Grayscale$Algorithm = setAppSlogan.length;
            setmin.FastBitmap$CoordinateSystem = new DialogPermission.length() {
                public final void onDialogDismissed() {
                }

                public final void onPositiveButtonClicked() {
                    NearbyMeView.this.checkPermission(false);
                    NearbyMeView.this.setMin.setMax();
                }

                public final void onNegativeButtonClicked() {
                    NearbyMeView.this.setMin.setMax();
                }
            };
            nearbyMeView.setMin = new DialogPermission(setmin.getMin, setmin.setMax, setmin, (byte) 0);
        }
        nearbyMeView.setMin.setMin();
    }

    public static /* synthetic */ void getMin(NearbyMeView nearbyMeView, LocationSettingsResult locationSettingsResult) {
        if (locationSettingsResult == null || locationSettingsResult.getStatus() == null) {
            nearbyMeView.isInside();
            return;
        }
        Status status = locationSettingsResult.getStatus();
        int statusCode = status.getStatusCode();
        if (statusCode != 6) {
            if (statusCode != 8502) {
                nearbyMeView.isInside();
            }
        } else if (nearbyMeView.FastBitmap$CoordinateSystem == null) {
        } else {
            if (status.getResolution() == null || status.getResolution().getIntentSender() == null) {
                nearbyMeView.isInside();
                return;
            }
            nearbyMeView.FastBitmap$CoordinateSystem.setMax(status.getResolution().getIntentSender());
        }
    }
}
