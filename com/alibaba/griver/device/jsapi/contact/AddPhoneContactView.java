package com.alibaba.griver.device.jsapi.contact;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.AdapterView;
import java.util.ArrayList;

public interface AddPhoneContactView {
    void initView(Context context, ArrayList<String> arrayList);

    void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener);

    void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener);

    void show();
}
