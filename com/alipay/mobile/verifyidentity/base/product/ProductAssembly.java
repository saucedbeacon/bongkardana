package com.alipay.mobile.verifyidentity.base.product;

import java.util.ArrayList;

public class ProductAssembly {
    private int curIndex = 0;
    private IEnvInfo envInfo;
    private ProcessType processType = ProcessType.OR;
    private ArrayList<String> productItemArrayList = new ArrayList<>();
    private ToastType toastType = ToastType.NORMAl;

    public enum ProcessType {
        OR,
        AND
    }

    public enum ToastType {
        NORMAl,
        ALIPAYLOG
    }

    public void setProcessType(ProcessType processType2) {
        this.processType = processType2;
    }

    public ProcessType getProcessType() {
        return this.processType;
    }

    public ToastType getToastType() {
        return this.toastType;
    }

    public void setToastType(ToastType toastType2) {
        this.toastType = toastType2;
    }

    public IEnvInfo getEnvInfo() {
        return this.envInfo;
    }

    public void setEnvInfo(IEnvInfo iEnvInfo) {
        this.envInfo = iEnvInfo;
    }

    public void addProduct(String str) {
        this.productItemArrayList.add(str);
    }

    public String getFirstProduct() {
        if (this.productItemArrayList.size() <= 0) {
            return null;
        }
        this.curIndex = 0;
        return this.productItemArrayList.get(0);
    }

    public String getNextProduct() {
        int size = this.productItemArrayList.size();
        int i = this.curIndex;
        if (size <= i + 1) {
            return null;
        }
        int i2 = i + 1;
        this.curIndex = i2;
        return this.productItemArrayList.get(i2);
    }

    public int number() {
        return this.productItemArrayList.size();
    }
}
