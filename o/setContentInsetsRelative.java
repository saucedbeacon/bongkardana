package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\n\u0018\u0000 e2\u00020\u0001:\u0001eB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bB\u000f\b\u0002\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010C\u001a\u00020DH\u0002J&\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020G2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010G2\b\b\u0002\u0010I\u001a\u00020,H\u0007J\u0018\u0010J\u001a\u00020D2\u0006\u0010I\u001a\u00020,2\u0006\u0010K\u001a\u00020LH\u0002J\u0018\u0010M\u001a\u00020D2\u0006\u0010I\u001a\u00020,2\u0006\u0010K\u001a\u00020LH\u0002J\u0018\u0010N\u001a\u00020D2\u0006\u0010I\u001a\u00020,2\u0006\u0010K\u001a\u00020LH\u0002J\u0018\u0010O\u001a\u00020D2\u0006\u0010I\u001a\u00020,2\u0006\u0010K\u001a\u00020LH\u0002J\u000e\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020GJ \u0010S\u001a\u00020D2\u0006\u0010I\u001a\u00020,2\u0006\u0010T\u001a\u00020,2\b\u0010U\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010V\u001a\u00020D2\u0006\u0010W\u001a\u00020\u0005J\u000e\u0010X\u001a\u00020D2\u0006\u0010Y\u001a\u00020\u0005J+\u0010Z\u001a\u00020D2\b\b\u0002\u0010I\u001a\u00020,2\u0012\u0010[\u001a\n\u0012\u0006\b\u0001\u0012\u00020G0\\\"\u00020GH\u0007¢\u0006\u0002\u0010]J\u0012\u0010^\u001a\u00020D2\b\b\u0002\u0010I\u001a\u00020,H\u0007J\b\u0010_\u001a\u00020DH\u0007J&\u0010`\u001a\u00020D2\b\b\u0002\u0010I\u001a\u00020,2\b\b\u0002\u0010a\u001a\u00020\u001a2\b\b\u0002\u0010b\u001a\u00020\u001aH\u0007J\u0010\u0010c\u001a\u00020Q2\u0006\u0010d\u001a\u00020LH\u0002R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001c8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020,@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00102\u001a\u00020,2\u0006\u0010+\u001a\u00020,@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R$\u00105\u001a\u00020,2\u0006\u0010+\u001a\u00020,@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010/\"\u0004\b7\u00101R$\u00108\u001a\u00020,2\u0006\u0010+\u001a\u00020,@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010/\"\u0004\b:\u00101R\u0014\u0010;\u001a\u00020\u001c8CX\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u001eR\u001c\u0010=\u001a\u0004\u0018\u00010>X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006f"}, d2 = {"Lcom/anggrayudi/storage/SimpleStorage;", "", "activity", "Landroid/app/Activity;", "savedState", "Landroid/os/Bundle;", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "Landroidx/activity/ComponentActivity;", "(Landroidx/activity/ComponentActivity;Landroid/os/Bundle;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)V", "wrapper", "Lcom/anggrayudi/storage/ComponentWrapper;", "(Lcom/anggrayudi/storage/ComponentWrapper;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "createFileCallback", "Lcom/anggrayudi/storage/callback/CreateFileCallback;", "getCreateFileCallback", "()Lcom/anggrayudi/storage/callback/CreateFileCallback;", "setCreateFileCallback", "(Lcom/anggrayudi/storage/callback/CreateFileCallback;)V", "expectedStorageTypeForAccessRequest", "Lcom/anggrayudi/storage/file/StorageType;", "externalStorageRootAccessIntent", "Landroid/content/Intent;", "getExternalStorageRootAccessIntent", "()Landroid/content/Intent;", "filePickerCallback", "Lcom/anggrayudi/storage/callback/FilePickerCallback;", "getFilePickerCallback", "()Lcom/anggrayudi/storage/callback/FilePickerCallback;", "setFilePickerCallback", "(Lcom/anggrayudi/storage/callback/FilePickerCallback;)V", "folderPickerCallback", "Lcom/anggrayudi/storage/callback/FolderPickerCallback;", "getFolderPickerCallback", "()Lcom/anggrayudi/storage/callback/FolderPickerCallback;", "setFolderPickerCallback", "(Lcom/anggrayudi/storage/callback/FolderPickerCallback;)V", "value", "", "requestCodeCreateFile", "getRequestCodeCreateFile", "()I", "setRequestCodeCreateFile", "(I)V", "requestCodeFilePicker", "getRequestCodeFilePicker", "setRequestCodeFilePicker", "requestCodeFolderPicker", "getRequestCodeFolderPicker", "setRequestCodeFolderPicker", "requestCodeStorageAccess", "getRequestCodeStorageAccess", "setRequestCodeStorageAccess", "sdCardRootAccessIntent", "getSdCardRootAccessIntent", "storageAccessCallback", "Lcom/anggrayudi/storage/callback/StorageAccessCallback;", "getStorageAccessCallback", "()Lcom/anggrayudi/storage/callback/StorageAccessCallback;", "setStorageAccessCallback", "(Lcom/anggrayudi/storage/callback/StorageAccessCallback;)V", "checkRequestCode", "", "createFile", "mimeType", "", "fileName", "requestCode", "handleActivityResultForCreateFile", "uri", "Landroid/net/Uri;", "handleActivityResultForFilePicker", "handleActivityResultForFolderPicker", "handleActivityResultForStorageAccess", "isStorageAccessGranted", "", "storageId", "onActivityResult", "resultCode", "data", "onRestoreInstanceState", "savedInstanceState", "onSaveInstanceState", "outState", "openFilePicker", "filterMimeTypes", "", "(I[Ljava/lang/String;)V", "openFolderPicker", "requestFullStorageAccess", "requestStorageAccess", "initialRootPath", "expectedStorageType", "saveUriPermission", "root", "Companion", "storage_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setContentInsetsRelative {
    @NotNull
    public static final setMax length = new setMax((byte) 0);

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\"\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u0014H\u0007J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000b8GX\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00048FX\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00148FX\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0013\u0010\u0016¨\u0006\""}, d2 = {"Lcom/anggrayudi/storage/SimpleStorage$Companion;", "", "()V", "KEY_EXPECTED_STORAGE_TYPE_FOR_ACCESS_REQUEST", "", "KEY_REQUEST_CODE_CREATE_FILE", "KEY_REQUEST_CODE_FILE_PICKER", "KEY_REQUEST_CODE_FOLDER_PICKER", "KEY_REQUEST_CODE_FRAGMENT_PICKER", "KEY_REQUEST_CODE_STORAGE_ACCESS", "defaultExternalStorageIntent", "Landroid/content/Intent;", "getDefaultExternalStorageIntent$annotations", "getDefaultExternalStorageIntent", "()Landroid/content/Intent;", "externalStoragePath", "getExternalStoragePath$annotations", "getExternalStoragePath", "()Ljava/lang/String;", "isSdCardPresent", "", "isSdCardPresent$annotations", "()Z", "cleanupRedundantUriPermissions", "", "context", "Landroid/content/Context;", "hasFullDiskAccess", "storageId", "hasStorageAccess", "fullPath", "requiresWriteAccess", "hasStoragePermission", "hasStorageReadPermission", "storage_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class setMax {
        public /* synthetic */ setMax(byte b) {
            this();
        }

        private setMax() {
        }

        @JvmStatic
        public static boolean getMax(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            return IntRange.length(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0 && setMin(context);
        }

        @JvmStatic
        private static boolean setMin(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            return IntRange.length(context, "android.permission.READ_EXTERNAL_STORAGE") == 0;
        }
    }
}