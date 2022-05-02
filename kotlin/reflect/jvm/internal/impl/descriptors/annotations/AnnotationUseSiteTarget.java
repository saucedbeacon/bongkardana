package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import id.dana.lib.gcontainer.app.bridge.contact.ContactEventType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public enum AnnotationUseSiteTarget {
    FIELD((String) null, 1, (String) null),
    FILE((String) null, 1, (String) null),
    PROPERTY((String) null, 1, (String) null),
    PROPERTY_GETTER(ContactEventType.CONTACT_GET),
    PROPERTY_SETTER("set"),
    RECEIVER((String) null, 1, (String) null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");
    
    @NotNull
    private final String renderName;

    private AnnotationUseSiteTarget(String str) {
        if (str == null) {
            String name = name();
            if (name != null) {
                str = name.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.String).toLowerCase()");
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        this.renderName = str;
    }

    @NotNull
    public final String getRenderName() {
        return this.renderName;
    }
}
