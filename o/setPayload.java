package o;

import java.io.IOException;

class setPayload extends scheduleAtFixedRate {
    private boolean length;

    /* access modifiers changed from: protected */
    public void length() {
    }

    setPayload(recordDnsTime recorddnstime) {
        super(recorddnstime);
    }

    public final void setMin(submitLazy submitlazy, long j) throws IOException {
        if (this.length) {
            submitlazy.isInside(j);
            return;
        }
        try {
            super.setMin(submitlazy, j);
        } catch (IOException unused) {
            this.length = true;
            length();
        }
    }

    public void flush() throws IOException {
        if (!this.length) {
            try {
                super.flush();
            } catch (IOException unused) {
                this.length = true;
                length();
            }
        }
    }

    public void close() throws IOException {
        if (!this.length) {
            try {
                super.close();
            } catch (IOException unused) {
                this.length = true;
                length();
            }
        }
    }
}
