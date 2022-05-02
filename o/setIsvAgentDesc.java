package o;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0010j\b\u0012\u0004\u0012\u00020\u0003`\u0011¢\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u0019\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0010j\b\u0012\u0004\u0012\u00020\u0003`\u0011HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0010j\b\u0012\u0004\u0012\u00020\u0003`\u0011HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R!\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0010j\b\u0012\u0004\u0012\u00020\u0003`\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00066"}, d2 = {"Lid/dana/data/social/repository/source/network/response/PaginatorResponse;", "", "beginIndex", "", "endIndex", "firstPage", "items", "itemsPerPage", "lastPage", "length", "nextPage", "offset", "page", "pages", "previousPage", "slider", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(IIIIIIIIIIIILjava/util/ArrayList;)V", "getBeginIndex", "()I", "getEndIndex", "getFirstPage", "getItems", "getItemsPerPage", "getLastPage", "getLength", "getNextPage", "getOffset", "getPage", "getPages", "getPreviousPage", "getSlider", "()Ljava/util/ArrayList;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setIsvAgentDesc {
    private final int beginIndex;
    private final int endIndex;
    private final int firstPage;
    private final int items;
    private final int itemsPerPage;
    private final int lastPage;
    private final int length;
    private final int nextPage;
    private final int offset;
    private final int page;
    private final int pages;
    private final int previousPage;
    @NotNull
    private final ArrayList<Integer> slider;

    public setIsvAgentDesc() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (ArrayList) null, 8191, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ setIsvAgentDesc copy$default(setIsvAgentDesc setisvagentdesc, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, ArrayList arrayList, int i13, Object obj) {
        setIsvAgentDesc setisvagentdesc2 = setisvagentdesc;
        int i14 = i13;
        return setisvagentdesc.copy((i14 & 1) != 0 ? setisvagentdesc2.beginIndex : i, (i14 & 2) != 0 ? setisvagentdesc2.endIndex : i2, (i14 & 4) != 0 ? setisvagentdesc2.firstPage : i3, (i14 & 8) != 0 ? setisvagentdesc2.items : i4, (i14 & 16) != 0 ? setisvagentdesc2.itemsPerPage : i5, (i14 & 32) != 0 ? setisvagentdesc2.lastPage : i6, (i14 & 64) != 0 ? setisvagentdesc2.length : i7, (i14 & 128) != 0 ? setisvagentdesc2.nextPage : i8, (i14 & 256) != 0 ? setisvagentdesc2.offset : i9, (i14 & 512) != 0 ? setisvagentdesc2.page : i10, (i14 & 1024) != 0 ? setisvagentdesc2.pages : i11, (i14 & 2048) != 0 ? setisvagentdesc2.previousPage : i12, (i14 & 4096) != 0 ? setisvagentdesc2.slider : arrayList);
    }

    public final int component1() {
        return this.beginIndex;
    }

    public final int component10() {
        return this.page;
    }

    public final int component11() {
        return this.pages;
    }

    public final int component12() {
        return this.previousPage;
    }

    @NotNull
    public final ArrayList<Integer> component13() {
        return this.slider;
    }

    public final int component2() {
        return this.endIndex;
    }

    public final int component3() {
        return this.firstPage;
    }

    public final int component4() {
        return this.items;
    }

    public final int component5() {
        return this.itemsPerPage;
    }

    public final int component6() {
        return this.lastPage;
    }

    public final int component7() {
        return this.length;
    }

    public final int component8() {
        return this.nextPage;
    }

    public final int component9() {
        return this.offset;
    }

    @NotNull
    public final setIsvAgentDesc copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, @NotNull ArrayList<Integer> arrayList) {
        ArrayList<Integer> arrayList2 = arrayList;
        Intrinsics.checkNotNullParameter(arrayList2, "slider");
        return new setIsvAgentDesc(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, arrayList2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setIsvAgentDesc)) {
            return false;
        }
        setIsvAgentDesc setisvagentdesc = (setIsvAgentDesc) obj;
        return this.beginIndex == setisvagentdesc.beginIndex && this.endIndex == setisvagentdesc.endIndex && this.firstPage == setisvagentdesc.firstPage && this.items == setisvagentdesc.items && this.itemsPerPage == setisvagentdesc.itemsPerPage && this.lastPage == setisvagentdesc.lastPage && this.length == setisvagentdesc.length && this.nextPage == setisvagentdesc.nextPage && this.offset == setisvagentdesc.offset && this.page == setisvagentdesc.page && this.pages == setisvagentdesc.pages && this.previousPage == setisvagentdesc.previousPage && Intrinsics.areEqual((Object) this.slider, (Object) setisvagentdesc.slider);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PaginatorResponse(beginIndex=");
        sb.append(this.beginIndex);
        sb.append(", endIndex=");
        sb.append(this.endIndex);
        sb.append(", firstPage=");
        sb.append(this.firstPage);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", itemsPerPage=");
        sb.append(this.itemsPerPage);
        sb.append(", lastPage=");
        sb.append(this.lastPage);
        sb.append(", length=");
        sb.append(this.length);
        sb.append(", nextPage=");
        sb.append(this.nextPage);
        sb.append(", offset=");
        sb.append(this.offset);
        sb.append(", page=");
        sb.append(this.page);
        sb.append(", pages=");
        sb.append(this.pages);
        sb.append(", previousPage=");
        sb.append(this.previousPage);
        sb.append(", slider=");
        sb.append(this.slider);
        sb.append(")");
        return sb.toString();
    }

    public setIsvAgentDesc(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, @NotNull ArrayList<Integer> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "slider");
        this.beginIndex = i;
        this.endIndex = i2;
        this.firstPage = i3;
        this.items = i4;
        this.itemsPerPage = i5;
        this.lastPage = i6;
        this.length = i7;
        this.nextPage = i8;
        this.offset = i9;
        this.page = i10;
        this.pages = i11;
        this.previousPage = i12;
        this.slider = arrayList;
    }

    public final int getBeginIndex() {
        return this.beginIndex;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final int getFirstPage() {
        return this.firstPage;
    }

    public final int getItems() {
        return this.items;
    }

    public final int getItemsPerPage() {
        return this.itemsPerPage;
    }

    public final int getLastPage() {
        return this.lastPage;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getNextPage() {
        return this.nextPage;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getPages() {
        return this.pages;
    }

    public final int getPreviousPage() {
        return this.previousPage;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ setIsvAgentDesc(int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, java.util.ArrayList r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r14 = this;
            r0 = r28
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = 0
            goto L_0x000a
        L_0x0009:
            r1 = r15
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r16
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r17
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r18
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r19
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r20
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r21
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r22
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r23
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r24
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r25
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r2 = r26
        L_0x0061:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x006b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x006d
        L_0x006b:
            r0 = r27
        L_0x006d:
            r15 = r14
            r16 = r1
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r26 = r12
            r27 = r2
            r28 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setIsvAgentDesc.<init>(int, int, int, int, int, int, int, int, int, int, int, int, java.util.ArrayList, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public final ArrayList<Integer> getSlider() {
        return this.slider;
    }

    public final int hashCode() {
        int hashCode = ((((((((((((((((((((((Integer.valueOf(this.beginIndex).hashCode() * 31) + Integer.valueOf(this.endIndex).hashCode()) * 31) + Integer.valueOf(this.firstPage).hashCode()) * 31) + Integer.valueOf(this.items).hashCode()) * 31) + Integer.valueOf(this.itemsPerPage).hashCode()) * 31) + Integer.valueOf(this.lastPage).hashCode()) * 31) + Integer.valueOf(this.length).hashCode()) * 31) + Integer.valueOf(this.nextPage).hashCode()) * 31) + Integer.valueOf(this.offset).hashCode()) * 31) + Integer.valueOf(this.page).hashCode()) * 31) + Integer.valueOf(this.pages).hashCode()) * 31) + Integer.valueOf(this.previousPage).hashCode()) * 31;
        ArrayList<Integer> arrayList = this.slider;
        return hashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }
}
