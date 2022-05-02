package com.google.android.play.core.splitinstall;

import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.RVParams;
import id.dana.data.Source;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class az {

    /* renamed from: a  reason: collision with root package name */
    private final XmlPullParser f10978a;
    private final g b = new g();

    az(XmlPullParser xmlPullParser) {
        this.f10978a = xmlPullParser;
    }

    @Nullable
    private final String a(String str) {
        for (int i = 0; i < this.f10978a.getAttributeCount(); i++) {
            if (this.f10978a.getAttributeName(i).equals(str)) {
                return this.f10978a.getAttributeValue(i);
            }
        }
        return null;
    }

    private final void b() throws IOException, XmlPullParserException {
        int i = 1;
        while (i != 0) {
            int next = this.f10978a.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final h a() {
        String a2;
        while (this.f10978a.next() != 1) {
            try {
                if (this.f10978a.getEventType() == 2) {
                    if (this.f10978a.getName().equals("splits")) {
                        while (this.f10978a.next() != 3) {
                            if (this.f10978a.getEventType() == 2) {
                                if (!this.f10978a.getName().equals("module") || (a2 = a("name")) == null) {
                                    b();
                                } else {
                                    while (this.f10978a.next() != 3) {
                                        if (this.f10978a.getEventType() == 2) {
                                            if (this.f10978a.getName().equals("language")) {
                                                while (this.f10978a.next() != 3) {
                                                    if (this.f10978a.getEventType() == 2) {
                                                        if (this.f10978a.getName().equals(RVParams.LONG_URL_WITH_ENTRY_KEY)) {
                                                            String a3 = a("key");
                                                            String a4 = a(Source.SPLIT);
                                                            b();
                                                            if (!(a3 == null || a4 == null)) {
                                                                this.b.a(a2, a3, a4);
                                                            }
                                                        } else {
                                                            b();
                                                        }
                                                    }
                                                }
                                            } else {
                                                b();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        b();
                    }
                }
            } catch (IOException | IllegalStateException | XmlPullParserException unused) {
                return null;
            }
        }
        return this.b.a();
    }
}
