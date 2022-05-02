package o;

import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.google.common.primitives.SignedBytes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.AppNode;

final class getHttpStatus {
    static final Map<printConnMonitorLog, Integer> length;
    static final setHttpStatus[] setMax = {new setHttpStatus(setHttpStatus.toFloatRange, ""), new setHttpStatus(setHttpStatus.getMin, "GET"), new setHttpStatus(setHttpStatus.getMin, "POST"), new setHttpStatus(setHttpStatus.setMin, "/"), new setHttpStatus(setHttpStatus.setMin, "/index.html"), new setHttpStatus(setHttpStatus.setMax, "http"), new setHttpStatus(setHttpStatus.setMax, "https"), new setHttpStatus(setHttpStatus.getMax, "200"), new setHttpStatus(setHttpStatus.getMax, (String) SecurityConstants.KEY_OUT_TIME_CODE2), new setHttpStatus(setHttpStatus.getMax, "206"), new setHttpStatus(setHttpStatus.getMax, "304"), new setHttpStatus(setHttpStatus.getMax, "400"), new setHttpStatus(setHttpStatus.getMax, "404"), new setHttpStatus(setHttpStatus.getMax, "500"), new setHttpStatus("accept-charset", ""), new setHttpStatus("accept-encoding", "gzip, deflate"), new setHttpStatus("accept-language", ""), new setHttpStatus("accept-ranges", ""), new setHttpStatus("accept", ""), new setHttpStatus("access-control-allow-origin", ""), new setHttpStatus("age", ""), new setHttpStatus("allow", ""), new setHttpStatus("authorization", ""), new setHttpStatus("cache-control", ""), new setHttpStatus("content-disposition", ""), new setHttpStatus("content-encoding", ""), new setHttpStatus("content-language", ""), new setHttpStatus("content-length", ""), new setHttpStatus("content-location", ""), new setHttpStatus("content-range", ""), new setHttpStatus("content-type", ""), new setHttpStatus("cookie", ""), new setHttpStatus((String) AppNode.AnonymousClass2.KEY_DATE, ""), new setHttpStatus("etag", ""), new setHttpStatus("expect", ""), new setHttpStatus("expires", ""), new setHttpStatus("from", ""), new setHttpStatus("host", ""), new setHttpStatus("if-match", ""), new setHttpStatus("if-modified-since", ""), new setHttpStatus("if-none-match", ""), new setHttpStatus("if-range", ""), new setHttpStatus("if-unmodified-since", ""), new setHttpStatus("last-modified", ""), new setHttpStatus("link", ""), new setHttpStatus("location", ""), new setHttpStatus("max-forwards", ""), new setHttpStatus("proxy-authenticate", ""), new setHttpStatus("proxy-authorization", ""), new setHttpStatus("range", ""), new setHttpStatus("referer", ""), new setHttpStatus("refresh", ""), new setHttpStatus("retry-after", ""), new setHttpStatus("server", ""), new setHttpStatus("set-cookie", ""), new setHttpStatus("strict-transport-security", ""), new setHttpStatus("transfer-encoding", ""), new setHttpStatus("user-agent", ""), new setHttpStatus("vary", ""), new setHttpStatus("via", ""), new setHttpStatus("www-authenticate", "")};

    static {
        int i = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(setMax.length);
        while (true) {
            setHttpStatus[] sethttpstatusArr = setMax;
            if (i < sethttpstatusArr.length) {
                if (!linkedHashMap.containsKey(sethttpstatusArr[i].toIntRange)) {
                    linkedHashMap.put(setMax[i].toIntRange, Integer.valueOf(i));
                }
                i++;
            } else {
                length = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    static final class getMax {
        private final int IsOverlapping;
        private final schedule equals;
        int getMax;
        setHttpStatus[] getMin;
        private int isInside;
        final List<setHttpStatus> length;
        int setMax;
        int setMin;

        getMax(recordWsHsTime recordwshstime, byte b) {
            this(recordwshstime);
        }

        private getMax(recordWsHsTime recordwshstime) {
            this.length = new ArrayList();
            setHttpStatus[] sethttpstatusArr = new setHttpStatus[8];
            this.getMin = sethttpstatusArr;
            this.setMin = sethttpstatusArr.length - 1;
            this.getMax = 0;
            this.setMax = 0;
            this.IsOverlapping = 4096;
            this.isInside = 4096;
            this.equals = recordMonitorOfSndMsg.setMin(recordwshstime);
        }

        private void length() {
            int i = this.isInside;
            int i2 = this.setMax;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                Arrays.fill(this.getMin, (Object) null);
                this.setMin = this.getMin.length - 1;
                this.getMax = 0;
                this.setMax = 0;
                return;
            }
            setMax(i2 - i);
        }

        private int setMax(int i) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(892502290, oncanceled);
                onCancelLoad.getMin(892502290, oncanceled);
            }
            int i2 = 0;
            if (i > 0) {
                for (int length2 = this.getMin.length - 1; length2 >= this.setMin && i > 0; length2--) {
                    i -= this.getMin[length2].isInside;
                    this.setMax -= this.getMin[length2].isInside;
                    this.getMax--;
                    i2++;
                }
                setHttpStatus[] sethttpstatusArr = this.getMin;
                int i3 = this.setMin;
                System.arraycopy(sethttpstatusArr, i3 + 1, sethttpstatusArr, i3 + 1 + i2, this.getMax);
                this.setMin += i2;
            }
            return i2;
        }

        /* access modifiers changed from: package-private */
        public final void getMax() throws IOException {
            while (!this.equals.setMax()) {
                byte IsOverlapping2 = this.equals.IsOverlapping() & 255;
                if (IsOverlapping2 == 128) {
                    throw new IOException("index == 0");
                } else if ((IsOverlapping2 & 128) == 128) {
                    int max = setMax(IsOverlapping2, 127) - 1;
                    if (setMin(max)) {
                        this.length.add(getHttpStatus.setMax[max]);
                    } else {
                        int length2 = this.setMin + 1 + (max - getHttpStatus.setMax.length);
                        if (length2 >= 0) {
                            setHttpStatus[] sethttpstatusArr = this.getMin;
                            if (length2 < sethttpstatusArr.length) {
                                this.length.add(sethttpstatusArr[length2]);
                            }
                        }
                        StringBuilder sb = new StringBuilder("Header index too large ");
                        sb.append(max + 1);
                        throw new IOException(sb.toString());
                    }
                } else if (IsOverlapping2 == 64) {
                    length(new setHttpStatus(getHttpStatus.getMax(setMax()), setMax()));
                } else if ((IsOverlapping2 & SignedBytes.MAX_POWER_OF_TWO) == 64) {
                    length(new setHttpStatus(getMax(setMax(IsOverlapping2, 63) - 1), setMax()));
                } else if ((IsOverlapping2 & 32) == 32) {
                    int max2 = setMax(IsOverlapping2, 31);
                    this.isInside = max2;
                    if (max2 < 0 || max2 > this.IsOverlapping) {
                        StringBuilder sb2 = new StringBuilder("Invalid dynamic table size update ");
                        sb2.append(this.isInside);
                        throw new IOException(sb2.toString());
                    }
                    length();
                } else if (IsOverlapping2 == 16 || IsOverlapping2 == 0) {
                    this.length.add(new setHttpStatus(getHttpStatus.getMax(setMax()), setMax()));
                } else {
                    this.length.add(new setHttpStatus(getMax(setMax(IsOverlapping2, 15) - 1), setMax()));
                }
            }
        }

        private printConnMonitorLog getMax(int i) throws IOException {
            if (setMin(i)) {
                return getHttpStatus.setMax[i].toIntRange;
            }
            int length2 = this.setMin + 1 + (i - getHttpStatus.setMax.length);
            if (length2 >= 0) {
                setHttpStatus[] sethttpstatusArr = this.getMin;
                if (length2 < sethttpstatusArr.length) {
                    return sethttpstatusArr[length2].toIntRange;
                }
            }
            StringBuilder sb = new StringBuilder("Header index too large ");
            sb.append(i + 1);
            throw new IOException(sb.toString());
        }

        private static boolean setMin(int i) {
            return i >= 0 && i <= getHttpStatus.setMax.length - 1;
        }

        private void length(setHttpStatus sethttpstatus) {
            this.length.add(sethttpstatus);
            int i = sethttpstatus.isInside;
            int i2 = this.isInside;
            if (i > i2) {
                Arrays.fill(this.getMin, (Object) null);
                this.setMin = this.getMin.length - 1;
                this.getMax = 0;
                this.setMax = 0;
                return;
            }
            setMax((this.setMax + i) - i2);
            int i3 = this.getMax + 1;
            setHttpStatus[] sethttpstatusArr = this.getMin;
            if (i3 > sethttpstatusArr.length) {
                setHttpStatus[] sethttpstatusArr2 = new setHttpStatus[(sethttpstatusArr.length * 2)];
                System.arraycopy(sethttpstatusArr, 0, sethttpstatusArr2, sethttpstatusArr.length, sethttpstatusArr.length);
                this.setMin = this.getMin.length - 1;
                this.getMin = sethttpstatusArr2;
            }
            int i4 = this.setMin;
            this.setMin = i4 - 1;
            this.getMin[i4] = sethttpstatus;
            this.getMax++;
            this.setMax += i;
        }

        private int setMax(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                byte IsOverlapping2 = this.equals.IsOverlapping() & 255;
                if ((IsOverlapping2 & 128) == 0) {
                    return i2 + (IsOverlapping2 << i4);
                }
                i2 += (IsOverlapping2 & Byte.MAX_VALUE) << i4;
                i4 += 7;
            }
        }

        private printConnMonitorLog setMax() throws IOException {
            byte IsOverlapping2 = this.equals.IsOverlapping() & 255;
            boolean z = (IsOverlapping2 & 128) == 128;
            int max = setMax(IsOverlapping2, 127);
            if (z) {
                return printConnMonitorLog.of(hasFieldValue.getMin().getMin(this.equals.toFloatRange((long) max)));
            }
            return this.equals.length((long) max);
        }
    }

    static final class length {
        int IsOverlapping;
        private int equals;
        int getMax;
        setHttpStatus[] getMin;
        private final submitLazy isInside;
        int length;
        int setMax;
        int setMin;
        private boolean toFloatRange;
        private final boolean toIntRange;

        length(submitLazy submitlazy) {
            this(submitlazy, (byte) 0);
        }

        private length(submitLazy submitlazy, byte b) {
            this.equals = Integer.MAX_VALUE;
            setHttpStatus[] sethttpstatusArr = new setHttpStatus[8];
            this.getMin = sethttpstatusArr;
            this.setMin = sethttpstatusArr.length - 1;
            this.length = 0;
            this.IsOverlapping = 0;
            this.setMax = 4096;
            this.getMax = 4096;
            this.toIntRange = true;
            this.isInside = submitlazy;
        }

        private int length(int i) {
            int i2 = 0;
            if (i > 0) {
                int length2 = this.getMin.length;
                while (true) {
                    length2--;
                    if (length2 < this.setMin || i <= 0) {
                        setHttpStatus[] sethttpstatusArr = this.getMin;
                        int i3 = this.setMin;
                        System.arraycopy(sethttpstatusArr, i3 + 1, sethttpstatusArr, i3 + 1 + i2, this.length);
                        setHttpStatus[] sethttpstatusArr2 = this.getMin;
                        int i4 = this.setMin;
                        Arrays.fill(sethttpstatusArr2, i4 + 1, i4 + 1 + i2, (Object) null);
                        this.setMin += i2;
                    } else {
                        i -= this.getMin[length2].isInside;
                        this.IsOverlapping -= this.getMin[length2].isInside;
                        this.length--;
                        i2++;
                    }
                }
                setHttpStatus[] sethttpstatusArr3 = this.getMin;
                int i32 = this.setMin;
                System.arraycopy(sethttpstatusArr3, i32 + 1, sethttpstatusArr3, i32 + 1 + i2, this.length);
                setHttpStatus[] sethttpstatusArr22 = this.getMin;
                int i42 = this.setMin;
                Arrays.fill(sethttpstatusArr22, i42 + 1, i42 + 1 + i2, (Object) null);
                this.setMin += i2;
            }
            return i2;
        }

        private void setMax(setHttpStatus sethttpstatus) {
            int i = sethttpstatus.isInside;
            int i2 = this.getMax;
            if (i > i2) {
                Arrays.fill(this.getMin, (Object) null);
                this.setMin = this.getMin.length - 1;
                this.length = 0;
                this.IsOverlapping = 0;
                return;
            }
            length((this.IsOverlapping + i) - i2);
            int i3 = this.length + 1;
            setHttpStatus[] sethttpstatusArr = this.getMin;
            if (i3 > sethttpstatusArr.length) {
                setHttpStatus[] sethttpstatusArr2 = new setHttpStatus[(sethttpstatusArr.length * 2)];
                System.arraycopy(sethttpstatusArr, 0, sethttpstatusArr2, sethttpstatusArr.length, sethttpstatusArr.length);
                this.setMin = this.getMin.length - 1;
                this.getMin = sethttpstatusArr2;
            }
            int i4 = this.setMin;
            this.setMin = i4 - 1;
            this.getMin[i4] = sethttpstatus;
            this.length++;
            this.IsOverlapping += i;
        }

        /* access modifiers changed from: package-private */
        public final void length(List<setHttpStatus> list) throws IOException {
            int i;
            int i2;
            if (this.toFloatRange) {
                int i3 = this.equals;
                if (i3 < this.getMax) {
                    getMax(i3, 31, 32);
                }
                this.toFloatRange = false;
                this.equals = Integer.MAX_VALUE;
                getMax(this.getMax, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                setHttpStatus sethttpstatus = list.get(i4);
                printConnMonitorLog asciiLowercase = sethttpstatus.toIntRange.toAsciiLowercase();
                printConnMonitorLog printconnmonitorlog = sethttpstatus.IsOverlapping;
                Integer num = getHttpStatus.length.get(asciiLowercase);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (i2 > 1 && i2 < 8) {
                        if (initCloseCode.setMin((Object) getHttpStatus.setMax[i2 - 1].IsOverlapping, (Object) printconnmonitorlog)) {
                            i = i2;
                        } else if (initCloseCode.setMin((Object) getHttpStatus.setMax[i2].IsOverlapping, (Object) printconnmonitorlog)) {
                            i = i2;
                            i2++;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i2 = -1;
                    i = -1;
                }
                if (i2 == -1) {
                    int i5 = this.setMin + 1;
                    int length2 = this.getMin.length;
                    while (true) {
                        if (i5 >= length2) {
                            break;
                        }
                        if (initCloseCode.setMin((Object) this.getMin[i5].toIntRange, (Object) asciiLowercase)) {
                            if (initCloseCode.setMin((Object) this.getMin[i5].IsOverlapping, (Object) printconnmonitorlog)) {
                                i2 = getHttpStatus.setMax.length + (i5 - this.setMin);
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.setMin) + getHttpStatus.setMax.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    getMax(i2, 127, 128);
                } else if (i == -1) {
                    this.isInside.equals(64);
                    getMax(asciiLowercase);
                    getMax(printconnmonitorlog);
                    setMax(sethttpstatus);
                } else if (!asciiLowercase.startsWith(setHttpStatus.length) || setHttpStatus.toFloatRange.equals(asciiLowercase)) {
                    getMax(i, 63, 64);
                    getMax(printconnmonitorlog);
                    setMax(sethttpstatus);
                } else {
                    getMax(i, 15, 0);
                    getMax(printconnmonitorlog);
                }
            }
        }

        private void getMax(int i, int i2, int i3) {
            if (i < i2) {
                this.isInside.equals(i | i3);
                return;
            }
            this.isInside.equals(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.isInside.equals(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.isInside.equals(i4);
        }

        private void getMax(printConnMonitorLog printconnmonitorlog) throws IOException {
            if (this.toIntRange) {
                hasFieldValue.getMin();
                if (hasFieldValue.getMax(printconnmonitorlog) < printconnmonitorlog.size()) {
                    submitLazy submitlazy = new submitLazy();
                    hasFieldValue.getMin();
                    hasFieldValue.getMin(printconnmonitorlog, submitlazy);
                    printConnMonitorLog printconnmonitorlog2 = new printConnMonitorLog(submitlazy.valueOf());
                    getMax(printconnmonitorlog2.size(), 127, 128);
                    printconnmonitorlog2.write(this.isInside);
                    return;
                }
            }
            getMax(printconnmonitorlog.size(), 127, 0);
            submitLazy submitlazy2 = this.isInside;
            if (printconnmonitorlog != null) {
                printconnmonitorlog.write(submitlazy2);
                return;
            }
            throw new IllegalArgumentException("byteString == null");
        }

        /* access modifiers changed from: package-private */
        public final void getMin(int i) {
            this.setMax = i;
            int min = Math.min(i, 16384);
            int i2 = this.getMax;
            if (i2 != min) {
                if (min < i2) {
                    this.equals = Math.min(this.equals, min);
                }
                this.toFloatRange = true;
                this.getMax = min;
                int i3 = this.IsOverlapping;
                if (min >= i3) {
                    return;
                }
                if (min == 0) {
                    Arrays.fill(this.getMin, (Object) null);
                    this.setMin = this.getMin.length - 1;
                    this.length = 0;
                    this.IsOverlapping = 0;
                    return;
                }
                length(i3 - min);
            }
        }
    }

    static printConnMonitorLog getMax(printConnMonitorLog printconnmonitorlog) throws IOException {
        int size = printconnmonitorlog.size();
        int i = 0;
        while (i < size) {
            byte b = printconnmonitorlog.getByte(i);
            if (b < 65 || b > 90) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder("PROTOCOL_ERROR response malformed: mixed case name: ");
                sb.append(printconnmonitorlog.utf8());
                throw new IOException(sb.toString());
            }
        }
        return printconnmonitorlog;
    }
}
