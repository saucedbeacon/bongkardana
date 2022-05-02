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

final class setPaddingRelative {
    /* access modifiers changed from: private */
    public static final CardView[] length = {new CardView(CardView.length, ""), new CardView(CardView.setMax, "GET"), new CardView(CardView.setMax, "POST"), new CardView(CardView.getMin, "/"), new CardView(CardView.getMin, "/index.html"), new CardView(CardView.getMax, "http"), new CardView(CardView.getMax, "https"), new CardView(CardView.setMin, "200"), new CardView(CardView.setMin, (String) SecurityConstants.KEY_OUT_TIME_CODE2), new CardView(CardView.setMin, "206"), new CardView(CardView.setMin, "304"), new CardView(CardView.setMin, "400"), new CardView(CardView.setMin, "404"), new CardView(CardView.setMin, "500"), new CardView("accept-charset", ""), new CardView("accept-encoding", "gzip, deflate"), new CardView("accept-language", ""), new CardView("accept-ranges", ""), new CardView("accept", ""), new CardView("access-control-allow-origin", ""), new CardView("age", ""), new CardView("allow", ""), new CardView("authorization", ""), new CardView("cache-control", ""), new CardView("content-disposition", ""), new CardView("content-encoding", ""), new CardView("content-language", ""), new CardView("content-length", ""), new CardView("content-location", ""), new CardView("content-range", ""), new CardView("content-type", ""), new CardView("cookie", ""), new CardView((String) AppNode.AnonymousClass2.KEY_DATE, ""), new CardView("etag", ""), new CardView("expect", ""), new CardView("expires", ""), new CardView("from", ""), new CardView("host", ""), new CardView("if-match", ""), new CardView("if-modified-since", ""), new CardView("if-none-match", ""), new CardView("if-range", ""), new CardView("if-unmodified-since", ""), new CardView("last-modified", ""), new CardView("link", ""), new CardView("location", ""), new CardView("max-forwards", ""), new CardView("proxy-authenticate", ""), new CardView("proxy-authorization", ""), new CardView("range", ""), new CardView("referer", ""), new CardView("refresh", ""), new CardView("retry-after", ""), new CardView("server", ""), new CardView("set-cookie", ""), new CardView("strict-transport-security", ""), new CardView("transfer-encoding", ""), new CardView("user-agent", ""), new CardView("vary", ""), new CardView("via", ""), new CardView("www-authenticate", "")};
    /* access modifiers changed from: private */
    public static final Map<evictAll, Integer> setMax;

    static {
        int i = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(length.length);
        while (true) {
            CardView[] cardViewArr = length;
            if (i < cardViewArr.length) {
                if (!linkedHashMap.containsKey(cardViewArr[i].equals)) {
                    linkedHashMap.put(length[i].equals, Integer.valueOf(i));
                }
                i++;
            } else {
                setMax = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    static final class setMin {
        private int equals;
        final List<CardView> getMax;
        int getMin;
        CardView[] length;
        int setMax;
        int setMin;
        private final int toFloatRange;
        private final put toIntRange;

        setMin(safeSizeOf safesizeof, byte b) {
            this(safesizeof);
        }

        private setMin(safeSizeOf safesizeof) {
            this.getMax = new ArrayList();
            CardView[] cardViewArr = new CardView[8];
            this.length = cardViewArr;
            this.getMin = cardViewArr.length - 1;
            this.setMin = 0;
            this.setMax = 0;
            this.toFloatRange = 4096;
            this.equals = 4096;
            this.toIntRange = putCount.getMax(safesizeof);
        }

        private void getMax() {
            int i = this.equals;
            int i2 = this.setMax;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                setMax();
            } else {
                setMax(i2 - i);
            }
        }

        private void setMax() {
            this.getMax.clear();
            Arrays.fill(this.length, (Object) null);
            this.getMin = this.length.length - 1;
            this.setMin = 0;
            this.setMax = 0;
        }

        private int setMax(int i) {
            int i2 = 0;
            if (i > 0) {
                int length2 = this.length.length;
                while (true) {
                    length2--;
                    if (length2 < this.getMin || i <= 0) {
                        CardView[] cardViewArr = this.length;
                        int i3 = this.getMin;
                        System.arraycopy(cardViewArr, i3 + 1, cardViewArr, i3 + 1 + i2, this.setMin);
                        this.getMin += i2;
                    } else {
                        i -= this.length[length2].toIntRange;
                        this.setMax -= this.length[length2].toIntRange;
                        this.setMin--;
                        i2++;
                    }
                }
                CardView[] cardViewArr2 = this.length;
                int i32 = this.getMin;
                System.arraycopy(cardViewArr2, i32 + 1, cardViewArr2, i32 + 1 + i2, this.setMin);
                this.getMin += i2;
            }
            return i2;
        }

        /* access modifiers changed from: package-private */
        public final void setMin() {
            while (!this.toIntRange.length()) {
                byte min = this.toIntRange.getMin() & 255;
                if (min == 128) {
                    throw new IOException("index == 0");
                } else if ((min & 128) == 128) {
                    getMax(getMax(min, 127) - 1);
                } else if (min == 64) {
                    setMax(new CardView(setPaddingRelative.setMin(getMin()), getMin()));
                } else if ((min & SignedBytes.MAX_POWER_OF_TWO) == 64) {
                    setMax(new CardView(getMin(getMax(min, 63) - 1), getMin()));
                } else if ((min & 32) == 32) {
                    int max = getMax(min, 31);
                    this.equals = max;
                    if (max < 0 || max > this.toFloatRange) {
                        StringBuilder sb = new StringBuilder("Invalid dynamic table size update ");
                        sb.append(this.equals);
                        throw new IOException(sb.toString());
                    }
                    getMax();
                } else if (min == 16 || min == 0) {
                    length();
                } else {
                    length(getMax(min, 15) - 1);
                }
            }
        }

        private void getMax(int i) {
            if (setMin(i)) {
                this.getMax.add(setPaddingRelative.length[i]);
                return;
            }
            int length2 = this.getMin + 1 + (i - setPaddingRelative.length.length);
            if (length2 >= 0) {
                CardView[] cardViewArr = this.length;
                if (length2 <= cardViewArr.length - 1) {
                    this.getMax.add(cardViewArr[length2]);
                    return;
                }
            }
            StringBuilder sb = new StringBuilder("Header index too large ");
            sb.append(i + 1);
            throw new IOException(sb.toString());
        }

        private void length(int i) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-1834326896, oncanceled);
                onCancelLoad.getMin(-1834326896, oncanceled);
            }
            this.getMax.add(new CardView(getMin(i), getMin()));
        }

        private void length() {
            this.getMax.add(new CardView(setPaddingRelative.setMin(getMin()), getMin()));
        }

        private evictAll getMin(int i) {
            if (setMin(i)) {
                return setPaddingRelative.length[i].equals;
            }
            return this.length[this.getMin + 1 + (i - setPaddingRelative.length.length)].equals;
        }

        private static boolean setMin(int i) {
            return i >= 0 && i <= setPaddingRelative.length.length - 1;
        }

        private void setMax(CardView cardView) {
            this.getMax.add(cardView);
            int i = cardView.toIntRange;
            int i2 = this.equals;
            if (i > i2) {
                setMax();
                return;
            }
            setMax((this.setMax + i) - i2);
            int i3 = this.setMin + 1;
            CardView[] cardViewArr = this.length;
            if (i3 > cardViewArr.length) {
                CardView[] cardViewArr2 = new CardView[(cardViewArr.length * 2)];
                System.arraycopy(cardViewArr, 0, cardViewArr2, cardViewArr.length, cardViewArr.length);
                this.getMin = this.length.length - 1;
                this.length = cardViewArr2;
            }
            int i4 = this.getMin;
            this.getMin = i4 - 1;
            this.length[i4] = cardView;
            this.setMin++;
            this.setMax += i;
        }

        private int getMax(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                byte min = this.toIntRange.getMin() & 255;
                if ((min & 128) == 0) {
                    return i2 + (min << i4);
                }
                i2 += (min & Byte.MAX_VALUE) << i4;
                i4 += 7;
            }
        }

        private evictAll getMin() {
            byte min = this.toIntRange.getMin() & 255;
            boolean z = (min & 128) == 128;
            int max = getMax(min, 127);
            if (z) {
                return evictAll.a(getCardBackgroundColor.setMin().setMax(this.toIntRange.equals((long) max)));
            }
            return this.toIntRange.getMax((long) max);
        }
    }

    static final class setMax {
        int IsOverlapping;
        private boolean equals;
        CardView[] getMax;
        int getMin;
        private final maxSize isInside;
        int length;
        int setMax;
        int setMin;
        private int toFloatRange;
        private final boolean toIntRange;

        setMax(maxSize maxsize) {
            this(maxsize, (byte) 0);
        }

        private setMax(maxSize maxsize, byte b) {
            this.toFloatRange = Integer.MAX_VALUE;
            CardView[] cardViewArr = new CardView[8];
            this.getMax = cardViewArr;
            this.length = cardViewArr.length - 1;
            this.setMax = 0;
            this.IsOverlapping = 0;
            this.setMin = 4096;
            this.getMin = 4096;
            this.toIntRange = true;
            this.isInside = maxsize;
        }

        private int setMin(int i) {
            int i2 = 0;
            if (i > 0) {
                int length2 = this.getMax.length;
                while (true) {
                    length2--;
                    if (length2 < this.length || i <= 0) {
                        CardView[] cardViewArr = this.getMax;
                        int i3 = this.length;
                        System.arraycopy(cardViewArr, i3 + 1, cardViewArr, i3 + 1 + i2, this.setMax);
                        CardView[] cardViewArr2 = this.getMax;
                        int i4 = this.length;
                        Arrays.fill(cardViewArr2, i4 + 1, i4 + 1 + i2, (Object) null);
                        this.length += i2;
                    } else {
                        i -= this.getMax[length2].toIntRange;
                        this.IsOverlapping -= this.getMax[length2].toIntRange;
                        this.setMax--;
                        i2++;
                    }
                }
                CardView[] cardViewArr3 = this.getMax;
                int i32 = this.length;
                System.arraycopy(cardViewArr3, i32 + 1, cardViewArr3, i32 + 1 + i2, this.setMax);
                CardView[] cardViewArr22 = this.getMax;
                int i42 = this.length;
                Arrays.fill(cardViewArr22, i42 + 1, i42 + 1 + i2, (Object) null);
                this.length += i2;
            }
            return i2;
        }

        /* access modifiers changed from: package-private */
        public final void length(List<CardView> list) {
            if (this.equals) {
                int i = this.toFloatRange;
                if (i < this.getMin) {
                    setMax(i, 31, 32);
                }
                this.equals = false;
                this.toFloatRange = Integer.MAX_VALUE;
                setMax(this.getMin, 31, 32);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                CardView cardView = list.get(i2);
                evictAll h = cardView.equals.h();
                evictAll evictall = cardView.toFloatRange;
                Integer num = (Integer) setPaddingRelative.setMax.get(h);
                if (num != null) {
                    setMax(num.intValue() + 1, 15, 0);
                    getMin(evictall);
                } else {
                    int max = CustomTabsIntent$ShareState.setMax(this.getMax, cardView);
                    if (max != -1) {
                        setMax((max - this.length) + setPaddingRelative.length.length, 127, 128);
                    } else {
                        this.isInside.getMin(64);
                        getMin(h);
                        getMin(evictall);
                        int i3 = cardView.toIntRange;
                        int i4 = this.getMin;
                        if (i3 > i4) {
                            Arrays.fill(this.getMax, (Object) null);
                            this.length = this.getMax.length - 1;
                            this.setMax = 0;
                            this.IsOverlapping = 0;
                        } else {
                            setMin((this.IsOverlapping + i3) - i4);
                            int i5 = this.setMax + 1;
                            CardView[] cardViewArr = this.getMax;
                            if (i5 > cardViewArr.length) {
                                CardView[] cardViewArr2 = new CardView[(cardViewArr.length * 2)];
                                System.arraycopy(cardViewArr, 0, cardViewArr2, cardViewArr.length, cardViewArr.length);
                                this.length = this.getMax.length - 1;
                                this.getMax = cardViewArr2;
                            }
                            int i6 = this.length;
                            this.length = i6 - 1;
                            this.getMax[i6] = cardView;
                            this.setMax++;
                            this.IsOverlapping += i3;
                        }
                    }
                }
            }
        }

        private void setMax(int i, int i2, int i3) {
            if (i < i2) {
                this.isInside.getMin(i | i3);
                return;
            }
            this.isInside.getMin(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.isInside.getMin(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.isInside.getMin(i4);
        }

        private void getMin(evictAll evictall) {
            if (this.toIntRange) {
                getCardBackgroundColor.setMin();
                if (getCardBackgroundColor.setMax(evictall) < evictall.j()) {
                    maxSize maxsize = new maxSize();
                    getCardBackgroundColor.setMin();
                    getCardBackgroundColor.setMax(evictall, maxsize);
                    evictAll evictall2 = new evictAll(maxsize.FastBitmap$CoordinateSystem());
                    setMax(evictall2.j(), 127, 128);
                    evictall2.a(this.isInside);
                    return;
                }
            }
            setMax(evictall.j(), 127, 0);
            maxSize maxsize2 = this.isInside;
            if (evictall != null) {
                evictall.a(maxsize2);
                return;
            }
            throw new IllegalArgumentException("byteString == null");
        }

        /* access modifiers changed from: package-private */
        public final void getMin(int i) {
            this.setMin = i;
            int min = Math.min(i, 16384);
            int i2 = this.getMin;
            if (i2 != min) {
                if (min < i2) {
                    this.toFloatRange = Math.min(this.toFloatRange, min);
                }
                this.equals = true;
                this.getMin = min;
                int i3 = this.IsOverlapping;
                if (min >= i3) {
                    return;
                }
                if (min == 0) {
                    Arrays.fill(this.getMax, (Object) null);
                    this.length = this.getMax.length - 1;
                    this.setMax = 0;
                    this.IsOverlapping = 0;
                    return;
                }
                setMin(i3 - min);
            }
        }
    }

    static /* synthetic */ evictAll setMin(evictAll evictall) {
        int j = evictall.j();
        int i = 0;
        while (i < j) {
            byte b = evictall.b(i);
            if (b < 65 || b > 90) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder("PROTOCOL_ERROR response malformed: mixed case name: ");
                sb.append(evictall.a());
                throw new IOException(sb.toString());
            }
        }
        return evictall;
    }
}
