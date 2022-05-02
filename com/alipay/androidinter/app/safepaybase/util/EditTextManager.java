package com.alipay.androidinter.app.safepaybase.util;

public class EditTextManager {
    private static EditTextUtil mEditTextUtils;

    public static EditTextUtil getEditTextUtils() {
        if (mEditTextUtils == null) {
            mEditTextUtils = new EditTextUtil();
        }
        return mEditTextUtils;
    }
}
