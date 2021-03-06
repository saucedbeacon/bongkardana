package com.google.zxing.multi;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class GenericMultipleBarcodeReader implements MultipleBarcodeReader {
    private static final int MAX_DEPTH = 4;
    private static final int MIN_DIMENSION_TO_RECUR = 100;
    private final Reader delegate;

    public GenericMultipleBarcodeReader(Reader reader) {
        this.delegate = reader;
    }

    public final Result[] decodeMultiple(BinaryBitmap binaryBitmap) throws NotFoundException {
        return decodeMultiple(binaryBitmap, (Map<DecodeHintType, ?>) null);
    }

    public final Result[] decodeMultiple(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
        ArrayList arrayList = new ArrayList();
        doDecodeMultiple(binaryBitmap, map, arrayList, 0, 0, 0);
        if (!arrayList.isEmpty()) {
            return (Result[]) arrayList.toArray(new Result[arrayList.size()]);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private void doDecodeMultiple(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map, List<Result> list, int i, int i2, int i3) {
        boolean z;
        float f;
        float f2;
        float f3;
        int i4;
        int i5 = i;
        BinaryBitmap binaryBitmap2 = binaryBitmap;
        int i6 = i2;
        int i7 = i3;
        while (i7 <= 4) {
            try {
                Result decode = this.delegate.decode(binaryBitmap2, map);
                Iterator<Result> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().getText().equals(decode.getText())) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    list.add(translateResultPoints(decode, i5, i6));
                } else {
                    List<Result> list2 = list;
                }
                ResultPoint[] resultPoints = decode.getResultPoints();
                if (resultPoints != null && resultPoints.length != 0) {
                    int width = binaryBitmap2.getWidth();
                    int height = binaryBitmap2.getHeight();
                    float f4 = (float) width;
                    float f5 = 0.0f;
                    float f6 = (float) height;
                    float f7 = 0.0f;
                    for (ResultPoint resultPoint : resultPoints) {
                        if (resultPoint != null) {
                            float x = resultPoint.getX();
                            float y = resultPoint.getY();
                            if (x < f4) {
                                f4 = x;
                            }
                            if (y < f6) {
                                f6 = y;
                            }
                            if (x > f5) {
                                f5 = x;
                            }
                            if (y > f7) {
                                f7 = y;
                            }
                        }
                    }
                    if (f4 > 100.0f) {
                        f2 = f7;
                        f = f5;
                        f3 = f6;
                        i4 = height;
                        doDecodeMultiple(binaryBitmap2.crop(0, 0, (int) f4, height), map, list, i, i6, i7 + 1);
                    } else {
                        f2 = f7;
                        f = f5;
                        f3 = f6;
                        i4 = height;
                    }
                    if (f3 > 100.0f) {
                        doDecodeMultiple(binaryBitmap2.crop(0, 0, width, (int) f3), map, list, i, i6, i7 + 1);
                    }
                    float f8 = f;
                    if (f8 < ((float) (width - 100))) {
                        int i8 = (int) f8;
                        doDecodeMultiple(binaryBitmap2.crop(i8, 0, width - i8, i4), map, list, i5 + i8, i6, i7 + 1);
                    }
                    float f9 = f2;
                    if (f9 < ((float) (i4 - 100))) {
                        int i9 = (int) f9;
                        binaryBitmap2 = binaryBitmap2.crop(0, i9, width, i4 - i9);
                        i6 += i9;
                        i7++;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } catch (ReaderException unused) {
                return;
            }
        }
    }

    private static Result translateResultPoints(Result result, int i, int i2) {
        ResultPoint[] resultPoints = result.getResultPoints();
        if (resultPoints == null) {
            return result;
        }
        ResultPoint[] resultPointArr = new ResultPoint[resultPoints.length];
        for (int i3 = 0; i3 < resultPoints.length; i3++) {
            ResultPoint resultPoint = resultPoints[i3];
            if (resultPoint != null) {
                resultPointArr[i3] = new ResultPoint(resultPoint.getX() + ((float) i), resultPoint.getY() + ((float) i2));
            }
        }
        Result result2 = new Result(result.getText(), result.getRawBytes(), result.getNumBits(), resultPointArr, result.getBarcodeFormat(), result.getTimestamp());
        result2.putAllMetadata(result.getResultMetadata());
        return result2;
    }
}
