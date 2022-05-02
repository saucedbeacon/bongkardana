package com.alibaba.griver.ui.ant.helper;

import android.view.View;
import android.widget.AdapterView;

public class AUViewEventHelper {

    /* renamed from: a  reason: collision with root package name */
    private static ClickListenerWrapper f10554a;

    public interface ClickListenerWrapper {
        View.OnClickListener wrap(View.OnClickListener onClickListener);

        AdapterView.OnItemClickListener wrap(AdapterView.OnItemClickListener onItemClickListener);
    }

    public static void setWrapper(ClickListenerWrapper clickListenerWrapper) {
        f10554a = clickListenerWrapper;
    }

    public static View.OnClickListener wrapClickListener(View.OnClickListener onClickListener) {
        ClickListenerWrapper clickListenerWrapper = f10554a;
        if (clickListenerWrapper == null) {
            return onClickListener;
        }
        return clickListenerWrapper.wrap(onClickListener);
    }

    public static AdapterView.OnItemClickListener wrapItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        ClickListenerWrapper clickListenerWrapper = f10554a;
        if (clickListenerWrapper == null) {
            return onItemClickListener;
        }
        return clickListenerWrapper.wrap(onItemClickListener);
    }
}
