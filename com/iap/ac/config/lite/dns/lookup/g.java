package com.iap.ac.config.lite.dns.lookup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private e f9808a;
    private List<i>[] b;

    private g(e eVar) {
        this.b = new List[4];
        this.f9808a = eVar;
    }

    public static g a(i iVar) {
        g gVar = new g();
        gVar.f9808a.f(0);
        gVar.f9808a.d(7);
        gVar.a(iVar, 0);
        return gVar;
    }

    public i b() {
        List<i> list = this.b[0];
        if (list == null || list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    public byte[] c() {
        b bVar = new b();
        a(bVar);
        return bVar.a();
    }

    public g() {
        this(new e());
    }

    g(a aVar) throws Exception {
        this(new e(aVar));
        boolean z = this.f9808a.b() == 5;
        boolean b2 = this.f9808a.b(6);
        int i = 0;
        while (i < 2) {
            try {
                int a2 = this.f9808a.a(i);
                if (a2 > 0) {
                    this.b[i] = new ArrayList(a2);
                }
                for (int i2 = 0; i2 < a2; i2++) {
                    this.b[i].add(i.a(aVar, i, z));
                }
                i++;
            } catch (DNSException e) {
                if (!b2) {
                    throw e;
                }
                return;
            }
        }
    }

    public e a() {
        return this.f9808a;
    }

    public void a(i iVar, int i) {
        List<i>[] listArr = this.b;
        if (listArr[i] == null) {
            listArr[i] = new LinkedList();
        }
        this.f9808a.c(i);
        this.b[i].add(iVar);
    }

    public List<i> a(int i) {
        List<i>[] listArr = this.b;
        if (listArr[i] == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(listArr[i]);
    }

    private void a(b bVar, int i) {
        int size = this.b[i].size();
        for (int i2 = 0; i2 < size; i2++) {
            this.b[i].get(i2).a(bVar);
        }
    }

    private void a(b bVar) {
        this.f9808a.a(bVar);
        for (int i = 0; i < 4; i++) {
            if (this.b[i] != null) {
                a(bVar, i);
            }
        }
    }

    public g(byte[] bArr) throws Exception {
        this(new a(bArr));
    }
}
