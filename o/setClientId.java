package o;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import id.dana.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.StartupException;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0002\r\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/dialog/DialogContactUs;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "data", "Lid/dana/dialog/DialogContactUs$Builder;", "(Lid/dana/dialog/DialogContactUs$Builder;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Builder", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setClientId extends getActiveNotifications {
    @NotNull
    public static final getMin setMax = new getMin((byte) 0);
    private HashMap getMin;
    /* access modifiers changed from: private */
    public final setMin setMin;

    public setClientId(@NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "data");
        this.setMin = setmin;
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Window window;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.dialog_contact_us, viewGroup, false);
        if (inflate == null) {
            return null;
        }
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setBackgroundDrawableResource(R.drawable.bg_white);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(resetInternal.setMax.setTrackDrawable);
        if (appCompatTextView != null) {
            appCompatTextView.setText(this.setMin.getMin);
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) inflate.findViewById(resetInternal.setMax.inflateMenu);
        if (appCompatTextView2 != null) {
            appCompatTextView2.setText(this.setMin.length);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(resetInternal.setMax.IMediaSession$Stub$Proxy);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new setMax(this));
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate.findViewById(resetInternal.setMax.onRetainCustomNonConfigurationInstance);
        if (constraintLayout2 != null) {
            constraintLayout2.setOnClickListener(new length(this));
        }
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) inflate.findViewById(resetInternal.setMax.ITrustedWebActivityCallback$Stub);
        if (appCompatTextView3 != null) {
            appCompatTextView3.setOnClickListener(new getMax(this));
        }
        return inflate;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/dialog/DialogContactUs$onCreateView$1$1"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ setClientId setMin;

        setMax(setClientId setclientid) {
            this.setMin = setclientid;
        }

        public final void onClick(View view) {
            Function1<? super String, Unit> function1 = this.setMin.setMin.getMax;
            if (function1 != null) {
                String str = this.setMin.setMin.getMin;
                if (str == null) {
                    str = "";
                }
                function1.invoke(str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/dialog/DialogContactUs$onCreateView$1$2"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ setClientId setMin;

        length(setClientId setclientid) {
            this.setMin = setclientid;
        }

        public final void onClick(View view) {
            Function1<? super String, Unit> function1 = this.setMin.setMin.setMax;
            if (function1 != null) {
                String str = this.setMin.setMin.length;
                if (str == null) {
                    str = "";
                }
                function1.invoke(str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/dialog/DialogContactUs$onCreateView$1$3"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ setClientId setMax;

        getMax(setClientId setclientid) {
            this.setMax = setclientid;
        }

        public final void onClick(View view) {
            this.setMax.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/dialog/DialogContactUs$Companion;", "", "()V", "TAG", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003J\u001a\u0010\u0005\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006J\u001a\u0010\b\u001a\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013¨\u0006$"}, d2 = {"Lid/dana/dialog/DialogContactUs$Builder;", "Lid/dana/component/BaseMaterialDialog$Cancellation;", "callNumber", "", "messageNumber", "onCallClick", "Lkotlin/Function1;", "", "onMessageClick", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getCallNumber", "()Ljava/lang/String;", "setCallNumber", "(Ljava/lang/String;)V", "getMessageNumber", "setMessageNumber", "getOnCallClick", "()Lkotlin/jvm/functions/Function1;", "setOnCallClick", "(Lkotlin/jvm/functions/Function1;)V", "getOnMessageClick", "setOnMessageClick", "build", "Lid/dana/dialog/DialogContactUs;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends StartupException.getMin {
        @Nullable
        public Function1<? super String, Unit> getMax;
        @Nullable
        public String getMin;
        @Nullable
        public String length;
        @Nullable
        public Function1<? super String, Unit> setMax;

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
            return Intrinsics.areEqual((Object) this.getMin, (Object) setmin.getMin) && Intrinsics.areEqual((Object) this.length, (Object) setmin.length) && Intrinsics.areEqual((Object) this.getMax, (Object) setmin.getMax) && Intrinsics.areEqual((Object) this.setMax, (Object) setmin.setMax);
        }

        public final int hashCode() {
            String str = this.getMin;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.length;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Function1<? super String, Unit> function1 = this.getMax;
            int hashCode3 = (hashCode2 + (function1 != null ? function1.hashCode() : 0)) * 31;
            Function1<? super String, Unit> function12 = this.setMax;
            if (function12 != null) {
                i = function12.hashCode();
            }
            return hashCode3 + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Builder(callNumber=");
            sb.append(this.getMin);
            sb.append(", messageNumber=");
            sb.append(this.length);
            sb.append(", onCallClick=");
            sb.append(this.getMax);
            sb.append(", onMessageClick=");
            sb.append(this.setMax);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ setMin(byte b) {
            this((String) null, (String) null, (Function1<? super String, Unit>) null, (Function1<? super String, Unit>) null);
        }

        public setMin(@Nullable String str, @Nullable String str2, @Nullable Function1<? super String, Unit> function1, @Nullable Function1<? super String, Unit> function12) {
            this.getMin = str;
            this.length = str2;
            this.getMax = function1;
            this.setMax = function12;
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.getMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
