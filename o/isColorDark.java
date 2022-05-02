package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import kotlin.Metadata;
import o.b;
import o.resolveFloat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class isColorDark implements getAdapterPosition<dimenPx> {
    private final b.C0007b<resolveInt> mockFaceAuthenticationEntityDataProvider;
    private final b.C0007b<resolveFloat.Cdefault> networkFaceAuthenticationEntityDataProvider;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/data/auth/face/repository/source/network/FaceAuthenticationFacade;", "", "switch", "Lid/dana/data/auth/face/repository/source/result/FaceAuthenticationEntityResult;", "faceAuthenticationRequest", "Lid/dana/data/auth/face/repository/source/request/FaceAuthenticationEntityRequest;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.isColorDark$default  reason: invalid class name */
    public interface Cdefault {
        @OperationType("alipayplus.mobilewallet.user.face.authentication.switch")
        @NotNull
        @SignCheck
        /* renamed from: switch  reason: not valid java name */
        textChanged m1325switch(@Nullable additionalPaddingForFont additionalpaddingforfont);
    }

    public isColorDark(b.C0007b<resolveFloat.Cdefault> bVar, b.C0007b<resolveInt> bVar2) {
        this.networkFaceAuthenticationEntityDataProvider = bVar;
        this.mockFaceAuthenticationEntityDataProvider = bVar2;
    }

    public final dimenPx get() {
        return newInstance(this.networkFaceAuthenticationEntityDataProvider.get(), this.mockFaceAuthenticationEntityDataProvider.get());
    }

    public static isColorDark create(b.C0007b<resolveFloat.Cdefault> bVar, b.C0007b<resolveInt> bVar2) {
        return new isColorDark(bVar, bVar2);
    }

    public static dimenPx newInstance(resolveFloat.Cdefault defaultR, resolveInt resolveint) {
        return new dimenPx(defaultR, resolveint);
    }
}
