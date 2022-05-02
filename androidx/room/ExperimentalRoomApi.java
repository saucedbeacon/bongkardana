package androidx.room;

import androidx.annotation.RequiresOptIn;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@RequiresOptIn
@Target({ElementType.METHOD})
public @interface ExperimentalRoomApi {
}
