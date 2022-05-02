package com.mixpanel.android.takeoverinapp;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.method.TransformationMethod;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.common.base.Ascii;
import com.mixpanel.android.mpmetrics.InAppButton;
import com.mixpanel.android.mpmetrics.TakeoverInAppNotification;
import com.mixpanel.android.mpmetrics.UpdateDisplayState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import o.convertFocusDirectionToLayoutDirection;
import o.dispatchOnCancelled;
import o.findOnePartiallyOrCompletelyInvisibleChild;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import o.updateAnchorFromPendingData;

@SuppressLint({"ClickableViewAccessibility"})
@TargetApi(16)
public class TakeoverInAppActivity extends Activity {
    public static final String INTENT_ID_KEY = "com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.INTENT_ID_KEY";
    public static final int setMax = 71;
    public static final byte[] setMin = {Ascii.GS, -115, 96, -60, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    /* access modifiers changed from: private */
    public convertFocusDirectionToLayoutDirection getMax;
    /* access modifiers changed from: private */
    public int getMin = -1;
    private UpdateDisplayState length;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMin(int r6, int r7, short r8) {
        /*
            int r6 = r6 * 165
            int r6 = 176 - r6
            int r8 = r8 * 45
            int r8 = 101 - r8
            int r7 = r7 * 175
            int r7 = 178 - r7
            byte[] r0 = setMin
            byte[] r1 = new byte[r6]
            int r6 = r6 + -1
            r2 = 0
            if (r0 != 0) goto L_0x0019
            r3 = r8
            r4 = 0
            r8 = r7
            goto L_0x002e
        L_0x0019:
            r3 = 0
        L_0x001a:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L_0x0027
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0027:
            int r7 = r7 + 1
            byte r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x002e:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + -2
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.getMin(int, int, short):java.lang.String");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int length2;
        int min;
        int length3;
        byte[] bArr = setMin;
        String min2 = getMin((byte) bArr[8], (byte) bArr[96], (byte) bArr[8]);
        byte[] bArr2 = setMin;
        String min3 = getMin((byte) bArr2[96], (byte) bArr2[8], (byte) bArr2[96]);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, min2, min3);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length4 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length4) {
            onCanceled oncanceled = new onCanceled(nextInt, length4, 1);
            onCancelLoad.setMax(-2120377246, oncanceled);
            onCancelLoad.getMin(-2120377246, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length3 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length3, 4);
            onCancelLoad.setMax(-2120377246, oncanceled2);
            onCancelLoad.getMin(-2120377246, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 8);
            onCancelLoad.setMax(-2120377246, oncanceled3);
            onCancelLoad.getMin(-2120377246, oncanceled3);
        }
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra(INTENT_ID_KEY, Integer.MAX_VALUE);
        this.getMin = intExtra;
        UpdateDisplayState min4 = UpdateDisplayState.setMin(intExtra);
        this.length = min4;
        if (min4 == null) {
            findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
            finish();
            return;
        }
        this.getMax = convertFocusDirectionToLayoutDirection.getMin((Context) this, min4.setMin);
        getMax();
    }

    private void getMax() {
        final int i;
        int length2;
        int i2 = 0;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-833666483, oncanceled);
            onCancelLoad.getMin(-833666483, oncanceled);
        }
        setContentView(updateAnchorFromPendingData.length.com_mixpanel_android_activity_notification_full);
        ImageView imageView = (ImageView) findViewById(updateAnchorFromPendingData.setMax.length);
        FadingImageView fadingImageView = (FadingImageView) findViewById(updateAnchorFromPendingData.setMax.setMax);
        TextView textView = (TextView) findViewById(updateAnchorFromPendingData.setMax.isInside);
        TextView textView2 = (TextView) findViewById(updateAnchorFromPendingData.setMax.IsOverlapping);
        ArrayList arrayList = new ArrayList();
        Button button = (Button) findViewById(updateAnchorFromPendingData.setMax.setMin);
        arrayList.add(button);
        arrayList.add((Button) findViewById(updateAnchorFromPendingData.setMax.toFloatRange));
        LinearLayout linearLayout = (LinearLayout) findViewById(updateAnchorFromPendingData.setMax.getMax);
        ImageView imageView2 = (ImageView) findViewById(updateAnchorFromPendingData.setMax.getMin);
        final TakeoverInAppNotification takeoverInAppNotification = (TakeoverInAppNotification) ((UpdateDisplayState.DisplayState.InAppNotificationState) this.length.getMin).setMax;
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        if (getResources().getConfiguration().orientation == 1) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, (int) (((float) point.y) * 0.06f));
            linearLayout.setLayoutParams(layoutParams);
        }
        fadingImageView.showShadow(takeoverInAppNotification.toFloatRange());
        imageView.setBackgroundColor(takeoverInAppNotification.setMin);
        if (takeoverInAppNotification.IsOverlapping()) {
            textView.setVisibility(0);
            textView.setText(takeoverInAppNotification.hashCode);
            textView.setTextColor(takeoverInAppNotification.values);
        } else {
            textView.setVisibility(8);
        }
        if (takeoverInAppNotification.setMax()) {
            textView2.setVisibility(0);
            textView2.setText(takeoverInAppNotification.toFloatRange);
            textView2.setTextColor(takeoverInAppNotification.IsOverlapping);
        } else {
            textView2.setVisibility(8);
        }
        fadingImageView.setImageBitmap(takeoverInAppNotification.isInside);
        final int i3 = 0;
        while (i3 < arrayList.size()) {
            final InAppButton inAppButton = takeoverInAppNotification.equals.size() > i3 ? takeoverInAppNotification.equals.get(i3) : null;
            Button button2 = (Button) arrayList.get(i3);
            Context baseContext = getBaseContext();
            Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
            if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, i2)) == 0)) {
                onCanceled oncanceled2 = new onCanceled(i2, length2, 4);
                onCancelLoad.setMax(-1721463126, oncanceled2);
                onCancelLoad.getMin(-1721463126, oncanceled2);
            }
            if (inAppButton != null) {
                button2.setVisibility(i2);
                button2.setText(inAppButton.length);
                button2.setTextColor(inAppButton.setMax);
                button2.setTransformationMethod((TransformationMethod) null);
                final GradientDrawable gradientDrawable = new GradientDrawable();
                if (inAppButton.getMax != 0) {
                    int i4 = inAppButton.getMax;
                    i = Color.rgb((int) ((float) ((Color.red(i4) / 2) + (Color.red(864454278) / 2))), (int) ((float) ((Color.green(i4) / 2) + (Color.green(864454278) / 2))), (int) ((float) ((Color.blue(i4) / 2) + (Color.blue(864454278) / 2))));
                } else {
                    i = 864454278;
                }
                button2.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            gradientDrawable.setColor(i);
                            return false;
                        }
                        gradientDrawable.setColor(inAppButton.getMax);
                        return false;
                    }
                });
                gradientDrawable.setColor(inAppButton.getMax);
                gradientDrawable.setStroke((int) ((((float) getResources().getDisplayMetrics().densityDpi) / 160.0f) * 2.0f), inAppButton.setMin);
                gradientDrawable.setCornerRadius((float) ((int) ((((float) getResources().getDisplayMetrics().densityDpi) / 160.0f) * 5.0f)));
                if (Build.VERSION.SDK_INT < 16) {
                    button2.setBackgroundDrawable(gradientDrawable);
                } else {
                    button2.setBackground(gradientDrawable);
                }
                button2.setOnClickListener(new View.OnClickListener() {
                    /* JADX WARNING: Removed duplicated region for block: B:29:0x004f A[SYNTHETIC, Splitter:B:29:0x004f] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void onClick(android.view.View r5) {
                        /*
                            r4 = this;
                            com.mixpanel.android.mpmetrics.InAppButton r5 = r13
                            java.lang.String r5 = r5.getMin
                            r0 = 0
                            if (r5 == 0) goto L_0x0037
                            int r1 = r5.length()
                            if (r1 <= 0) goto L_0x0037
                            android.net.Uri r1 = android.net.Uri.parse(r5)     // Catch:{ IllegalArgumentException -> 0x0033 }
                            android.content.Intent r2 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x001e }
                            java.lang.String r3 = "android.intent.action.VIEW"
                            r2.<init>(r3, r1)     // Catch:{ ActivityNotFoundException -> 0x001e }
                            com.mixpanel.android.takeoverinapp.TakeoverInAppActivity r1 = com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.this     // Catch:{ ActivityNotFoundException -> 0x001e }
                            r1.startActivity(r2)     // Catch:{ ActivityNotFoundException -> 0x001e }
                            goto L_0x0021
                        L_0x001e:
                            o.findOnePartiallyOrCompletelyInvisibleChild.IsOverlapping()
                        L_0x0021:
                            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002f }
                            r1.<init>()     // Catch:{ JSONException -> 0x002f }
                            java.lang.String r0 = "url"
                            r1.put(r0, r5)     // Catch:{ JSONException -> 0x002e }
                            r0 = r1
                            goto L_0x0037
                        L_0x002e:
                            r0 = r1
                        L_0x002f:
                            o.findOnePartiallyOrCompletelyInvisibleChild.toFloatRange()
                            goto L_0x0037
                        L_0x0033:
                            o.findOnePartiallyOrCompletelyInvisibleChild.equals()
                            return
                        L_0x0037:
                            com.mixpanel.android.mpmetrics.InAppNotification r5 = r11
                            com.mixpanel.android.mpmetrics.TakeoverInAppNotification r5 = (com.mixpanel.android.mpmetrics.TakeoverInAppNotification) r5
                            java.util.ArrayList<com.mixpanel.android.mpmetrics.InAppButton> r5 = r5.equals
                            int r5 = r5.size()
                            r1 = 2
                            java.lang.String r2 = "primary"
                            if (r5 != r1) goto L_0x004d
                            int r5 = r1
                            if (r5 != 0) goto L_0x004d
                            java.lang.String r5 = "secondary"
                            r2 = r5
                        L_0x004d:
                            if (r0 != 0) goto L_0x0055
                            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005b }
                            r5.<init>()     // Catch:{ JSONException -> 0x005b }
                            r0 = r5
                        L_0x0055:
                            java.lang.String r5 = "button"
                            r0.put(r5, r2)     // Catch:{ JSONException -> 0x005b }
                            goto L_0x005e
                        L_0x005b:
                            o.findOnePartiallyOrCompletelyInvisibleChild.toFloatRange()
                        L_0x005e:
                            com.mixpanel.android.takeoverinapp.TakeoverInAppActivity r5 = com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.this
                            o.convertFocusDirectionToLayoutDirection r5 = r5.getMax
                            o.convertFocusDirectionToLayoutDirection$getMax r5 = r5.setMax
                            com.mixpanel.android.mpmetrics.InAppNotification r1 = r11
                            java.lang.String r2 = "$campaign_open"
                            r5.length(r2, r1, r0)
                            com.mixpanel.android.takeoverinapp.TakeoverInAppActivity r5 = com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.this
                            r5.finish()
                            com.mixpanel.android.takeoverinapp.TakeoverInAppActivity r5 = com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.this
                            int r5 = r5.getMin
                            com.mixpanel.android.mpmetrics.UpdateDisplayState.setMax(r5)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.AnonymousClass3.onClick(android.view.View):void");
                    }
                });
            } else {
                button2.setVisibility(8);
            }
            i3++;
            i2 = 0;
        }
        if (takeoverInAppNotification.equals.size() == 1) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button.getLayoutParams();
            layoutParams2.weight = 0.0f;
            layoutParams2.width = -2;
            button.setLayoutParams(layoutParams2);
        }
        imageView2.setColorFilter(takeoverInAppNotification.toDoubleRange);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                TakeoverInAppActivity.this.finish();
                UpdateDisplayState.setMax(TakeoverInAppActivity.this.getMin);
            }
        });
        setMax(fadingImageView, textView, textView2, arrayList, linearLayout);
    }

    private void setMax(ImageView imageView, TextView textView, TextView textView2, ArrayList<Button> arrayList, LinearLayout linearLayout) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.95f, 1.0f, 0.95f, 1.0f, 1, 0.5f, 1, 1.0f);
        scaleAnimation.setDuration(200);
        imageView.startAnimation(scaleAnimation);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.5f, 1, 0.0f);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        translateAnimation.setDuration(200);
        textView.startAnimation(translateAnimation);
        textView2.startAnimation(translateAnimation);
        Iterator<Button> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().startAnimation(translateAnimation);
        }
        LinearLayout linearLayout2 = linearLayout;
        linearLayout2.startAnimation(AnimationUtils.loadAnimation(this, updateAnchorFromPendingData.setMin.length));
    }

    public void onBackPressed() {
        UpdateDisplayState.setMax(this.getMin);
        super.onBackPressed();
    }
}
