package com.alipay.a.a.a.a;

import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import java.lang.reflect.Method;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

public final class e extends a {
    private c g;

    public e(c cVar, Method method, int i, String str, byte[] bArr, boolean z) {
        super(method, i, str, bArr, "application/x-www-form-urlencoded", z);
        this.g = cVar;
    }

    public final Object a() {
        j jVar = new j(this.g.a());
        jVar.b = this.b;
        jVar.c = this.e;
        jVar.e = this.f;
        jVar.a("id", String.valueOf(this.d));
        jVar.a("operationType", this.c);
        jVar.a(HeaderConstant.HEADER_VALUE_CONTENT_ENCODING_GZIP, String.valueOf(this.g.d()));
        jVar.a((Header) new BasicHeader(HeaderConstant.HEADER_KEY_UUID, UUID.randomUUID().toString()));
        List<Header> list = this.g.c().b;
        if (list != null && !list.isEmpty()) {
            for (Header a2 : list) {
                jVar.a(a2);
            }
        }
        Thread.currentThread().getId();
        try {
            p pVar = this.g.b().a(jVar).get();
            if (pVar != null) {
                return pVar.a();
            }
            throw new s(9, "response is null");
        } catch (InterruptedException e) {
            throw new s(13, "", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause == null || !(cause instanceof g)) {
                throw new s(9, "", e2);
            }
            g gVar = (g) cause;
            int i = gVar.f9235a;
            switch (i) {
                case 1:
                    i = 2;
                    break;
                case 2:
                    i = 3;
                    break;
                case 3:
                    i = 4;
                    break;
                case 4:
                    i = 5;
                    break;
                case 5:
                    i = 6;
                    break;
                case 6:
                    i = 7;
                    break;
                case 7:
                    i = 8;
                    break;
                case 8:
                    i = 15;
                    break;
                case 9:
                    i = 16;
                    break;
            }
            throw new s(Integer.valueOf(i), gVar.b);
        } catch (CancellationException e3) {
            throw new s(13, "", e3);
        }
    }
}
