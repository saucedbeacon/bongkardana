package com.mixpanel.android.viewcrawler;

import com.mixpanel.android.java_websocket.exceptions.NotSendableException;
import com.mixpanel.android.java_websocket.exceptions.WebsocketNotConnectedException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import o.findOnePartiallyOrCompletelyInvisibleChild;
import o.fixLayoutStartGap;
import o.scrollToPosition;
import org.json.JSONException;
import org.json.JSONObject;

public class EditorConnection {
    /* access modifiers changed from: private */
    public static final ByteBuffer length = ByteBuffer.allocate(0);
    /* access modifiers changed from: private */
    public final length getMax;
    /* access modifiers changed from: private */
    public final setMin getMin;
    /* access modifiers changed from: private */
    public final URI setMin;

    public interface length {
        void getMax(JSONObject jSONObject);

        void getMin(JSONObject jSONObject);

        void length();

        void length(JSONObject jSONObject);

        void setMax();

        void setMax(JSONObject jSONObject);

        void setMin(JSONObject jSONObject);
    }

    public class EditorConnectionException extends IOException {
        private static final long serialVersionUID = -1884953175346045636L;

        public EditorConnectionException(Throwable th) {
            super(th.getMessage());
        }
    }

    public EditorConnection(URI uri, length length2, Socket socket) throws EditorConnectionException {
        this.getMax = length2;
        this.setMin = uri;
        try {
            setMin setmin = new setMin(uri, socket);
            this.getMin = setmin;
            setmin.toIntRange();
        } catch (InterruptedException e) {
            throw new EditorConnectionException(e);
        }
    }

    public final boolean length() {
        return !this.getMin.toDoubleRange() && !this.getMin.values() && !this.getMin.isInside();
    }

    public final boolean getMax() {
        return this.getMin.IsOverlapping();
    }

    class setMin extends fixLayoutStartGap {
        public setMin(URI uri, Socket socket) throws InterruptedException {
            super(uri, new scrollToPosition());
            getMin(socket);
        }

        public final void toFloatRange() {
            findOnePartiallyOrCompletelyInvisibleChild.getMax();
        }

        public final void setMin(String str) {
            findOnePartiallyOrCompletelyInvisibleChild.getMax();
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("type");
                if (string.equals("device_info_request")) {
                    EditorConnection.this.getMax.setMax();
                } else if (string.equals("snapshot_request")) {
                    EditorConnection.this.getMax.setMin(jSONObject);
                } else if (string.equals("change_request")) {
                    EditorConnection.this.getMax.length(jSONObject);
                } else if (string.equals("event_binding_request")) {
                    EditorConnection.this.getMax.getMax(jSONObject);
                } else if (string.equals("clear_request")) {
                    EditorConnection.this.getMax.setMax(jSONObject);
                } else if (string.equals("tweak_request")) {
                    EditorConnection.this.getMax.getMin(jSONObject);
                }
            } catch (JSONException unused) {
                findOnePartiallyOrCompletelyInvisibleChild.values();
            }
        }

        public final void equals() {
            URI unused = EditorConnection.this.setMin;
            findOnePartiallyOrCompletelyInvisibleChild.getMax();
            EditorConnection.this.getMax.length();
        }

        public final void getMin(Exception exc) {
            if (exc == null || exc.getMessage() == null) {
                findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
                return;
            }
            exc.getMessage();
            findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
        }
    }

    public class setMax extends OutputStream {
        private setMax() {
        }

        public /* synthetic */ setMax(EditorConnection editorConnection, byte b) {
            this();
        }

        public final void write(int i) throws EditorConnectionException {
            write(new byte[]{(byte) i}, 0, 1);
        }

        public final void write(byte[] bArr) throws EditorConnectionException {
            write(bArr, 0, bArr.length);
        }

        public final void write(byte[] bArr, int i, int i2) throws EditorConnectionException {
            try {
                EditorConnection.this.getMin.setMin(Framedata.Opcode.TEXT, ByteBuffer.wrap(bArr, i, i2), false);
            } catch (WebsocketNotConnectedException e) {
                throw new EditorConnectionException(e);
            } catch (NotSendableException e2) {
                throw new EditorConnectionException(e2);
            }
        }

        public final void close() throws EditorConnectionException {
            try {
                EditorConnection.this.getMin.setMin(Framedata.Opcode.TEXT, EditorConnection.length, true);
            } catch (WebsocketNotConnectedException e) {
                throw new EditorConnectionException(e);
            } catch (NotSendableException e2) {
                throw new EditorConnectionException(e2);
            }
        }
    }
}
