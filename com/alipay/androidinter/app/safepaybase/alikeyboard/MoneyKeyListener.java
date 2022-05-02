package com.alipay.androidinter.app.safepaybase.alikeyboard;

import android.os.Build;
import android.text.Editable;
import android.text.Spanned;
import android.text.method.NumberKeyListener;
import android.view.KeyEvent;
import android.view.View;
import java.util.regex.Pattern;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class MoneyKeyListener extends NumberKeyListener {
    private static final Pattern MONEY_PATTERN = Pattern.compile("^(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d){0,2})?$");

    public static MoneyKeyListener getInstance() {
        return new MoneyKeyListener();
    }

    public int getInputType() {
        if (TaoHelper.isSpecialManuFacturer("samsung") || Build.VERSION.SDK_INT >= 14 || Build.VERSION.SDK_INT >= 14) {
            return 128;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public char[] getAcceptedChars() {
        return new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.'};
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(2089056965, oncanceled);
            onCancelLoad.getMin(2089056965, oncanceled);
        }
        String charSequence2 = charSequence.subSequence(i, i2).toString();
        String obj = spanned.toString();
        String substring = obj.substring(0, i3);
        String substring2 = obj.substring(i4, spanned.length());
        StringBuilder sb = new StringBuilder();
        sb.append(substring);
        sb.append(charSequence2);
        sb.append(substring2);
        return !MONEY_PATTERN.matcher(sb.toString()).find() ? "" : charSequence2;
    }

    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return super.onKeyDown(view, editable, i, keyEvent);
    }
}
