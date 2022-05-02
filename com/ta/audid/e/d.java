package com.ta.audid.e;

import com.ta.audid.a;
import com.ta.audid.g.m;
import java.util.ArrayList;
import java.util.List;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f9838a;

    private d() {
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (f9838a == null) {
                f9838a = new d();
            }
            dVar = f9838a;
        }
        return dVar;
    }

    public synchronized void a(List<String> list) {
        m.d();
        if (list != null) {
            if (list.size() > 0) {
                m.d("", "logs", Integer.valueOf(list.size()));
                if (count() > 4) {
                    clearOldLogByCount(2);
                }
                ArrayList arrayList = new ArrayList();
                for (String bVar : list) {
                    arrayList.add(new b(bVar));
                }
                a.a().a().insert(arrayList);
                return;
            }
        }
        m.d("", "logs is empty");
    }

    private int count() {
        return a.a().a().count(b.class);
    }

    private int clearOldLogByCount(int i) {
        String tablename = a.a().a().getTablename(b.class);
        StringBuilder sb = new StringBuilder(" _id in ( select _id from ");
        sb.append(tablename);
        sb.append(" ORDER BY _id ASC LIMIT ");
        sb.append(i);
        sb.append(" )");
        return a.a().a().delete(b.class, sb.toString(), (String[]) null);
    }

    public synchronized int delete(List<b> list) {
        return a.a().a().delete(list);
    }

    public synchronized List<b> get(int i) {
        return a.a().a().find(b.class, (String) null, "priority DESC , time DESC ", i);
    }
}
