package o;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BaseGriverRpcRequest;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/miniprogram/interactor/GetMiniPrograms;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/miniprogram/model/MiniProgram;", "Lid/dana/domain/core/usecase/NoParams;", "repository", "Lid/dana/domain/miniprogram/MiniProgramRepository;", "(Lid/dana/domain/miniprogram/MiniProgramRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class BaseGriverNetwork extends APWebChromeClient<List<? extends BaseGriverRpcRequest.DeviceInfo>, onReceivedIcon> {
    private final getFacade repository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lid/dana/domain/miniprogram/model/DeeplinkServiceEntity;", "", "variant", "", "value", "source", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "getValue", "getVariant", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public final class FacadeProcessor {
        @Nullable
        private final String source;
        @Nullable
        private final String value;
        @NotNull
        private final String variant;

        public static /* synthetic */ FacadeProcessor copy$default(FacadeProcessor facadeProcessor, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = facadeProcessor.variant;
            }
            if ((i & 2) != 0) {
                str2 = facadeProcessor.value;
            }
            if ((i & 4) != 0) {
                str3 = facadeProcessor.source;
            }
            return facadeProcessor.copy(str, str2, str3);
        }

        @NotNull
        public final String component1() {
            return this.variant;
        }

        @Nullable
        public final String component2() {
            return this.value;
        }

        @Nullable
        public final String component3() {
            return this.source;
        }

        @NotNull
        public final FacadeProcessor copy(@NotNull String str, @Nullable String str2, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(str, "variant");
            return new FacadeProcessor(str, str2, str3);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FacadeProcessor)) {
                return false;
            }
            FacadeProcessor facadeProcessor = (FacadeProcessor) obj;
            return Intrinsics.areEqual((Object) this.variant, (Object) facadeProcessor.variant) && Intrinsics.areEqual((Object) this.value, (Object) facadeProcessor.value) && Intrinsics.areEqual((Object) this.source, (Object) facadeProcessor.source);
        }

        public final int hashCode() {
            String str = this.variant;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.value;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.source;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("DeeplinkServiceEntity(variant=");
            sb.append(this.variant);
            sb.append(", value=");
            sb.append(this.value);
            sb.append(", source=");
            sb.append(this.source);
            sb.append(")");
            return sb.toString();
        }

        public FacadeProcessor(@NotNull String str, @Nullable String str2, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(str, "variant");
            this.variant = str;
            this.value = str2;
            this.source = str3;
        }

        @NotNull
        public final String getVariant() {
            return this.variant;
        }

        @Nullable
        public final String getValue() {
            return this.value;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FacadeProcessor(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        @Nullable
        public final String getSource() {
            return this.source;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public BaseGriverNetwork(@NotNull getFacade getfacade) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getfacade, "repository");
        this.repository = getfacade;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<BaseGriverRpcRequest.DeviceInfo>> buildUseCase(@NotNull onReceivedIcon onreceivedicon) {
        Intrinsics.checkNotNullParameter(onreceivedicon, "params");
        return this.repository.getMiniPrograms();
    }
}
