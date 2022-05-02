package o;

import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.Px;
import com.alipay.mobile.verifyidentity.business.securitycommon.widget.ConvertUtils;
import com.facebook.infer.annotation.ThreadConfined;
import com.facebook.litho.Border;
import com.facebook.litho.ComponentsLogger;
import com.facebook.litho.Transition;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaBaselineFunction;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaWrap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import o.dispatchNestedPreFling;
import o.onSizeChanged;

@ThreadConfined("ANY")
public class sendAccessibilityEvent implements NotificationCompat$GroupAlertBehavior {
    private static final boolean getInterfaceDescriptor = (Build.VERSION.SDK_INT >= 17);
    public ViewCompat$ScrollIndicators FastBitmap$CoordinateSystem;
    public String Grayscale$Algorithm;
    @Nullable
    public IconCompat<ParseException> ICustomTabsCallback;
    Set<RemoteInput$EditChoicesBeforeSending> ICustomTabsCallback$Default = new HashSet();
    @Nullable
    public ArrayList<Transition> ICustomTabsCallback$Stub;
    private boolean ICustomTabsCallback$Stub$Proxy;
    private sendAccessibilityEvent ICustomTabsService;
    public final int[] IsOverlapping = new int[4];
    public float Mean$Arithmetic;
    public computeVerticalScrollExtent asBinder;
    @Nullable
    public ArrayList<onSizeChanged.length> asInterface;
    @Nullable
    public IconCompat<computeHorizontalScrollOffset> b;
    @Nullable
    public IconCompat<LinkifyCompat$LinkifyMask> create;
    @Nullable
    public getVirtualViewAt equals;
    onFontRetrieved extraCallback;
    public float extraCallbackWithResult = -1.0f;
    private boolean[] extraCommand;
    @Nullable
    public IconCompat<computeHorizontalScrollExtent> getCause;
    private boolean getDefaultImpl;
    public ensureProcessorRunningLocked getMax;
    public int getMin = 0;
    @Nullable
    public PathEffect hashCode;
    @Nullable
    public IconCompat<onRequestFocusInDescendants> invoke;
    public float invokeSuspend;
    @Nullable
    public onPerformActionForVirtualView<? extends Drawable> isInside;
    public YogaNode length;
    private float mayLaunchUrl = 1.0E21f;
    private onFontRetrieved newSession;
    private float newSessionWithExtras = 1.0E21f;
    public String onMessageChannelReady;
    @Nullable
    public IconCompat<FontsContractCompat$FontRequestCallback$FontRequestFailReason> onNavigationEvent;
    public PermissionInfoCompat$ProtectionFlags onPostMessage;
    public float onRelationshipValidationResult = -1.0f;
    @Nullable
    public ArrayList<isStopped> onTransact;
    private float postMessage = 1.0E21f;
    private boolean receiveFile;
    private int requestPostMessageChannel = -1;
    private float requestPostMessageChannelWithExtras = 1.0E21f;
    private onFontRetrieved setDefaultImpl;
    @ThreadConfined("ANY")
    public final List<isStopped> setMax = new ArrayList(1);
    public boolean setMin;
    public final float[] toDoubleRange = new float[4];
    public sendAccessibilityEvent toFloatRange;
    long toIntRange;
    @DrawableRes
    public int toString;
    private int updateVisuals = -1;
    private float validateRelationship = 1.0E21f;
    @Nullable
    public Transition.TransitionKeyType valueOf;
    @Nullable
    public StateListAnimator values;
    private float warmup = 1.0E21f;

    sendAccessibilityEvent() {
    }

    public final boolean getMax() {
        return (this.length == null || this.getMax == null) ? false : true;
    }

    @Px
    public int getMin() {
        if (clampViewPositionHorizontal.length(this.newSessionWithExtras)) {
            this.newSessionWithExtras = this.length.mLeft;
        }
        return (int) this.newSessionWithExtras;
    }

    @Px
    public int length() {
        if (clampViewPositionHorizontal.length(this.postMessage)) {
            this.postMessage = this.length.mTop;
        }
        return (int) this.postMessage;
    }

    @Px
    public int setMax() {
        if (clampViewPositionHorizontal.length(this.requestPostMessageChannelWithExtras)) {
            this.requestPostMessageChannelWithExtras = this.length.mWidth;
        }
        return (int) this.requestPostMessageChannelWithExtras;
    }

    @Px
    public int setMin() {
        if (clampViewPositionHorizontal.length(this.validateRelationship)) {
            this.validateRelationship = this.length.mHeight;
        }
        return (int) this.validateRelationship;
    }

    @Px
    public int equals() {
        double d;
        float max = this.length.getMax(YogaEdge.LEFT);
        if (max > 0.0f) {
            double d2 = (double) max;
            Double.isNaN(d2);
            d = d2 + 0.5d;
        } else {
            double d3 = (double) max;
            Double.isNaN(d3);
            d = d3 - 0.5d;
        }
        return (int) d;
    }

    @Px
    public int toFloatRange() {
        double d;
        float max = this.length.getMax(YogaEdge.TOP);
        if (max > 0.0f) {
            double d2 = (double) max;
            Double.isNaN(d2);
            d = d2 + 0.5d;
        } else {
            double d3 = (double) max;
            Double.isNaN(d3);
            d = d3 - 0.5d;
        }
        return (int) d;
    }

    @Px
    public int toIntRange() {
        double d;
        float max = this.length.getMax(YogaEdge.RIGHT);
        if (max > 0.0f) {
            double d2 = (double) max;
            Double.isNaN(d2);
            d = d2 + 0.5d;
        } else {
            double d3 = (double) max;
            Double.isNaN(d3);
            d = d3 - 0.5d;
        }
        return (int) d;
    }

    @Px
    public int isInside() {
        double d;
        float max = this.length.getMax(YogaEdge.BOTTOM);
        if (max > 0.0f) {
            double d2 = (double) max;
            Double.isNaN(d2);
            d = d2 + 0.5d;
        } else {
            double d3 = (double) max;
            Double.isNaN(d3);
            d = d3 - 0.5d;
        }
        return (int) d;
    }

    public final boolean IsOverlapping() {
        return (this.toIntRange & ConvertUtils.KB) != 0;
    }

    public void FastBitmap$CoordinateSystem() {
        this.receiveFile = true;
    }

    public int toDoubleRange() {
        return this.requestPostMessageChannel;
    }

    public void getMax(int i) {
        this.requestPostMessageChannel = i;
    }

    public int values() {
        return this.updateVisuals;
    }

    public void getMin(int i) {
        this.updateVisuals = i;
    }

    public final boolean invokeSuspend() {
        return (this.invoke == null && this.onNavigationEvent == null && this.b == null && this.ICustomTabsCallback == null && this.create == null && this.getCause == null) ? false : true;
    }

    public void length(float f) {
        this.extraCallbackWithResult = f;
    }

    public void getMax(float f) {
        this.onRelationshipValidationResult = f;
    }

    public final boolean invoke() {
        return this.receiveFile;
    }

    public void setMin(PermissionInfoCompat$ProtectionFlags permissionInfoCompat$ProtectionFlags) {
        this.onPostMessage = permissionInfoCompat$ProtectionFlags;
    }

    public final boolean valueOf() {
        return this.setMin;
    }

    public final YogaDirection Grayscale$Algorithm() {
        YogaNode yogaNode = this.length;
        while (yogaNode != null && YogaDirection.fromInt(yogaNode.mLayoutDirection) == YogaDirection.INHERIT) {
            yogaNode = yogaNode.setMin;
        }
        if (yogaNode == null) {
            return YogaDirection.INHERIT;
        }
        return YogaDirection.fromInt(yogaNode.mLayoutDirection);
    }

    public sendAccessibilityEvent setMax(YogaDirection yogaDirection) {
        this.toIntRange |= 1;
        YogaNode.jni_YGNodeStyleSetDirection(this.length.getMin, yogaDirection.intValue());
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent getMax(YogaFlexDirection yogaFlexDirection) {
        YogaNode.jni_YGNodeStyleSetFlexDirection(this.length.getMin, yogaFlexDirection.intValue());
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent length(YogaWrap yogaWrap) {
        YogaNode.jni_YGNodeStyleSetFlexWrap(this.length.getMin, yogaWrap.intValue());
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent length(YogaJustify yogaJustify) {
        YogaNode.jni_YGNodeStyleSetJustifyContent(this.length.getMin, yogaJustify.intValue());
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent getMin(YogaAlign yogaAlign) {
        YogaNode.jni_YGNodeStyleSetAlignItems(this.length.getMin, yogaAlign.intValue());
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent setMin(YogaAlign yogaAlign) {
        YogaNode.jni_YGNodeStyleSetAlignContent(this.length.getMin, yogaAlign.intValue());
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent length(YogaAlign yogaAlign) {
        this.toIntRange |= 2;
        YogaNode.jni_YGNodeStyleSetAlignSelf(this.length.getMin, yogaAlign.intValue());
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent getMin(YogaPositionType yogaPositionType) {
        this.toIntRange |= 4;
        YogaNode.jni_YGNodeStyleSetPositionType(this.length.getMin, yogaPositionType.intValue());
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent setMax(float f) {
        this.toIntRange |= 8;
        YogaNode.jni_YGNodeStyleSetFlex(this.length.getMin, f);
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent setMin(float f) {
        this.toIntRange |= 16;
        YogaNode.jni_YGNodeStyleSetFlexGrow(this.length.getMin, f);
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent getMin(float f) {
        this.toIntRange |= 32;
        YogaNode.jni_YGNodeStyleSetFlexShrink(this.length.getMin, f);
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent setMax(@Px int i) {
        this.toIntRange |= 64;
        YogaNode.jni_YGNodeStyleSetFlexBasis(this.length.getMin, (float) i);
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent IsOverlapping(float f) {
        this.toIntRange |= 64;
        YogaNode.jni_YGNodeStyleSetFlexBasisPercent(this.length.getMin, f);
        return this;
    }

    public sendAccessibilityEvent length(int i) {
        this.toIntRange |= 128;
        this.getMin = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent length(boolean z) {
        this.toIntRange |= 256;
        this.getDefaultImpl = z;
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent getMax(YogaEdge yogaEdge, @Px int i) {
        this.toIntRange |= 512;
        YogaNode yogaNode = this.length;
        yogaNode.mEdgeSetFlag |= 1;
        YogaNode.jni_YGNodeStyleSetMargin(yogaNode.getMin, yogaEdge.intValue(), (float) i);
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent getMin(YogaEdge yogaEdge, float f) {
        this.toIntRange |= 512;
        YogaNode yogaNode = this.length;
        yogaNode.mEdgeSetFlag |= 1;
        YogaNode.jni_YGNodeStyleSetMarginPercent(yogaNode.getMin, yogaEdge.intValue(), f);
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent getMin(YogaEdge yogaEdge) {
        this.toIntRange |= 512;
        YogaNode yogaNode = this.length;
        yogaNode.mEdgeSetFlag |= 1;
        YogaNode.jni_YGNodeStyleSetMarginAuto(yogaNode.getMin, yogaEdge.intValue());
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent setMax(YogaEdge yogaEdge, @Px int i) {
        this.toIntRange |= ConvertUtils.KB;
        if (this.setMin) {
            if (this.setDefaultImpl == null) {
                this.setDefaultImpl = NotificationCompatSideChannelService.values();
            }
            this.setDefaultImpl.setMin(yogaEdge, (float) i);
            getMin(yogaEdge, false);
        } else {
            YogaNode yogaNode = this.length;
            yogaNode.mEdgeSetFlag |= 2;
            YogaNode.jni_YGNodeStyleSetPadding(yogaNode.getMin, yogaEdge.intValue(), (float) i);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent setMin(YogaEdge yogaEdge, float f) {
        this.toIntRange |= ConvertUtils.KB;
        if (this.setMin) {
            if (this.setDefaultImpl == null) {
                this.setDefaultImpl = NotificationCompatSideChannelService.values();
            }
            this.setDefaultImpl.setMin(yogaEdge, f);
            getMin(yogaEdge, true);
        } else {
            YogaNode yogaNode = this.length;
            yogaNode.mEdgeSetFlag |= 2;
            YogaNode.jni_YGNodeStyleSetPaddingPercent(yogaNode.getMin, yogaEdge.intValue(), f);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent setMax(Border border) {
        YogaEdge yogaEdge;
        this.toIntRange |= 268435456;
        int length2 = border.setMax.length;
        for (int i = 0; i < length2; i++) {
            if (i < 0 || i >= 4) {
                throw new IllegalArgumentException("Given index out of range of acceptable edges: ".concat(String.valueOf(i)));
            }
            if (i == 0) {
                yogaEdge = YogaEdge.LEFT;
            } else if (i == 1) {
                yogaEdge = YogaEdge.TOP;
            } else if (i == 2) {
                yogaEdge = YogaEdge.RIGHT;
            } else if (i == 3) {
                yogaEdge = YogaEdge.BOTTOM;
            } else {
                throw new IllegalArgumentException("Given unknown edge index: ".concat(String.valueOf(i)));
            }
            int i2 = border.setMax[i];
            if (this.setMin) {
                if (this.newSession == null) {
                    this.newSession = NotificationCompatSideChannelService.values();
                }
                this.newSession.setMin(yogaEdge, (float) i2);
            } else {
                YogaNode yogaNode = this.length;
                yogaNode.mEdgeSetFlag = 4 | yogaNode.mEdgeSetFlag;
                YogaNode.jni_YGNodeStyleSetBorder(yogaNode.getMin, yogaEdge.intValue(), (float) i2);
            }
        }
        int[] iArr = border.getMin;
        int[] iArr2 = this.IsOverlapping;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        float[] fArr = border.setMin;
        float[] fArr2 = this.toDoubleRange;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        this.hashCode = border.getMax;
        return this;
    }

    public final boolean Mean$Arithmetic() {
        return (this.toIntRange & ConvertUtils.GB) != 0;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent setMin(YogaEdge yogaEdge, @Px int i) {
        this.toIntRange |= 2048;
        YogaNode yogaNode = this.length;
        yogaNode.toIntRange = true;
        YogaNode.jni_YGNodeStyleSetPosition(yogaNode.getMin, yogaEdge.intValue(), (float) i);
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent setMax(YogaEdge yogaEdge, float f) {
        this.toIntRange |= 2048;
        YogaNode yogaNode = this.length;
        yogaNode.toIntRange = true;
        YogaNode.jni_YGNodeStyleSetPositionPercent(yogaNode.getMin, yogaEdge.intValue(), f);
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent setMin(@Px int i) {
        this.toIntRange |= 4096;
        YogaNode.jni_YGNodeStyleSetWidth(this.length.getMin, (float) i);
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent isInside(float f) {
        this.toIntRange |= 4096;
        YogaNode.jni_YGNodeStyleSetWidthPercent(this.length.getMin, f);
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent toFloatRange(@Px int i) {
        this.toIntRange |= 8192;
        YogaNode.jni_YGNodeStyleSetMinWidth(this.length.getMin, (float) i);
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent toIntRange(float f) {
        this.toIntRange |= 8192;
        YogaNode.jni_YGNodeStyleSetMinWidthPercent(this.length.getMin, f);
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent toIntRange(@Px int i) {
        this.toIntRange |= 16384;
        YogaNode.jni_YGNodeStyleSetMaxWidth(this.length.getMin, (float) i);
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent equals(float f) {
        this.toIntRange |= 16384;
        YogaNode.jni_YGNodeStyleSetMaxWidthPercent(this.length.getMin, f);
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent equals(@Px int i) {
        this.toIntRange |= 32768;
        YogaNode.jni_YGNodeStyleSetHeight(this.length.getMin, (float) i);
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent toFloatRange(float f) {
        this.toIntRange |= 32768;
        YogaNode.jni_YGNodeStyleSetHeightPercent(this.length.getMin, f);
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent isInside(@Px int i) {
        this.toIntRange |= 65536;
        YogaNode.jni_YGNodeStyleSetMinHeight(this.length.getMin, (float) i);
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent toString(float f) {
        this.toIntRange |= 65536;
        YogaNode.jni_YGNodeStyleSetMinHeightPercent(this.length.getMin, f);
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent IsOverlapping(@Px int i) {
        this.toIntRange |= 131072;
        YogaNode.jni_YGNodeStyleSetMaxHeight(this.length.getMin, (float) i);
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent values(float f) {
        this.toIntRange |= 131072;
        YogaNode.jni_YGNodeStyleSetMaxHeightPercent(this.length.getMin, f);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.FastBitmap$CoordinateSystem;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean onTransact() {
        /*
            r1 = this;
            o.onFontRetrieved r0 = r1.extraCallback
            if (r0 == 0) goto L_0x0010
            o.ViewCompat$ScrollIndicators r0 = r1.FastBitmap$CoordinateSystem
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.setMin()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendAccessibilityEvent.onTransact():boolean");
    }

    /* access modifiers changed from: package-private */
    public final boolean ICustomTabsCallback() {
        return (this.toIntRange & 33554432) != 0;
    }

    /* access modifiers changed from: package-private */
    public final int getCause() {
        double d;
        if (!onTransact()) {
            return 0;
        }
        if (clampViewPositionHorizontal.length(this.mayLaunchUrl)) {
            this.mayLaunchUrl = setMax(this.extraCallback, YogaEdge.LEFT);
        }
        float f = this.mayLaunchUrl;
        if (f > 0.0f) {
            double d2 = (double) f;
            Double.isNaN(d2);
            d = d2 + 0.5d;
        } else {
            double d3 = (double) f;
            Double.isNaN(d3);
            d = d3 - 0.5d;
        }
        return (int) d;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        double d;
        if (!onTransact()) {
            return 0;
        }
        float length2 = this.extraCallback.length(YogaEdge.TOP);
        if (length2 > 0.0f) {
            double d2 = (double) length2;
            Double.isNaN(d2);
            d = d2 + 0.5d;
        } else {
            double d3 = (double) length2;
            Double.isNaN(d3);
            d = d3 - 0.5d;
        }
        return (int) d;
    }

    /* access modifiers changed from: package-private */
    public final int create() {
        double d;
        if (!onTransact()) {
            return 0;
        }
        if (clampViewPositionHorizontal.length(this.warmup)) {
            this.warmup = setMax(this.extraCallback, YogaEdge.RIGHT);
        }
        float f = this.warmup;
        if (f > 0.0f) {
            double d2 = (double) f;
            Double.isNaN(d2);
            d = d2 + 0.5d;
        } else {
            double d3 = (double) f;
            Double.isNaN(d3);
            d = d3 - 0.5d;
        }
        return (int) d;
    }

    /* access modifiers changed from: package-private */
    public final int onNavigationEvent() {
        double d;
        if (!onTransact()) {
            return 0;
        }
        float length2 = this.extraCallback.length(YogaEdge.BOTTOM);
        if (length2 > 0.0f) {
            double d2 = (double) length2;
            Double.isNaN(d2);
            d = d2 + 0.5d;
        } else {
            double d3 = (double) length2;
            Double.isNaN(d3);
            d = d3 - 0.5d;
        }
        return (int) d;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent setMax(isStopped isstopped) {
        sendAccessibilityEvent sendaccessibilityevent;
        if (isstopped != null) {
            ensureProcessorRunningLocked ensureprocessorrunninglocked = this.getMax;
            if (isstopped == null) {
                sendaccessibilityevent = ensureProcessorRunningLocked.length;
            } else {
                sendaccessibilityevent = ensureprocessorrunninglocked.length(isstopped);
            }
            if (!(sendaccessibilityevent == null || sendaccessibilityevent == ensureProcessorRunningLocked.length)) {
                YogaNode yogaNode = this.length;
                this.length.length(sendaccessibilityevent.length, yogaNode.setMax == null ? 0 : yogaNode.setMax.size());
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public sendAccessibilityEvent setMax(@Nullable onPerformActionForVirtualView<? extends Drawable> onperformactionforvirtualview) {
        Drawable drawable;
        this.toIntRange |= 262144;
        this.isInside = onperformactionforvirtualview;
        if (!(onperformactionforvirtualview == null || (drawable = (Drawable) onPerformActionForVirtualView.setMin(onperformactionforvirtualview)) == null)) {
            Rect isInside2 = NotificationCompatSideChannelService.isInside();
            if (setMax(drawable, isInside2)) {
                setMax(YogaEdge.LEFT, isInside2.left);
                setMax(YogaEdge.TOP, isInside2.top);
                setMax(YogaEdge.RIGHT, isInside2.right);
                setMax(YogaEdge.BOTTOM, isInside2.bottom);
            }
            NotificationCompatSideChannelService.setMax(isInside2);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent length(@Nullable getVirtualViewAt getvirtualviewat) {
        this.toIntRange |= 524288;
        this.equals = getvirtualviewat;
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent onPostMessage() {
        this.ICustomTabsCallback$Stub$Proxy = true;
        return this;
    }

    public final boolean extraCallback() {
        return this.ICustomTabsCallback$Stub$Proxy;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent setMin(@Nullable IconCompat<onRequestFocusInDescendants> iconCompat) {
        this.toIntRange |= ConvertUtils.MB;
        IconCompat<onRequestFocusInDescendants> iconCompat2 = this.invoke;
        if (iconCompat2 != null) {
            if (iconCompat == null) {
                iconCompat = iconCompat2;
            } else {
                iconCompat = new insert<>(iconCompat2, iconCompat);
            }
        }
        this.invoke = iconCompat;
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent length(@Nullable IconCompat<FontsContractCompat$FontRequestCallback$FontRequestFailReason> iconCompat) {
        this.toIntRange |= 2097152;
        IconCompat<FontsContractCompat$FontRequestCallback$FontRequestFailReason> iconCompat2 = this.onNavigationEvent;
        if (iconCompat2 != null) {
            if (iconCompat == null) {
                iconCompat = iconCompat2;
            } else {
                iconCompat = new insert<>(iconCompat2, iconCompat);
            }
        }
        this.onNavigationEvent = iconCompat;
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent toIntRange(@Nullable IconCompat<computeHorizontalScrollOffset> iconCompat) {
        this.toIntRange |= 16777216;
        IconCompat<computeHorizontalScrollOffset> iconCompat2 = this.b;
        if (iconCompat2 != null) {
            if (iconCompat == null) {
                iconCompat = iconCompat2;
            } else {
                iconCompat = new insert<>(iconCompat2, iconCompat);
            }
        }
        this.b = iconCompat;
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent equals(@Nullable IconCompat<ParseException> iconCompat) {
        this.toIntRange |= 4194304;
        IconCompat<ParseException> iconCompat2 = this.ICustomTabsCallback;
        if (iconCompat2 != null) {
            if (iconCompat == null) {
                iconCompat = iconCompat2;
            } else {
                iconCompat = new insert<>(iconCompat2, iconCompat);
            }
        }
        this.ICustomTabsCallback = iconCompat;
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent toFloatRange(@Nullable IconCompat<LinkifyCompat$LinkifyMask> iconCompat) {
        this.toIntRange |= 8388608;
        IconCompat<LinkifyCompat$LinkifyMask> iconCompat2 = this.create;
        if (iconCompat2 != null) {
            if (iconCompat == null) {
                iconCompat = iconCompat2;
            } else {
                iconCompat = new insert<>(iconCompat2, iconCompat);
            }
        }
        this.create = iconCompat;
        return this;
    }

    @Nullable
    static <T> IconCompat<T> setMin(@Nullable IconCompat<T> iconCompat, @Nullable IconCompat<T> iconCompat2) {
        if (iconCompat == null) {
            return iconCompat2;
        }
        return iconCompat2 == null ? iconCompat : new insert(iconCompat, iconCompat2);
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent setMax(String str) {
        if (Build.VERSION.SDK_INT >= 14 && !TextUtils.isEmpty(str)) {
            this.toIntRange |= 134217728;
            this.Grayscale$Algorithm = str;
        }
        return this;
    }

    public final boolean onRelationshipValidationResult() {
        return !TextUtils.isEmpty(this.Grayscale$Algorithm);
    }

    public void setMin(YogaBaselineFunction yogaBaselineFunction) {
        YogaNode yogaNode = this.length;
        yogaNode.getMax = yogaBaselineFunction;
        YogaNode.jni_YGNodeSetHasBaselineFunc(yogaNode.getMin, yogaBaselineFunction != null);
    }

    public final boolean extraCallbackWithResult() {
        return this.length.getMax();
    }

    public final void length(sendAccessibilityEvent sendaccessibilityevent) {
        sendAccessibilityEvent sendaccessibilityevent2;
        while (keyToDirection.getMax) {
            RemoteInput$EditChoicesBeforeSending.getMax(this.getMax, sendaccessibilityevent);
            YogaNode yogaNode = sendaccessibilityevent.length;
            int size = yogaNode.setMax == null ? 0 : yogaNode.setMax.size();
            for (int i = 0; i < size; i++) {
                if (sendaccessibilityevent.length.setMin(i) == null) {
                    sendaccessibilityevent2 = null;
                } else {
                    sendaccessibilityevent2 = (sendAccessibilityEvent) sendaccessibilityevent.length.setMin(i).toFloatRange;
                }
                length(sendaccessibilityevent2);
            }
            if (sendaccessibilityevent.ICustomTabsCallback$Stub()) {
                sendaccessibilityevent = sendaccessibilityevent.toFloatRange;
            } else {
                return;
            }
        }
    }

    @Nullable
    public final sendAccessibilityEvent onMessageChannelReady() {
        YogaNode yogaNode = this.length;
        if (yogaNode == null || yogaNode.setMin == null) {
            return null;
        }
        return (sendAccessibilityEvent) this.length.setMin.toFloatRange;
    }

    public final sendAccessibilityEvent hashCode(int i) {
        YogaNode yogaNode = this.length;
        if (yogaNode.setMax != null) {
            YogaNode remove = yogaNode.setMax.remove(i);
            remove.setMin = null;
            YogaNode.jni_YGNodeRemoveChild(yogaNode.getMin, remove.getMin);
            return (sendAccessibilityEvent) remove.toFloatRange;
        }
        throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
    }

    private float setMax(onFontRetrieved onfontretrieved, YogaEdge yogaEdge) {
        YogaEdge yogaEdge2;
        boolean z = YogaDirection.fromInt(this.length.mLayoutDirection) == YogaDirection.RTL;
        int i = AnonymousClass2.setMax[yogaEdge.ordinal()];
        if (i != 1) {
            if (i == 2) {
                yogaEdge2 = z ? YogaEdge.START : YogaEdge.END;
            } else {
                throw new IllegalArgumentException("Not an horizontal padding edge: ".concat(String.valueOf(yogaEdge)));
            }
        } else if (z) {
            yogaEdge2 = YogaEdge.END;
        } else {
            yogaEdge2 = YogaEdge.START;
        }
        float f = onfontretrieved.length[yogaEdge2.intValue()];
        return clampViewPositionHorizontal.length(f) ? onfontretrieved.length(yogaEdge) : f;
    }

    /* renamed from: o.sendAccessibilityEvent$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] setMax;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.facebook.yoga.YogaEdge[] r0 = com.facebook.yoga.YogaEdge.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMax = r0
                com.facebook.yoga.YogaEdge r1 = com.facebook.yoga.YogaEdge.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.yoga.YogaEdge r1 = com.facebook.yoga.YogaEdge.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.sendAccessibilityEvent.AnonymousClass2.<clinit>():void");
        }
    }

    private boolean ICustomTabsCallback$Stub$Proxy() {
        for (int i : this.IsOverlapping) {
            if (i != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean asInterface() {
        if (ICustomTabsCallback$Stub$Proxy()) {
            return (this.length.getMin(YogaEdge.LEFT) == 0.0f && this.length.getMin(YogaEdge.TOP) == 0.0f && this.length.getMin(YogaEdge.RIGHT) == 0.0f && this.length.getMin(YogaEdge.BOTTOM) == 0.0f) ? false : true;
        }
        return false;
    }

    public void getMin(isStopped isstopped) {
        this.setMax.add(isstopped);
    }

    public final boolean ICustomTabsCallback$Stub() {
        return this.toFloatRange != null;
    }

    public void setMin(sendAccessibilityEvent sendaccessibilityevent) {
        sendaccessibilityevent.ICustomTabsService = this;
        this.toFloatRange = sendaccessibilityevent;
    }

    public final boolean asBinder() {
        return this.getDefaultImpl;
    }

    /* access modifiers changed from: package-private */
    public void getMin(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == dispatchNestedPreFling.setMin.isInside) {
                int layoutDimension = typedArray.getLayoutDimension(index, -1);
                if (layoutDimension >= 0) {
                    setMin(layoutDimension);
                }
            } else if (index == dispatchNestedPreFling.setMin.IsOverlapping) {
                int layoutDimension2 = typedArray.getLayoutDimension(index, -1);
                if (layoutDimension2 >= 0) {
                    equals(layoutDimension2);
                }
            } else if (index == dispatchNestedPreFling.setMin.Grayscale$Algorithm) {
                isInside(typedArray.getDimensionPixelSize(index, 0));
            } else if (index == dispatchNestedPreFling.setMin.invoke) {
                toFloatRange(typedArray.getDimensionPixelSize(index, 0));
            } else if (index == dispatchNestedPreFling.setMin.setMax) {
                setMax(YogaEdge.LEFT, typedArray.getDimensionPixelOffset(index, 0));
            } else if (index == dispatchNestedPreFling.setMin.getMin) {
                setMax(YogaEdge.TOP, typedArray.getDimensionPixelOffset(index, 0));
            } else if (index == dispatchNestedPreFling.setMin.toFloatRange) {
                setMax(YogaEdge.RIGHT, typedArray.getDimensionPixelOffset(index, 0));
            } else if (index == dispatchNestedPreFling.setMin.toIntRange) {
                setMax(YogaEdge.BOTTOM, typedArray.getDimensionPixelOffset(index, 0));
            } else if (index == dispatchNestedPreFling.setMin.onNavigationEvent && getInterfaceDescriptor) {
                setMax(YogaEdge.START, typedArray.getDimensionPixelOffset(index, 0));
            } else if (index == dispatchNestedPreFling.setMin.create && getInterfaceDescriptor) {
                setMax(YogaEdge.END, typedArray.getDimensionPixelOffset(index, 0));
            } else if (index == dispatchNestedPreFling.setMin.setMin) {
                setMax(YogaEdge.ALL, typedArray.getDimensionPixelOffset(index, 0));
            } else if (index == dispatchNestedPreFling.setMin.toString) {
                getMax(YogaEdge.LEFT, typedArray.getDimensionPixelOffset(index, 0));
            } else if (index == dispatchNestedPreFling.setMin.hashCode) {
                getMax(YogaEdge.TOP, typedArray.getDimensionPixelOffset(index, 0));
            } else if (index == dispatchNestedPreFling.setMin.FastBitmap$CoordinateSystem) {
                getMax(YogaEdge.RIGHT, typedArray.getDimensionPixelOffset(index, 0));
            } else if (index == dispatchNestedPreFling.setMin.toDoubleRange) {
                getMax(YogaEdge.BOTTOM, typedArray.getDimensionPixelOffset(index, 0));
            } else if (index == dispatchNestedPreFling.setMin.b && getInterfaceDescriptor) {
                getMax(YogaEdge.START, typedArray.getDimensionPixelOffset(index, 0));
            } else if (index == dispatchNestedPreFling.setMin.ICustomTabsCallback && getInterfaceDescriptor) {
                getMax(YogaEdge.END, typedArray.getDimensionPixelOffset(index, 0));
            } else if (index == dispatchNestedPreFling.setMin.values) {
                getMax(YogaEdge.ALL, typedArray.getDimensionPixelOffset(index, 0));
            } else if (index == dispatchNestedPreFling.setMin.Mean$Arithmetic && Build.VERSION.SDK_INT >= 16) {
                length(typedArray.getInt(index, 0));
            } else if (index == dispatchNestedPreFling.setMin.equals) {
                length(typedArray.getBoolean(index, false));
            } else if (index == dispatchNestedPreFling.setMin.length) {
                if (computeVerticalScrollOffset.setMin(typedArray, dispatchNestedPreFling.setMin.length)) {
                    getMin((getVirtualViewAt) new requestKeyboardFocusForVirtualView(typedArray.getColor(index, 0)));
                } else {
                    int resourceId = typedArray.getResourceId(index, -1);
                    if (resourceId == 0) {
                        getMin((getVirtualViewAt) null);
                    } else {
                        Context context = this.getMax.setMin;
                        getMin((getVirtualViewAt) new onPopulateEventForVirtualView(resourceId, new Configuration(context.getResources().getConfiguration()), IntRange.length(context, resourceId)));
                    }
                }
            } else if (index == dispatchNestedPreFling.setMin.valueOf) {
                if (computeVerticalScrollOffset.setMin(typedArray, dispatchNestedPreFling.setMin.valueOf)) {
                    length((getVirtualViewAt) new requestKeyboardFocusForVirtualView(typedArray.getColor(index, 0)));
                } else {
                    int resourceId2 = typedArray.getResourceId(index, -1);
                    if (resourceId2 == 0) {
                        length((getVirtualViewAt) null);
                    } else {
                        Context context2 = this.getMax.setMin;
                        length((getVirtualViewAt) new onPopulateEventForVirtualView(resourceId2, new Configuration(context2.getResources().getConfiguration()), IntRange.length(context2, resourceId2)));
                    }
                }
            } else if (index == dispatchNestedPreFling.setMin.invokeSuspend) {
                setMax((CharSequence) typedArray.getString(index));
            } else if (index == dispatchNestedPreFling.setMin.extraCallback) {
                getMax(YogaFlexDirection.fromInt(typedArray.getInteger(index, 0)));
            } else if (index == dispatchNestedPreFling.setMin.setDefaultImpl) {
                length(YogaWrap.fromInt(typedArray.getInteger(index, 0)));
            } else if (index == dispatchNestedPreFling.setMin.onPostMessage) {
                length(YogaJustify.fromInt(typedArray.getInteger(index, 0)));
            } else if (index == dispatchNestedPreFling.setMin.extraCallbackWithResult) {
                getMin(YogaAlign.fromInt(typedArray.getInteger(index, 0)));
            } else if (index == dispatchNestedPreFling.setMin.onMessageChannelReady) {
                length(YogaAlign.fromInt(typedArray.getInteger(index, 0)));
            } else if (index == dispatchNestedPreFling.setMin.asBinder) {
                getMin(YogaPositionType.fromInt(typedArray.getInteger(index, 0)));
            } else if (index == dispatchNestedPreFling.setMin.getCause) {
                float f = typedArray.getFloat(index, -1.0f);
                if (f >= 0.0f) {
                    setMax(f);
                }
            } else if (index == dispatchNestedPreFling.setMin.asInterface) {
                setMin(YogaEdge.LEFT, typedArray.getDimensionPixelOffset(index, 0));
            } else if (index == dispatchNestedPreFling.setMin.onTransact) {
                setMin(YogaEdge.TOP, typedArray.getDimensionPixelOffset(index, 0));
            } else if (index == dispatchNestedPreFling.setMin.ICustomTabsCallback$Stub) {
                setMin(YogaEdge.RIGHT, typedArray.getDimensionPixelOffset(index, 0));
            } else if (index == dispatchNestedPreFling.setMin.onRelationshipValidationResult) {
                setMin(YogaEdge.BOTTOM, typedArray.getDimensionPixelOffset(index, 0));
            } else if (index == dispatchNestedPreFling.setMin.ICustomTabsCallback$Default) {
                setMax(YogaDirection.fromInt(typedArray.getInteger(index, -1)));
            }
        }
    }

    public final void ICustomTabsCallback$Default() {
        if (!keyToDirection.ICustomTabsCallback$Default) {
            YogaNode yogaNode = this.length;
            if (yogaNode != null) {
                if (yogaNode.setMin == null) {
                    YogaNode yogaNode2 = this.length;
                    if ((yogaNode2.setMax == null ? 0 : yogaNode2.setMax.size()) <= 0) {
                        NotificationCompatSideChannelService.getMin(this.length);
                        this.length = null;
                    }
                }
                throw new IllegalStateException("You should not free an attached Internalnode");
            }
            this.ICustomTabsCallback$Default.clear();
            this.mayLaunchUrl = 1.0E21f;
            this.warmup = 1.0E21f;
            this.newSessionWithExtras = 1.0E21f;
            this.postMessage = 1.0E21f;
            this.requestPostMessageChannelWithExtras = 1.0E21f;
            this.validateRelationship = 1.0E21f;
            this.getMax = null;
            this.setMax.clear();
            this.toFloatRange = null;
            this.ICustomTabsService = null;
            ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = this.FastBitmap$CoordinateSystem;
            if (viewCompat$ScrollIndicators != null) {
                viewCompat$ScrollIndicators.IsOverlapping();
                this.FastBitmap$CoordinateSystem = null;
            }
            this.getMin = 0;
            this.getDefaultImpl = false;
            this.isInside = null;
            this.equals = null;
            this.ICustomTabsCallback$Stub$Proxy = false;
            this.Mean$Arithmetic = 0.0f;
            this.invokeSuspend = 0.0f;
            this.invoke = null;
            this.onNavigationEvent = null;
            this.b = null;
            this.ICustomTabsCallback = null;
            this.create = null;
            this.toIntRange = 0;
            this.Grayscale$Algorithm = null;
            this.valueOf = null;
            Arrays.fill(this.IsOverlapping, 0);
            Arrays.fill(this.toDoubleRange, 0.0f);
            this.extraCommand = null;
            onFontRetrieved onfontretrieved = this.extraCallback;
            if (onfontretrieved != null) {
                NotificationCompatSideChannelService.setMax(onfontretrieved);
                this.extraCallback = null;
            }
            onFontRetrieved onfontretrieved2 = this.setDefaultImpl;
            if (onfontretrieved2 != null) {
                NotificationCompatSideChannelService.setMax(onfontretrieved2);
                this.setDefaultImpl = null;
            }
            onFontRetrieved onfontretrieved3 = this.newSession;
            if (onfontretrieved3 != null) {
                NotificationCompatSideChannelService.setMax(onfontretrieved3);
                this.newSession = null;
            }
            this.requestPostMessageChannel = -1;
            this.updateVisuals = -1;
            this.onRelationshipValidationResult = -1.0f;
            this.extraCallbackWithResult = -1.0f;
            this.onPostMessage = null;
            this.receiveFile = false;
            this.setMin = false;
            this.onMessageChannelReady = null;
            this.asBinder = null;
            this.ICustomTabsCallback$Stub = null;
            this.onTransact = null;
            this.asInterface = null;
            this.values = null;
            this.toString = 0;
            NotificationCompatSideChannelService.getMax(this);
        }
    }

    public static boolean getMax(sendAccessibilityEvent sendaccessibilityevent, sendAccessibilityEvent sendaccessibilityevent2) {
        return (((sendaccessibilityevent2.toIntRange & 1) > 0 ? 1 : ((sendaccessibilityevent2.toIntRange & 1) == 0 ? 0 : -1)) != 0) || (YogaDirection.fromInt(sendaccessibilityevent2.length.mLayoutDirection) == YogaDirection.fromInt(sendaccessibilityevent.length.mLayoutDirection));
    }

    private void getMin(YogaEdge yogaEdge, boolean z) {
        if (this.extraCommand == null && z) {
            this.extraCommand = new boolean[(YogaEdge.ALL.intValue() + 1)];
        }
        boolean[] zArr = this.extraCommand;
        if (zArr != null) {
            zArr[yogaEdge.intValue()] = z;
        }
    }

    public static void getMax(sendAccessibilityEvent sendaccessibilityevent) {
        LinkedList linkedList;
        if ((sendaccessibilityevent.toIntRange & 2) != 0) {
            linkedList = new LinkedList();
            linkedList.add("alignSelf");
        } else {
            linkedList = null;
        }
        if ((sendaccessibilityevent.toIntRange & 4) != 0) {
            if (linkedList == null) {
                linkedList = new LinkedList();
            }
            linkedList.add("positionType");
        }
        if ((sendaccessibilityevent.toIntRange & 8) != 0) {
            if (linkedList == null) {
                linkedList = new LinkedList();
            }
            linkedList.add("flex");
        }
        if ((sendaccessibilityevent.toIntRange & 16) != 0) {
            if (linkedList == null) {
                linkedList = new LinkedList();
            }
            linkedList.add("flexGrow");
        }
        if ((sendaccessibilityevent.toIntRange & 512) != 0) {
            if (linkedList == null) {
                linkedList = new LinkedList();
            }
            linkedList.add("margin");
        }
        if (linkedList != null) {
            TextUtils.join(", ", linkedList);
            if (sendaccessibilityevent.getMax.getMin != null) {
                ComponentsLogger.LogLevel logLevel = ComponentsLogger.LogLevel.WARNING;
                if (sendaccessibilityevent.setMax.size() != 0) {
                    sendaccessibilityevent.setMax.get(0);
                }
            }
        }
    }

    private static boolean setMax(Drawable drawable, Rect rect) {
        drawable.getPadding(rect);
        return (rect.bottom == 0 && rect.top == 0 && rect.left == 0 && rect.right == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void length(YogaNode yogaNode, ensureProcessorRunningLocked ensureprocessorrunninglocked) {
        if (yogaNode != null) {
            yogaNode.toFloatRange = this;
        }
        this.length = yogaNode;
        this.getMax = ensureprocessorrunninglocked;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent getMin(@Nullable getVirtualViewAt getvirtualviewat) {
        return setMax((onPerformActionForVirtualView<? extends Drawable>) getvirtualviewat != null ? new onPopulateNodeForHost(getvirtualviewat) : null);
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent getMax(IconCompat<FrameMetricsAggregator$MetricType> iconCompat) {
        if (this.FastBitmap$CoordinateSystem == null) {
            ViewCompat$ScrollIndicators min = NotificationCompatSideChannelService.setMin();
            if (min.getMax.getAndSet(1) == 0) {
                this.FastBitmap$CoordinateSystem = min;
            } else {
                throw new IllegalStateException("The NodeInfo reference acquired from the pool  wasn't correctly released.");
            }
        }
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = this.FastBitmap$CoordinateSystem;
        viewCompat$ScrollIndicators.onPostMessage |= 8;
        viewCompat$ScrollIndicators.values = iconCompat;
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent getMin(IconCompat<GnssStatusCompat$ConstellationType> iconCompat) {
        if (this.FastBitmap$CoordinateSystem == null) {
            ViewCompat$ScrollIndicators min = NotificationCompatSideChannelService.setMin();
            if (min.getMax.getAndSet(1) == 0) {
                this.FastBitmap$CoordinateSystem = min;
            } else {
                throw new IllegalStateException("The NodeInfo reference acquired from the pool  wasn't correctly released.");
            }
        }
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = this.FastBitmap$CoordinateSystem;
        viewCompat$ScrollIndicators.onPostMessage |= 131072;
        viewCompat$ScrollIndicators.toString = iconCompat;
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent setMax(IconCompat<fullScroll> iconCompat) {
        if (this.FastBitmap$CoordinateSystem == null) {
            ViewCompat$ScrollIndicators min = NotificationCompatSideChannelService.setMin();
            if (min.getMax.getAndSet(1) == 0) {
                this.FastBitmap$CoordinateSystem = min;
            } else {
                throw new IllegalStateException("The NodeInfo reference acquired from the pool  wasn't correctly released.");
            }
        }
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = this.FastBitmap$CoordinateSystem;
        viewCompat$ScrollIndicators.onPostMessage |= 32;
        viewCompat$ScrollIndicators.toDoubleRange = iconCompat;
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent setMax(CharSequence charSequence) {
        if (this.FastBitmap$CoordinateSystem == null) {
            ViewCompat$ScrollIndicators min = NotificationCompatSideChannelService.setMin();
            if (min.getMax.getAndSet(1) == 0) {
                this.FastBitmap$CoordinateSystem = min;
            } else {
                throw new IllegalStateException("The NodeInfo reference acquired from the pool  wasn't correctly released.");
            }
        }
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = this.FastBitmap$CoordinateSystem;
        viewCompat$ScrollIndicators.onPostMessage = 1 | viewCompat$ScrollIndicators.onPostMessage;
        viewCompat$ScrollIndicators.setMax = charSequence;
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent getMax(Object obj) {
        if (this.FastBitmap$CoordinateSystem == null) {
            ViewCompat$ScrollIndicators min = NotificationCompatSideChannelService.setMin();
            if (min.getMax.getAndSet(1) == 0) {
                this.FastBitmap$CoordinateSystem = min;
            } else {
                throw new IllegalStateException("The NodeInfo reference acquired from the pool  wasn't correctly released.");
            }
        }
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = this.FastBitmap$CoordinateSystem;
        viewCompat$ScrollIndicators.onPostMessage |= 2;
        viewCompat$ScrollIndicators.length = obj;
        return this;
    }

    /* access modifiers changed from: package-private */
    public sendAccessibilityEvent getMax(SparseArray<Object> sparseArray) {
        if (this.FastBitmap$CoordinateSystem == null) {
            ViewCompat$ScrollIndicators min = NotificationCompatSideChannelService.setMin();
            if (min.getMax.getAndSet(1) == 0) {
                this.FastBitmap$CoordinateSystem = min;
            } else {
                throw new IllegalStateException("The NodeInfo reference acquired from the pool  wasn't correctly released.");
            }
        }
        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = this.FastBitmap$CoordinateSystem;
        viewCompat$ScrollIndicators.onPostMessage |= 4;
        viewCompat$ScrollIndicators.setMin = sparseArray;
        return this;
    }

    public void toDoubleRange(int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            YogaNode.jni_YGNodeStyleSetMaxWidth(this.length.getMin, (float) View.MeasureSpec.getSize(i));
        } else if (mode == 0) {
            YogaNode.jni_YGNodeStyleSetWidth(this.length.getMin, 1.0E21f);
        } else if (mode == 1073741824) {
            YogaNode.jni_YGNodeStyleSetWidth(this.length.getMin, (float) View.MeasureSpec.getSize(i));
        }
    }

    public void FastBitmap$CoordinateSystem(int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            YogaNode.jni_YGNodeStyleSetMaxHeight(this.length.getMin, (float) View.MeasureSpec.getSize(i));
        } else if (mode == 0) {
            YogaNode.jni_YGNodeStyleSetHeight(this.length.getMin, 1.0E21f);
        } else if (mode == 1073741824) {
            YogaNode.jni_YGNodeStyleSetHeight(this.length.getMin, (float) View.MeasureSpec.getSize(i));
        }
    }
}
