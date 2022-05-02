package com.uc.crashsdk.a;

final class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Runnable f9874a;

    j(Runnable runnable) {
        this.f9874a = runnable;
    }

    public final void run() {
        synchronized (i.e) {
            if (i.e.get(this.f9874a) != null) {
                i.e.remove(this.f9874a);
            }
        }
        StringBuilder sb = new StringBuilder("pre-run: ");
        sb.append(this.f9874a);
        c.a(sb.toString());
        this.f9874a.run();
        StringBuilder sb2 = new StringBuilder("end-run: ");
        sb2.append(this.f9874a);
        c.a(sb2.toString());
    }
}
