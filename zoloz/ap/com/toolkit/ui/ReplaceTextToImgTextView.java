package zoloz.ap.com.toolkit.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.Map;
import zoloz.ap.com.toolkit.R;

public class ReplaceTextToImgTextView extends CustomTextView {
    private Map<String, Integer> mReplaceResInfo = null;

    public ReplaceTextToImgTextView(Context context) {
        super(context);
    }

    public ReplaceTextToImgTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ReplaceTextToImgTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void init(Context context, AttributeSet attributeSet) {
        super.init(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ReplaceTextToImgTextView);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.ReplaceTextToImgTextView_z_replace_str_array, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.ReplaceTextToImgTextView_z_replace_res_array, -1);
        if (!(resourceId == -1 || resourceId2 == -1)) {
            parseReplaceInfo(resourceId, resourceId2);
        }
        addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                ReplaceTextToImgTextView.this.updateText();
            }
        });
        setText(getText());
    }

    private void parseReplaceInfo(int i, int i2) {
        this.mReplaceResInfo = new HashMap();
        String[] stringArray = getResources().getStringArray(i);
        TypedArray obtainTypedArray = getResources().obtainTypedArray(i2);
        int length = obtainTypedArray.length();
        int[] iArr = new int[length];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            iArr[i4] = obtainTypedArray.getResourceId(i4, -1);
        }
        while (i3 < stringArray.length && i3 < length) {
            this.mReplaceResInfo.put(stringArray[i3], Integer.valueOf(iArr[i3]));
            i3++;
        }
    }

    /* access modifiers changed from: private */
    public void updateText() {
        if (this.mReplaceResInfo != null) {
            Editable editableText = getEditableText();
            String obj = editableText.toString();
            for (Map.Entry next : this.mReplaceResInfo.entrySet()) {
                if (!TextUtils.isEmpty((CharSequence) next.getKey()) && ((Integer) next.getValue()).intValue() != -1) {
                    int indexOf = obj.indexOf((String) next.getKey());
                    editableText.setSpan(new CustomImgSpan(getContext(), ((Integer) next.getValue()).intValue(), (int) getTextSize(), (int) getTextSize()), indexOf, indexOf + 1, 18);
                }
            }
        }
    }
}
