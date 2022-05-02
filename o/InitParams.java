package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0015"}, d2 = {"Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantImageResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "images", "", "Lid/dana/data/nearbyme/model/MerchantImageEntity;", "(Ljava/util/List;)V", "getImages", "()Ljava/util/List;", "setImages", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toMerchantImages", "Lid/dana/domain/nearbyme/model/MerchantImage;", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class InitParams extends BaseRpcResult {
    @NotNull
    private List<sendPushWorkMessage> images;

    public static /* synthetic */ InitParams copy$default(InitParams initParams, List<sendPushWorkMessage> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = initParams.images;
        }
        return initParams.copy(list);
    }

    @NotNull
    public final List<sendPushWorkMessage> component1() {
        return this.images;
    }

    @NotNull
    public final InitParams copy(@NotNull List<sendPushWorkMessage> list) {
        Intrinsics.checkNotNullParameter(list, "images");
        return new InitParams(list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof InitParams) && Intrinsics.areEqual((Object) this.images, (Object) ((InitParams) obj).images);
        }
        return true;
    }

    public final int hashCode() {
        List<sendPushWorkMessage> list = this.images;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantImageResult(images=");
        sb.append(this.images);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final List<sendPushWorkMessage> getImages() {
        return this.images;
    }

    public final void setImages(@NotNull List<sendPushWorkMessage> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.images = list;
    }

    public InitParams(@NotNull List<sendPushWorkMessage> list) {
        Intrinsics.checkNotNullParameter(list, "images");
        this.images = list;
    }

    @NotNull
    public final List<getUtdid> toMerchantImages() {
        Iterable<sendPushWorkMessage> iterable = this.images;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (sendPushWorkMessage merchantImage : iterable) {
            arrayList.add(merchantImage.toMerchantImage());
        }
        return (List) arrayList;
    }

    /* renamed from: o.InitParams$1  reason: invalid class name */
    public final class AnonymousClass1 implements Serializable {
        private int[] buffer;
        private int column;
        private int index;
        private int line;
        private String name;
        private int pointer;

        private static int[] toCodePoints(char[] cArr) {
            int i = 0;
            int[] iArr = new int[Character.codePointCount(cArr, 0, cArr.length)];
            int i2 = 0;
            while (i < cArr.length) {
                int codePointAt = Character.codePointAt(cArr, i);
                iArr[i2] = codePointAt;
                i += Character.charCount(codePointAt);
                i2++;
            }
            return iArr;
        }

        public AnonymousClass1(String str, int i, int i2, int i3, char[] cArr, int i4) {
            this(str, i, i2, i3, toCodePoints(cArr), i4);
        }

        @Deprecated
        public AnonymousClass1(String str, int i, int i2, int i3, String str2, int i4) {
            this(str, i, i2, i3, str2.toCharArray(), i4);
        }

        public AnonymousClass1(String str, int i, int i2, int i3, int[] iArr, int i4) {
            this.name = str;
            this.index = i;
            this.line = i2;
            this.column = i3;
            this.buffer = iArr;
            this.pointer = i4;
        }

        private boolean isLineBreak(int i) {
            return setSpmMonitor.getMax.length(i);
        }

        public final String get_snippet(int i, int i2) {
            String str;
            String str2;
            float f = (((float) i2) / 2.0f) - 1.0f;
            int i3 = this.pointer;
            while (true) {
                str = " ... ";
                if (i3 > 0 && !isLineBreak(this.buffer[i3 - 1])) {
                    i3--;
                    if (((float) (this.pointer - i3)) > f) {
                        i3 += 5;
                        str2 = str;
                        break;
                    }
                } else {
                    str2 = "";
                }
            }
            str2 = "";
            int i4 = this.pointer;
            while (true) {
                int[] iArr = this.buffer;
                if (i4 < iArr.length && !isLineBreak(iArr[i4])) {
                    i4++;
                    if (((float) (i4 - this.pointer)) > f) {
                        i4 -= 5;
                        break;
                    }
                } else {
                    str = "";
                }
            }
            str = "";
            StringBuilder sb = new StringBuilder();
            for (int i5 = 0; i5 < i; i5++) {
                sb.append(" ");
            }
            sb.append(str2);
            for (int i6 = i3; i6 < i4; i6++) {
                sb.appendCodePoint(this.buffer[i6]);
            }
            sb.append(str);
            sb.append("\n");
            for (int i7 = 0; i7 < ((this.pointer + i) - i3) + str2.length(); i7++) {
                sb.append(" ");
            }
            sb.append("^");
            return sb.toString();
        }

        public final String get_snippet() {
            return get_snippet(4, 75);
        }

        public final String toString() {
            String str = get_snippet();
            StringBuilder sb = new StringBuilder(" in ");
            sb.append(this.name);
            sb.append(", line ");
            sb.append(this.line + 1);
            sb.append(", column ");
            sb.append(this.column + 1);
            sb.append(":\n");
            sb.append(str);
            return sb.toString();
        }

        public final String getName() {
            return this.name;
        }

        public final int getLine() {
            return this.line;
        }

        public final int getColumn() {
            return this.column;
        }

        public final int getIndex() {
            return this.index;
        }

        public final int[] getBuffer() {
            return this.buffer;
        }

        public final int getPointer() {
            return this.pointer;
        }
    }
}
