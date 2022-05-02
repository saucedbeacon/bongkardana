package id.dana.nearbyme;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.location.Geocoder;
import android.location.Location;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.bumptech.glide.Glide;
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
import id.dana.di.modules.NewNearbyMeModule;
import id.dana.dialog.DialogPermission;
import id.dana.nearbyme.merchantdetail.MerchantDetailActivity;
import id.dana.nearbyme.model.ShopModel;
import id.dana.nearbyrevamp.NewNearbyMeActivity;
import id.dana.richview.HomeWidgetBase;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import o.CornerMarkingDataProvider;
import o.FetchAppsByKeyWordsRequest;
import o.GriverProgressBar;
import o.IntRange;
import o.PrepareException;
import o.RedDotDrawable;
import o.TitleBarRightButtonView;
import o.WheelView;
import o.a;
import o.allowsGoneWidget;
import o.appendAppLog;
import o.getAppInfoList;
import o.getOffscreenPageLimit;
import o.getOriginStartParams;
import o.getQuerySize;
import o.getQueryStartIndex;
import o.getRelatedEnv;
import o.getScrimColor;
import o.onDetachedFromLayoutParams;
import o.setAppInfoList;
import o.setFirstVerticalBias;
import o.setQuerySize;
import o.setQueryStartIndex;
import o.setRelatedEnv;
import o.setStateOn;
import o.setStorage;
import o.stopIgnoring;
import o.updatePostConstraints;
import o.updatePostLayout;
import o.uploadCoreByStartService;

public class NewNearbyMeView extends BaseRichView {
    public static final int MAX_RETRY = 5;
    /* access modifiers changed from: private */
    public boolean FastBitmap$CoordinateSystem;
    private boolean IsOverlapping;
    DanaButtonSecondaryView btnViewAll;
    @BindView(2131362467)
    ConstraintLayout clNearbyMeEntryPointParent;
    private onDetachedFromLayoutParams equals;
    private boolean getMax;
    private GriverProgressBar.UpdateRunnable getMin;
    /* access modifiers changed from: private */
    public DialogPermission hashCode;
    @BindView(2131363130)
    HomeWidgetBase homeWidgetBase;
    /* access modifiers changed from: private */
    public boolean invoke;
    private GriverProgressBar.UpdateRunnable isInside;
    @BindView(2131363673)
    ImageView ivWidgetMap;
    /* access modifiers changed from: private */
    public DialogPermission length;
    @BindView(2131363889)
    LinearLayout llMapSection;
    @BindView(2131365902)
    NewNearbyWidgetEmptyStateView nearbyWidgetEmptyStateView;
    @BindView(2131365903)
    NearbyWidgetLocationPermissionStateView nearbyWidgetLocationPermissionStateView;
    @Inject
    public getOffscreenPageLimit.getMax presenter;
    @BindView(2131364535)
    RecyclerView rvNearbyShop;
    private int setMax;
    private boolean setMin;
    private getScrimColor toDoubleRange;
    /* access modifiers changed from: private */
    public boolean toFloatRange;
    /* access modifiers changed from: private */
    public NewNearbyShopsAdapter toIntRange;
    private setMin toString;
    @BindView(2131365164)
    TextView tvCurrentLocation;
    private String values = "";

    public interface setMin {
        void getMin();

        void length(IntentSender intentSender);
    }

    public int getLayout() {
        return R.layout.new_view_nearby_me_entry_point;
    }

    public NewNearbyMeView(@NonNull Context context) {
        super(context);
    }

    public NewNearbyMeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewNearbyMeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NewNearbyMeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.btnViewAll = this.homeWidgetBase.getButtonView();
    }

    /* access modifiers changed from: private */
    public void getMax() {
        Intent intent;
        if (this.invoke) {
            intent = new Intent(getContext(), NewNearbyMeActivity.class);
        } else {
            intent = new Intent(getContext(), NearbyMeActivity.class);
        }
        intent.putExtra("EXTRA_SOURCE", this.values);
        getContext().startActivity(intent);
    }

    public void setSource(String str) {
        this.values = str;
    }

    public void checkPermission(boolean z) {
        if (!CornerMarkingDataProvider.IsOverlapping() || setStateOn.getMin(getBaseActivity(), "android.permission.ACCESS_FINE_LOCATION") || this.toString == null) {
            onRequestPermissionResult(true, z);
            return;
        }
        toIntRange();
        if (!z) {
            if (this.getMax) {
                this.toString.getMin();
            }
            this.getMax = true;
        }
    }

    public void onRequestPermissionResult(boolean z, boolean z2) {
        if (this.toFloatRange) {
            if (!z) {
                toIntRange();
            } else if (WheelView.ScrollerTask.length(getContext())) {
                setMin();
                if (!this.IsOverlapping || z2) {
                    this.setMin = true;
                    getMin(z2);
                    return;
                }
                this.IsOverlapping = false;
                getMax();
            } else {
                toIntRange();
                if (!z2) {
                    if (this.getMax) {
                        this.btnViewAll.setEnabled(false);
                        this.btnViewAll.setDanaButtonView(0, getContext().getString(R.string.explore_text), "", (Drawable) null);
                        this.setMin = true;
                        GriverProgressBar.UpdateRunnable updateRunnable = this.getMin;
                        if (updateRunnable != null) {
                            updateRunnable.dispose();
                            this.getMin = null;
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
                        }).subscribe(new setRelatedEnv(this));
                        this.getMin = subscribe;
                        addDisposable(subscribe);
                    }
                    this.getMax = true;
                }
            }
        }
    }

    private void getMin() {
        if (this.FastBitmap$CoordinateSystem) {
            this.llMapSection.setVisibility(0);
        }
        this.nearbyWidgetEmptyStateView.setVisibility(8);
        DanaButtonSecondaryView danaButtonSecondaryView = this.btnViewAll;
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setVisibility(0);
        }
        this.rvNearbyShop.setVisibility(0);
    }

    private void length() {
        if (this.hashCode == null) {
            DialogPermission.setMin setmin = new DialogPermission.setMin(getBaseActivity(), new getRelatedEnv(this));
            setmin.setMin = R.drawable.ic_location_graphic;
            String string = getContext().getString(R.string.t_n_c);
            setQuerySize setquerysize = new setQuerySize(this);
            setmin.equals = string;
            setmin.toIntRange = setquerysize;
            setmin.getMax = getContext().getString(R.string.msg_location_dialog_desc);
            setmin.IsOverlapping = getContext().getString(R.string.msg_check_permission);
            setmin.FastBitmap$CoordinateSystem = new DialogPermission.length() {
                public final void onDialogDismissed() {
                }

                public final void onPositiveButtonClicked() {
                    NewNearbyMeView.this.getContext().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    NewNearbyMeView.access$900(NewNearbyMeView.this);
                }

                public final void onNegativeButtonClicked() {
                    NewNearbyMeView.access$900(NewNearbyMeView.this);
                }
            };
            this.hashCode = new DialogPermission(setmin.getMin, setmin.setMax, setmin, (byte) 0);
        }
        this.hashCode.setMin();
    }

    private void toFloatRange() {
        getScrimColor getscrimcolor = this.toDoubleRange;
        if (getscrimcolor == null) {
            getScrimColor.getMax getmax = new getScrimColor.getMax(this.rvNearbyShop);
            getmax.length = this.toIntRange;
            getmax.getMax = R.layout.new_view_skeleton_nearby_shops;
            getmax.IsOverlapping = 1500;
            getmax.getMin = true;
            getmax.toFloatRange = IntRange.setMax(getmax.setMax.getContext(), R.color.f24782131100433);
            getmax.setMin = 4;
            getScrimColor getscrimcolor2 = new getScrimColor(getmax, (byte) 0);
            getscrimcolor2.getMin();
            this.toDoubleRange = getscrimcolor2;
            return;
        }
        getscrimcolor.getMin();
    }

    public void onLocationUpdate(Location location, boolean z) {
        int i = this.setMax;
        if (i >= 5) {
            this.setMax = 0;
            GriverProgressBar.UpdateRunnable updateRunnable = this.isInside;
            if (updateRunnable != null) {
                updateRunnable.dispose();
                this.isInside = null;
            }
            getScrimColor getscrimcolor = this.toDoubleRange;
            if (getscrimcolor != null) {
                getscrimcolor.getMax.setAdapter(getscrimcolor.length);
            }
            onDetachedFromLayoutParams ondetachedfromlayoutparams = this.equals;
            if (ondetachedfromlayoutparams != null) {
                ondetachedfromlayoutparams.length();
            }
            this.rvNearbyShop.setVisibility(8);
            this.nearbyWidgetLocationPermissionStateView.setVisibility(8);
            DanaButtonSecondaryView danaButtonSecondaryView = this.btnViewAll;
            if (danaButtonSecondaryView != null) {
                danaButtonSecondaryView.setVisibility(0);
            }
            this.nearbyWidgetEmptyStateView.setVisibility(0);
            setMin();
        } else if (location != null) {
            try {
                this.tvCurrentLocation.setText(new Geocoder(getContext()).getFromLocation(location.getLatitude(), location.getLongitude(), 1).get(0).getSubLocality());
            } catch (IOException unused) {
                this.tvCurrentLocation.setText("");
            }
            if (this.setMin) {
                setMin();
                if (!this.IsOverlapping || z) {
                    if (location != null) {
                        this.presenter.getMax(location);
                    } else {
                        toIntRange();
                    }
                    getMin();
                } else {
                    this.IsOverlapping = false;
                    getMax();
                }
            }
            this.setMin = false;
            GriverProgressBar.UpdateRunnable updateRunnable2 = this.isInside;
            if (updateRunnable2 != null) {
                updateRunnable2.dispose();
                this.isInside = null;
            }
        } else {
            this.setMax = i + 1;
        }
    }

    /* access modifiers changed from: private */
    public void IsOverlapping() {
        this.rvNearbyShop.setVisibility(8);
        this.nearbyWidgetLocationPermissionStateView.setVisibility(8);
        DanaButtonSecondaryView danaButtonSecondaryView = this.btnViewAll;
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setVisibility(0);
        }
        this.nearbyWidgetEmptyStateView.setVisibility(0);
    }

    public void setOnNearbyMeEntryView(setMin setmin) {
        this.toString = setmin;
    }

    public void injectComponent(PrepareException.AnonymousClass1 r4) {
        setStorage.getMax getmax = new setStorage.getMax((byte) 0);
        if (r4 != null) {
            getmax.setMax = r4;
            getmax.getMin = new NewNearbyMeModule(new getOffscreenPageLimit.setMax() {
                public final void getMin(boolean z) {
                    boolean unused = NewNearbyMeView.this.toFloatRange = z;
                    if (z) {
                        NewNearbyMeView.this.homeWidgetBase.setVisibility(0);
                        NewNearbyMeView.this.checkPermission(false);
                        return;
                    }
                    NewNearbyMeView.this.homeWidgetBase.setVisibility(8);
                }

                public final void length(boolean z) {
                    boolean unused = NewNearbyMeView.this.FastBitmap$CoordinateSystem = z;
                    NewNearbyMeView.this.llMapSection.setVisibility(NewNearbyMeView.this.FastBitmap$CoordinateSystem ? 0 : 8);
                }

                public final void getMin(a.C0056a aVar) {
                    NewNearbyMeView.access$300(NewNearbyMeView.this, aVar.getMax);
                    NewNearbyMeView.this.presenter.setMin(aVar.getMax);
                }

                public final void getMin(List<ShopModel> list) {
                    NewNearbyShopsAdapter access$400 = NewNearbyMeView.this.toIntRange;
                    for (ShopModel next : list) {
                        Integer num = access$400.getMax.get(next.b);
                        List max = access$400.getMax();
                        if (num != null) {
                            max.set(num.intValue(), next);
                        }
                        access$400.getMin(max);
                    }
                }

                public final void setMin(boolean z) {
                    boolean unused = NewNearbyMeView.this.invoke = z;
                }

                public final void showProgress() {
                    NewNearbyMeView.access$600(NewNearbyMeView.this);
                }

                public final void dismissProgress() {
                    NewNearbyMeView.access$700(NewNearbyMeView.this);
                }

                public final void onError(String str) {
                    NewNearbyMeView.this.IsOverlapping();
                }
            });
            stopIgnoring.setMin(getmax.getMin, NewNearbyMeModule.class);
            stopIgnoring.setMin(getmax.setMax, PrepareException.AnonymousClass1.class);
            new setStorage(getmax.getMin, getmax.setMax, (byte) 0).getMax(this);
            registerPresenter(this.presenter);
            return;
        }
        throw null;
    }

    public void setup() {
        this.toIntRange = new NewNearbyShopsAdapter(new getAppInfoList(this));
        this.rvNearbyShop.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.rvNearbyShop.setAdapter(this.toIntRange);
        ((setFirstVerticalBias) Glide.setMin((View) this).setMin(Integer.valueOf(R.drawable.ic_nearby_widget_maps)).getMin((updatePostLayout<Bitmap>[]) new updatePostLayout[]{new allowsGoneWidget(), new updatePostConstraints(getResources().getDimensionPixelSize(R.dimen.f26272131165275))})).length(this.ivWidgetMap);
        this.ivWidgetMap.setOnClickListener(new setAppInfoList(this));
        if (getOriginStartParams.isNetworkAvailable(getContext())) {
            this.presenter.length();
            return;
        }
        this.llMapSection.setVisibility(8);
        this.rvNearbyShop.setVisibility(8);
        this.nearbyWidgetLocationPermissionStateView.setVisibility(8);
        DanaButtonSecondaryView danaButtonSecondaryView = this.btnViewAll;
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setVisibility(0);
        }
        this.nearbyWidgetEmptyStateView.setVisibility(0);
    }

    private void setMin() {
        HomeWidgetBase homeWidgetBase2 = this.homeWidgetBase;
        if (homeWidgetBase2 != null) {
            homeWidgetBase2.setOnButtonClickListener(new setQueryStartIndex(this));
        }
        DanaButtonSecondaryView danaButtonSecondaryView = this.btnViewAll;
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setEnabled(true);
            this.btnViewAll.setDanaButtonView(1, getContext().getString(R.string.explore_text), "", (Drawable) null);
        }
    }

    private void toIntRange() {
        DanaButtonSecondaryView danaButtonSecondaryView = this.btnViewAll;
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setVisibility(8);
        }
        this.rvNearbyShop.setVisibility(8);
        this.llMapSection.setVisibility(8);
        this.nearbyWidgetLocationPermissionStateView.setOnButtonClickListener(new getQuerySize(this));
        this.nearbyWidgetLocationPermissionStateView.setVisibility(0);
    }

    public void onRequestPermissionResult(setStateOn.setMin setmin) {
        if ("android.permission.ACCESS_FINE_LOCATION".equals(setmin.getMin)) {
            onRequestPermissionResult(setmin.setMax(), true);
        }
    }

    public void onLocationResolutionResult(int i) {
        GriverProgressBar.UpdateRunnable updateRunnable = this.getMin;
        if (updateRunnable != null) {
            updateRunnable.dispose();
            this.getMin = null;
        }
        if (i == -1) {
            this.nearbyWidgetLocationPermissionStateView.setVisibility(8);
            if (!this.IsOverlapping) {
                getMin();
                this.nearbyWidgetEmptyStateView.setVisibility(8);
                this.nearbyWidgetLocationPermissionStateView.setVisibility(8);
                this.rvNearbyShop.setVisibility(0);
                toFloatRange();
            }
            getMin(false);
            return;
        }
        this.nearbyWidgetLocationPermissionStateView.setVisibility(0);
        setMin();
    }

    private void getMin(boolean z) {
        GriverProgressBar.UpdateRunnable updateRunnable = this.isInside;
        if (updateRunnable != null) {
            updateRunnable.dispose();
            this.isInside = null;
        }
        GriverProgressBar.UpdateRunnable subscribe = new WheelView.ScrollerTask.getMax(getContext()).getMin().subscribe(new FetchAppsByKeyWordsRequest(this, z));
        this.isInside = subscribe;
        addDisposable(subscribe);
    }

    static /* synthetic */ void access$300(NewNearbyMeView newNearbyMeView, List list) {
        if (list.isEmpty()) {
            newNearbyMeView.IsOverlapping();
            return;
        }
        newNearbyMeView.getMin();
        newNearbyMeView.toIntRange.getMin();
        newNearbyMeView.toIntRange.length(list);
    }

    static /* synthetic */ void access$600(NewNearbyMeView newNearbyMeView) {
        newNearbyMeView.nearbyWidgetEmptyStateView.setVisibility(8);
        newNearbyMeView.nearbyWidgetLocationPermissionStateView.setVisibility(8);
        newNearbyMeView.rvNearbyShop.setVisibility(0);
        newNearbyMeView.toFloatRange();
    }

    static /* synthetic */ void access$700(NewNearbyMeView newNearbyMeView) {
        getScrimColor getscrimcolor = newNearbyMeView.toDoubleRange;
        if (getscrimcolor != null) {
            getscrimcolor.getMax.setAdapter(getscrimcolor.length);
        }
        onDetachedFromLayoutParams ondetachedfromlayoutparams = newNearbyMeView.equals;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
    }

    static /* synthetic */ void access$900(NewNearbyMeView newNearbyMeView) {
        DialogPermission dialogPermission = newNearbyMeView.hashCode;
        if (dialogPermission != null) {
            dialogPermission.setMax();
            newNearbyMeView.hashCode = null;
        }
    }

    public static /* synthetic */ void length(NewNearbyMeView newNearbyMeView, int i) {
        ShopModel shopModel = (ShopModel) newNearbyMeView.toIntRange.setMin(i);
        if (newNearbyMeView.invoke) {
            NewNearbyMeActivity.openMerchantDetailBottomsheet(newNearbyMeView.getContext(), shopModel, "Home");
            return;
        }
        MerchantDetailActivity.setMin setmin = MerchantDetailActivity.Companion;
        MerchantDetailActivity.setMin.setMax(newNearbyMeView.getContext(), shopModel, "Home");
    }

    public static /* synthetic */ void setMin(NewNearbyMeView newNearbyMeView, LocationSettingsResult locationSettingsResult) {
        if (locationSettingsResult == null || locationSettingsResult.getStatus() == null) {
            newNearbyMeView.length();
            return;
        }
        Status status = locationSettingsResult.getStatus();
        int statusCode = status.getStatusCode();
        if (statusCode != 6) {
            if (statusCode != 8502) {
                newNearbyMeView.length();
            }
        } else if (newNearbyMeView.toString == null) {
        } else {
            if (status.getResolution() == null || status.getResolution().getIntentSender() == null) {
                newNearbyMeView.length();
                return;
            }
            newNearbyMeView.toString.length(status.getResolution().getIntentSender());
        }
    }

    public static /* synthetic */ void getMax(NewNearbyMeView newNearbyMeView) {
        newNearbyMeView.IsOverlapping = true;
        newNearbyMeView.checkPermission(false);
    }

    public static /* synthetic */ void length(NewNearbyMeView newNearbyMeView) {
        if (newNearbyMeView.length == null) {
            DialogPermission.setMin setmin = new DialogPermission.setMin(newNearbyMeView.getBaseActivity(), new getQueryStartIndex(newNearbyMeView));
            setmin.setMin = R.drawable.ic_request_location;
            setmin.length = newNearbyMeView.getBaseActivity().getString(R.string.request_permission_title);
            setmin.getMax = newNearbyMeView.getBaseActivity().getString(R.string.request_permission_desc);
            setmin.IsOverlapping = newNearbyMeView.getBaseActivity().getString(R.string.allow_permission_services);
            setmin.FastBitmap$CoordinateSystem = new DialogPermission.length() {
                public final void onDialogDismissed() {
                }

                public final void onPositiveButtonClicked() {
                    NewNearbyMeView.this.checkPermission(false);
                    NewNearbyMeView.this.length.setMax();
                }

                public final void onNegativeButtonClicked() {
                    NewNearbyMeView.this.length.setMax();
                }
            };
            newNearbyMeView.length = new DialogPermission(setmin.getMin, setmin.setMax, setmin, (byte) 0);
        }
        newNearbyMeView.length.setMin();
    }
}
