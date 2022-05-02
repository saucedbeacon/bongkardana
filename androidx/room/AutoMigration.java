package androidx.room;

import androidx.annotation.RestrictTo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@Retention(RetentionPolicy.CLASS)
public @interface AutoMigration {
    int from();

    int to();
}
