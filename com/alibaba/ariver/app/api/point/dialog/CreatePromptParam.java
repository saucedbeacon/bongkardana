package com.alibaba.ariver.app.api.point.dialog;

import android.content.DialogInterface;

public class CreatePromptParam {

    /* renamed from: a  reason: collision with root package name */
    private String f8953a;
    private String b;
    private String c;
    public String cancelColor;
    public DialogInterface.OnCancelListener cancelListener;
    public boolean cancelable = true;
    private String d;
    private String e;
    public DialogInterface.OnClickListener negativeListener;
    public String negativeTextColor;
    public PositiveListener positiveListener;
    public String positiveTextColor;

    public interface PositiveListener {
        void onClick(DialogInterface dialogInterface, String str);
    }

    public CreatePromptParam(String str, String str2, String str3, String str4, String str5) {
        this.f8953a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public String getTitle() {
        return this.f8953a;
    }

    public String getMessage() {
        return this.b;
    }

    public String getPositiveString() {
        return this.c;
    }

    public String getNegativeString() {
        return this.d;
    }

    public String getPlaceHolder() {
        return this.e;
    }
}
