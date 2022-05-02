package com.bca.xco.widget;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import java.util.List;
import o.dispatchOnCancelled;
import o.getChildTop;
import o.getWrapper;
import o.isChildOrHidden;
import o.onCancelLoad;
import o.onCanceled;

public class BCAEditXCOWidget extends BCAXCOModule {
    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public /* bridge */ /* synthetic */ void a(int i) {
        super.a(i);
    }

    public /* bridge */ /* synthetic */ void a(String str) {
        super.a(str);
    }

    public /* bridge */ /* synthetic */ void a(String str, String str2) {
        super.a(str, str2);
    }

    public /* bridge */ /* synthetic */ void a(String str, String str2, int i) {
        super.a(str, str2, i);
    }

    public /* bridge */ /* synthetic */ void a(String str, String str2, String str3) {
        super.a(str, str2, str3);
    }

    public /* bridge */ /* synthetic */ void a(String str, String str2, String str3, String str4) {
        super.a(str, str2, str3, str4);
    }

    public /* bridge */ /* synthetic */ void a(List list, getWrapper getwrapper, int i, String str, boolean z, boolean z2) {
        super.a(list, getwrapper, i, str, z, z2);
    }

    public /* bridge */ /* synthetic */ void a(boolean z) {
        super.a(z);
    }

    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public /* bridge */ /* synthetic */ void b(int i) {
        super.b(i);
    }

    public /* bridge */ /* synthetic */ void b(String str) {
        super.b(str);
    }

    public /* bridge */ /* synthetic */ void b(String str, String str2) {
        super.b(str, str2);
    }

    public /* bridge */ /* synthetic */ void b(String str, String str2, String str3) {
        super.b(str, str2, str3);
    }

    public /* bridge */ /* synthetic */ void b(List list, getWrapper getwrapper, int i, String str, boolean z, boolean z2) {
        super.b(list, getwrapper, i, str, z, z2);
    }

    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public /* bridge */ /* synthetic */ void c(String str) {
        super.c(str);
    }

    public /* synthetic */ void c(String str, String str2) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1815768182, oncanceled);
            onCancelLoad.getMin(1815768182, oncanceled);
        }
        super.c(str, str2);
    }

    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    public /* bridge */ /* synthetic */ void d(String str) {
        super.d(str);
    }

    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    public /* bridge */ /* synthetic */ void e(String str) {
        super.e(str);
    }

    public /* bridge */ /* synthetic */ void f() {
        super.f();
    }

    public /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    public /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public /* bridge */ /* synthetic */ void onProviderInstallFailed(int i, Intent intent) {
        super.onProviderInstallFailed(i, intent);
    }

    public /* bridge */ /* synthetic */ void onProviderInstalled() {
        super.onProviderInstalled();
    }

    public /* bridge */ /* synthetic */ void openWidget(String str, String str2, String str3, String str4, String str5) {
        super.openWidget(str, str2, str3, str4, str5);
    }

    public /* bridge */ /* synthetic */ void openWidget(String str, String str2, String str3, String str4, String str5, String str6) {
        super.openWidget(str, str2, str3, str4, str5, str6);
    }

    public /* bridge */ /* synthetic */ void setDataOTP(String str) {
        super.setDataOTP(str);
    }

    public /* bridge */ /* synthetic */ void setListPhone(List list) {
        super.setListPhone(list);
    }

    public /* bridge */ /* synthetic */ void setListener(getChildTop getchildtop) {
        super.setListener(getchildtop);
    }

    public /* bridge */ /* synthetic */ void setOTPFieldEnabled(boolean z) {
        super.setOTPFieldEnabled(z);
    }

    public /* bridge */ /* synthetic */ void setResponseCredentialDetails(isChildOrHidden ischildorhidden) {
        super.setResponseCredentialDetails(ischildorhidden);
    }

    public /* bridge */ /* synthetic */ void setResponseCredentialOTPRegistration(isChildOrHidden ischildorhidden) {
        super.setResponseCredentialOTPRegistration(ischildorhidden);
    }

    public /* bridge */ /* synthetic */ void setResponseCredentialRequestRegistration(isChildOrHidden ischildorhidden) {
        super.setResponseCredentialRequestRegistration(ischildorhidden);
    }

    public /* bridge */ /* synthetic */ void setToScreenFragmentTextCredentialNumber(String str) {
        super.setToScreenFragmentTextCredentialNumber(str);
    }

    public BCAEditXCOWidget(Context context) {
        super(context);
        setType("UPDATE");
        setTransactionType("UPDATE_LIMIT");
    }

    public BCAEditXCOWidget(Context context, String str) {
        super(context, str);
        setType("UPDATE");
        setTransactionType("UPDATE_LIMIT");
    }

    public BCAEditXCOWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setType("UPDATE");
        setTransactionType("UPDATE_LIMIT");
    }

    public BCAEditXCOWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setType("UPDATE");
        setTransactionType("UPDATE_LIMIT");
    }
}
