package com.bca.xco.widget;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.security.ProviderInstaller;
import id.dana.nearbyme.NearbyMePromoType;
import id.dana.richview.CurrencyTextView;
import java.util.List;
import o.addChildrenForExpandedActionView;
import o.addCustomViewsWithGravity;
import o.dispatchOnCancelled;
import o.getChildHorizontalGravity;
import o.getChildTop;
import o.getChildVerticalGravity;
import o.getHorizontalMargins;
import o.getOuterActionMenuPresenter;
import o.getViewListMeasuredWidth;
import o.getWrapper;
import o.isChildOrHidden;
import o.onCancelLoad;
import o.onCanceled;
import o.resolveRtl;
import o.setHorizontalStyle;
import o.setPaddingRight;
import o.setPaddingTop;
import o.shouldCollapse;
import o.shouldLayout;

public class BCAXCOModule extends LinearLayout implements ProviderInstaller.ProviderInstallListener {

    /* renamed from: a  reason: collision with root package name */
    public static final int f10772a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    private addCustomViewsWithGravity FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public getHorizontalMargins IsOverlapping;
    private isChildOrHidden equals;
    private shouldLayout getMax;
    /* access modifiers changed from: private */
    public getChildTop getMin;
    /* access modifiers changed from: private */
    public shouldCollapse hashCode;
    private String isInside = "DEV";
    private View length;
    private LayoutInflater setMax;
    private Context setMin;
    private getViewListMeasuredWidth toDoubleRange;
    private addChildrenForExpandedActionView toFloatRange;
    private setPaddingRight toIntRange;
    private int toString = 0;
    private getChildHorizontalGravity values;

    static /* synthetic */ void e(BCAXCOModule bCAXCOModule) {
    }

    public BCAXCOModule(Context context) {
        super(context);
        this.setMax = LayoutInflater.from(context);
        this.setMin = context;
        getMax();
    }

    public BCAXCOModule(Context context, String str) {
        super(context);
        this.setMax = LayoutInflater.from(context);
        this.setMin = context;
        this.isInside = str;
        getMax();
    }

    public BCAXCOModule(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setMax = LayoutInflater.from(context);
        this.setMin = context;
        getMax();
    }

    public BCAXCOModule(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.setMax = LayoutInflater.from(context);
        this.setMin = context;
        getMax();
    }

    private void getMax() {
        ProviderInstaller.installIfNeededAsync(this.setMin, this);
        this.toIntRange = new setPaddingRight();
        setPaddingRight.getMax(this.setMin, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
        this.toFloatRange = new addChildrenForExpandedActionView();
        this.equals = new isChildOrHidden();
        setPaddingTop.getMax();
        this.getMax = new shouldLayout(this.setMin, this, this.isInside);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.length = this.setMax.inflate(getChildVerticalGravity.setMin.xco_main_layout, this, true);
        addChildrenForExpandedActionView addchildrenforexpandedactionview = this.toFloatRange;
        Context context = this.setMin;
        Boolean bool = Boolean.TRUE;
        addchildrenforexpandedactionview.setMax = setHorizontalStyle.length(context, "||", bool, bool, Boolean.TRUE);
        setPaddingTop.getMax();
        this.FastBitmap$CoordinateSystem = new addCustomViewsWithGravity();
        this.toDoubleRange = new getViewListMeasuredWidth();
        j();
    }

    public void setListener(getChildTop getchildtop) {
        this.getMin = getchildtop;
        this.getMax.length = getchildtop;
    }

    public void b(int i) {
        this.toString = i;
        FragmentTransaction beginTransaction = ((Activity) this.setMin).getFragmentManager().beginTransaction();
        if (i == 1) {
            getHorizontalMargins gethorizontalmargins = new getHorizontalMargins();
            this.IsOverlapping = gethorizontalmargins;
            gethorizontalmargins.setMin = this;
            beginTransaction.replace(getChildVerticalGravity.setMax.getMin, this.IsOverlapping);
            beginTransaction.commit();
            a(true);
        } else if (i == 2) {
            shouldCollapse shouldcollapse = new shouldCollapse();
            this.hashCode = shouldcollapse;
            shouldcollapse.getMax = this;
            beginTransaction.replace(getChildVerticalGravity.setMax.getMin, this.hashCode);
            beginTransaction.commit();
            a(true);
        } else if (i == 3) {
            getChildHorizontalGravity getchildhorizontalgravity = new getChildHorizontalGravity();
            this.values = getchildhorizontalgravity;
            getchildhorizontalgravity.IsOverlapping = this;
            beginTransaction.replace(getChildVerticalGravity.setMax.getMin, this.values);
            beginTransaction.commit();
            a(true);
        } else if (i == 4) {
            this.FastBitmap$CoordinateSystem.getMin = this;
            beginTransaction.replace(getChildVerticalGravity.setMax.getMin, this.FastBitmap$CoordinateSystem);
            beginTransaction.addToBackStack((String) null);
            beginTransaction.commit();
            a(false);
        } else if (i == 5) {
            this.toDoubleRange.setMax = this;
            beginTransaction.replace(getChildVerticalGravity.setMax.getMin, this.toDoubleRange);
            beginTransaction.addToBackStack((String) null);
            beginTransaction.commit();
            a(false);
        }
    }

    public void a(boolean z) {
        ImageView imageView = (ImageView) findViewById(getChildVerticalGravity.setMax.toIntRange);
        if (z) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public boolean setMax() {
        return this.toString != 3;
    }

    public void a(int i) {
        Button button = (Button) findViewById(getChildVerticalGravity.setMax.invoke);
        if (i == 1) {
            button.setText(getChildVerticalGravity.IsOverlapping.xco_button_submit_registration);
        } else if (i == 2) {
            button.setText(getChildVerticalGravity.IsOverlapping.xco_button_submit_edit);
        }
    }

    private void length(Boolean bool) {
        Button button = (Button) findViewById(getChildVerticalGravity.setMax.invoke);
        if (bool.booleanValue()) {
            button.setBackgroundResource(getChildVerticalGravity.length.xco_button_disable);
            button.setEnabled(false);
            return;
        }
        button.setBackgroundResource(getChildVerticalGravity.length.xco_button_submit);
        button.setEnabled(true);
    }

    public void l() {
        length(Boolean.FALSE);
    }

    public void k() {
        length(Boolean.TRUE);
    }

    public void h() {
        shouldLayout.getMin getmin = new shouldLayout.getMin(this.toFloatRange, this.equals);
        getmin.execute(new Void[0]);
        setMin(getmin);
    }

    public void g() {
        shouldLayout.getMax getmax = new shouldLayout.getMax(this.toFloatRange, this.equals);
        getmax.execute(new Void[0]);
        setMin(getmax);
    }

    public void f() {
        shouldLayout.IsOverlapping isOverlapping = new shouldLayout.IsOverlapping(this.toFloatRange, this.equals);
        isOverlapping.execute(new Void[0]);
        setMin(isOverlapping);
    }

    public void e() {
        shouldLayout.length length2 = new shouldLayout.length(this.toFloatRange, this.equals);
        length2.execute(new Void[0]);
        setMin(length2);
    }

    public void d() {
        shouldLayout.setMin setmin = new shouldLayout.setMin(this.toFloatRange, this.equals);
        setmin.execute(new Void[0]);
        setMin(setmin);
    }

    public void c() {
        if (this.values.setMin()) {
            shouldLayout.equals equals2 = new shouldLayout.equals(this.toFloatRange, this.equals);
            equals2.execute(new Void[0]);
            setMin(equals2);
        }
    }

    public void b() {
        if (this.values.setMin()) {
            shouldLayout.toFloatRange tofloatrange = new shouldLayout.toFloatRange(this.toFloatRange, this.equals);
            tofloatrange.execute(new Void[0]);
            setMin(tofloatrange);
        }
    }

    private void setMin(final AsyncTask asyncTask) {
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                if (asyncTask.getStatus() == AsyncTask.Status.RUNNING) {
                    asyncTask.cancel(true);
                }
            }
        }, (long) Integer.valueOf(this.setMin.getString(getChildVerticalGravity.IsOverlapping.xco_timeout_maxprogress)).intValue());
    }

    public void c(String str, String str2) {
        this.equals.length = NearbyMePromoType.LimitRangeType.DC;
        this.equals.setMax = str;
        this.equals.getMax(str2);
    }

    public void b(String str, String str2) {
        this.equals.IsOverlapping = str;
        this.equals.toIntRange = str2;
    }

    public void setDataOTP(String str) {
        this.equals.isInside = str;
    }

    public void setOTPFieldEnabled(boolean z) {
        this.values.getMax(z);
    }

    public void a() {
        getChildHorizontalGravity getchildhorizontalgravity = this.values;
        getchildhorizontalgravity.isInside++;
        TextView textView = getchildhorizontalgravity.setMax;
        StringBuilder sb = new StringBuilder();
        sb.append(getchildhorizontalgravity.toDoubleRange.getString(getChildVerticalGravity.IsOverlapping.xco_permintaan_otp));
        sb.append(getchildhorizontalgravity.isInside);
        textView.setText(sb.toString());
        getchildhorizontalgravity.setMax.setVisibility(0);
    }

    public void setListPhone(List<getWrapper> list) {
        getChildHorizontalGravity getchildhorizontalgravity = this.values;
        getchildhorizontalgravity.equals = list;
        getchildhorizontalgravity.toIntRange.clear();
        for (getWrapper getwrapper : getchildhorizontalgravity.equals) {
            getchildhorizontalgravity.toIntRange.add(getwrapper.getMin);
        }
        getchildhorizontalgravity.toIntRange.add(getchildhorizontalgravity.toDoubleRange.getString(getChildVerticalGravity.IsOverlapping.xco_listphone_prompt));
        getchildhorizontalgravity.getMin.setAdapter(getchildhorizontalgravity.toIntRange);
        getchildhorizontalgravity.getMin.setSelection(getchildhorizontalgravity.toIntRange.getCount(), true);
    }

    public void b(List<getWrapper> list, getWrapper getwrapper, int i, String str, boolean z, boolean z2) {
        getChildHorizontalGravity getchildhorizontalgravity = this.values;
        getchildhorizontalgravity.getMax = getwrapper;
        getchildhorizontalgravity.equals = list;
        getchildhorizontalgravity.toIntRange.clear();
        int i2 = -1;
        for (int i3 = 0; i3 < getchildhorizontalgravity.equals.size(); i3++) {
            getWrapper getwrapper2 = getchildhorizontalgravity.equals.get(i3);
            getchildhorizontalgravity.toIntRange.add(getwrapper2.getMin);
            if (getwrapper.length.equals(getwrapper2.length)) {
                i2 = i3;
            }
        }
        getchildhorizontalgravity.toIntRange.add(getchildhorizontalgravity.toDoubleRange.getString(getChildVerticalGravity.IsOverlapping.xco_listphone_prompt));
        getchildhorizontalgravity.getMin.setAdapter(getchildhorizontalgravity.toIntRange);
        if (i2 == -1) {
            i2 = getchildhorizontalgravity.toIntRange.getCount();
        }
        getchildhorizontalgravity.getMin.setSelection(i2, true);
        getchildhorizontalgravity.isInside = i;
        if (i == 0) {
            getchildhorizontalgravity.setMax.setVisibility(4);
        } else {
            TextView textView = getchildhorizontalgravity.setMax;
            StringBuilder sb = new StringBuilder();
            sb.append(getchildhorizontalgravity.toDoubleRange.getString(getChildVerticalGravity.IsOverlapping.xco_permintaan_otp));
            sb.append(getchildhorizontalgravity.isInside);
            textView.setText(sb.toString());
            getchildhorizontalgravity.setMax.setVisibility(0);
        }
        getchildhorizontalgravity.getMax(z2);
        getchildhorizontalgravity.length.setText(str);
        getchildhorizontalgravity.setMin.setChecked(z);
    }

    public void a(List<getWrapper> list, getWrapper getwrapper, int i, String str, boolean z, boolean z2) {
        addCustomViewsWithGravity addcustomviewswithgravity = this.FastBitmap$CoordinateSystem;
        addcustomviewswithgravity.setMax = list;
        addcustomviewswithgravity.getMax = getwrapper;
        addcustomviewswithgravity.setMin = i;
        addcustomviewswithgravity.toIntRange = str;
        addcustomviewswithgravity.isInside = z;
        addcustomviewswithgravity.IsOverlapping = z2;
    }

    public void a(String str, String str2, int i) {
        getViewListMeasuredWidth getviewlistmeasuredwidth = this.toDoubleRange;
        getviewlistmeasuredwidth.getMax = str;
        getviewlistmeasuredwidth.IsOverlapping = str2;
        getviewlistmeasuredwidth.setMin = i;
    }

    public void setToScreenFragmentTextCredentialNumber(String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-1207801893, oncanceled);
            onCancelLoad.getMin(-1207801893, oncanceled);
        }
        this.hashCode.setMin.setText(str);
    }

    public void a(String str, String str2) {
        shouldCollapse shouldcollapse = this.hashCode;
        shouldcollapse.setMin.setText(str);
        shouldcollapse.length.setText(str2);
        shouldcollapse.getMin = str2;
    }

    /* access modifiers changed from: protected */
    public void setTransactionType(String str) {
        this.equals.hashCode = str;
    }

    /* access modifiers changed from: protected */
    public void setType(String str) {
        this.equals.toDoubleRange = str;
        if (str.equals("REGISTRATION") || !str.equals("UPDATE")) {
            b(1);
        } else {
            b(2);
        }
        Button button = (Button) findViewById(getChildVerticalGravity.setMax.invoke);
        new setPaddingRight();
        button.setTypeface(setPaddingRight.getMin(button.getContext()));
        button.setText(getChildVerticalGravity.IsOverlapping.xco_button_next);
        if (str.equals("REGISTRATION")) {
            button.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (BCAXCOModule.this.setMax()) {
                        getHorizontalMargins b = BCAXCOModule.this.IsOverlapping;
                        try {
                            if (b.getMax()) {
                                String obj = b.getMax.getText().toString();
                                String obj2 = b.length.getText().toString();
                                b.setMin.c(obj.replace(" ", ""), obj2.replace(".", ""));
                                setPaddingRight.setMax(b.setMax);
                                b.setMin.g();
                            }
                        } catch (NumberFormatException unused) {
                            b.setMin.c(b.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_error_must_number));
                        } catch (Exception unused2) {
                            b.setMin.a(b.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_error_unknown));
                        }
                    } else {
                        BCAXCOModule.this.c();
                    }
                }
            });
        } else if (str.equals("UPDATE")) {
            button.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (BCAXCOModule.this.setMax()) {
                        shouldCollapse c = BCAXCOModule.this.hashCode;
                        try {
                            if (c.setMax()) {
                                String charSequence = c.setMin.getText().toString();
                                String obj = c.length.getText().toString();
                                c.getMax.c(charSequence.replace(" ", ""), obj.replace(".", ""));
                                setPaddingRight.setMax(c.setMax);
                                c.getMax.f();
                            }
                        } catch (NumberFormatException unused) {
                            c.getMax.c(c.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_error_must_number));
                        } catch (Exception unused2) {
                            c.getMax.a(c.setMax.getString(getChildVerticalGravity.IsOverlapping.xco_error_unknown));
                        }
                    } else {
                        BCAXCOModule.this.b();
                    }
                }
            });
        }
    }

    public void openWidget(String str, String str2, String str3, String str4, String str5) {
        this.getMax.length = this.getMin;
        this.toFloatRange.setMin = str;
        this.toFloatRange.getMax = "application/json";
        this.toFloatRange.length = str2;
        this.toFloatRange.getMin = str3;
        this.equals.setMin = str4;
        this.equals.getMax = str5;
    }

    public void openWidget(String str, String str2, String str3, String str4, String str5, String str6) {
        this.getMax.length = this.getMin;
        this.toFloatRange.setMin = str;
        this.toFloatRange.getMax = "application/json";
        this.toFloatRange.length = str2;
        this.toFloatRange.getMin = str3;
        this.equals.setMin = str4;
        this.equals.getMax = str5;
        this.equals.equals = str6;
        d();
    }

    public void e(String str) {
        final getOuterActionMenuPresenter getouteractionmenupresenter = new getOuterActionMenuPresenter(this.setMin);
        ((TextView) getouteractionmenupresenter.findViewById(getChildVerticalGravity.setMax.Grayscale$Algorithm)).setText(str);
        getouteractionmenupresenter.show();
        ((Button) getouteractionmenupresenter.findViewById(getChildVerticalGravity.setMax.setMin)).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                getouteractionmenupresenter.dismiss();
                BCAXCOModule.this.getMin.getMax("Token Expired");
            }
        });
    }

    public void a(String str, String str2, String str3, final String str4) {
        final getOuterActionMenuPresenter getouteractionmenupresenter = new getOuterActionMenuPresenter(this.setMin);
        ((TextView) getouteractionmenupresenter.findViewById(getChildVerticalGravity.setMax.Grayscale$Algorithm)).setText(setPaddingRight.getMax(this.setMin, str2, str3));
        getouteractionmenupresenter.show();
        ((Button) getouteractionmenupresenter.findViewById(getChildVerticalGravity.setMax.setMin)).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                getouteractionmenupresenter.dismiss();
                BCAXCOModule.this.getMin.getMin(str4);
            }
        });
    }

    public void b(String str, String str2, String str3) {
        final getOuterActionMenuPresenter getouteractionmenupresenter = new getOuterActionMenuPresenter(this.setMin);
        ((TextView) getouteractionmenupresenter.findViewById(getChildVerticalGravity.setMax.Grayscale$Algorithm)).setText(setPaddingRight.getMax(this.setMin, str2, str3));
        getouteractionmenupresenter.show();
        ((Button) getouteractionmenupresenter.findViewById(getChildVerticalGravity.setMax.setMin)).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                getouteractionmenupresenter.dismiss();
                BCAXCOModule.this.getMin.getMin();
            }
        });
    }

    public void d(String str) {
        final getOuterActionMenuPresenter getouteractionmenupresenter = new getOuterActionMenuPresenter(this.setMin);
        ((TextView) getouteractionmenupresenter.findViewById(getChildVerticalGravity.setMax.Grayscale$Algorithm)).setText(str);
        getouteractionmenupresenter.show();
        ((Button) getouteractionmenupresenter.findViewById(getChildVerticalGravity.setMax.setMin)).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                getouteractionmenupresenter.dismiss();
                BCAXCOModule.this.getMin.getMin();
            }
        });
    }

    public void a(String str, String str2, String str3) {
        getOuterActionMenuPresenter getouteractionmenupresenter = new getOuterActionMenuPresenter(this.setMin);
        ((TextView) getouteractionmenupresenter.findViewById(getChildVerticalGravity.setMax.Grayscale$Algorithm)).setText(setPaddingRight.getMax(this.setMin, str2, str3));
        getouteractionmenupresenter.show();
    }

    public void c(String str) {
        getOuterActionMenuPresenter getouteractionmenupresenter = new getOuterActionMenuPresenter(this.setMin);
        ((TextView) getouteractionmenupresenter.findViewById(getChildVerticalGravity.setMax.Grayscale$Algorithm)).setText(str);
        getouteractionmenupresenter.show();
    }

    public void b(String str) {
        getOuterActionMenuPresenter getouteractionmenupresenter = new getOuterActionMenuPresenter(this.setMin);
        StringBuilder sb = new StringBuilder("<html>");
        sb.append(str);
        sb.append("</html>");
        ((TextView) getouteractionmenupresenter.findViewById(getChildVerticalGravity.setMax.Grayscale$Algorithm)).setText(Html.fromHtml(sb.toString()));
        ((TextView) getouteractionmenupresenter.findViewById(getChildVerticalGravity.setMax.Grayscale$Algorithm)).setPadding(0, 50, 0, 50);
        getouteractionmenupresenter.show();
    }

    public void a(String str) {
        resolveRtl resolvertl = new resolveRtl(this.setMin);
        resolvertl.getMax = new AlertDialog.Builder(resolvertl.setMin).setMessage(str).setPositiveButton(17039379, new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                resolveRtl.this.getMax.show();
            }
        }).create();
        resolvertl.getMax.show();
    }

    public void setResponseCredentialDetails(isChildOrHidden ischildorhidden) {
        this.equals.equals = ischildorhidden.equals;
        this.equals.getMax(ischildorhidden.getMin);
        this.equals.length = ischildorhidden.length;
        this.equals.setMax = ischildorhidden.setMax;
    }

    public void setResponseCredentialRequestRegistration(isChildOrHidden ischildorhidden) {
        this.equals.equals = ischildorhidden.equals;
        this.equals.getMax(ischildorhidden.getMin);
        this.equals.length = ischildorhidden.length;
        this.equals.setMax = ischildorhidden.setMax;
        this.equals.getMax = ischildorhidden.getMax;
        this.equals.setMin = ischildorhidden.setMin;
        this.equals.toFloatRange = ischildorhidden.toFloatRange;
    }

    public void setResponseCredentialOTPRegistration(isChildOrHidden ischildorhidden) {
        this.equals.hashCode = ischildorhidden.hashCode;
        this.equals.equals = ischildorhidden.equals;
        this.equals.getMax = ischildorhidden.getMax;
        this.equals.IsOverlapping = ischildorhidden.IsOverlapping;
    }

    public void onProviderInstalled() {
        shouldLayout shouldlayout = new shouldLayout(this.setMin, this, this.isInside);
        this.getMax = shouldlayout;
        shouldlayout.length = this.getMin;
    }

    public void onProviderInstallFailed(int i, Intent intent) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(2001579621, oncanceled);
            onCancelLoad.getMin(2001579621, oncanceled);
        }
        GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
        if (instance.isUserResolvableError(i)) {
            Context context = this.setMin;
            if (context instanceof Activity) {
                instance.showErrorDialogFragment((Activity) context, i, 1, new DialogInterface.OnCancelListener() {
                    public final void onCancel(DialogInterface dialogInterface) {
                        BCAXCOModule.e(BCAXCOModule.this);
                    }
                });
            }
        }
    }

    public void j() {
        ((Button) findViewById(getChildVerticalGravity.setMax.invoke)).setVisibility(0);
    }

    public void i() {
        ((Button) findViewById(getChildVerticalGravity.setMax.invoke)).setVisibility(8);
    }
}
