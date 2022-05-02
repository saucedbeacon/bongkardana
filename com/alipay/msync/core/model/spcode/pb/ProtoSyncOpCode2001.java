package com.alipay.msync.core.model.spcode.pb;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ProtoSyncOpCode2001 extends Message {
    public static final List<ProtoBizSyncData> DEFAULT_BIZ_SYNC_DATA = Collections.emptyList();
    public static final Boolean DEFAULT_HAS_MORE_DATA = Boolean.FALSE;
    public static final Boolean DEFAULT_NOT_CHECK_PRINCIPAL = Boolean.FALSE;
    public static final String DEFAULT_PRINCIPAL_ID = "";
    public static final Integer DEFAULT_PRINCIPAL_ID_TYPE = 0;
    public static final Integer DEFAULT_SERVER_IP = 0;
    public static final int TAG_BIZ_SYNC_DATA = 3;
    public static final int TAG_HAS_MORE_DATA = 6;
    public static final int TAG_NOT_CHECK_PRINCIPAL = 4;
    public static final int TAG_PRINCIPAL_ID = 2;
    public static final int TAG_PRINCIPAL_ID_TYPE = 1;
    public static final int TAG_SERVER_IP = 5;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public List<ProtoBizSyncData> biz_sync_data;
    @ProtoField(tag = 6, type = Message.Datatype.BOOL)
    public Boolean has_more_data;
    @ProtoField(tag = 4, type = Message.Datatype.BOOL)
    public Boolean not_check_principal;
    @ProtoField(label = Message.Label.REQUIRED, tag = 2, type = Message.Datatype.STRING)
    public String principal_id;
    @ProtoField(label = Message.Label.REQUIRED, tag = 1, type = Message.Datatype.INT32)
    public Integer principal_id_type;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public Integer server_ip;

    public ProtoSyncOpCode2001(ProtoSyncOpCode2001 protoSyncOpCode2001) {
        super(protoSyncOpCode2001);
        if (protoSyncOpCode2001 != null) {
            this.principal_id_type = protoSyncOpCode2001.principal_id_type;
            this.principal_id = protoSyncOpCode2001.principal_id;
            this.biz_sync_data = copyOf(protoSyncOpCode2001.biz_sync_data);
            this.not_check_principal = protoSyncOpCode2001.not_check_principal;
            this.server_ip = protoSyncOpCode2001.server_ip;
            this.has_more_data = protoSyncOpCode2001.has_more_data;
        }
    }

    public ProtoSyncOpCode2001() {
    }

    public final ProtoSyncOpCode2001 fillTagValue(int i, Object obj) {
        switch (i) {
            case 1:
                this.principal_id_type = (Integer) obj;
                break;
            case 2:
                this.principal_id = (String) obj;
                break;
            case 3:
                this.biz_sync_data = immutableCopyOf((List) obj);
                break;
            case 4:
                this.not_check_principal = (Boolean) obj;
                break;
            case 5:
                this.server_ip = (Integer) obj;
                break;
            case 6:
                this.has_more_data = (Boolean) obj;
                break;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoSyncOpCode2001)) {
            return false;
        }
        ProtoSyncOpCode2001 protoSyncOpCode2001 = (ProtoSyncOpCode2001) obj;
        return equals((Object) this.principal_id_type, (Object) protoSyncOpCode2001.principal_id_type) && equals((Object) this.principal_id, (Object) protoSyncOpCode2001.principal_id) && equals((List<?>) this.biz_sync_data, (List<?>) protoSyncOpCode2001.biz_sync_data) && equals((Object) this.not_check_principal, (Object) protoSyncOpCode2001.not_check_principal) && equals((Object) this.server_ip, (Object) protoSyncOpCode2001.server_ip) && equals((Object) this.has_more_data, (Object) protoSyncOpCode2001.has_more_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        Integer num = this.principal_id_type;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 37;
        String str = this.principal_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        List<ProtoBizSyncData> list = this.biz_sync_data;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 1)) * 37;
        Boolean bool = this.not_check_principal;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 37;
        Integer num2 = this.server_ip;
        int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Boolean bool2 = this.has_more_data;
        if (bool2 != null) {
            i2 = bool2.hashCode();
        }
        int i3 = hashCode5 + i2;
        this.hashCode = i3;
        return i3;
    }
}
