package com.alipay.iap.android.wallet.acl.contact;

import java.util.Map;

public class ContactInfo {
    public String displayName;
    public Map<String, String> extendedInfo;

    /* renamed from: id  reason: collision with root package name */
    public String f10691id;
    public String[] numbers;
    public ContactStatus status;

    public ContactInfo(String[] strArr, String str, String str2, ContactStatus contactStatus, Map<String, String> map) {
        this.numbers = strArr;
        this.f10691id = str;
        this.displayName = str2;
        this.status = contactStatus;
        this.extendedInfo = map;
    }

    public String[] getNumbers() {
        return this.numbers;
    }

    public void setNumbers(String[] strArr) {
        this.numbers = strArr;
    }

    public String getId() {
        return this.f10691id;
    }

    public void setId(String str) {
        this.f10691id = str;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public ContactStatus getStatus() {
        return this.status;
    }

    public void setStatus(ContactStatus contactStatus) {
        this.status = contactStatus;
    }

    public Map<String, String> getExtendedInfo() {
        return this.extendedInfo;
    }

    public void setExtendedInfo(Map<String, String> map) {
        this.extendedInfo = map;
    }
}
