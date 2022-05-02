package com.facebook.stetho.inspector.elements.android;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.elements.AbstractChainedDescriptor;
import com.facebook.stetho.inspector.elements.AttributeAccumulator;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

final class TextViewDescriptor extends AbstractChainedDescriptor<TextView> {
    private static final String TEXT_ATTRIBUTE_NAME = "text";
    private final Map<TextView, ElementContext> mElementToContextMap = Collections.synchronizedMap(new IdentityHashMap());

    TextViewDescriptor() {
    }

    /* access modifiers changed from: protected */
    public final void onHook(TextView textView) {
        ElementContext elementContext = new ElementContext();
        elementContext.hook(textView);
        this.mElementToContextMap.put(textView, elementContext);
    }

    /* access modifiers changed from: protected */
    public final void onUnhook(TextView textView) {
        this.mElementToContextMap.remove(textView).unhook();
    }

    /* access modifiers changed from: protected */
    public final void onGetAttributes(TextView textView, AttributeAccumulator attributeAccumulator) {
        CharSequence text = textView.getText();
        if (text != null && text.length() != 0) {
            attributeAccumulator.store("text", text.toString());
        }
    }

    final class ElementContext implements TextWatcher {
        private TextView mElement;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-1896489084, oncanceled);
                onCancelLoad.getMin(-1896489084, oncanceled);
            }
        }

        private ElementContext() {
        }

        public final void hook(TextView textView) {
            TextView textView2 = (TextView) Util.throwIfNull(textView);
            this.mElement = textView2;
            textView2.addTextChangedListener(this);
        }

        public final void unhook() {
            TextView textView = this.mElement;
            if (textView != null) {
                textView.removeTextChangedListener(this);
                this.mElement = null;
            }
        }

        public final void afterTextChanged(Editable editable) {
            if (editable.length() == 0) {
                TextViewDescriptor.this.getHost().onAttributeRemoved(this.mElement, "text");
            } else {
                TextViewDescriptor.this.getHost().onAttributeModified(this.mElement, "text", editable.toString());
            }
        }
    }
}
