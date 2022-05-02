package id.dana.domain.social;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lid/dana/domain/social/ModifyRelationOperationType;", "", "operationType", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getOperationType", "()Ljava/lang/String;", "BLOCK", "UNBLOCK", "MUTE", "UNMUTE", "domain_release"}, k = 1, mv = {1, 4, 2})
public enum ModifyRelationOperationType {
    BLOCK("BLOCK"),
    UNBLOCK("UNBLOCK"),
    MUTE("MUTE"),
    UNMUTE("UNMUTE");
    
    @NotNull
    private final String operationType;

    private ModifyRelationOperationType(String str) {
        this.operationType = str;
    }

    @NotNull
    public final String getOperationType() {
        return this.operationType;
    }
}
