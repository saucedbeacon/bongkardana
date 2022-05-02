package o;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

public final class setTransition extends enableTransition<InputStream> {
    private static final UriMatcher getMax;

    /* access modifiers changed from: protected */
    public final /* synthetic */ void length(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        getMax = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        getMax.addURI("com.android.contacts", "contacts/lookup/*", 1);
        getMax.addURI("com.android.contacts", "contacts/#/photo", 2);
        getMax.addURI("com.android.contacts", "contacts/#", 3);
        getMax.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        getMax.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public setTransition(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @NonNull
    public final Class<InputStream> setMax() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object getMin(android.net.Uri r4, android.content.ContentResolver r5) throws java.io.FileNotFoundException {
        /*
            r3 = this;
            android.content.UriMatcher r0 = getMax
            int r0 = r0.match(r4)
            r1 = 1
            if (r0 == r1) goto L_0x0019
            r2 = 3
            if (r0 == r2) goto L_0x0014
            r2 = 5
            if (r0 == r2) goto L_0x0019
            java.io.InputStream r5 = r5.openInputStream(r4)
            goto L_0x0023
        L_0x0014:
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r5, r4, r1)
            goto L_0x0023
        L_0x0019:
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.lookupContact(r5, r4)
            if (r0 == 0) goto L_0x0036
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r5, r0, r1)
        L_0x0023:
            if (r5 == 0) goto L_0x0026
            return r5
        L_0x0026:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "InputStream is null for "
            java.lang.String r4 = r0.concat(r4)
            r5.<init>(r4)
            throw r5
        L_0x0036:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r5 = "Contact cannot be found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTransition.getMin(android.net.Uri, android.content.ContentResolver):java.lang.Object");
    }
}
