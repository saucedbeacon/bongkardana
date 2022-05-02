package com.bca.xco.widget.comp;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.Spinner;

public class XSpinner extends Spinner {

    /* renamed from: a  reason: collision with root package name */
    AdapterView.OnItemSelectedListener f10774a;

    public XSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setSelection(int i) {
        super.setSelection(i);
        AdapterView.OnItemSelectedListener onItemSelectedListener = this.f10774a;
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onItemSelected(this, getSelectedView(), i, 0);
        }
    }

    public void setOnItemSelectedEvenIfUnchangedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f10774a = onItemSelectedListener;
    }
}
