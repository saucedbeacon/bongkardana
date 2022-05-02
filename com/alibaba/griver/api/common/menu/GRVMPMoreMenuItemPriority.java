package com.alibaba.griver.api.common.menu;

public enum GRVMPMoreMenuItemPriority {
    GRVMPMoreMenuItemPriorityDefault(100),
    GRVMPMoreMenuItemPriorityLow(10),
    GRVMPMoreMenuItemPriorityHigh(1000);
    
    int value;

    private GRVMPMoreMenuItemPriority(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    public final GRVMPMoreMenuItemPriority parseValue(int i) {
        GRVMPMoreMenuItemPriority gRVMPMoreMenuItemPriority = GRVMPMoreMenuItemPriorityDefault;
        if (i == 10) {
            return GRVMPMoreMenuItemPriorityLow;
        }
        if (i == 100 || i != 1000) {
            return gRVMPMoreMenuItemPriority;
        }
        return GRVMPMoreMenuItemPriorityHigh;
    }
}
