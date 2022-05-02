package com.alibaba.griver.file.pdf;

import java.util.HashMap;
import java.util.Map;

public class PdfSourceManager {

    /* renamed from: a  reason: collision with root package name */
    private static PdfSourceManager f10435a;
    private Map<String, PdfImageSource> b = new HashMap();

    private PdfSourceManager() {
    }

    public static synchronized PdfSourceManager getInstance() {
        PdfSourceManager pdfSourceManager;
        synchronized (PdfSourceManager.class) {
            if (f10435a == null) {
                f10435a = new PdfSourceManager();
            }
            pdfSourceManager = f10435a;
        }
        return pdfSourceManager;
    }

    public synchronized PdfImageSource getOrCreate(String str) {
        if (!this.b.containsKey(str)) {
            PdfImageSource pdfImageSource = new PdfImageSource();
            pdfImageSource.open(str);
            this.b.put(str, pdfImageSource);
        }
        return this.b.get(str);
    }

    public synchronized void destory(String str) {
        if (this.b.containsKey(str)) {
            this.b.get(str).close();
            this.b.remove(str);
        }
    }
}
