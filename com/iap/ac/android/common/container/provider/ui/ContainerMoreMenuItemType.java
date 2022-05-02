package com.iap.ac.android.common.container.provider.ui;

public enum ContainerMoreMenuItemType {
    Feedback(1),
    Notification(2),
    Favorite(3);
    
    private int value;

    private ContainerMoreMenuItemType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    public static ContainerMoreMenuItemType parseValue(int i) {
        ContainerMoreMenuItemType containerMoreMenuItemType = Feedback;
        if (i == 1) {
            return containerMoreMenuItemType;
        }
        if (i == 2) {
            return Notification;
        }
        if (i != 3) {
            return containerMoreMenuItemType;
        }
        return Favorite;
    }
}
