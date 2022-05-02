package com.alibaba.griver.base.resource.predownload;

import java.util.List;

public class AppPreDownloadConfig {

    /* renamed from: a  reason: collision with root package name */
    private boolean f9173a;
    private int b;
    private int c;
    private List<ConfigUnitsBean> d;

    public boolean isEnabled() {
        return this.f9173a;
    }

    public void setEnabled(boolean z) {
        this.f9173a = z;
    }

    public int getMaxConcurrentCount() {
        if (this.b <= 0) {
            this.b = 1;
        }
        if (this.b > 10) {
            this.b = 10;
        }
        return this.b;
    }

    public void setMaxConcurrentCount(int i) {
        this.b = i;
    }

    public int getAvailableExpiredTime() {
        if (this.c < 0) {
            this.c = 0;
        }
        return this.c;
    }

    public void setAvailableExpiredTime(int i) {
        this.c = i;
    }

    public List<ConfigUnitsBean> getConfigUnits() {
        return this.d;
    }

    public void setConfigUnits(List<ConfigUnitsBean> list) {
        this.d = list;
    }

    public static class ConfigUnitsBean {

        /* renamed from: a  reason: collision with root package name */
        private String f9174a;
        private String b;
        private int c;
        private int d;
        private List<String> e;

        public String getType() {
            return this.f9174a;
        }

        public void setType(String str) {
            this.f9174a = str;
        }

        public String getFireMoment() {
            return this.b;
        }

        public void setFireMoment(String str) {
            this.b = str;
        }

        public int getDelay() {
            return this.c;
        }

        public void setDelay(int i) {
            this.c = i;
        }

        public int getRetryCount() {
            return this.d;
        }

        public void setRetryCount(int i) {
            this.d = i;
        }

        public List<String> getAppIds() {
            return this.e;
        }

        public void setAppIds(List<String> list) {
            this.e = list;
        }
    }
}
