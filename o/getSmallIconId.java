package o;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import o.ITrustedWebActivityCallback;

public class getSmallIconId extends notifyNotificationWithChannel implements DialogInterface {
    public final AlertController getMax = new AlertController(getContext(), this, getWindow());

    protected getSmallIconId(@NonNull Context context, @StyleRes int i) {
        super(context, getMax(context, i));
    }

    static int getMax(@NonNull Context context, @StyleRes int i) {
        if (((i >>> 24) & 255) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(ITrustedWebActivityCallback.Stub.getMin.Grayscale$Algorithm, typedValue, true);
        return typedValue.resourceId;
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.getMax;
        alertController.setMax = charSequence;
        if (alertController.asBinder != null) {
            alertController.asBinder.setText(charSequence);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int i;
        View view;
        boolean z;
        View findViewById;
        View view2;
        View findViewById2;
        super.onCreate(bundle);
        AlertController alertController = this.getMax;
        if (alertController.ICustomTabsService == 0 || alertController.newSessionWithExtras != 1) {
            i = alertController.setDefaultImpl;
        } else {
            i = alertController.ICustomTabsService;
        }
        alertController.setMin.setContentView(i);
        View findViewById3 = alertController.getMax.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.extraCallback);
        View findViewById4 = findViewById3.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.updateVisuals);
        View findViewById5 = findViewById3.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.toDoubleRange);
        View findViewById6 = findViewById3.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.values);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.invokeSuspend);
        View view3 = null;
        char c = 0;
        if (alertController.IsOverlapping != null) {
            view = alertController.IsOverlapping;
        } else {
            view = alertController.isInside != 0 ? LayoutInflater.from(alertController.getMin).inflate(alertController.isInside, viewGroup, false) : null;
        }
        boolean z2 = view != null;
        if (!z2 || !AlertController.setMax(view)) {
            alertController.getMax.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) alertController.getMax.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.hashCode);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.toString) {
                frameLayout.setPadding(alertController.toIntRange, alertController.values, alertController.FastBitmap$CoordinateSystem, alertController.toDoubleRange);
            }
            if (alertController.toFloatRange != null) {
                ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams()).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById7 = viewGroup.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.updateVisuals);
        View findViewById8 = viewGroup.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.toDoubleRange);
        View findViewById9 = viewGroup.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.values);
        ViewGroup max = AlertController.setMax(findViewById7, findViewById4);
        ViewGroup max2 = AlertController.setMax(findViewById8, findViewById5);
        ViewGroup max3 = AlertController.setMax(findViewById9, findViewById6);
        alertController.onPostMessage = (NestedScrollView) alertController.getMax.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.onRelationshipValidationResult);
        alertController.onPostMessage.setFocusable(false);
        alertController.onPostMessage.setNestedScrollingEnabled(false);
        alertController.onTransact = (TextView) max2.findViewById(16908299);
        if (alertController.onTransact != null) {
            if (alertController.equals != null) {
                alertController.onTransact.setText(alertController.equals);
            } else {
                alertController.onTransact.setVisibility(8);
                alertController.onPostMessage.removeView(alertController.onTransact);
                if (alertController.toFloatRange != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.onPostMessage.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.onPostMessage);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.toFloatRange, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    max2.setVisibility(8);
                }
            }
        }
        alertController.hashCode = (Button) max3.findViewById(16908313);
        alertController.hashCode.setOnClickListener(alertController.warmup);
        if (!TextUtils.isEmpty(alertController.Grayscale$Algorithm) || alertController.invoke != null) {
            alertController.hashCode.setText(alertController.Grayscale$Algorithm);
            if (alertController.invoke != null) {
                alertController.invoke.setBounds(0, 0, alertController.length, alertController.length);
                alertController.hashCode.setCompoundDrawables(alertController.invoke, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            alertController.hashCode.setVisibility(0);
            z = true;
        } else {
            alertController.hashCode.setVisibility(8);
            z = false;
        }
        alertController.invokeSuspend = (Button) max3.findViewById(16908314);
        alertController.invokeSuspend.setOnClickListener(alertController.warmup);
        if (!TextUtils.isEmpty(alertController.valueOf) || alertController.onNavigationEvent != null) {
            alertController.invokeSuspend.setText(alertController.valueOf);
            if (alertController.onNavigationEvent != null) {
                alertController.onNavigationEvent.setBounds(0, 0, alertController.length, alertController.length);
                alertController.invokeSuspend.setCompoundDrawables(alertController.onNavigationEvent, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            alertController.invokeSuspend.setVisibility(0);
            z |= true;
        } else {
            alertController.invokeSuspend.setVisibility(8);
        }
        alertController.ICustomTabsCallback = (Button) max3.findViewById(16908315);
        alertController.ICustomTabsCallback.setOnClickListener(alertController.warmup);
        if (!TextUtils.isEmpty(alertController.create) || alertController.onRelationshipValidationResult != null) {
            alertController.ICustomTabsCallback.setText(alertController.create);
            if (alertController.onRelationshipValidationResult != null) {
                alertController.onRelationshipValidationResult.setBounds(0, 0, alertController.length, alertController.length);
                alertController.ICustomTabsCallback.setCompoundDrawables(alertController.onRelationshipValidationResult, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            alertController.ICustomTabsCallback.setVisibility(0);
            z |= true;
        } else {
            alertController.ICustomTabsCallback.setVisibility(8);
        }
        if (AlertController.getMax(alertController.getMin)) {
            if (z) {
                Button button = alertController.hashCode;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button.setLayoutParams(layoutParams);
            } else if (z) {
                Button button2 = alertController.invokeSuspend;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button2.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button2.setLayoutParams(layoutParams2);
            } else if (z) {
                Button button3 = alertController.ICustomTabsCallback;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button3.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button3.setLayoutParams(layoutParams3);
            }
        }
        if (!(z)) {
            max3.setVisibility(8);
        }
        if (alertController.asInterface != null) {
            max.addView(alertController.asInterface, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.getMax.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.requestPostMessageChannelWithExtras).setVisibility(8);
        } else {
            alertController.extraCallbackWithResult = (ImageView) alertController.getMax.findViewById(16908294);
            if (!(!TextUtils.isEmpty(alertController.setMax)) || !alertController.mayLaunchUrl) {
                alertController.getMax.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.requestPostMessageChannelWithExtras).setVisibility(8);
                alertController.extraCallbackWithResult.setVisibility(8);
                max.setVisibility(8);
            } else {
                alertController.asBinder = (TextView) alertController.getMax.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.toString);
                alertController.asBinder.setText(alertController.setMax);
                if (alertController.onMessageChannelReady != 0) {
                    alertController.extraCallbackWithResult.setImageResource(alertController.onMessageChannelReady);
                } else if (alertController.extraCallback != null) {
                    alertController.extraCallbackWithResult.setImageDrawable(alertController.extraCallback);
                } else {
                    alertController.asBinder.setPadding(alertController.extraCallbackWithResult.getPaddingLeft(), alertController.extraCallbackWithResult.getPaddingTop(), alertController.extraCallbackWithResult.getPaddingRight(), alertController.extraCallbackWithResult.getPaddingBottom());
                    alertController.extraCallbackWithResult.setVisibility(8);
                }
            }
        }
        boolean z3 = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z4 = (max == null || max.getVisibility() == 8) ? false : true;
        boolean z5 = (max3 == null || max3.getVisibility() == 8) ? false : true;
        if (!(z5 || max2 == null || (findViewById2 = max2.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.extraCommand)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z4) {
            if (alertController.onPostMessage != null) {
                alertController.onPostMessage.setClipToPadding(true);
            }
            if (alertController.equals == null && alertController.toFloatRange == null) {
                view2 = null;
            } else {
                view2 = max.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.validateRelationship);
            }
            if (view2 != null) {
                view2.setVisibility(0);
            }
        } else if (!(max2 == null || (findViewById = max2.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.mayLaunchUrl)) == null)) {
            findViewById.setVisibility(0);
        }
        if (alertController.toFloatRange instanceof AlertController.RecycleListView) {
            ((AlertController.RecycleListView) alertController.toFloatRange).setHasDecor(z4, z5);
        }
        if (!z3) {
            View view4 = alertController.toFloatRange != null ? alertController.toFloatRange : alertController.onPostMessage;
            if (view4 != null) {
                if (z5) {
                    c = 2;
                }
                boolean z6 = z4 | c;
                View findViewById10 = alertController.getMax.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.onMessageChannelReady);
                View findViewById11 = alertController.getMax.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.extraCallbackWithResult);
                if (Build.VERSION.SDK_INT >= 23) {
                    ViewCompat.setMax(view4, z6 ? 1 : 0, 3);
                    if (findViewById10 != null) {
                        max2.removeView(findViewById10);
                    }
                    if (findViewById11 != null) {
                        max2.removeView(findViewById11);
                    }
                } else {
                    if (findViewById10 != null && (!z6 || !true)) {
                        max2.removeView(findViewById10);
                        findViewById10 = null;
                    }
                    if (findViewById11 == null || (z6 && true)) {
                        view3 = findViewById11;
                    } else {
                        max2.removeView(findViewById11);
                    }
                    if (!(findViewById10 == null && view3 == null)) {
                        if (alertController.equals != null) {
                            alertController.onPostMessage.setOnScrollChangeListener(new NestedScrollView.setMax(findViewById10, view3) {
                                final /* synthetic */ View length;
                                final /* synthetic */ View setMin;

                                public final void setMax(
/*
Method generation error in method: androidx.appcompat.app.AlertController.2.setMax(androidx.core.widget.NestedScrollView, int, int, int, int):void, dex: classes.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: androidx.appcompat.app.AlertController.2.setMax(androidx.core.widget.NestedScrollView, int, int, int, int):void, class status: UNLOADED
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
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                            alertController.onPostMessage.post(new Runnable(findViewById10, view3) {
                                final /* synthetic */ View length;
                                final /* synthetic */ View setMax;

                                public final void run(
/*
Method generation error in method: androidx.appcompat.app.AlertController.3.run():void, dex: classes.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: androidx.appcompat.app.AlertController.3.run():void, class status: UNLOADED
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
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                        } else if (alertController.toFloatRange != null) {
                            alertController.toFloatRange.setOnScrollListener(new AbsListView.OnScrollListener(findViewById10, view3) {
                                final /* synthetic */ View getMax;
                                final /* synthetic */ View setMin;

                                public final void onScrollStateChanged(
/*
Method generation error in method: androidx.appcompat.app.AlertController.4.onScrollStateChanged(android.widget.AbsListView, int):void, dex: classes.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: androidx.appcompat.app.AlertController.4.onScrollStateChanged(android.widget.AbsListView, int):void, class status: UNLOADED
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
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
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
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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

                                public final void onScroll(
/*
Method generation error in method: androidx.appcompat.app.AlertController.4.onScroll(android.widget.AbsListView, int, int, int):void, dex: classes.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: androidx.appcompat.app.AlertController.4.onScroll(android.widget.AbsListView, int, int, int):void, class status: UNLOADED
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
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
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
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                            alertController.toFloatRange.post(new Runnable(findViewById10, view3) {
                                final /* synthetic */ View length;
                                final /* synthetic */ View setMin;

                                public final void run(
/*
Method generation error in method: androidx.appcompat.app.AlertController.5.run():void, dex: classes.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: androidx.appcompat.app.AlertController.5.run():void, class status: UNLOADED
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
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
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
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                        } else {
                            if (findViewById10 != null) {
                                max2.removeView(findViewById10);
                            }
                            if (view3 != null) {
                                max2.removeView(view3);
                            }
                        }
                    }
                }
            }
        }
        ListView listView = alertController.toFloatRange;
        if (listView != null && alertController.ICustomTabsCallback$Default != null) {
            listView.setAdapter(alertController.ICustomTabsCallback$Default);
            int i2 = alertController.ICustomTabsCallback$Stub;
            if (i2 >= 0) {
                listView.setItemChecked(i2, true);
                listView.setSelection(i2);
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.getMax.setMax(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.getMax.length(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public static class length {
        private final AlertController.length P;
        private final int mTheme;

        public length(@NonNull Context context) {
            this(context, getSmallIconId.getMax(context, 0));
        }

        public length(@NonNull Context context, @StyleRes int i) {
            this.P = new AlertController.length(new ContextThemeWrapper(context, getSmallIconId.getMax(context, i)));
            this.mTheme = i;
        }

        @NonNull
        public Context getContext() {
            return this.P.getMin;
        }

        public length setTitle(@StringRes int i) {
            AlertController.length length = this.P;
            length.IsOverlapping = length.getMin.getText(i);
            return this;
        }

        public length setTitle(@Nullable CharSequence charSequence) {
            this.P.IsOverlapping = charSequence;
            return this;
        }

        public length setCustomTitle(@Nullable View view) {
            this.P.toIntRange = view;
            return this;
        }

        public length setMessage(@StringRes int i) {
            AlertController.length length = this.P;
            length.equals = length.getMin.getText(i);
            return this;
        }

        public length setMessage(@Nullable CharSequence charSequence) {
            this.P.equals = charSequence;
            return this;
        }

        public length setIcon(@DrawableRes int i) {
            this.P.setMax = i;
            return this;
        }

        public length setIcon(@Nullable Drawable drawable) {
            this.P.getMax = drawable;
            return this;
        }

        public length setIconAttribute(@AttrRes int i) {
            TypedValue typedValue = new TypedValue();
            this.P.getMin.getTheme().resolveAttribute(i, typedValue, true);
            this.P.setMax = typedValue.resourceId;
            return this;
        }

        public length setPositiveButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.length length = this.P;
            length.toFloatRange = length.getMin.getText(i);
            this.P.values = onClickListener;
            return this;
        }

        public length setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.P.toFloatRange = charSequence;
            this.P.values = onClickListener;
            return this;
        }

        public length setPositiveButtonIcon(Drawable drawable) {
            this.P.isInside = drawable;
            return this;
        }

        public length setNegativeButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.length length = this.P;
            length.toDoubleRange = length.getMin.getText(i);
            this.P.hashCode = onClickListener;
            return this;
        }

        public length setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.P.toDoubleRange = charSequence;
            this.P.hashCode = onClickListener;
            return this;
        }

        public length setNegativeButtonIcon(Drawable drawable) {
            this.P.FastBitmap$CoordinateSystem = drawable;
            return this;
        }

        public length setNeutralButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.length length = this.P;
            length.toString = length.getMin.getText(i);
            this.P.Grayscale$Algorithm = onClickListener;
            return this;
        }

        public length setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.P.toString = charSequence;
            this.P.Grayscale$Algorithm = onClickListener;
            return this;
        }

        public length setNeutralButtonIcon(Drawable drawable) {
            this.P.Mean$Arithmetic = drawable;
            return this;
        }

        public length setCancelable(boolean z) {
            this.P.invoke = z;
            return this;
        }

        public length setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.P.invokeSuspend = onCancelListener;
            return this;
        }

        public length setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.P.valueOf = onDismissListener;
            return this;
        }

        public length setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.P.getCause = onKeyListener;
            return this;
        }

        public length setItems(@ArrayRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.length length = this.P;
            length.b = length.getMin.getResources().getTextArray(i);
            this.P.onNavigationEvent = onClickListener;
            return this;
        }

        public length setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            this.P.b = charSequenceArr;
            this.P.onNavigationEvent = onClickListener;
            return this;
        }

        public length setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            this.P.ICustomTabsCallback = listAdapter;
            this.P.onNavigationEvent = onClickListener;
            return this;
        }

        public length setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            this.P.ICustomTabsService = cursor;
            this.P.ICustomTabsCallback$Stub$Proxy = str;
            this.P.onNavigationEvent = onClickListener;
            return this;
        }

        public length setMultiChoiceItems(@ArrayRes int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.length length = this.P;
            length.b = length.getMin.getResources().getTextArray(i);
            this.P.getInterfaceDescriptor = onMultiChoiceClickListener;
            this.P.onTransact = zArr;
            this.P.ICustomTabsCallback$Stub = true;
            return this;
        }

        public length setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            this.P.b = charSequenceArr;
            this.P.getInterfaceDescriptor = onMultiChoiceClickListener;
            this.P.onTransact = zArr;
            this.P.ICustomTabsCallback$Stub = true;
            return this;
        }

        public length setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            this.P.ICustomTabsService = cursor;
            this.P.getInterfaceDescriptor = onMultiChoiceClickListener;
            this.P.setDefaultImpl = str;
            this.P.ICustomTabsCallback$Stub$Proxy = str2;
            this.P.ICustomTabsCallback$Stub = true;
            return this;
        }

        public length setSingleChoiceItems(@ArrayRes int i, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.length length = this.P;
            length.b = length.getMin.getResources().getTextArray(i);
            this.P.onNavigationEvent = onClickListener;
            this.P.asInterface = i2;
            this.P.asBinder = true;
            return this;
        }

        public length setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
            this.P.ICustomTabsService = cursor;
            this.P.onNavigationEvent = onClickListener;
            this.P.asInterface = i;
            this.P.ICustomTabsCallback$Stub$Proxy = str;
            this.P.asBinder = true;
            return this;
        }

        public length setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            this.P.b = charSequenceArr;
            this.P.onNavigationEvent = onClickListener;
            this.P.asInterface = i;
            this.P.asBinder = true;
            return this;
        }

        public length setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            this.P.ICustomTabsCallback = listAdapter;
            this.P.onNavigationEvent = onClickListener;
            this.P.asInterface = i;
            this.P.asBinder = true;
            return this;
        }

        public length setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.P.mayLaunchUrl = onItemSelectedListener;
            return this;
        }

        public length setView(int i) {
            this.P.onPostMessage = null;
            this.P.create = i;
            this.P.ICustomTabsCallback$Default = false;
            return this;
        }

        public length setView(View view) {
            this.P.onPostMessage = view;
            this.P.create = 0;
            this.P.ICustomTabsCallback$Default = false;
            return this;
        }

        @Deprecated
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public length setView(View view, int i, int i2, int i3, int i4) {
            this.P.onPostMessage = view;
            this.P.create = 0;
            this.P.ICustomTabsCallback$Default = true;
            this.P.onRelationshipValidationResult = i;
            this.P.extraCallbackWithResult = i2;
            this.P.onMessageChannelReady = i3;
            this.P.extraCallback = i4;
            return this;
        }

        @Deprecated
        public length setInverseBackgroundForced(boolean z) {
            this.P.getDefaultImpl = z;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public length setRecycleOnMeasureEnabled(boolean z) {
            this.P.warmup = z;
            return this;
        }

        /* JADX WARNING: type inference failed for: r14v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r14v4 */
        /* JADX WARNING: type inference failed for: r14v5 */
        /* JADX WARNING: type inference failed for: r14v6 */
        /* JADX WARNING: type inference failed for: r4v32, types: [androidx.appcompat.app.AlertController$length$5] */
        /* JADX WARNING: type inference failed for: r4v33, types: [androidx.appcompat.app.AlertController$length$3] */
        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.NonNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public o.getSmallIconId create() {
            /*
                r20 = this;
                r0 = r20
                o.getSmallIconId r1 = new o.getSmallIconId
                androidx.appcompat.app.AlertController$length r2 = r0.P
                android.content.Context r2 = r2.getMin
                int r3 = r0.mTheme
                r1.<init>(r2, r3)
                androidx.appcompat.app.AlertController$length r2 = r0.P
                androidx.appcompat.app.AlertController r10 = r1.getMax
                android.view.View r3 = r2.toIntRange
                r11 = 1
                r12 = 0
                if (r3 == 0) goto L_0x001c
                android.view.View r3 = r2.toIntRange
                r10.asInterface = r3
                goto L_0x0071
            L_0x001c:
                java.lang.CharSequence r3 = r2.IsOverlapping
                if (r3 == 0) goto L_0x002d
                java.lang.CharSequence r3 = r2.IsOverlapping
                r10.setMax = r3
                android.widget.TextView r4 = r10.asBinder
                if (r4 == 0) goto L_0x002d
                android.widget.TextView r4 = r10.asBinder
                r4.setText(r3)
            L_0x002d:
                android.graphics.drawable.Drawable r3 = r2.getMax
                if (r3 == 0) goto L_0x004f
                android.graphics.drawable.Drawable r3 = r2.getMax
                r10.extraCallback = r3
                r10.onMessageChannelReady = r12
                android.widget.ImageView r4 = r10.extraCallbackWithResult
                if (r4 == 0) goto L_0x004f
                if (r3 == 0) goto L_0x0048
                android.widget.ImageView r4 = r10.extraCallbackWithResult
                r4.setVisibility(r12)
                android.widget.ImageView r4 = r10.extraCallbackWithResult
                r4.setImageDrawable(r3)
                goto L_0x004f
            L_0x0048:
                android.widget.ImageView r3 = r10.extraCallbackWithResult
                r4 = 8
                r3.setVisibility(r4)
            L_0x004f:
                int r3 = r2.setMax
                if (r3 == 0) goto L_0x0058
                int r3 = r2.setMax
                r10.setMax((int) r3)
            L_0x0058:
                int r3 = r2.setMin
                if (r3 == 0) goto L_0x0071
                int r3 = r2.setMin
                android.util.TypedValue r4 = new android.util.TypedValue
                r4.<init>()
                android.content.Context r5 = r10.getMin
                android.content.res.Resources$Theme r5 = r5.getTheme()
                r5.resolveAttribute(r3, r4, r11)
                int r3 = r4.resourceId
                r10.setMax((int) r3)
            L_0x0071:
                java.lang.CharSequence r3 = r2.equals
                if (r3 == 0) goto L_0x0082
                java.lang.CharSequence r3 = r2.equals
                r10.equals = r3
                android.widget.TextView r4 = r10.onTransact
                if (r4 == 0) goto L_0x0082
                android.widget.TextView r4 = r10.onTransact
                r4.setText(r3)
            L_0x0082:
                java.lang.CharSequence r3 = r2.toFloatRange
                if (r3 != 0) goto L_0x008a
                android.graphics.drawable.Drawable r3 = r2.isInside
                if (r3 == 0) goto L_0x0096
            L_0x008a:
                r4 = -1
                java.lang.CharSequence r5 = r2.toFloatRange
                android.content.DialogInterface$OnClickListener r6 = r2.values
                r7 = 0
                android.graphics.drawable.Drawable r8 = r2.isInside
                r3 = r10
                r3.length(r4, r5, r6, r7, r8)
            L_0x0096:
                java.lang.CharSequence r3 = r2.toDoubleRange
                if (r3 != 0) goto L_0x009e
                android.graphics.drawable.Drawable r3 = r2.FastBitmap$CoordinateSystem
                if (r3 == 0) goto L_0x00aa
            L_0x009e:
                r4 = -2
                java.lang.CharSequence r5 = r2.toDoubleRange
                android.content.DialogInterface$OnClickListener r6 = r2.hashCode
                r7 = 0
                android.graphics.drawable.Drawable r8 = r2.FastBitmap$CoordinateSystem
                r3 = r10
                r3.length(r4, r5, r6, r7, r8)
            L_0x00aa:
                java.lang.CharSequence r3 = r2.toString
                if (r3 != 0) goto L_0x00b2
                android.graphics.drawable.Drawable r3 = r2.Mean$Arithmetic
                if (r3 == 0) goto L_0x00be
            L_0x00b2:
                r4 = -3
                java.lang.CharSequence r5 = r2.toString
                android.content.DialogInterface$OnClickListener r6 = r2.Grayscale$Algorithm
                r7 = 0
                android.graphics.drawable.Drawable r8 = r2.Mean$Arithmetic
                r3 = r10
                r3.length(r4, r5, r6, r7, r8)
            L_0x00be:
                java.lang.CharSequence[] r3 = r2.b
                r13 = 0
                if (r3 != 0) goto L_0x00cb
                android.database.Cursor r3 = r2.ICustomTabsService
                if (r3 != 0) goto L_0x00cb
                android.widget.ListAdapter r3 = r2.ICustomTabsCallback
                if (r3 == 0) goto L_0x0171
            L_0x00cb:
                android.view.LayoutInflater r3 = r2.length
                int r4 = r10.getInterfaceDescriptor
                android.view.View r3 = r3.inflate(r4, r13)
                androidx.appcompat.app.AlertController$RecycleListView r3 = (androidx.appcompat.app.AlertController.RecycleListView) r3
                boolean r4 = r2.ICustomTabsCallback$Stub
                if (r4 == 0) goto L_0x00fa
                android.database.Cursor r4 = r2.ICustomTabsService
                if (r4 != 0) goto L_0x00ec
                androidx.appcompat.app.AlertController$length$3 r14 = new androidx.appcompat.app.AlertController$length$3
                android.content.Context r6 = r2.getMin
                int r7 = r10.ICustomTabsCallback$Stub$Proxy
                java.lang.CharSequence[] r8 = r2.b
                r4 = r14
                r5 = r2
                r9 = r3
                r4.<init>(r6, r7, r8, r9)
                goto L_0x0137
            L_0x00ec:
                androidx.appcompat.app.AlertController$length$5 r14 = new androidx.appcompat.app.AlertController$length$5
                android.content.Context r6 = r2.getMin
                android.database.Cursor r7 = r2.ICustomTabsService
                r4 = r14
                r5 = r2
                r8 = r3
                r9 = r10
                r4.<init>(r6, r7, r8, r9)
                goto L_0x0137
            L_0x00fa:
                boolean r4 = r2.asBinder
                if (r4 == 0) goto L_0x0101
                int r4 = r10.getDefaultImpl
                goto L_0x0103
            L_0x0101:
                int r4 = r10.newSession
            L_0x0103:
                android.database.Cursor r5 = r2.ICustomTabsService
                if (r5 == 0) goto L_0x0127
                android.widget.SimpleCursorAdapter r5 = new android.widget.SimpleCursorAdapter
                android.content.Context r15 = r2.getMin
                android.database.Cursor r6 = r2.ICustomTabsService
                java.lang.String[] r7 = new java.lang.String[r11]
                java.lang.String r8 = r2.ICustomTabsCallback$Stub$Proxy
                r7[r12] = r8
                int[] r8 = new int[r11]
                r9 = 16908308(0x1020014, float:2.3877285E-38)
                r8[r12] = r9
                r14 = r5
                r16 = r4
                r17 = r6
                r18 = r7
                r19 = r8
                r14.<init>(r15, r16, r17, r18, r19)
                goto L_0x0137
            L_0x0127:
                android.widget.ListAdapter r5 = r2.ICustomTabsCallback
                if (r5 == 0) goto L_0x012e
                android.widget.ListAdapter r14 = r2.ICustomTabsCallback
                goto L_0x0137
            L_0x012e:
                androidx.appcompat.app.AlertController$getMin r14 = new androidx.appcompat.app.AlertController$getMin
                android.content.Context r5 = r2.getMin
                java.lang.CharSequence[] r6 = r2.b
                r14.<init>(r5, r4, r6)
            L_0x0137:
                r10.ICustomTabsCallback$Default = r14
                int r4 = r2.asInterface
                r10.ICustomTabsCallback$Stub = r4
                android.content.DialogInterface$OnClickListener r4 = r2.onNavigationEvent
                if (r4 == 0) goto L_0x014a
                androidx.appcompat.app.AlertController$length$2 r4 = new androidx.appcompat.app.AlertController$length$2
                r4.<init>(r10)
                r3.setOnItemClickListener(r4)
                goto L_0x0156
            L_0x014a:
                android.content.DialogInterface$OnMultiChoiceClickListener r4 = r2.getInterfaceDescriptor
                if (r4 == 0) goto L_0x0156
                androidx.appcompat.app.AlertController$length$1 r4 = new androidx.appcompat.app.AlertController$length$1
                r4.<init>(r3, r10)
                r3.setOnItemClickListener(r4)
            L_0x0156:
                android.widget.AdapterView$OnItemSelectedListener r4 = r2.mayLaunchUrl
                if (r4 == 0) goto L_0x015f
                android.widget.AdapterView$OnItemSelectedListener r4 = r2.mayLaunchUrl
                r3.setOnItemSelectedListener(r4)
            L_0x015f:
                boolean r4 = r2.asBinder
                if (r4 == 0) goto L_0x0167
                r3.setChoiceMode(r11)
                goto L_0x016f
            L_0x0167:
                boolean r4 = r2.ICustomTabsCallback$Stub
                if (r4 == 0) goto L_0x016f
                r4 = 2
                r3.setChoiceMode(r4)
            L_0x016f:
                r10.toFloatRange = r3
            L_0x0171:
                android.view.View r3 = r2.onPostMessage
                if (r3 == 0) goto L_0x019b
                boolean r3 = r2.ICustomTabsCallback$Default
                if (r3 == 0) goto L_0x0192
                android.view.View r3 = r2.onPostMessage
                int r4 = r2.onRelationshipValidationResult
                int r5 = r2.extraCallbackWithResult
                int r6 = r2.onMessageChannelReady
                int r2 = r2.extraCallback
                r10.IsOverlapping = r3
                r10.isInside = r12
                r10.toString = r11
                r10.toIntRange = r4
                r10.values = r5
                r10.FastBitmap$CoordinateSystem = r6
                r10.toDoubleRange = r2
                goto L_0x01a7
            L_0x0192:
                android.view.View r2 = r2.onPostMessage
                r10.IsOverlapping = r2
                r10.isInside = r12
                r10.toString = r12
                goto L_0x01a7
            L_0x019b:
                int r3 = r2.create
                if (r3 == 0) goto L_0x01a7
                int r2 = r2.create
                r10.IsOverlapping = r13
                r10.isInside = r2
                r10.toString = r12
            L_0x01a7:
                androidx.appcompat.app.AlertController$length r2 = r0.P
                boolean r2 = r2.invoke
                r1.setCancelable(r2)
                androidx.appcompat.app.AlertController$length r2 = r0.P
                boolean r2 = r2.invoke
                if (r2 == 0) goto L_0x01b7
                r1.setCanceledOnTouchOutside(r11)
            L_0x01b7:
                androidx.appcompat.app.AlertController$length r2 = r0.P
                android.content.DialogInterface$OnCancelListener r2 = r2.invokeSuspend
                r1.setOnCancelListener(r2)
                androidx.appcompat.app.AlertController$length r2 = r0.P
                android.content.DialogInterface$OnDismissListener r2 = r2.valueOf
                r1.setOnDismissListener(r2)
                androidx.appcompat.app.AlertController$length r2 = r0.P
                android.content.DialogInterface$OnKeyListener r2 = r2.getCause
                if (r2 == 0) goto L_0x01d2
                androidx.appcompat.app.AlertController$length r2 = r0.P
                android.content.DialogInterface$OnKeyListener r2 = r2.getCause
                r1.setOnKeyListener(r2)
            L_0x01d2:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getSmallIconId.length.create():o.getSmallIconId");
        }

        public getSmallIconId show() {
            getSmallIconId create = create();
            create.show();
            return create;
        }
    }
}
