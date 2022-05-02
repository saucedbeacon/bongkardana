package id.dana.miniprogram.tnc;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.richview.CurrencyTextView;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/miniprogram/tnc/TncDetailMiniProgramActivity;", "Lid/dana/base/BaseActivity;", "()V", "params", "Lid/dana/miniprogram/tnc/TncDetailMiniProgramActivity$StartParams;", "getDataContent", "", "getLayout", "", "init", "showIcon", "urlIcon", "", "Companion", "StartParams", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class TncDetailMiniProgramActivity extends BaseActivity {
    @NotNull
    public static final length Companion = new length((byte) 0);
    @NotNull
    public static final String EXTRA_START_PARAMS = "startParams";
    private StartParams getMax;
    private HashMap setMax;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1851896800, oncanceled);
            onCancelLoad.getMin(-1851896800, oncanceled);
        }
        if (this.setMax == null) {
            this.setMax = new HashMap();
        }
        View view = (View) this.setMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_terms_services_detail;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ TncDetailMiniProgramActivity setMin;

        getMax(TncDetailMiniProgramActivity tncDetailMiniProgramActivity) {
            this.setMin = tncDetailMiniProgramActivity;
        }

        public final void onClick(View view) {
            this.setMin.setResult(-1, new Intent().putExtra("AGREE", true));
            this.setMin.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ TncDetailMiniProgramActivity length;

        setMin(TncDetailMiniProgramActivity tncDetailMiniProgramActivity) {
            this.length = tncDetailMiniProgramActivity;
        }

        public final void onClick(View view) {
            this.length.setResult(-1, new Intent().putExtra("AGREE", false));
            this.length.finish();
        }
    }

    @Parcelize
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0007HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001R%\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\""}, d2 = {"Lid/dana/miniprogram/tnc/TncDetailMiniProgramActivity$StartParams;", "Landroid/os/Parcelable;", "name", "", "logo", "agreements", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "contentAgreement", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V", "getAgreements", "()Ljava/util/ArrayList;", "getContentAgreement", "()Ljava/lang/String;", "getLogo", "getName", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class StartParams implements Parcelable {
        public static final Parcelable.Creator<StartParams> CREATOR = new setMin();
        @NotNull
        final String getMin;
        @Nullable
        final String length;
        @NotNull
        final String setMax;
        @Nullable
        final ArrayList<String> setMin;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartParams)) {
                return false;
            }
            StartParams startParams = (StartParams) obj;
            return Intrinsics.areEqual((Object) this.getMin, (Object) startParams.getMin) && Intrinsics.areEqual((Object) this.setMax, (Object) startParams.setMax) && Intrinsics.areEqual((Object) this.setMin, (Object) startParams.setMin) && Intrinsics.areEqual((Object) this.length, (Object) startParams.length);
        }

        public final int hashCode() {
            String str = this.getMin;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.setMax;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            ArrayList<String> arrayList = this.setMin;
            int hashCode3 = (hashCode2 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
            String str3 = this.length;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode3 + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("StartParams(name=");
            sb.append(this.getMin);
            sb.append(", logo=");
            sb.append(this.setMax);
            sb.append(", agreements=");
            sb.append(this.setMin);
            sb.append(", contentAgreement=");
            sb.append(this.length);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeString(this.getMin);
            parcel.writeString(this.setMax);
            ArrayList<String> arrayList = this.setMin;
            if (arrayList != null) {
                parcel.writeInt(1);
                parcel.writeInt(arrayList.size());
                for (String writeString : arrayList) {
                    parcel.writeString(writeString);
                }
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.length);
        }

        public StartParams(@NotNull String str, @NotNull String str2, @Nullable ArrayList<String> arrayList, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, "logo");
            this.getMin = str;
            this.setMax = str2;
            this.setMin = arrayList;
            this.length = str3;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StartParams(String str, String str2, ArrayList arrayList, String str3, int i) {
            this(str, str2, (i & 4) != 0 ? null : arrayList, (i & 8) != 0 ? null : str3);
        }

        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
        public static class setMin implements Parcelable.Creator<StartParams> {
            public final /* synthetic */ Object[] newArray(int i) {
                int max = dispatchOnCancelled.setMax(i);
                if (i != max) {
                    onCanceled oncanceled = new onCanceled(i, max, 1);
                    onCancelLoad.setMax(626443954, oncanceled);
                    onCancelLoad.getMin(626443954, oncanceled);
                }
                return new StartParams[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    while (readInt != 0) {
                        arrayList.add(parcel.readString());
                        readInt--;
                    }
                } else {
                    arrayList = null;
                }
                return new StartParams(readString, readString2, arrayList, parcel.readString());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/miniprogram/tnc/TncDetailMiniProgramActivity$Companion;", "", "()V", "EXTRA_START_PARAMS", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void init() {
        /*
            r7 = this;
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r1 = "startParams"
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            id.dana.miniprogram.tnc.TncDetailMiniProgramActivity$StartParams r0 = (id.dana.miniprogram.tnc.TncDetailMiniProgramActivity.StartParams) r0
            r7.getMax = r0
            java.lang.String r1 = "params"
            if (r0 != 0) goto L_0x0018
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0018:
            java.lang.String r0 = r0.setMax
            r2 = r7
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            o.setHorizontalGap r2 = com.bumptech.glide.Glide.setMin((androidx.fragment.app.FragmentActivity) r2)
            o.updateCornerMarking r2 = (o.updateCornerMarking) r2
            o.updateMessageMenuItem r0 = r2.setMax((java.lang.String) r0)
            r2 = 2131231373(0x7f08028d, float:1.8078825E38)
            o.updateMessageMenuItem r0 = r0.setMax((int) r2)
            o.updateMessageMenuItem r0 = r0.setMin((int) r2)
            o.evaluate r2 = o.evaluate.setMin
            o.updateMessageMenuItem r0 = r0.setMax((o.evaluate) r2)
            int r2 = o.resetInternal.setMax.onSupportActionModeStarted
            android.view.View r2 = r7._$_findCachedViewById(r2)
            androidx.appcompat.widget.AppCompatImageView r2 = (androidx.appcompat.widget.AppCompatImageView) r2
            r0.length((android.widget.ImageView) r2)
            int r0 = o.resetInternal.setMax.setWeightSum
            android.view.View r0 = r7._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r2 = "tvContentTitle"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r2 = 2131889058(0x7f120ba2, float:1.9412769E38)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            id.dana.miniprogram.tnc.TncDetailMiniProgramActivity$StartParams r5 = r7.getMax
            if (r5 != 0) goto L_0x005d
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x005d:
            java.lang.String r5 = r5.getMin
            r6 = 0
            r4[r6] = r5
            java.lang.String r2 = r7.getString(r2, r4)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            id.dana.miniprogram.tnc.TncDetailMiniProgramActivity$StartParams r0 = r7.getMax
            if (r0 != 0) goto L_0x0072
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0072:
            java.util.ArrayList<java.lang.String> r0 = r0.setMin
            if (r0 == 0) goto L_0x009c
            int r2 = o.resetInternal.setMax.setMenuPrepared
            android.view.View r2 = r7._$_findCachedViewById(r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            java.lang.String r4 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            androidx.recyclerview.widget.LinearLayoutManager r4 = new androidx.recyclerview.widget.LinearLayoutManager
            r5 = r7
            android.content.Context r5 = (android.content.Context) r5
            r4.<init>(r5)
            androidx.recyclerview.widget.RecyclerView$IsOverlapping r4 = (androidx.recyclerview.widget.RecyclerView.IsOverlapping) r4
            r2.setLayoutManager(r4)
            o.GriverUniformDialogExtension r4 = new o.GriverUniformDialogExtension
            java.util.List r0 = (java.util.List) r0
            r4.<init>((java.util.List<java.lang.String>) r0)
            androidx.recyclerview.widget.RecyclerView$Adapter r4 = (androidx.recyclerview.widget.RecyclerView.Adapter) r4
            r2.setAdapter(r4)
        L_0x009c:
            int r0 = o.resetInternal.setMax.touchAnimateTo
            android.view.View r0 = r7._$_findCachedViewById(r0)
            id.dana.richview.WebProgressView r0 = (id.dana.richview.WebProgressView) r0
            id.dana.miniprogram.tnc.TncDetailMiniProgramActivity$StartParams r2 = r7.getMax
            if (r2 != 0) goto L_0x00ab
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00ab:
            java.lang.String r2 = r2.length
            if (r2 == 0) goto L_0x00ca
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x00b9
            r2 = 1
            goto L_0x00ba
        L_0x00b9:
            r2 = 0
        L_0x00ba:
            if (r2 != r3) goto L_0x00ca
            r2 = 0
            id.dana.miniprogram.tnc.TncDetailMiniProgramActivity$StartParams r4 = r7.getMax
            if (r4 != 0) goto L_0x00c4
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00c4:
            java.lang.String r4 = r4.length
            r0.loadDataWithBaseUrl(r2, r4)
            goto L_0x00d3
        L_0x00ca:
            java.lang.String r2 = "/m/standalone/tnc"
            java.lang.String r2 = o.isShowMenu.setMin(r2)
            r0.loadUrl(r2)
        L_0x00d3:
            r0.setScrollbarFadingEnabled(r6)
            int r0 = o.resetInternal.setMax.hashCode
            android.view.View r0 = r7._$_findCachedViewById(r0)
            id.dana.component.buttoncomponent.DanaButtonPrimaryView r0 = (id.dana.component.buttoncomponent.DanaButtonPrimaryView) r0
            id.dana.miniprogram.tnc.TncDetailMiniProgramActivity$getMax r2 = new id.dana.miniprogram.tnc.TncDetailMiniProgramActivity$getMax
            r2.<init>(r7)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r0.setOnClickListener(r2)
            int r0 = o.resetInternal.setMax.valueOf
            android.view.View r0 = r7._$_findCachedViewById(r0)
            id.dana.component.buttoncomponent.DanaButtonGhostView r0 = (id.dana.component.buttoncomponent.DanaButtonGhostView) r0
            id.dana.miniprogram.tnc.TncDetailMiniProgramActivity$setMin r2 = new id.dana.miniprogram.tnc.TncDetailMiniProgramActivity$setMin
            r2.<init>(r7)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r0.setOnClickListener(r2)
            int r0 = o.resetInternal.setMax.setAllowCollapse
            android.view.View r0 = r7._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r2 = "tvHeaderTnc"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            id.dana.miniprogram.tnc.TncDetailMiniProgramActivity$StartParams r2 = r7.getMax
            if (r2 != 0) goto L_0x010e
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x010e:
            java.lang.String r2 = r2.length
            if (r2 == 0) goto L_0x0127
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x011b
            r6 = 1
        L_0x011b:
            if (r6 != r3) goto L_0x0127
            id.dana.miniprogram.tnc.TncDetailMiniProgramActivity$StartParams r2 = r7.getMax
            if (r2 != 0) goto L_0x0124
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0124:
            java.lang.String r1 = r2.getMin
            goto L_0x012e
        L_0x0127:
            r1 = 2131889061(0x7f120ba5, float:1.9412775E38)
            java.lang.String r1 = r7.getString(r1)
        L_0x012e:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.miniprogram.tnc.TncDetailMiniProgramActivity.init():void");
    }
}
