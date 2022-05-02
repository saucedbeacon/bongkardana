package o;

import androidx.annotation.ColorRes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.getUrlIndex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0003*+,B7\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J;\u0010#\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001b¨\u0006-"}, d2 = {"Lid/dana/lib/gcontainer/app/extension/toolbar/ToolbarStyle;", "", "toolbarBackgroundColor", "", "toolbarBackgroundDrawable", "title", "Lid/dana/lib/gcontainer/app/extension/toolbar/ToolbarStyle$Title;", "backButton", "Lid/dana/lib/gcontainer/app/extension/toolbar/ToolbarStyle$BackButton;", "closeButton", "Lid/dana/lib/gcontainer/app/extension/toolbar/ToolbarStyle$CloseButton;", "(IILid/dana/lib/gcontainer/app/extension/toolbar/ToolbarStyle$Title;Lid/dana/lib/gcontainer/app/extension/toolbar/ToolbarStyle$BackButton;Lid/dana/lib/gcontainer/app/extension/toolbar/ToolbarStyle$CloseButton;)V", "getBackButton", "()Lid/dana/lib/gcontainer/app/extension/toolbar/ToolbarStyle$BackButton;", "setBackButton", "(Lid/dana/lib/gcontainer/app/extension/toolbar/ToolbarStyle$BackButton;)V", "getCloseButton", "()Lid/dana/lib/gcontainer/app/extension/toolbar/ToolbarStyle$CloseButton;", "setCloseButton", "(Lid/dana/lib/gcontainer/app/extension/toolbar/ToolbarStyle$CloseButton;)V", "getTitle", "()Lid/dana/lib/gcontainer/app/extension/toolbar/ToolbarStyle$Title;", "setTitle", "(Lid/dana/lib/gcontainer/app/extension/toolbar/ToolbarStyle$Title;)V", "getToolbarBackgroundColor", "()I", "setToolbarBackgroundColor", "(I)V", "getToolbarBackgroundDrawable", "setToolbarBackgroundDrawable", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "BackButton", "CloseButton", "Title", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public final class getClipboard {
    @NotNull
    public setMin getMax;
    public int getMin;
    @NotNull
    public getMax length;
    public int setMax;
    @NotNull
    public getMin setMin;

    public getClipboard() {
        this((byte) 0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getClipboard)) {
            return false;
        }
        getClipboard getclipboard = (getClipboard) obj;
        return this.getMin == getclipboard.getMin && this.setMax == getclipboard.setMax && Intrinsics.areEqual((Object) this.setMin, (Object) getclipboard.setMin) && Intrinsics.areEqual((Object) this.length, (Object) getclipboard.length) && Intrinsics.areEqual((Object) this.getMax, (Object) getclipboard.getMax);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ToolbarStyle(toolbarBackgroundColor=");
        sb.append(this.getMin);
        sb.append(", toolbarBackgroundDrawable=");
        sb.append(this.setMax);
        sb.append(", title=");
        sb.append(this.setMin);
        sb.append(", backButton=");
        sb.append(this.length);
        sb.append(", closeButton=");
        sb.append(this.getMax);
        sb.append(")");
        return sb.toString();
    }

    private getClipboard(@NotNull getMin getmin, @NotNull getMax getmax, @NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(getmin, "title");
        Intrinsics.checkNotNullParameter(getmax, "backButton");
        Intrinsics.checkNotNullParameter(setmin, "closeButton");
        this.getMin = 17170443;
        this.setMax = 0;
        this.setMin = getmin;
        this.length = getmax;
        this.getMax = setmin;
    }

    public /* synthetic */ getClipboard(byte b) {
        this(new getMin(0), new getMax((byte) 0), new setMin((byte) 0));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lid/dana/lib/gcontainer/app/extension/toolbar/ToolbarStyle$Title;", "", "preloadTitle", "", "textColor", "", "(Ljava/lang/String;I)V", "getPreloadTitle", "()Ljava/lang/String;", "setPreloadTitle", "(Ljava/lang/String;)V", "getTextColor", "()I", "setTextColor", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        public int length;
        @Nullable
        public String setMax;

        public getMin() {
            this(0);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMin)) {
                return false;
            }
            getMin getmin = (getMin) obj;
            return Intrinsics.areEqual((Object) this.setMax, (Object) getmin.setMax) && this.length == getmin.length;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Title(preloadTitle=");
            sb.append(this.setMax);
            sb.append(", textColor=");
            sb.append(this.length);
            sb.append(")");
            return sb.toString();
        }

        private getMin(byte b) {
            this.setMax = null;
            this.length = 17170444;
        }

        public /* synthetic */ getMin(char c) {
            this((byte) 0);
        }

        public final int hashCode() {
            String str = this.setMax;
            return ((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.length).hashCode();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lid/dana/lib/gcontainer/app/extension/toolbar/ToolbarStyle$BackButton;", "", "text", "", "color", "", "icon", "(Ljava/lang/String;II)V", "getColor", "()I", "setColor", "(I)V", "getIcon", "setIcon", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        public int getMin;
        @Nullable
        public String length;
        public int setMin;

        public getMax() {
            this((byte) 0);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMax)) {
                return false;
            }
            getMax getmax = (getMax) obj;
            return Intrinsics.areEqual((Object) this.length, (Object) getmax.length) && this.setMin == getmax.setMin && this.getMin == getmax.getMin;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("BackButton(text=");
            sb.append(this.length);
            sb.append(", color=");
            sb.append(this.setMin);
            sb.append(", icon=");
            sb.append(this.getMin);
            sb.append(")");
            return sb.toString();
        }

        private getMax(@ColorRes int i) {
            this.length = null;
            this.setMin = i;
            this.getMin = 0;
        }

        public /* synthetic */ getMax(byte b) {
            this(getUrlIndex.getMin.setMin);
        }

        public final int hashCode() {
            String str = this.length;
            return ((((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.setMin).hashCode()) * 31) + Integer.valueOf(this.getMin).hashCode();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J3\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lid/dana/lib/gcontainer/app/extension/toolbar/ToolbarStyle$CloseButton;", "", "show", "", "text", "", "color", "", "icon", "(ZLjava/lang/String;II)V", "getColor", "()I", "setColor", "(I)V", "getIcon", "setIcon", "getShow", "()Z", "setShow", "(Z)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        @Nullable
        public String getMax;
        public int length;
        public int setMax;
        public boolean setMin;

        public setMin() {
            this((byte) 0);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof setMin)) {
                return false;
            }
            setMin setmin = (setMin) obj;
            return this.setMin == setmin.setMin && Intrinsics.areEqual((Object) this.getMax, (Object) setmin.getMax) && this.setMax == setmin.setMax && this.length == setmin.length;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("CloseButton(show=");
            sb.append(this.setMin);
            sb.append(", text=");
            sb.append(this.getMax);
            sb.append(", color=");
            sb.append(this.setMax);
            sb.append(", icon=");
            sb.append(this.length);
            sb.append(")");
            return sb.toString();
        }

        private setMin(@ColorRes int i) {
            this.setMin = true;
            this.getMax = null;
            this.setMax = i;
            this.length = 0;
        }

        public final boolean getMax() {
            return this.setMin;
        }

        public /* synthetic */ setMin(byte b) {
            this(getUrlIndex.getMin.setMin);
        }

        public final int hashCode() {
            boolean z = this.setMin;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            String str = this.getMax;
            return ((((i + (str != null ? str.hashCode() : 0)) * 31) + Integer.valueOf(this.setMax).hashCode()) * 31) + Integer.valueOf(this.length).hashCode();
        }
    }

    public final int hashCode() {
        int hashCode = ((Integer.valueOf(this.getMin).hashCode() * 31) + Integer.valueOf(this.setMax).hashCode()) * 31;
        getMin getmin = this.setMin;
        int i = 0;
        int hashCode2 = (hashCode + (getmin != null ? getmin.hashCode() : 0)) * 31;
        getMax getmax = this.length;
        int hashCode3 = (hashCode2 + (getmax != null ? getmax.hashCode() : 0)) * 31;
        setMin setmin = this.getMax;
        if (setmin != null) {
            i = setmin.hashCode();
        }
        return hashCode3 + i;
    }
}
