package o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;

@RequiresApi(21)
class createButton extends superDispatchKeyEvent {
    private Context length;
    private Uri setMax;

    createButton(@Nullable superDispatchKeyEvent superdispatchkeyevent, Context context, Uri uri) {
        super(superdispatchkeyevent);
        this.length = context;
        this.setMax = uri;
    }

    @Nullable
    public superDispatchKeyEvent getMax(String str, String str2) {
        Uri length2 = length(this.length, this.setMax, str, str2);
        if (length2 != null) {
            return new createButton(this, this.length, length2);
        }
        return null;
    }

    @Nullable
    private static Uri length(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public superDispatchKeyEvent getMin(String str) {
        Uri length2 = length(this.length, this.setMax, "vnd.android.document/directory", str);
        if (length2 != null) {
            return new createButton(this, this.length, length2);
        }
        return null;
    }

    public Uri setMin() {
        return this.setMax;
    }

    @Nullable
    public String getMin() {
        return setupDialog.getMin(this.length, this.setMax);
    }

    @Nullable
    public String getMax() {
        return setupDialog.setMin(this.length, this.setMax);
    }

    public boolean setMax() {
        return setupDialog.setMax(this.length, this.setMax);
    }

    public boolean toFloatRange() {
        return setupDialog.getMax(this.length, this.setMax);
    }

    public boolean IsOverlapping() {
        return setupDialog.length(this.length, this.setMax);
    }

    public boolean isInside() {
        return setupDialog.equals(this.length, this.setMax);
    }

    public boolean equals() {
        try {
            return DocumentsContract.deleteDocument(this.length.getContentResolver(), this.setMax);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean toIntRange() {
        return setupDialog.IsOverlapping(this.length, this.setMax);
    }

    public superDispatchKeyEvent[] FastBitmap$CoordinateSystem() {
        ContentResolver contentResolver = this.length.getContentResolver();
        Uri uri = this.setMax;
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, (String) null, (String[]) null, (String) null);
            while (cursor.moveToNext()) {
                arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.setMax, cursor.getString(0)));
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            setMax((AutoCloseable) null);
            throw th;
        }
        setMax((AutoCloseable) cursor);
        Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
        superDispatchKeyEvent[] superdispatchkeyeventArr = new superDispatchKeyEvent[uriArr.length];
        for (int i = 0; i < uriArr.length; i++) {
            superdispatchkeyeventArr[i] = new createButton(this, this.length, uriArr[i]);
        }
        return superdispatchkeyeventArr;
    }

    private static void setMax(@Nullable AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public boolean setMax(String str) {
        try {
            Uri renameDocument = DocumentsContract.renameDocument(this.length.getContentResolver(), this.setMax, str);
            if (renameDocument != null) {
                this.setMax = renameDocument;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
