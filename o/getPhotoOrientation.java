package o;

import kotlin.jvm.functions.Function1;

final class getPhotoOrientation implements Function1 {
    private final setIsPicCurrentlyTaked length;

    public getPhotoOrientation(setIsPicCurrentlyTaked setispiccurrentlytaked) {
        this.length = setispiccurrentlytaked;
    }

    public final Object invoke(Object obj) {
        return setIsPicCurrentlyTaked.length();
    }
}
