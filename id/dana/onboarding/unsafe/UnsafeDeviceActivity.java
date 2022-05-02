package id.dana.onboarding.unsafe;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.myprofile.EasterEggActivity;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.cancelAll;
import o.dispatchOnCancelled;
import o.message;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0002J:\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lid/dana/onboarding/unsafe/UnsafeDeviceActivity;", "Lid/dana/base/BaseActivity;", "()V", "quickTapListener", "Lid/dana/danah5/easteregg/QuickTap;", "getLayout", "", "init", "", "initOnClickListener", "initView", "onBackPressed", "quickTapEasterEgg", "setupTextsAndImage", "title", "", "description", "imageTitle", "imageDescription", "footer", "image", "Landroid/graphics/drawable/Drawable;", "Companion", "UnsafeStatus", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class UnsafeDeviceActivity extends BaseActivity {
    @NotNull
    public static final setMin Companion = new setMin((byte) 0);
    @NotNull
    public static final String EGG_MESSAGE = "egg_message";
    @NotNull
    public static final String UNSAFE_STATUS = "unsafe_status";
    private HashMap getMin;
    /* access modifiers changed from: private */
    public final message setMax;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.getMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 32);
            onCancelLoad.setMax(-566023152, oncanceled);
            onCancelLoad.getMin(-566023152, oncanceled);
        }
        if (this.getMin == null) {
            this.getMin = new HashMap();
        }
        View view = (View) this.getMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_unsafe_device;
    }

    public UnsafeDeviceActivity() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1516847004, oncanceled);
            onCancelLoad.getMin(-1516847004, oncanceled);
        }
        this.setMax = new message(2000, 5, new getMin(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onQuickTap"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements message.getMin {
        final /* synthetic */ UnsafeDeviceActivity setMax;

        getMin(UnsafeDeviceActivity unsafeDeviceActivity) {
            this.setMax = unsafeDeviceActivity;
        }

        public final void onQuickTap() {
            try {
                Intent intent = new Intent(this.setMax, EasterEggActivity.class);
                Intent intent2 = this.setMax.getIntent();
                Intrinsics.checkNotNullExpressionValue(intent2, IpcMessageConstants.EXTRA_INTENT);
                Bundle extras = intent2.getExtras();
                intent.putExtra("egg_message", extras != null ? extras.getString("egg_message") : null);
                this.setMax.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ UnsafeDeviceActivity getMin;

        getMax(UnsafeDeviceActivity unsafeDeviceActivity) {
            this.getMin = unsafeDeviceActivity;
        }

        public final void onClick(View view) {
            this.getMin.finishAffinity();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ UnsafeDeviceActivity getMax;

        length(UnsafeDeviceActivity unsafeDeviceActivity) {
            this.getMax = unsafeDeviceActivity;
        }

        public final void onClick(View view) {
            this.getMax.setMax.process();
        }
    }

    private final void getMin(String str, String str2, String str3, String str4, String str5, Drawable drawable) {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setThreshold);
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.isLandscapeMode);
        if (textView2 != null) {
            textView2.setText(str2);
        }
        TextView textView3 = (TextView) _$_findCachedViewById(resetInternal.setMax.replaceText);
        if (textView3 != null) {
            textView3.setText(str3);
        }
        TextView textView4 = (TextView) _$_findCachedViewById(resetInternal.setMax.isEmpty);
        if (textView4 != null) {
            textView4.setText(str4);
        }
        TextView textView5 = (TextView) _$_findCachedViewById(resetInternal.setMax.forceSuggestionQuery);
        if (textView5 != null) {
            textView5.setText(str5);
        }
        ImageView imageView = (ImageView) _$_findCachedViewById(resetInternal.setMax.openOptionsMenu);
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public final void onBackPressed() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1296204875, oncanceled);
            onCancelLoad.getMin(-1296204875, oncanceled);
        }
        finishAffinity();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/onboarding/unsafe/UnsafeDeviceActivity$Companion;", "", "()V", "EGG_MESSAGE", "", "UNSAFE_STATUS", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lid/dana/onboarding/unsafe/UnsafeDeviceActivity$UnsafeStatus;", "", "status", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "invoke", "ROOTED", "TAMPERED", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public enum UnsafeStatus {
        ROOTED("Rooted"),
        TAMPERED("Tampered");
        
        @NotNull
        private final String status;

        private UnsafeStatus(String str) {
            this.status = str;
        }

        @NotNull
        public final String getStatus() {
            return this.status;
        }

        @NotNull
        public final String invoke() {
            return this.status;
        }
    }

    public final void init() {
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
        Bundle extras = intent.getExtras();
        if (Intrinsics.areEqual((Object) extras != null ? extras.getString(UNSAFE_STATUS) : null, (Object) UnsafeStatus.ROOTED.invoke())) {
            String string = getString(R.string.unsafe_device_rooted_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.unsafe_device_rooted_title)");
            String string2 = getString(R.string.unsafe_device_rooted_description);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.unsaf…evice_rooted_description)");
            String string3 = getString(R.string.unsafe_device_rooted_image_title);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.unsaf…evice_rooted_image_title)");
            String string4 = getString(R.string.unsafe_device_rooted_image_description);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.unsaf…rooted_image_description)");
            String string5 = getString(R.string.unsafe_device_rooted_footer);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.unsafe_device_rooted_footer)");
            getMin(string, string2, string3, string4, string5, cancelAll.getMin(this, R.drawable.ic_rooted_device));
        } else {
            String string6 = getString(R.string.unsafe_device_tamper_title);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.unsafe_device_tamper_title)");
            String string7 = getString(R.string.unsafe_device_tamper_description);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.unsaf…evice_tamper_description)");
            String string8 = getString(R.string.unsafe_device_tamper_image_title);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(R.string.unsaf…evice_tamper_image_title)");
            String string9 = getString(R.string.unsafe_device_tamper_image_description);
            Intrinsics.checkNotNullExpressionValue(string9, "getString(R.string.unsaf…tamper_image_description)");
            String string10 = getString(R.string.unsafe_device_tamper_footer);
            Intrinsics.checkNotNullExpressionValue(string10, "getString(R.string.unsafe_device_tamper_footer)");
            getMin(string6, string7, string8, string9, string10, cancelAll.getMin(this, R.drawable.ic_tampered_device));
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.setCaptioningEnabled);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new getMax(this));
        }
        ImageView imageView = (ImageView) _$_findCachedViewById(resetInternal.setMax.openOptionsMenu);
        if (imageView != null) {
            imageView.setOnClickListener(new length(this));
        }
    }
}
