package o;

import android.content.ContentResolver;
import android.content.Context;
import o.b;

public final class H5AuthParamsModel implements getAdapterPosition<getAuthContentResult> {
    private final b.C0007b<ContentResolver> contentResolverProvider;
    private final b.C0007b<Context> contextProvider;

    public H5AuthParamsModel(b.C0007b<Context> bVar, b.C0007b<ContentResolver> bVar2) {
        this.contextProvider = bVar;
        this.contentResolverProvider = bVar2;
    }

    public final getAuthContentResult get() {
        return newInstance(this.contextProvider.get(), this.contentResolverProvider.get());
    }

    public static H5AuthParamsModel create(b.C0007b<Context> bVar, b.C0007b<ContentResolver> bVar2) {
        return new H5AuthParamsModel(bVar, bVar2);
    }

    public static getAuthContentResult newInstance(Context context, ContentResolver contentResolver) {
        return new getAuthContentResult(context, contentResolver);
    }
}
