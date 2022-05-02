package o;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import com.alibaba.griver.image.framework.meta.ImageFileType;
import com.google.android.exoplayer2.C;
import id.dana.R;
import java.io.UnsupportedEncodingException;

public abstract class TinyBlurMenu implements Runnable {
    public Runnable length;
    public byte setMax = 0;

    /* renamed from: o.TinyBlurMenu$2  reason: invalid class name */
    public final class AnonymousClass2 {

        /* renamed from: o.TinyBlurMenu$2$getMax */
        public static final class getMax {

            /* renamed from: equals */
            public static final int cube_ptr_refreshing = 2131886734;

            /* renamed from: getMax */
            public static final int cube_ptr_pull_down = 2131886731;

            /* renamed from: getMin */
            public static final int cube_ptr_last_update = 2131886729;

            /* renamed from: isInside */
            public static final int cube_ptr_seconds_ago = 2131886736;

            /* renamed from: length */
            public static final int cube_ptr_hours_ago = 2131886728;

            /* renamed from: setMax */
            public static final int cube_ptr_pull_down_to_refresh = 2131886732;

            /* renamed from: setMin */
            public static final int cube_ptr_minutes_ago = 2131886730;

            /* renamed from: toFloatRange */
            public static final int cube_ptr_refresh_complete = 2131886733;

            /* renamed from: toIntRange */
            public static final int cube_ptr_release_to_refresh = 2131886735;
        }

        /* renamed from: o.TinyBlurMenu$2$getMin */
        public static final class getMin {
            public static final int IsOverlapping = 6;
            public static final int equals = 2;
            public static final int[] getMax = {R.attr.f13162130969769};
            public static final int getMin = 0;
            public static final int isInside = 3;
            public static final int length = 1;
            public static final int[] setMax = {R.attr.f13082130969761, R.attr.f13092130969762, R.attr.f13102130969763, R.attr.f13112130969764, R.attr.f13122130969765, R.attr.f13132130969766, R.attr.f13142130969767, R.attr.f13152130969768};
            public static final int setMin = 0;
            public static final int toFloatRange = 4;
            public static final int toIntRange = 5;
            public static final int values = 7;
        }

        /* renamed from: o.TinyBlurMenu$2$length */
        public static final class length {

            /* renamed from: setMax */
            public static final int cube_ptr_classic_default_header = 2131558645;
        }

        /* renamed from: o.TinyBlurMenu$2$setMin */
        public static final class setMin {
            public static final int getMax = 2131364297;
            public static final int getMin = 2131364295;
            public static final int length = 2131364294;
            public static final int setMin = 2131364298;
        }
    }

    public final void getMax() {
        byte b = this.setMax;
        if (b == 0) {
            this.setMax = 1;
            run();
        } else if (b == 2) {
            Runnable runnable = this.length;
            if (runnable != null) {
                runnable.run();
            }
            this.setMax = 2;
        }
    }

    public final class TinyPopMenuReceiver extends Dialog {
        private final boolean getMax;
        private boolean setMin;

        /* access modifiers changed from: protected */
        public final void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            if (this.getMax) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.width = -1;
                getWindow().setAttributes(attributes);
            }
        }

        public final void show() {
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            translateAnimation.setDuration(500);
            translateAnimation.setInterpolator(new AccelerateInterpolator());
            ((ViewGroup) getWindow().getDecorView()).getChildAt(0).startAnimation(translateAnimation);
            super.show();
        }

        public final void cancel() {
            if (!this.setMin) {
                this.setMin = true;
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
                translateAnimation.setDuration(500);
                translateAnimation.setInterpolator(new DecelerateInterpolator());
                ((ViewGroup) getWindow().getDecorView()).getChildAt(0).startAnimation(translateAnimation);
                translateAnimation.setAnimationListener(new Animation.AnimationListener() {
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    public final void onAnimationStart(Animation animation) {
                    }

                    public final void onAnimationEnd(Animation animation) {
                        TinyPopMenuReceiver.this.dismiss();
                    }
                });
            }
        }

        public final void setContentView(int i) {
            requestWindowFeature(1);
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().addFlags(2);
            getWindow().addFlags(1024);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(getWindow().getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -1;
            layoutParams.gravity = 80;
            layoutParams.dimAmount = 0.8f;
            getWindow().setAttributes(layoutParams);
            getWindow().setWindowAnimations(17432578);
            setCanceledOnTouchOutside(true);
            super.setContentView(i);
        }
    }

    /* renamed from: o.TinyBlurMenu$9  reason: invalid class name */
    public final class AnonymousClass9 {

        /* renamed from: o.TinyBlurMenu$9$length */
        static abstract class length {
            public int getMax;
            public byte[] getMin;

            length() {
            }
        }

        public static byte[] setMax(byte[] bArr) {
            return getMin(bArr, bArr.length);
        }

        private static byte[] getMin(byte[] bArr, int i) {
            getMax getmax = new getMax(new byte[((i * 3) / 4)]);
            if (!getmax.getMin(bArr, i)) {
                throw new IllegalArgumentException("bad base-64");
            } else if (getmax.getMax == getmax.getMin.length) {
                return getmax.getMin;
            } else {
                byte[] bArr2 = new byte[getmax.getMax];
                System.arraycopy(getmax.getMin, 0, bArr2, 0, getmax.getMax);
                return bArr2;
            }
        }

        /* renamed from: o.TinyBlurMenu$9$getMax */
        static class getMax extends length {
            private static final int[] length = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
            private static final int[] setMin = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
            private final int[] equals = setMin;
            private int setMax = 0;
            private int toFloatRange = 0;

            public getMax(byte[] bArr) {
                this.getMin = bArr;
            }

            public final boolean getMin(byte[] bArr, int i) {
                int i2 = this.setMax;
                if (i2 == 6) {
                    return false;
                }
                int i3 = i + 0;
                int i4 = this.toFloatRange;
                byte[] bArr2 = this.getMin;
                int[] iArr = this.equals;
                int i5 = 0;
                int i6 = 0;
                while (i5 < i3) {
                    if (i2 == 0) {
                        while (true) {
                            int i7 = i5 + 4;
                            if (i7 > i3) {
                                break;
                            }
                            i4 = iArr[bArr[i5 + 3] & 255] | (iArr[bArr[i5 + 1] & 255] << 12) | (iArr[bArr[i5] & 255] << 18) | (iArr[bArr[i5 + 2] & 255] << 6);
                            if (i4 < 0) {
                                break;
                            }
                            bArr2[i6 + 2] = (byte) i4;
                            bArr2[i6 + 1] = (byte) (i4 >> 8);
                            bArr2[i6] = (byte) (i4 >> 16);
                            i6 += 3;
                            i5 = i7;
                        }
                        if (i5 >= i3) {
                            break;
                        }
                    }
                    int i8 = i5 + 1;
                    int i9 = iArr[bArr[i5] & 255];
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 == 4) {
                                        if (i9 != -2) {
                                            if (i9 != -1) {
                                                this.setMax = 6;
                                                return false;
                                            }
                                        }
                                        i2++;
                                    } else if (i2 == 5 && i9 != -1) {
                                        this.setMax = 6;
                                        return false;
                                    }
                                } else if (i9 >= 0) {
                                    i4 = (i4 << 6) | i9;
                                    bArr2[i6 + 2] = (byte) i4;
                                    bArr2[i6 + 1] = (byte) (i4 >> 8);
                                    bArr2[i6] = (byte) (i4 >> 16);
                                    i6 += 3;
                                    i5 = i8;
                                    i2 = 0;
                                } else if (i9 == -2) {
                                    bArr2[i6 + 1] = (byte) (i4 >> 2);
                                    bArr2[i6] = (byte) (i4 >> 10);
                                    i6 += 2;
                                    i5 = i8;
                                    i2 = 5;
                                } else if (i9 != -1) {
                                    this.setMax = 6;
                                    return false;
                                }
                            } else if (i9 < 0) {
                                if (i9 == -2) {
                                    bArr2[i6] = (byte) (i4 >> 4);
                                    i6++;
                                    i5 = i8;
                                    i2 = 4;
                                } else if (i9 != -1) {
                                    this.setMax = 6;
                                    return false;
                                }
                            }
                        } else if (i9 < 0) {
                            if (i9 != -1) {
                                this.setMax = 6;
                                return false;
                            }
                        }
                        i4 = (i4 << 6) | i9;
                        i2++;
                    } else if (i9 >= 0) {
                        i2++;
                        i4 = i9;
                    } else if (i9 != -1) {
                        this.setMax = 6;
                        return false;
                    }
                    i5 = i8;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        bArr2[i6] = (byte) (i4 >> 4);
                        i6++;
                    } else if (i2 == 3) {
                        int i10 = i6 + 1;
                        bArr2[i6] = (byte) (i4 >> 10);
                        i6 = i10 + 1;
                        bArr2[i10] = (byte) (i4 >> 2);
                    } else if (i2 == 4) {
                        this.setMax = 6;
                        return false;
                    }
                    this.setMax = i2;
                    this.getMax = i6;
                    return true;
                }
                this.setMax = 6;
                return false;
            }
        }

        public static String getMin(byte[] bArr) {
            try {
                return new String(setMin(bArr), C.ASCII_NAME);
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }

        private static byte[] setMin(byte[] bArr) {
            return setMax(bArr, bArr.length);
        }

        private static byte[] setMax(byte[] bArr, int i) {
            setMin setmin = new setMin();
            int i2 = (i / 3) * 4;
            int i3 = 2;
            if (!setmin.length) {
                int i4 = i % 3;
                if (i4 == 1) {
                    i2 += 2;
                } else if (i4 == 2) {
                    i2 += 3;
                }
            } else if (i % 3 > 0) {
                i2 += 4;
            }
            if (setmin.setMin && i > 0) {
                int i5 = ((i - 1) / 57) + 1;
                if (!setmin.isInside) {
                    i3 = 1;
                }
                i2 += i5 * i3;
            }
            setmin.getMin = new byte[i2];
            setmin.length(bArr, i);
            return setmin.getMin;
        }

        /* renamed from: o.TinyBlurMenu$9$setMin */
        static class setMin extends length {
            private static final byte[] equals = {65, 66, 67, 68, 69, 70, ImageFileType.HEAD_GIF_0, ImageFileType.HEAD_HEVC_0, 73, 74, 75, 76, 77, 78, 79, 80, 81, ImageFileType.HEAD_WEBP_0, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, Framer.STDIN_FRAME_PREFIX, Framer.STDIN_REQUEST_FRAME_PREFIX};
            private static final byte[] toIntRange = {65, 66, 67, 68, 69, 70, ImageFileType.HEAD_GIF_0, ImageFileType.HEAD_HEVC_0, 73, 74, 75, 76, 77, 78, 79, 80, 81, ImageFileType.HEAD_WEBP_0, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 43, 47};
            private final byte[] IsOverlapping = new byte[2];
            public final boolean isInside = false;
            public final boolean length = true;
            int setMax = 0;
            public final boolean setMin = false;
            private int toFloatRange;
            private final byte[] values = toIntRange;

            public setMin() {
                this.getMin = null;
                this.toFloatRange = 0 != 0 ? 19 : -1;
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
                	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
                */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x008c  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x00e8  */
            /* JADX WARNING: Removed duplicated region for block: B:43:0x012d  */
            /* JADX WARNING: Removed duplicated region for block: B:75:0x00de A[SYNTHETIC] */
            public final boolean length(byte[] r18, int r19) {
                /*
                    r17 = this;
                    r0 = r17
                    byte[] r1 = r0.values
                    byte[] r2 = r0.getMin
                    int r3 = r0.toFloatRange
                    r4 = 0
                    int r5 = r19 + 0
                    int r6 = r0.setMax
                    r7 = -1
                    r8 = 2
                    r9 = 1
                    if (r6 == r9) goto L_0x002f
                    if (r6 == r8) goto L_0x0015
                    goto L_0x0049
                L_0x0015:
                    if (r5 <= 0) goto L_0x0049
                    byte[] r6 = r0.IsOverlapping
                    byte r10 = r6[r4]
                    r10 = r10 & 255(0xff, float:3.57E-43)
                    int r10 = r10 << 16
                    byte r6 = r6[r9]
                    r6 = r6 & 255(0xff, float:3.57E-43)
                    int r6 = r6 << 8
                    r6 = r6 | r10
                    byte r10 = r18[r4]
                    r10 = r10 & 255(0xff, float:3.57E-43)
                    r6 = r6 | r10
                    r0.setMax = r4
                    r10 = 1
                    goto L_0x004b
                L_0x002f:
                    if (r8 > r5) goto L_0x0049
                    byte[] r6 = r0.IsOverlapping
                    byte r6 = r6[r4]
                    r6 = r6 & 255(0xff, float:3.57E-43)
                    int r6 = r6 << 16
                    byte r10 = r18[r4]
                    r10 = r10 & 255(0xff, float:3.57E-43)
                    int r10 = r10 << 8
                    r6 = r6 | r10
                    byte r10 = r18[r9]
                    r10 = r10 & 255(0xff, float:3.57E-43)
                    r6 = r6 | r10
                    r0.setMax = r4
                    r10 = 2
                    goto L_0x004b
                L_0x0049:
                    r6 = -1
                    r10 = 0
                L_0x004b:
                    r12 = 4
                    r13 = 13
                    r14 = 10
                    if (r6 == r7) goto L_0x0087
                    int r7 = r6 >> 18
                    r7 = r7 & 63
                    byte r7 = r1[r7]
                    r2[r4] = r7
                    int r7 = r6 >> 12
                    r7 = r7 & 63
                    byte r7 = r1[r7]
                    r2[r9] = r7
                    int r7 = r6 >> 6
                    r7 = r7 & 63
                    byte r7 = r1[r7]
                    r2[r8] = r7
                    r6 = r6 & 63
                    byte r6 = r1[r6]
                    r7 = 3
                    r2[r7] = r6
                    int r3 = r3 + -1
                    if (r3 != 0) goto L_0x0085
                    boolean r3 = r0.isInside
                    if (r3 == 0) goto L_0x007d
                    r3 = 5
                    r2[r12] = r13
                    goto L_0x007e
                L_0x007d:
                    r3 = 4
                L_0x007e:
                    int r6 = r3 + 1
                    r2[r3] = r14
                L_0x0082:
                    r3 = 19
                    goto L_0x0088
                L_0x0085:
                    r6 = 4
                    goto L_0x0088
                L_0x0087:
                    r6 = 0
                L_0x0088:
                    int r7 = r10 + 3
                    if (r7 > r5) goto L_0x00de
                    byte r15 = r18[r10]
                    r15 = r15 & 255(0xff, float:3.57E-43)
                    int r15 = r15 << 16
                    int r16 = r10 + 1
                    byte r11 = r18[r16]
                    r11 = r11 & 255(0xff, float:3.57E-43)
                    int r11 = r11 << 8
                    r11 = r11 | r15
                    int r10 = r10 + 2
                    byte r10 = r18[r10]
                    r10 = r10 & 255(0xff, float:3.57E-43)
                    r10 = r10 | r11
                    int r11 = r10 >> 18
                    r11 = r11 & 63
                    byte r11 = r1[r11]
                    r2[r6] = r11
                    int r11 = r6 + 1
                    int r15 = r10 >> 12
                    r15 = r15 & 63
                    byte r15 = r1[r15]
                    r2[r11] = r15
                    int r11 = r6 + 2
                    int r15 = r10 >> 6
                    r15 = r15 & 63
                    byte r15 = r1[r15]
                    r2[r11] = r15
                    int r11 = r6 + 3
                    r10 = r10 & 63
                    byte r10 = r1[r10]
                    r2[r11] = r10
                    int r6 = r6 + 4
                    int r3 = r3 + -1
                    if (r3 != 0) goto L_0x00dc
                    boolean r3 = r0.isInside
                    if (r3 == 0) goto L_0x00d5
                    int r3 = r6 + 1
                    r2[r6] = r13
                    r6 = r3
                L_0x00d5:
                    int r3 = r6 + 1
                    r2[r6] = r14
                    r6 = r3
                    r10 = r7
                    goto L_0x0082
                L_0x00dc:
                    r10 = r7
                    goto L_0x0088
                L_0x00de:
                    int r7 = r0.setMax
                    int r11 = r10 - r7
                    int r15 = r5 + -1
                    r16 = 61
                    if (r11 != r15) goto L_0x012d
                    if (r7 <= 0) goto L_0x00f0
                    byte[] r5 = r0.IsOverlapping
                    byte r4 = r5[r4]
                    r5 = 1
                    goto L_0x00f4
                L_0x00f0:
                    byte r5 = r18[r10]
                    r4 = r5
                    r5 = 0
                L_0x00f4:
                    r4 = r4 & 255(0xff, float:3.57E-43)
                    int r4 = r4 << r12
                    int r7 = r0.setMax
                    int r7 = r7 - r5
                    r0.setMax = r7
                    int r5 = r6 + 1
                    int r7 = r4 >> 6
                    r7 = r7 & 63
                    byte r7 = r1[r7]
                    r2[r6] = r7
                    int r6 = r5 + 1
                    r4 = r4 & 63
                    byte r1 = r1[r4]
                    r2[r5] = r1
                    boolean r1 = r0.length
                    if (r1 == 0) goto L_0x011a
                    int r1 = r6 + 1
                    r2[r6] = r16
                    int r6 = r1 + 1
                    r2[r1] = r16
                L_0x011a:
                    boolean r1 = r0.setMin
                    if (r1 == 0) goto L_0x01ad
                    boolean r1 = r0.isInside
                    if (r1 == 0) goto L_0x0127
                    int r1 = r6 + 1
                    r2[r6] = r13
                    r6 = r1
                L_0x0127:
                    int r1 = r6 + 1
                    r2[r6] = r14
                    goto L_0x01ac
                L_0x012d:
                    int r11 = r10 - r7
                    int r5 = r5 - r8
                    if (r11 != r5) goto L_0x0195
                    if (r7 <= r9) goto L_0x013a
                    byte[] r5 = r0.IsOverlapping
                    byte r4 = r5[r4]
                    r5 = 1
                    goto L_0x0141
                L_0x013a:
                    int r5 = r10 + 1
                    byte r7 = r18[r10]
                    r10 = r5
                    r4 = r7
                    r5 = 0
                L_0x0141:
                    r4 = r4 & 255(0xff, float:3.57E-43)
                    int r4 = r4 << r14
                    int r7 = r0.setMax
                    if (r7 <= 0) goto L_0x014f
                    byte[] r7 = r0.IsOverlapping
                    int r10 = r5 + 1
                    byte r5 = r7[r5]
                    goto L_0x0153
                L_0x014f:
                    byte r7 = r18[r10]
                    r10 = r5
                    r5 = r7
                L_0x0153:
                    r5 = r5 & 255(0xff, float:3.57E-43)
                    int r5 = r5 << r8
                    r4 = r4 | r5
                    int r5 = r0.setMax
                    int r5 = r5 - r10
                    r0.setMax = r5
                    int r5 = r6 + 1
                    int r7 = r4 >> 12
                    r7 = r7 & 63
                    byte r7 = r1[r7]
                    r2[r6] = r7
                    int r6 = r5 + 1
                    int r7 = r4 >> 6
                    r7 = r7 & 63
                    byte r7 = r1[r7]
                    r2[r5] = r7
                    int r5 = r6 + 1
                    r4 = r4 & 63
                    byte r1 = r1[r4]
                    r2[r6] = r1
                    boolean r1 = r0.length
                    if (r1 == 0) goto L_0x0181
                    int r1 = r5 + 1
                    r2[r5] = r16
                    r5 = r1
                L_0x0181:
                    boolean r1 = r0.setMin
                    if (r1 == 0) goto L_0x0193
                    boolean r1 = r0.isInside
                    if (r1 == 0) goto L_0x018e
                    int r1 = r5 + 1
                    r2[r5] = r13
                    r5 = r1
                L_0x018e:
                    int r1 = r5 + 1
                    r2[r5] = r14
                    goto L_0x01ac
                L_0x0193:
                    r6 = r5
                    goto L_0x01ad
                L_0x0195:
                    boolean r1 = r0.setMin
                    if (r1 == 0) goto L_0x01ad
                    if (r6 <= 0) goto L_0x01ad
                    r1 = 19
                    if (r3 == r1) goto L_0x01ad
                    boolean r1 = r0.isInside
                    if (r1 == 0) goto L_0x01a8
                    int r1 = r6 + 1
                    r2[r6] = r13
                    r6 = r1
                L_0x01a8:
                    int r1 = r6 + 1
                    r2[r6] = r14
                L_0x01ac:
                    r6 = r1
                L_0x01ad:
                    r0.getMax = r6
                    r0.toFloatRange = r3
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: o.TinyBlurMenu.AnonymousClass9.setMin.length(byte[], int):boolean");
            }
        }
    }
}
