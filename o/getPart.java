package o;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

public abstract class getPart {
    public abstract void getMin(executeSerial executeserial) throws IOException;

    @Nullable
    public abstract translateRegularFrame setMax();

    public long setMin() throws IOException {
        return -1;
    }

    public static getPart length(@Nullable translateRegularFrame translateregularframe, String str) {
        Charset charset = initCloseCode.setMax;
        if (translateregularframe != null && (charset = translateregularframe.setMin((Charset) null)) == null) {
            charset = initCloseCode.setMax;
            StringBuilder sb = new StringBuilder();
            sb.append(translateregularframe);
            sb.append("; charset=utf-8");
            translateregularframe = translateRegularFrame.length(sb.toString());
        }
        byte[] bytes = str.getBytes(charset);
        return setMax(translateregularframe, bytes, bytes.length);
    }

    public static getPart getMin(@Nullable final translateRegularFrame translateregularframe, final printConnMonitorLog printconnmonitorlog) {
        return new getPart() {
            @Nullable
            public final translateRegularFrame setMax() {
                return translateRegularFrame.this;
            }

            public final long setMin() throws IOException {
                return (long) printconnmonitorlog.size();
            }

            public final void getMin(executeSerial executeserial) throws IOException {
                executeserial.length(printconnmonitorlog);
            }
        };
    }

    public static getPart length(byte[] bArr) {
        return setMax((translateRegularFrame) null, bArr, bArr.length);
    }

    private static getPart setMax(@Nullable final translateRegularFrame translateregularframe, final byte[] bArr, final int i) {
        if (bArr != null) {
            initCloseCode.setMin((long) bArr.length, (long) i);
            return new getPart() {
                final /* synthetic */ int length = 0;

                @Nullable
                public final translateRegularFrame setMax() {
                    return translateRegularFrame.this;
                }

                public final long setMin() {
                    return (long) i;
                }

                public final void getMin(executeSerial executeserial) throws IOException {
                    executeserial.length(bArr, this.length, i);
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    public static getPart getMin(@Nullable final translateRegularFrame translateregularframe, final File file) {
        if (file != null) {
            return new getPart() {
                @Nullable
                public final translateRegularFrame setMax() {
                    return translateRegularFrame.this;
                }

                public final long setMin() {
                    return file.length();
                }

                public final void getMin(executeSerial executeserial) throws IOException {
                    recordWsHsTime recordwshstime = null;
                    try {
                        recordwshstime = recordMonitorOfSndMsg.setMin(file);
                        executeserial.getMin(recordwshstime);
                    } finally {
                        initCloseCode.getMin((Closeable) recordwshstime);
                    }
                }
            };
        }
        throw new NullPointerException("file == null");
    }
}
