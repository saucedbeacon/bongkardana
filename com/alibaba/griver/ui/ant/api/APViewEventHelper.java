package com.alibaba.griver.ui.ant.api;

import android.view.View;
import android.widget.AdapterView;

public class APViewEventHelper {

    /* renamed from: a  reason: collision with root package name */
    private static ClickListenerWrapper f10535a;

    public interface ClickListenerWrapper {
        View.OnClickListener wrap(View.OnClickListener onClickListener);

        AdapterView.OnItemClickListener wrap(AdapterView.OnItemClickListener onItemClickListener);
    }

    public static void setWrapper(ClickListenerWrapper clickListenerWrapper) {
        f10535a = clickListenerWrapper;
    }

    public static View.OnClickListener wrapClickListener(View.OnClickListener onClickListener) {
        ClickListenerWrapper clickListenerWrapper = f10535a;
        if (clickListenerWrapper == null) {
            return onClickListener;
        }
        return clickListenerWrapper.wrap(onClickListener);
    }

    public static AdapterView.OnItemClickListener wrapItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        ClickListenerWrapper clickListenerWrapper = f10535a;
        if (clickListenerWrapper == null) {
            return onItemClickListener;
        }
        return clickListenerWrapper.wrap(onItemClickListener);
    }
}
