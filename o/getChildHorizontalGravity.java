package o;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bca.xco.widget.BCAXCOModule;
import com.bca.xco.widget.comp.XSpinner;
import java.util.List;
import o.getChildVerticalGravity;

public final class getChildHorizontalGravity extends Fragment {
    private TextView FastBitmap$CoordinateSystem;
    public BCAXCOModule IsOverlapping;
    /* access modifiers changed from: private */
    public boolean Mean$Arithmetic;
    public List<getWrapper> equals;
    public getWrapper getMax;
    public XSpinner getMin;
    private ImageView hashCode;
    public int isInside = 0;
    public EditText length;
    public TextView setMax;
    public CheckBox setMin;
    public Context toDoubleRange;
    setPaddingRight toFloatRange;
    public ArrayAdapter<String> toIntRange;
    private Button toString;
    private TextView values;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getActivity().getWindow().setSoftInputMode(48);
        View inflate = layoutInflater.inflate(getChildVerticalGravity.setMin.xco_fragment_screen_phone, viewGroup, false);
        this.toDoubleRange = inflate.getContext();
        this.getMax = new getWrapper();
        this.toFloatRange = new setPaddingRight();
        this.getMin = (XSpinner) inflate.findViewById(getChildVerticalGravity.setMax.values);
        AnonymousClass4 r10 = new ArrayAdapter<String>(this.toDoubleRange) {
            public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
                View dropDownView = super.getDropDownView(i, view, viewGroup);
                TextView textView = (TextView) dropDownView.findViewById(16908308);
                if (i == getCount()) {
                    textView.setText("");
                    textView.setHint((CharSequence) getItem(getCount()));
                }
                textView.setTypeface(setPaddingRight.setMin(textView.getContext()));
                setPaddingRight.getMax(textView, (float) getChildHorizontalGravity.this.toDoubleRange.getResources().getDimensionPixelSize(getChildVerticalGravity.getMax.getMax));
                return dropDownView;
            }

            public final View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                TextView textView = (TextView) view2.findViewById(16908308);
                if (i == getCount()) {
                    textView.setText("");
                    textView.setHint((CharSequence) getItem(getCount()));
                }
                textView.setTypeface(setPaddingRight.setMin(textView.getContext()));
                setPaddingRight.getMax(textView, (float) getChildHorizontalGravity.this.toDoubleRange.getResources().getDimensionPixelSize(getChildVerticalGravity.getMax.getMax));
                return view2;
            }

            public final int getCount() {
                return super.getCount() - 1;
            }
        };
        this.toIntRange = r10;
        r10.setDropDownViewResource(17367049);
        this.toIntRange.add(inflate.getContext().getString(getChildVerticalGravity.IsOverlapping.xco_listphone_prompt));
        this.toIntRange.add(inflate.getContext().getString(getChildVerticalGravity.IsOverlapping.xco_listphone_prompt));
        this.getMin.setAdapter(this.toIntRange);
        this.getMin.setSelection(this.toIntRange.getCount());
        this.getMin.setOnItemSelectedEvenIfUnchangedListener(new AdapterView.OnItemSelectedListener() {
            /* access modifiers changed from: private */
            public boolean setMax = true;

            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                StringBuilder sb = new StringBuilder();
                sb.append(getChildHorizontalGravity.this.getMin.getSelectedItem());
                if (!sb.toString().equals(getChildHorizontalGravity.this.toDoubleRange.getString(getChildVerticalGravity.IsOverlapping.xco_listphone_prompt))) {
                    final getSubtitleTextView getsubtitletextview = new getSubtitleTextView(getChildHorizontalGravity.this.toDoubleRange);
                    final getWrapper getwrapper = getChildHorizontalGravity.this.equals.get(i);
                    ((TextView) getsubtitletextview.findViewById(getChildVerticalGravity.setMax.invokeSuspend)).setText(getwrapper.getMin);
                    getsubtitletextview.show();
                    ((Button) getsubtitletextview.findViewById(getChildVerticalGravity.setMax.setMin)).setOnClickListener(new View.OnClickListener() {
                        public final void onClick(View view) {
                            boolean unused = AnonymousClass3.this.setMax = false;
                            getChildHorizontalGravity.this.getMax = getwrapper;
                            getChildHorizontalGravity.this.IsOverlapping.b(getChildHorizontalGravity.this.getMax.length, getChildHorizontalGravity.this.getMax.getMin);
                            getChildHorizontalGravity.this.IsOverlapping.e();
                            getsubtitletextview.dismiss();
                        }
                    });
                    ((Button) getsubtitletextview.findViewById(getChildVerticalGravity.setMax.getMax)).setOnClickListener(new View.OnClickListener() {
                        public final void onClick(View view) {
                            if (AnonymousClass3.this.setMax) {
                                getChildHorizontalGravity.this.getMin.setSelection(getChildHorizontalGravity.this.toIntRange.getCount(), true);
                            } else {
                                getChildHorizontalGravity.this.getMin.setSelection(getChildHorizontalGravity.this.toIntRange.getPosition(getChildHorizontalGravity.this.getMax.getMin), true);
                            }
                            getsubtitletextview.dismiss();
                        }
                    });
                }
            }
        });
        this.FastBitmap$CoordinateSystem = (TextView) inflate.findViewById(getChildVerticalGravity.setMax.toDoubleRange);
        this.hashCode = (ImageView) inflate.findViewById(getChildVerticalGravity.setMax.equals);
        this.setMin = (CheckBox) inflate.findViewById(getChildVerticalGravity.setMax.isInside);
        this.values = (TextView) inflate.findViewById(getChildVerticalGravity.setMax.Mean$Arithmetic);
        Spanned fromHtml = Html.fromHtml(inflate.getContext().getString(getChildVerticalGravity.IsOverlapping.xco_agreement));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, fromHtml.length(), URLSpan.class)) {
            spannableStringBuilder.setSpan(new ClickableSpan() {
                public final void onClick(View view) {
                    setPaddingRight.setMax(getChildHorizontalGravity.this.toDoubleRange);
                    getChildHorizontalGravity.this.IsOverlapping.i();
                    getChildHorizontalGravity.this.IsOverlapping.b(4);
                    BCAXCOModule bCAXCOModule = getChildHorizontalGravity.this.IsOverlapping;
                    List<getWrapper> list = getChildHorizontalGravity.this.equals;
                    getWrapper getwrapper = getChildHorizontalGravity.this.getMax;
                    int i = getChildHorizontalGravity.this.isInside;
                    StringBuilder sb = new StringBuilder();
                    sb.append(getChildHorizontalGravity.this.length.getText());
                    bCAXCOModule.a(list, getwrapper, i, sb.toString(), getChildHorizontalGravity.this.setMin.isChecked(), getChildHorizontalGravity.this.Mean$Arithmetic);
                }
            }, spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
            spannableStringBuilder.removeSpan(uRLSpan);
        }
        this.values.setText(spannableStringBuilder);
        this.values.setMovementMethod(LinkMovementMethod.getInstance());
        this.values.setLinkTextColor(this.toDoubleRange.getResources().getColor(getChildVerticalGravity.getMin.getMin));
        this.values.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (getChildHorizontalGravity.this.setMin.isEnabled()) {
                    getChildHorizontalGravity.this.setMin.setChecked(!getChildHorizontalGravity.this.setMin.isChecked());
                }
            }
        });
        this.length = (EditText) inflate.findViewById(getChildVerticalGravity.setMax.FastBitmap$CoordinateSystem);
        TextView textView = (TextView) inflate.findViewById(getChildVerticalGravity.setMax.create);
        this.setMax = textView;
        textView.setVisibility(4);
        Button button = (Button) inflate.findViewById(getChildVerticalGravity.setMax.length);
        this.toString = button;
        button.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                setPaddingRight.setMax(getChildHorizontalGravity.this.toDoubleRange);
                getChildHorizontalGravity.this.IsOverlapping.b(getChildHorizontalGravity.this.getMax.length, getChildHorizontalGravity.this.getMax.getMin);
                getChildHorizontalGravity.this.IsOverlapping.e();
            }
        });
        getMax(false);
        TextView textView2 = this.FastBitmap$CoordinateSystem;
        textView2.setTypeface(setPaddingRight.setMin(textView2.getContext()));
        TextView textView3 = this.values;
        textView3.setTypeface(setPaddingRight.setMin(textView3.getContext()));
        EditText editText = this.length;
        editText.setTypeface(setPaddingRight.setMin(editText.getContext()));
        TextView textView4 = this.setMax;
        textView4.setTypeface(setPaddingRight.setMin(textView4.getContext()));
        Button button2 = this.toString;
        button2.setTypeface(setPaddingRight.setMin(button2.getContext()));
        return inflate;
    }

    public final void getMax(boolean z) {
        this.Mean$Arithmetic = z;
        this.length.setEnabled(z);
        this.toString.setEnabled(z);
        this.setMin.setEnabled(z);
        this.FastBitmap$CoordinateSystem.setEnabled(z);
        this.hashCode.setEnabled(z);
        this.IsOverlapping.j();
        if (!z) {
            this.values.setTextColor(this.toDoubleRange.getResources().getColor(getChildVerticalGravity.getMin.setMin));
            this.length.setTextColor(this.toDoubleRange.getResources().getColor(getChildVerticalGravity.getMin.setMin));
            this.FastBitmap$CoordinateSystem.setTextColor(this.toDoubleRange.getResources().getColor(getChildVerticalGravity.getMin.setMin));
            this.hashCode.setImageDrawable(this.toDoubleRange.getResources().getDrawable(getChildVerticalGravity.length.xco_ic_otp_na));
            this.toString.setBackgroundResource(getChildVerticalGravity.length.xco_button_rounded_disable);
            return;
        }
        this.values.setTextColor(this.toDoubleRange.getResources().getColor(getChildVerticalGravity.getMin.length));
        this.length.setTextColor(this.toDoubleRange.getResources().getColor(getChildVerticalGravity.getMin.length));
        this.FastBitmap$CoordinateSystem.setTextColor(this.toDoubleRange.getResources().getColor(getChildVerticalGravity.getMin.length));
        this.hashCode.setImageDrawable(this.toDoubleRange.getResources().getDrawable(getChildVerticalGravity.length.xco_ic_otp));
        this.toString.setBackgroundResource(getChildVerticalGravity.length.xco_button_rounded_positive);
    }

    public final boolean setMin() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getMin.getSelectedItem());
        if (sb.toString().equals(this.toDoubleRange.getString(getChildVerticalGravity.IsOverlapping.xco_listphone_prompt))) {
            this.IsOverlapping.c(this.toDoubleRange.getString(getChildVerticalGravity.IsOverlapping.xco_err_ponsel_01));
            return false;
        } else if (setPaddingRight.setMax(this.length)) {
            this.IsOverlapping.c(this.toDoubleRange.getString(getChildVerticalGravity.IsOverlapping.xco_err_otp_01));
            return false;
        } else if (this.length.getText().length() < 6) {
            this.IsOverlapping.c(this.toDoubleRange.getString(getChildVerticalGravity.IsOverlapping.xco_err_otp_03));
            return false;
        } else if (!this.setMin.isChecked()) {
            this.IsOverlapping.c(this.toDoubleRange.getString(getChildVerticalGravity.IsOverlapping.xco_err_syarat_01));
            return false;
        } else {
            this.IsOverlapping.setDataOTP(this.length.getText().toString());
            setPaddingRight.setMax(this.toDoubleRange);
            return true;
        }
    }
}
