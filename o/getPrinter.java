package o;

import android.content.Context;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.LibraryVersionComponent;

public final class getPrinter implements ComponentFactory {
    private final String getMax;
    private final LibraryVersionComponent.VersionExtractor setMin;

    public getPrinter(String str, LibraryVersionComponent.VersionExtractor versionExtractor) {
        this.getMax = str;
        this.setMin = versionExtractor;
    }

    public final Object create(ComponentContainer componentContainer) {
        return LibraryVersion.create(this.getMax, this.setMin.extract((Context) componentContainer.get(Context.class)));
    }
}
