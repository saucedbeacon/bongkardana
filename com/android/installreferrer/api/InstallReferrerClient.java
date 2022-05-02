package com.android.installreferrer.api;

import android.content.Context;
import android.os.RemoteException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.inflateMenu;
import o.setContentInsetsAbsolute;

public abstract class InstallReferrerClient {

    @Retention(RetentionPolicy.SOURCE)
    public @interface InstallReferrerResponse {
        public static final int DEVELOPER_ERROR = 3;
        public static final int FEATURE_NOT_SUPPORTED = 2;
        public static final int OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;
        public static final int SERVICE_UNAVAILABLE = 1;
    }

    public static final class getMax {
        public final Context setMin;

        private getMax(Context context) {
            this.setMin = context;
        }

        /* synthetic */ getMax(Context context, byte b) {
            this(context);
        }
    }

    public abstract void getMax();

    public abstract setContentInsetsAbsolute getMin() throws RemoteException;

    public abstract boolean length();

    public abstract void setMin(inflateMenu inflatemenu);

    public static getMax setMax(Context context) {
        return new getMax(context, (byte) 0);
    }
}
