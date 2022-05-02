package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o.ResultReceiver;
import o.to;
import org.xmlpull.v1.XmlPullParser;

public class onRequestPermissionsResult {
    /* access modifiers changed from: private */
    public int FastBitmap$CoordinateSystem = 0;
    private boolean Grayscale$Algorithm = false;
    float IsOverlapping;
    private boolean Mean$Arithmetic;
    public int equals = 400;
    public ArrayList<length> getMax = new ArrayList<>();
    public ArrayList<length> getMin = new ArrayList<>();
    private SparseIntArray hashCode = new SparseIntArray();
    private MotionLayout.getMax invoke;
    private MotionEvent invokeSuspend;
    public SparseArray<from> isInside = new SparseArray<>();
    public boolean length = false;
    public length setMax = null;
    public DoNotInline setMin = null;
    private length toDoubleRange = null;
    float toFloatRange;
    public HashMap<String, Integer> toIntRange = new HashMap<>();
    /* access modifiers changed from: private */
    public final MotionLayout toString;
    private boolean valueOf = false;
    private boolean values = false;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r2 != -1) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void length(int r7, int r8) {
        /*
            r6 = this;
            o.DoNotInline r0 = r6.setMin
            r1 = -1
            if (r0 == 0) goto L_0x0016
            int r0 = r0.setMin(r7)
            if (r0 == r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r0 = r7
        L_0x000d:
            o.DoNotInline r2 = r6.setMin
            int r2 = r2.setMin(r8)
            if (r2 == r1) goto L_0x0017
            goto L_0x0018
        L_0x0016:
            r0 = r7
        L_0x0017:
            r2 = r8
        L_0x0018:
            java.util.ArrayList<o.onRequestPermissionsResult$length> r3 = r6.getMin
            java.util.Iterator r3 = r3.iterator()
        L_0x001e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0058
            java.lang.Object r4 = r3.next()
            o.onRequestPermissionsResult$length r4 = (o.onRequestPermissionsResult.length) r4
            int r5 = r4.setMax
            if (r5 != r2) goto L_0x0036
            int r5 = r4.getMin
            if (r5 == r0) goto L_0x0042
        L_0x0036:
            int r5 = r4.setMax
            if (r5 != r8) goto L_0x001e
            int r5 = r4.getMin
            if (r5 != r7) goto L_0x001e
        L_0x0042:
            r6.setMax = r4
            if (r4 == 0) goto L_0x0057
            o.access$001 r7 = r4.length
            if (r7 == 0) goto L_0x0057
            o.onRequestPermissionsResult$length r7 = r6.setMax
            o.access$001 r7 = r7.length
            boolean r8 = r6.Mean$Arithmetic
            r7.getMax(r8)
        L_0x0057:
            return
        L_0x0058:
            o.onRequestPermissionsResult$length r7 = r6.toDoubleRange
            java.util.ArrayList<o.onRequestPermissionsResult$length> r3 = r6.getMax
            java.util.Iterator r3 = r3.iterator()
        L_0x0060:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0074
            java.lang.Object r4 = r3.next()
            o.onRequestPermissionsResult$length r4 = (o.onRequestPermissionsResult.length) r4
            int r5 = r4.setMax
            if (r5 != r8) goto L_0x0060
            r7 = r4
            goto L_0x0060
        L_0x0074:
            o.onRequestPermissionsResult$length r8 = new o.onRequestPermissionsResult$length
            r8.<init>(r6, r7)
            int unused = r8.getMin = r0
            int unused = r8.setMax = r2
            if (r0 == r1) goto L_0x0086
            java.util.ArrayList<o.onRequestPermissionsResult$length> r7 = r6.getMin
            r7.add(r8)
        L_0x0086:
            r6.setMax = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onRequestPermissionsResult.length(int, int):void");
    }

    public final void setMin(length length2) {
        this.setMax = length2;
        if (length2 != null && length2.length != null) {
            this.setMax.length.getMax(this.Mean$Arithmetic);
        }
    }

    private length setMin(int i, float f, float f2, MotionEvent motionEvent) {
        RectF length2;
        if (i == -1) {
            return this.setMax;
        }
        List<length> length3 = length(i);
        float f3 = 0.0f;
        length length4 = null;
        RectF rectF = new RectF();
        for (length next : length3) {
            if (!next.toFloatRange && next.length != null) {
                next.length.getMax(this.Mean$Arithmetic);
                RectF length5 = next.length.length(this.toString, rectF);
                if ((length5 == null || motionEvent == null || length5.contains(motionEvent.getX(), motionEvent.getY())) && ((length2 = next.length.length(this.toString, rectF)) == null || motionEvent == null || length2.contains(motionEvent.getX(), motionEvent.getY()))) {
                    access$001 min = next.length;
                    float f4 = ((min.equals * f) + (min.toIntRange * f2)) * (next.setMax == i ? -1.0f : 1.1f);
                    if (f4 > f3) {
                        length4 = next;
                        f3 = f4;
                    }
                }
            }
        }
        return length4;
    }

    public final boolean getMin(MotionLayout motionLayout, int i) {
        if (getMax() || this.length) {
            return false;
        }
        Iterator<length> it = this.getMin.iterator();
        while (it.hasNext()) {
            length next = it.next();
            if (!(next.isInside == 0 || this.setMax == next)) {
                if (i == next.getMin && (next.isInside == 4 || next.isInside == 2)) {
                    motionLayout.setState(MotionLayout.TransitionState.FINISHED);
                    motionLayout.setTransition(next);
                    if (next.isInside == 4) {
                        motionLayout.transitionToEnd();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.evaluate(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(MotionLayout.TransitionState.FINISHED);
                        motionLayout.onNewStateAttachHandlers();
                    }
                    return true;
                } else if (i == next.setMax && (next.isInside == 3 || next.isInside == 1)) {
                    motionLayout.setState(MotionLayout.TransitionState.FINISHED);
                    motionLayout.setTransition(next);
                    if (next.isInside == 3) {
                        motionLayout.transitionToStart();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.evaluate(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(MotionLayout.TransitionState.FINISHED);
                        motionLayout.onNewStateAttachHandlers();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private boolean getMax() {
        return this.invoke != null;
    }

    public final void getMin(boolean z) {
        this.Mean$Arithmetic = z;
        length length2 = this.setMax;
        if (length2 != null && length2.length != null) {
            this.setMax.length.getMax(this.Mean$Arithmetic);
        }
    }

    public static class length {
        /* access modifiers changed from: private */
        public int FastBitmap$CoordinateSystem = -1;
        /* access modifiers changed from: private */
        public int IsOverlapping = -1;
        /* access modifiers changed from: private */
        public boolean equals = false;
        /* access modifiers changed from: package-private */
        public ArrayList<getMin> getMax = new ArrayList<>();
        public int getMin = -1;
        /* access modifiers changed from: private */
        public float hashCode = 0.0f;
        /* access modifiers changed from: private */
        public int invoke = -1;
        /* access modifiers changed from: private */
        public ArrayList<getLifecycle> invokeSuspend = new ArrayList<>();
        public int isInside = 0;
        public access$001 length = null;
        public int setMax = -1;
        public int setMin = 400;
        /* access modifiers changed from: private */
        public String toDoubleRange = null;
        public boolean toFloatRange = false;
        public int toIntRange = 0;
        /* access modifiers changed from: private */
        public int toString = 0;
        private int valueOf = 0;
        /* access modifiers changed from: private */
        public final onRequestPermissionsResult values;

        public final boolean length() {
            return !this.toFloatRange;
        }

        public final boolean getMax() {
            return (this.valueOf & 1) != 0;
        }

        public static class getMin implements View.OnClickListener {
            int getMin = 17;
            private final length setMax;
            public int setMin = -1;

            public getMin(Context context, length length, XmlPullParser xmlPullParser) {
                this.setMax = length;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), to.length.createButton);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == to.length.createEditText) {
                        this.setMin = obtainStyledAttributes.getResourceId(index, this.setMin);
                    } else if (index == to.length.createView) {
                        this.getMin = obtainStyledAttributes.getInt(index, this.getMin);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            public final void setMax(MotionLayout motionLayout, int i, length length) {
                int i2 = this.setMin;
                View view = motionLayout;
                if (i2 != -1) {
                    view = motionLayout.findViewById(i2);
                }
                if (view != null) {
                    int max = length.getMin;
                    int max2 = length.setMax;
                    if (max == -1) {
                        view.setOnClickListener(this);
                        return;
                    }
                    boolean z = true;
                    boolean z2 = ((this.getMin & 1) != 0 && i == max) | ((this.getMin & 1) != 0 && i == max) | ((this.getMin & 256) != 0 && i == max) | ((this.getMin & 16) != 0 && i == max2);
                    if ((this.getMin & 4096) == 0 || i != max2) {
                        z = false;
                    }
                    if (z2 || z) {
                        view.setOnClickListener(this);
                    }
                }
            }

            private boolean getMax(length length, MotionLayout motionLayout) {
                length length2 = this.setMax;
                if (length2 == length) {
                    return true;
                }
                int max = length2.setMax;
                int max2 = this.setMax.getMin;
                if (max2 == -1) {
                    if (motionLayout.mCurrentState != max) {
                        return true;
                    }
                    return false;
                } else if (motionLayout.mCurrentState == max2 || motionLayout.mCurrentState == max) {
                    return true;
                } else {
                    return false;
                }
            }

            public final void onClick(View view) {
                MotionLayout min = this.setMax.values.toString;
                if (min.isInteractionEnabled()) {
                    if (this.setMax.getMin == -1) {
                        int currentState = min.getCurrentState();
                        if (currentState == -1) {
                            min.transitionToState(this.setMax.setMax);
                            return;
                        }
                        length length = new length(this.setMax.values, this.setMax);
                        int unused = length.getMin = currentState;
                        int unused2 = length.setMax = this.setMax.setMax;
                        min.setTransition(length);
                        min.transitionToEnd();
                        return;
                    }
                    length length2 = this.setMax.values.setMax;
                    int i = this.getMin;
                    boolean z = false;
                    boolean z2 = ((i & 1) == 0 && (i & 256) == 0) ? false : true;
                    int i2 = this.getMin;
                    boolean z3 = ((i2 & 16) == 0 && (i2 & 4096) == 0) ? false : true;
                    if (z2 && z3) {
                        length length3 = this.setMax.values.setMax;
                        length length4 = this.setMax;
                        if (length3 != length4) {
                            min.setTransition(length4);
                        }
                        if (min.getCurrentState() != min.getEndState() && min.getProgress() <= 0.5f) {
                            z = z2;
                            z3 = false;
                        }
                    } else {
                        z = z2;
                    }
                    if (!getMax(length2, min)) {
                        return;
                    }
                    if (z && (this.getMin & 1) != 0) {
                        min.setTransition(this.setMax);
                        min.transitionToEnd();
                    } else if (z3 && (this.getMin & 16) != 0) {
                        min.setTransition(this.setMax);
                        min.transitionToStart();
                    } else if (z && (this.getMin & 256) != 0) {
                        min.setTransition(this.setMax);
                        min.setProgress(1.0f);
                    } else if (z3 && (this.getMin & 4096) != 0) {
                        min.setTransition(this.setMax);
                        min.setProgress(0.0f);
                    }
                }
            }
        }

        length(onRequestPermissionsResult onrequestpermissionsresult, length length2) {
            this.values = onrequestpermissionsresult;
            if (length2 != null) {
                this.invoke = length2.invoke;
                this.toString = length2.toString;
                this.toDoubleRange = length2.toDoubleRange;
                this.FastBitmap$CoordinateSystem = length2.FastBitmap$CoordinateSystem;
                this.setMin = length2.setMin;
                this.invokeSuspend = length2.invokeSuspend;
                this.hashCode = length2.hashCode;
                this.toIntRange = length2.toIntRange;
            }
        }

        length(onRequestPermissionsResult onrequestpermissionsresult, Context context, XmlPullParser xmlPullParser) {
            this.setMin = onrequestpermissionsresult.equals;
            this.toIntRange = onrequestpermissionsresult.FastBitmap$CoordinateSystem;
            this.values = onrequestpermissionsresult;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), to.length.setHotspot);
            setMax(onrequestpermissionsresult, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        private void setMax(onRequestPermissionsResult onrequestpermissionsresult, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                if (index == to.length.setHotspotBounds) {
                    this.setMax = typedArray.getResourceId(index, this.setMax);
                    if (TtmlNode.TAG_LAYOUT.equals(context.getResources().getResourceTypeName(this.setMax))) {
                        from from = new from();
                        from.getMax(context, this.setMax);
                        onrequestpermissionsresult.isInside.append(this.setMax, from);
                    }
                } else if (index == to.length.DrawerArrowDrawable$ArrowDirection) {
                    this.getMin = typedArray.getResourceId(index, this.getMin);
                    if (TtmlNode.TAG_LAYOUT.equals(context.getResources().getResourceTypeName(this.getMin))) {
                        from from2 = new from();
                        from2.getMax(context, this.getMin);
                        onrequestpermissionsresult.isInside.append(this.getMin, from2);
                    }
                } else if (index == to.length.onTouchEvent) {
                    TypedValue peekValue = typedArray.peekValue(index);
                    if (peekValue.type == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.FastBitmap$CoordinateSystem = resourceId;
                        if (resourceId != -1) {
                            this.toString = -2;
                        }
                    } else if (peekValue.type == 3) {
                        String string = typedArray.getString(index);
                        this.toDoubleRange = string;
                        if (string.indexOf("/") > 0) {
                            this.FastBitmap$CoordinateSystem = typedArray.getResourceId(index, -1);
                            this.toString = -2;
                        } else {
                            this.toString = -1;
                        }
                    } else {
                        this.toString = typedArray.getInteger(index, this.toString);
                    }
                } else if (index == to.length.initialize) {
                    this.setMin = typedArray.getInt(index, this.setMin);
                } else if (index == to.length.setPadding) {
                    this.hashCode = typedArray.getFloat(index, this.hashCode);
                } else if (index == to.length.setWrappedDrawable) {
                    this.isInside = typedArray.getInteger(index, this.isInside);
                } else if (index == to.length.getWrappedDrawable) {
                    this.IsOverlapping = typedArray.getResourceId(index, this.IsOverlapping);
                } else if (index == to.length.prefersCondensedTitle) {
                    this.toFloatRange = typedArray.getBoolean(index, this.toFloatRange);
                } else if (index == to.length.ActionMenuItemView) {
                    this.invoke = typedArray.getInteger(index, -1);
                } else if (index == to.length.getItemData) {
                    this.toIntRange = typedArray.getInteger(index, 0);
                } else if (index == to.length.setItemInvoker) {
                    this.valueOf = typedArray.getInteger(index, 0);
                }
            }
            if (this.getMin == -1) {
                this.equals = true;
            }
        }
    }

    public onRequestPermissionsResult(Context context, MotionLayout motionLayout, int i) {
        this.toString = motionLayout;
        setMin(context, i);
        this.isInside.put(to.getMin.length, new from());
        this.toIntRange.put("motion_base", Integer.valueOf(to.getMin.length));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e6 A[Catch:{ IOException | XmlPullParserException -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ee A[Catch:{ IOException | XmlPullParserException -> 0x01e1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setMin(android.content.Context r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            android.content.res.Resources r3 = r17.getResources()
            android.content.res.XmlResourceParser r3 = r3.getXml(r2)
            r4 = 0
            int r5 = r3.getEventType()     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
        L_0x0013:
            r6 = 1
            if (r5 == r6) goto L_0x01e1
            if (r5 == 0) goto L_0x01d8
            r7 = 2
            if (r5 == r7) goto L_0x001d
            goto L_0x01db
        L_0x001d:
            java.lang.String r5 = r3.getName()     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            boolean r8 = r0.values     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            if (r8 == 0) goto L_0x0034
            java.io.PrintStream r8 = java.lang.System.out     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            java.lang.String r9 = "parsing = "
            java.lang.String r10 = java.lang.String.valueOf(r5)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            java.lang.String r9 = r9.concat(r10)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r8.println(r9)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
        L_0x0034:
            int r8 = r5.hashCode()     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r9 = 0
            switch(r8) {
                case -1349929691: goto L_0x0078;
                case -1239391468: goto L_0x006e;
                case 269306229: goto L_0x0064;
                case 312750793: goto L_0x005a;
                case 327855227: goto L_0x0051;
                case 793277014: goto L_0x0047;
                case 1382829617: goto L_0x003d;
                default: goto L_0x003c;
            }     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
        L_0x003c:
            goto L_0x0082
        L_0x003d:
            java.lang.String r7 = "StateSet"
            boolean r5 = r5.equals(r7)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            if (r5 == 0) goto L_0x0082
            r7 = 4
            goto L_0x0083
        L_0x0047:
            java.lang.String r7 = "MotionScene"
            boolean r5 = r5.equals(r7)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            if (r5 == 0) goto L_0x0082
            r7 = 0
            goto L_0x0083
        L_0x0051:
            java.lang.String r8 = "OnSwipe"
            boolean r5 = r5.equals(r8)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            if (r5 == 0) goto L_0x0082
            goto L_0x0083
        L_0x005a:
            java.lang.String r7 = "OnClick"
            boolean r5 = r5.equals(r7)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            if (r5 == 0) goto L_0x0082
            r7 = 3
            goto L_0x0083
        L_0x0064:
            java.lang.String r7 = "Transition"
            boolean r5 = r5.equals(r7)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            if (r5 == 0) goto L_0x0082
            r7 = 1
            goto L_0x0083
        L_0x006e:
            java.lang.String r7 = "KeyFrameSet"
            boolean r5 = r5.equals(r7)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            if (r5 == 0) goto L_0x0082
            r7 = 6
            goto L_0x0083
        L_0x0078:
            java.lang.String r7 = "ConstraintSet"
            boolean r5 = r5.equals(r7)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            if (r5 == 0) goto L_0x0082
            r7 = 5
            goto L_0x0083
        L_0x0082:
            r7 = -1
        L_0x0083:
            switch(r7) {
                case 0: goto L_0x01a2;
                case 1: goto L_0x015d;
                case 2: goto L_0x0145;
                case 3: goto L_0x0139;
                case 4: goto L_0x0130;
                case 5: goto L_0x0096;
                case 6: goto L_0x0088;
                default: goto L_0x0086;
            }     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
        L_0x0086:
            goto L_0x01db
        L_0x0088:
            o.getLifecycle r5 = new o.getLifecycle     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r5.<init>(r1, r3)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            java.util.ArrayList r6 = r4.invokeSuspend     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r6.add(r5)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            goto L_0x01db
        L_0x0096:
            o.from r5 = new o.from     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r5.<init>()     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r5.getMax = r9     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            int r7 = r3.getAttributeCount()     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r8 = 0
            r11 = -1
            r12 = -1
        L_0x00a4:
            if (r8 >= r7) goto L_0x0113
            java.lang.String r13 = r3.getAttributeName(r8)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            java.lang.String r14 = r3.getAttributeValue(r8)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            boolean r15 = r0.values     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            if (r15 == 0) goto L_0x00c1
            java.io.PrintStream r15 = java.lang.System.out     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            java.lang.String r9 = "id string = "
            java.lang.String r10 = java.lang.String.valueOf(r14)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            java.lang.String r9 = r9.concat(r10)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r15.println(r9)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
        L_0x00c1:
            int r9 = r13.hashCode()     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r10 = -1496482599(0xffffffffa6cd7cd9, float:-1.4258573E-15)
            if (r9 == r10) goto L_0x00d9
            r10 = 3355(0xd1b, float:4.701E-42)
            if (r9 == r10) goto L_0x00cf
            goto L_0x00e3
        L_0x00cf:
            java.lang.String r9 = "id"
            boolean r9 = r13.equals(r9)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            if (r9 == 0) goto L_0x00e3
            r9 = 0
            goto L_0x00e4
        L_0x00d9:
            java.lang.String r9 = "deriveConstraintsFrom"
            boolean r9 = r13.equals(r9)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            if (r9 == 0) goto L_0x00e3
            r9 = 1
            goto L_0x00e4
        L_0x00e3:
            r9 = -1
        L_0x00e4:
            if (r9 == 0) goto L_0x00ee
            if (r9 == r6) goto L_0x00e9
            goto L_0x010f
        L_0x00e9:
            int r12 = r0.setMin((android.content.Context) r1, (java.lang.String) r14)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            goto L_0x010f
        L_0x00ee:
            int r11 = r0.setMin((android.content.Context) r1, (java.lang.String) r14)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r9 = r0.toIntRange     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            if (r14 != 0) goto L_0x00f9
            java.lang.String r14 = ""
            goto L_0x0108
        L_0x00f9:
            r10 = 47
            int r10 = r14.indexOf(r10)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            if (r10 >= 0) goto L_0x0102
            goto L_0x0108
        L_0x0102:
            int r10 = r10 + 1
            java.lang.String r14 = r14.substring(r10)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
        L_0x0108:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r9.put(r14, r10)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
        L_0x010f:
            int r8 = r8 + 1
            r9 = 0
            goto L_0x00a4
        L_0x0113:
            r7 = -1
            if (r11 == r7) goto L_0x01db
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.toString     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            int r7 = r7.mDebugPath     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            if (r7 == 0) goto L_0x011e
            r5.setMin = r6     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
        L_0x011e:
            r5.setMax((android.content.Context) r1, (org.xmlpull.v1.XmlPullParser) r3)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r6 = -1
            if (r12 == r6) goto L_0x0129
            android.util.SparseIntArray r6 = r0.hashCode     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r6.put(r11, r12)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
        L_0x0129:
            android.util.SparseArray<o.from> r6 = r0.isInside     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r6.put(r11, r5)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            goto L_0x01db
        L_0x0130:
            o.DoNotInline r5 = new o.DoNotInline     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r5.<init>(r1, r3)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r0.setMin = r5     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            goto L_0x01db
        L_0x0139:
            java.util.ArrayList<o.onRequestPermissionsResult$length$getMin> r5 = r4.getMax     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            o.onRequestPermissionsResult$length$getMin r6 = new o.onRequestPermissionsResult$length$getMin     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r6.<init>(r1, r4, r3)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r5.add(r6)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            goto L_0x01db
        L_0x0145:
            if (r4 != 0) goto L_0x0151
            android.content.res.Resources r5 = r17.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r5.getResourceEntryName(r2)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r3.getLineNumber()     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
        L_0x0151:
            o.access$001 r5 = new o.access$001     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r0.toString     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r5.<init>(r1, r6, r3)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            o.access$001 unused = r4.length = r5     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            goto L_0x01db
        L_0x015d:
            java.util.ArrayList<o.onRequestPermissionsResult$length> r4 = r0.getMin     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            o.onRequestPermissionsResult$length r5 = new o.onRequestPermissionsResult$length     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r5.<init>(r0, r1, r3)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r4.add(r5)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            o.onRequestPermissionsResult$length r4 = r0.setMax     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            if (r4 != 0) goto L_0x0186
            boolean r4 = r5.equals     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            if (r4 != 0) goto L_0x0186
            r0.setMax = r5     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            if (r5 == 0) goto L_0x0186
            o.access$001 r4 = r5.length     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            if (r4 == 0) goto L_0x0186
            o.onRequestPermissionsResult$length r4 = r0.setMax     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            o.access$001 r4 = r4.length     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            boolean r6 = r0.Mean$Arithmetic     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r4.getMax(r6)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
        L_0x0186:
            boolean r4 = r5.equals     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            if (r4 == 0) goto L_0x01a0
            int r4 = r5.setMax     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r6 = -1
            if (r4 != r6) goto L_0x0196
            r0.toDoubleRange = r5     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            goto L_0x019b
        L_0x0196:
            java.util.ArrayList<o.onRequestPermissionsResult$length> r4 = r0.getMax     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r4.add(r5)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
        L_0x019b:
            java.util.ArrayList<o.onRequestPermissionsResult$length> r4 = r0.getMin     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r4.remove(r5)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
        L_0x01a0:
            r4 = r5
            goto L_0x01db
        L_0x01a2:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r3)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            int[] r6 = o.to.length.onCreateDialog     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            android.content.res.TypedArray r5 = r1.obtainStyledAttributes(r5, r6)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            int r6 = r5.getIndexCount()     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r7 = 0
        L_0x01b1:
            if (r7 >= r6) goto L_0x01d4
            int r8 = r5.getIndex(r7)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            int r9 = o.to.length.getThemeResId     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            if (r8 != r9) goto L_0x01c4
            int r9 = r0.equals     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            int r8 = r5.getInt(r8, r9)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r0.equals = r8     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            goto L_0x01d0
        L_0x01c4:
            int r9 = o.to.length.superDispatchKeyEvent     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            if (r8 != r9) goto L_0x01d0
            r9 = 0
            int r8 = r5.getInteger(r8, r9)     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            r0.FastBitmap$CoordinateSystem = r8     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            goto L_0x01d1
        L_0x01d0:
            r9 = 0
        L_0x01d1:
            int r7 = r7 + 1
            goto L_0x01b1
        L_0x01d4:
            r5.recycle()     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            goto L_0x01db
        L_0x01d8:
            r3.getName()     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
        L_0x01db:
            int r5 = r3.next()     // Catch:{ IOException | XmlPullParserException -> 0x01e1 }
            goto L_0x0013
        L_0x01e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onRequestPermissionsResult.setMin(android.content.Context, int):void");
    }

    private int setMin(Context context, String str) {
        int i;
        if (str.contains("/")) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (this.values) {
                System.out.println("id getMap res = ".concat(String.valueOf(i)));
            }
        } else {
            i = -1;
        }
        return (i != -1 || str == null || str.length() <= 1) ? i : Integer.parseInt(str.substring(1));
    }

    public final from getMin(int i) {
        int min;
        if (this.values) {
            System.out.println("id ".concat(String.valueOf(i)));
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("size ");
            sb.append(this.isInside.size());
            printStream.println(sb.toString());
        }
        DoNotInline doNotInline = this.setMin;
        if (!(doNotInline == null || (min = doNotInline.setMin(i)) == -1)) {
            i = min;
        }
        if (this.isInside.get(i) != null) {
            return this.isInside.get(i);
        }
        addContentView.length(this.toString.getContext(), i);
        SparseArray<from> sparseArray = this.isInside;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    public final void getMax(onBackPressed onbackpressed) {
        length length2 = this.setMax;
        if (length2 == null) {
            length length3 = this.toDoubleRange;
            if (length3 != null) {
                Iterator it = length3.invokeSuspend.iterator();
                while (it.hasNext()) {
                    ((getLifecycle) it.next()).setMax(onbackpressed);
                }
                return;
            }
            return;
        }
        Iterator it2 = length2.invokeSuspend.iterator();
        while (it2.hasNext()) {
            ((getLifecycle) it2.next()).setMax(onbackpressed);
        }
    }

    public final boolean setMin() {
        Iterator<length> it = this.getMin.iterator();
        while (it.hasNext()) {
            if (it.next().length != null) {
                return true;
            }
        }
        length length2 = this.setMax;
        if (length2 == null || length2.length == null) {
            return false;
        }
        return true;
    }

    public final void length(MotionEvent motionEvent, int i, MotionLayout motionLayout) {
        MotionLayout.getMax getmax;
        float f;
        float f2;
        RectF rectF;
        View findViewById;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3 = motionEvent;
        int i2 = i;
        MotionLayout motionLayout2 = motionLayout;
        RectF rectF2 = new RectF();
        if (this.invoke == null) {
            this.invoke = this.toString.obtainVelocityTracker();
        }
        this.invoke.setMax(motionEvent3);
        if (i2 != -1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.toFloatRange = motionEvent.getRawX();
                this.IsOverlapping = motionEvent.getRawY();
                this.invokeSuspend = motionEvent3;
                this.Grayscale$Algorithm = false;
                if (this.setMax.length != null) {
                    access$001 min = this.setMax.length;
                    MotionLayout motionLayout3 = this.toString;
                    if (min.setMax == -1 || (findViewById = motionLayout3.findViewById(min.setMax)) == null) {
                        rectF = null;
                    } else {
                        rectF2.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
                        rectF = rectF2;
                    }
                    if (rectF == null || rectF.contains(this.invokeSuspend.getX(), this.invokeSuspend.getY())) {
                        RectF length2 = this.setMax.length.length(this.toString, rectF2);
                        if (length2 == null || length2.contains(this.invokeSuspend.getX(), this.invokeSuspend.getY())) {
                            this.valueOf = false;
                        } else {
                            this.valueOf = true;
                        }
                        access$001 min2 = this.setMax.length;
                        float f3 = this.toFloatRange;
                        float f4 = this.IsOverlapping;
                        min2.toDoubleRange = f3;
                        min2.FastBitmap$CoordinateSystem = f4;
                        return;
                    }
                    this.invokeSuspend = null;
                    this.Grayscale$Algorithm = true;
                    return;
                }
                return;
            } else if (action == 2 && !this.Grayscale$Algorithm) {
                float rawY = motionEvent.getRawY() - this.IsOverlapping;
                float rawX = motionEvent.getRawX() - this.toFloatRange;
                if ((((double) rawX) != 0.0d || ((double) rawY) != 0.0d) && (motionEvent2 = this.invokeSuspend) != null) {
                    length min3 = setMin(i2, rawX, rawY, motionEvent2);
                    if (min3 != null) {
                        motionLayout2.setTransition(min3);
                        RectF length3 = this.setMax.length.length(this.toString, rectF2);
                        this.valueOf = length3 != null && !length3.contains(this.invokeSuspend.getX(), this.invokeSuspend.getY());
                        access$001 min4 = this.setMax.length;
                        float f5 = this.toFloatRange;
                        float f6 = this.IsOverlapping;
                        min4.toDoubleRange = f5;
                        min4.FastBitmap$CoordinateSystem = f6;
                        min4.toFloatRange = false;
                    }
                } else {
                    return;
                }
            }
        }
        if (!this.Grayscale$Algorithm) {
            length length4 = this.setMax;
            if (!(length4 == null || length4.length == null || this.valueOf)) {
                access$001 min5 = this.setMax.length;
                MotionLayout.getMax getmax2 = this.invoke;
                getmax2.setMax(motionEvent3);
                int action2 = motionEvent.getAction();
                if (action2 == 0) {
                    min5.toDoubleRange = motionEvent.getRawX();
                    min5.FastBitmap$CoordinateSystem = motionEvent.getRawY();
                    min5.toFloatRange = false;
                } else if (action2 == 1) {
                    min5.toFloatRange = false;
                    getmax2.getMin();
                    float min6 = getmax2.setMin();
                    float max = getmax2.setMax();
                    float progress = min5.values.getProgress();
                    if (min5.getMax != -1) {
                        min5.values.getAnchorDpDt(min5.getMax, progress, min5.IsOverlapping, min5.getMin, min5.isInside);
                    } else {
                        float min7 = (float) Math.min(min5.values.getWidth(), min5.values.getHeight());
                        min5.isInside[1] = min5.toIntRange * min7;
                        min5.isInside[0] = min7 * min5.equals;
                    }
                    if (min5.equals != 0.0f) {
                        f = min6 / min5.isInside[0];
                    } else {
                        f = max / min5.isInside[1];
                    }
                    float f7 = !Float.isNaN(f) ? (f / 3.0f) + progress : progress;
                    if (f7 != 0.0f && f7 != 1.0f && min5.length != 3) {
                        min5.values.touchAnimateTo(min5.length, ((double) f7) < 0.5d ? 0.0f : 1.0f, f);
                        if (0.0f >= progress || 1.0f <= progress) {
                            min5.values.setState(MotionLayout.TransitionState.FINISHED);
                        }
                    } else if (0.0f >= f7 || 1.0f <= f7) {
                        min5.values.setState(MotionLayout.TransitionState.FINISHED);
                    }
                } else if (action2 == 2) {
                    float rawY2 = motionEvent.getRawY() - min5.FastBitmap$CoordinateSystem;
                    float rawX2 = motionEvent.getRawX() - min5.toDoubleRange;
                    if (Math.abs((min5.equals * rawX2) + (min5.toIntRange * rawY2)) > min5.Mean$Arithmetic || min5.toFloatRange) {
                        float progress2 = min5.values.getProgress();
                        if (!min5.toFloatRange) {
                            min5.toFloatRange = true;
                            min5.values.setProgress(progress2);
                        }
                        if (min5.getMax != -1) {
                            min5.values.getAnchorDpDt(min5.getMax, progress2, min5.IsOverlapping, min5.getMin, min5.isInside);
                        } else {
                            float min8 = (float) Math.min(min5.values.getWidth(), min5.values.getHeight());
                            min5.isInside[1] = min5.toIntRange * min8;
                            min5.isInside[0] = min8 * min5.equals;
                        }
                        if (((double) Math.abs(((min5.equals * min5.isInside[0]) + (min5.toIntRange * min5.isInside[1])) * min5.invoke)) < 0.01d) {
                            min5.isInside[0] = 0.01f;
                            min5.isInside[1] = 0.01f;
                        }
                        if (min5.equals != 0.0f) {
                            f2 = rawX2 / min5.isInside[0];
                        } else {
                            f2 = rawY2 / min5.isInside[1];
                        }
                        float max2 = Math.max(Math.min(progress2 + f2, 1.0f), 0.0f);
                        if (max2 != min5.values.getProgress()) {
                            min5.values.setProgress(max2);
                            getmax2.getMin();
                            min5.values.mLastVelocity = min5.equals != 0.0f ? getmax2.setMin() / min5.isInside[0] : getmax2.setMax() / min5.isInside[1];
                        } else {
                            min5.values.mLastVelocity = 0.0f;
                        }
                        min5.toDoubleRange = motionEvent.getRawX();
                        min5.FastBitmap$CoordinateSystem = motionEvent.getRawY();
                    }
                }
            }
            this.toFloatRange = motionEvent.getRawX();
            this.IsOverlapping = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (getmax = this.invoke) != null) {
                getmax.getMax();
                this.invoke = null;
                if (motionLayout2.mCurrentState != -1) {
                    getMin(motionLayout2, motionLayout2.mCurrentState);
                }
            }
        }
    }

    public final Interpolator length() {
        int values2 = this.setMax.toString;
        if (values2 == -2) {
            return AnimationUtils.loadInterpolator(this.toString.getContext(), this.setMax.FastBitmap$CoordinateSystem);
        }
        if (values2 == -1) {
            final ResultReceiver.MyResultReceiver max = ResultReceiver.MyResultReceiver.getMax(this.setMax.toDoubleRange);
            return new Interpolator() {
                public final float getInterpolation(float f) {
                    return (float) max.getMin((double) f);
                }
            };
        } else if (values2 == 0) {
            return new AccelerateDecelerateInterpolator();
        } else {
            if (values2 == 1) {
                return new AccelerateInterpolator();
            }
            if (values2 == 2) {
                return new DecelerateInterpolator();
            }
            if (values2 == 4) {
                return new AnticipateInterpolator();
            }
            if (values2 != 5) {
                return null;
            }
            return new BounceInterpolator();
        }
    }

    public final boolean getMin() {
        length length2 = this.setMax;
        if (length2 == null || length2.length == null) {
            return false;
        }
        return this.setMax.length.getMax();
    }

    public final void setMax(MotionLayout motionLayout) {
        int i = 0;
        while (i < this.isInside.size()) {
            int keyAt = this.isInside.keyAt(i);
            if (!setMin(keyAt)) {
                setMax(keyAt);
                i++;
            } else {
                return;
            }
        }
        for (int i2 = 0; i2 < this.isInside.size(); i2++) {
            this.isInside.valueAt(i2).getMin(motionLayout);
        }
    }

    private boolean setMin(int i) {
        int i2 = this.hashCode.get(i);
        int size = this.hashCode.size();
        while (i2 > 0) {
            if (i2 == i) {
                return true;
            }
            int i3 = size - 1;
            if (size < 0) {
                return true;
            }
            i2 = this.hashCode.get(i2);
            size = i3;
        }
        return false;
    }

    private void setMax(int i) {
        int i2 = this.hashCode.get(i);
        if (i2 > 0) {
            setMax(this.hashCode.get(i));
            from from = this.isInside.get(i);
            from from2 = this.isInside.get(i2);
            if (from2 == null) {
                addContentView.length(this.toString.getContext(), i2);
                return;
            }
            from.getMax(from2);
            this.hashCode.put(i, -1);
        }
    }

    public final List<length> length(int i) {
        int min;
        DoNotInline doNotInline = this.setMin;
        if (!(doNotInline == null || (min = doNotInline.setMin(i)) == -1)) {
            i = min;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<length> it = this.getMin.iterator();
        while (it.hasNext()) {
            length next = it.next();
            if (next.getMin == i || next.setMax == i) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
