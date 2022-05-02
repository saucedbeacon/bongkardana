package com.alibaba.griver.base.api;

public interface APWebBackForwardList {
    int getCurrentIndex();

    APWebHistoryItem getCurrentItem();

    APWebHistoryItem getItemAtIndex(int i);

    int getSize();
}
