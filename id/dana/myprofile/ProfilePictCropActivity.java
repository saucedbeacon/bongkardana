package id.dana.myprofile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.yalantis.ucrop.UCropActivity;
import id.dana.R;
import id.dana.base.BaseActivity;
import java.io.File;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.ConfirmPopup;
import o.IntRange;
import o.dispatchOnCancelled;
import o.isMeasurementUpToDate;
import o.onCancelLoad;
import o.onCanceled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\"\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u0012\u001a\u00020\u0004H\u0002J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u0016"}, d2 = {"Lid/dana/myprofile/ProfilePictCropActivity;", "Lid/dana/base/BaseActivity;", "()V", "cropImage", "", "sourceUri", "Landroid/net/Uri;", "getLayout", "", "getUcropOptions", "Lcom/yalantis/ucrop/UCrop$Options;", "handleUCropResult", "data", "Landroid/content/Intent;", "init", "onActivityResult", "requestCode", "resultCode", "setResultCancelled", "setResultOk", "croppedImageUri", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ProfilePictCropActivity extends BaseActivity {
    public static final int CROPPED_IMAGE_MAX_WIDTH_AND_HEIGHT = 1024;
    @NotNull
    public static final String CROPPED_IMAGE_NAME = "croppedImageAvatarDana.png";
    @NotNull
    public static final setMax Companion = new setMax((byte) 0);
    private HashMap setMax;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
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
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length))) {
            return R.layout.activity_profile_pict_crop;
        }
        onCanceled oncanceled = new onCanceled(length, min, 32);
        onCancelLoad.setMax(-557485780, oncanceled);
        onCancelLoad.getMin(-557485780, oncanceled);
        return R.layout.activity_profile_pict_crop;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/myprofile/ProfilePictCropActivity$Companion;", "", "()V", "CROPPED_IMAGE_MAX_WIDTH_AND_HEIGHT", "", "CROPPED_IMAGE_NAME", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public final void init() {
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
        Bundle extras = intent.getExtras();
        Uri parse = Uri.parse(extras != null ? extras.getString("data") : null);
        Intrinsics.checkNotNullExpressionValue(parse, "Uri.parse(path)");
        Context context = this;
        isMeasurementUpToDate ismeasurementuptodate = new isMeasurementUpToDate(parse, Uri.fromFile(new File(ConfirmPopup.AnonymousClass2.length(context), CROPPED_IMAGE_NAME)));
        isMeasurementUpToDate.setMin setmin = new isMeasurementUpToDate.setMin();
        setmin.setMin.putString("com.yalantis.ucrop.CompressionFormatName", Bitmap.CompressFormat.PNG.name());
        setmin.setMin.putInt("com.yalantis.ucrop.MaxSizeX", 1024);
        setmin.setMin.putInt("com.yalantis.ucrop.MaxSizeY", 1024);
        setmin.setMin.putInt("com.yalantis.ucrop.UcropColorWidgetActive", IntRange.setMax(context, R.color.f19022131099797));
        setmin.setMin.putInt("com.yalantis.ucrop.StatusBarColor", IntRange.setMax(context, R.color.f19022131099797));
        setmin.setMin.putInt("com.yalantis.ucrop.ToolbarColor", IntRange.setMax(context, R.color.f19022131099797));
        setmin.setMin.putInt("com.yalantis.ucrop.CropFrameColor", IntRange.setMax(context, R.color.f18942131099789));
        setmin.setMin.putFloat("com.yalantis.ucrop.AspectRatioX", 1.0f);
        setmin.setMin.putFloat("com.yalantis.ucrop.AspectRatioY", 1.0f);
        ismeasurementuptodate.setMin.putAll(setmin.setMin);
        Activity activity = this;
        ismeasurementuptodate.length.setClass(activity, UCropActivity.class);
        ismeasurementuptodate.length.putExtras(ismeasurementuptodate.setMin);
        activity.startActivityForResult(ismeasurementuptodate.length, 69);
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int length;
        int min;
        int min2;
        int max;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -991706981 == (max = dispatchOnCancelled.getMax(applicationContext, -991706981)))) {
            onCanceled oncanceled = new onCanceled(-991706981, max, 512);
            onCancelLoad.setMax(-991706981, oncanceled);
            onCancelLoad.getMin(-991706981, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || i == (min2 = dispatchOnCancelled.setMin(applicationContext2, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min2, 8);
            onCancelLoad.setMax(-991706981, oncanceled2);
            onCancelLoad.getMin(-991706981, oncanceled2);
        }
        super.onActivityResult(i, i2, intent);
        if (i == 69 && i2 == -1) {
            Context baseContext3 = getBaseContext();
            if (baseContext3 != null) {
                context = baseContext3.getApplicationContext();
            }
            if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
                onCanceled oncanceled3 = new onCanceled(length, min, 32);
                onCancelLoad.setMax(1222936192, oncanceled3);
                onCancelLoad.getMin(1222936192, oncanceled3);
            }
            if (intent == null) {
                setResult(0, new Intent());
                finish();
                return;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("croppedImageUri", String.valueOf((Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri")));
            setResult(-1, intent2);
            finish();
            return;
        }
        setResult(0, new Intent());
        finish();
    }
}
