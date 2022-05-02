package com.alibaba.ariver.permission.openauth.model.result;

import androidx.annotation.Keep;

@Keep
public final class AuthAgreementModel {
    private String content;
    private String link;
    private String name;

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final String getLink() {
        return this.link;
    }

    public final void setLink(String str) {
        this.link = str;
    }

    public final String getContent() {
        return this.content;
    }

    public final void setContent(String str) {
        this.content = str;
    }
}
