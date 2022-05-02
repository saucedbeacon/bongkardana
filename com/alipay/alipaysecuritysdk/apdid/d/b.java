package com.alipay.alipaysecuritysdk.apdid.d;

import android.annotation.SuppressLint;
import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    Context f9258a;

    b(Context context) {
        this.f9258a = context;
    }

    @SuppressLint({"SimpleDateFormat"})
    static boolean a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String[] strArr = {"2017-01-27 2017-01-28", "2017-11-10 2017-11-11", "2017-12-11 2017-12-12"};
        int random = ((int) (Math.random() * 24.0d * 60.0d * 60.0d)) * 1;
        int i = 0;
        while (i < 3) {
            try {
                String[] split = strArr[i].split(" ");
                if (split != null) {
                    if (split.length == 2) {
                        Date date = new Date();
                        StringBuilder sb = new StringBuilder();
                        sb.append(split[0]);
                        sb.append(" 00:00:00");
                        Date parse = simpleDateFormat.parse(sb.toString());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(split[1]);
                        sb2.append(" 23:59:59");
                        Date parse2 = simpleDateFormat.parse(sb2.toString());
                        simpleDateFormat.format(parse);
                        Calendar instance = Calendar.getInstance();
                        instance.setTime(parse2);
                        instance.add(13, random);
                        Date time = instance.getTime();
                        simpleDateFormat.format(time);
                        if (!date.after(parse) || !date.before(time)) {
                            simpleDateFormat.format(date);
                        } else {
                            simpleDateFormat.format(date);
                            return true;
                        }
                    }
                }
                i++;
            } catch (Throwable th) {
                com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-apdid", "Unexpected error happened while judge whether now is in rush hour.", th);
            }
        }
        return false;
    }
}
