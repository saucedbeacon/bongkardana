package com.alibaba.ariver.resource.api.appinfo;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class AppUpdaterFactory {

    /* renamed from: a  reason: collision with root package name */
    private static final List<Rule> f10167a = new ArrayList();

    public interface Rule {
        IAppUpdater findUpdater(String str, @Nullable Bundle bundle);
    }

    public static void clearRules() {
        synchronized (f10167a) {
            f10167a.clear();
        }
    }

    public static void registerRule(Rule rule) {
        synchronized (f10167a) {
            f10167a.add(rule);
        }
    }

    public static void unRegisterRule(Rule rule) {
        synchronized (f10167a) {
            f10167a.remove(rule);
        }
    }

    public static IAppUpdater createUpdater(String str, @Nullable Bundle bundle) {
        synchronized (f10167a) {
            for (int size = f10167a.size() - 1; size >= 0; size--) {
                IAppUpdater findUpdater = f10167a.get(size).findUpdater(str, bundle);
                if (findUpdater != null) {
                    return findUpdater;
                }
            }
            return null;
        }
    }
}
