package com.iap.ac.android.acs.plugin.biz.region.stageinfo;

public interface FetchLaunchableGroupsCallback<T> {
    void onFailure(String str, String str2);

    void onResponse(T t);
}
