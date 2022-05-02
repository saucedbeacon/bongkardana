package com.ta.audid.e;

import com.ta.audid.b.a.a;
import com.ta.audid.b.a.c;
import com.ta.audid.g.m;

@c("utdid")
public class b extends com.ta.audid.b.b {
    @a("content")
    private String f;
    @a("priority")
    public String priority;
    @a("time")
    public String time;

    public b() {
        this.time = null;
        this.priority = "3";
        this.f = null;
    }

    public b(String str) {
        this.time = null;
        this.priority = "3";
        this.f = null;
        this.priority = "3";
        this.time = String.valueOf(System.currentTimeMillis());
        setContent(str);
    }

    public String H() {
        return e.d(this.f);
    }

    public void setContent(String str) {
        if (str != null) {
            try {
                this.f = e.e(str);
            } catch (Exception e) {
                m.e("", e, new Object[0]);
            }
        }
    }
}
