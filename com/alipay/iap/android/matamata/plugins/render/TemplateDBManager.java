package com.alipay.iap.android.matamata.plugins.render;

import android.content.Context;
import com.alipay.plus.android.database.sqlite.SQLiteTableManager;
import java.sql.SQLException;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

class TemplateDBManager<T> extends SQLiteTableManager<T, Integer> {
    private static final String WHERE_CONDITION = "templateCode = ?";

    TemplateDBManager(Class<T> cls, Context context) {
        super(cls, context);
    }

    /* access modifiers changed from: package-private */
    public List<T> get(String str) throws SQLException {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-973475049, oncanceled);
            onCancelLoad.getMin(-973475049, oncanceled);
        }
        return get(WHERE_CONDITION, new String[]{str}, (String) null, (String) null);
    }
}
