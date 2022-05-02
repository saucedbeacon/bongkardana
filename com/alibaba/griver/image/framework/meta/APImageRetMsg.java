package com.alibaba.griver.image.framework.meta;

public class APImageRetMsg {

    /* renamed from: a  reason: collision with root package name */
    private RETCODE f10474a;
    private String b;

    public RETCODE getCode() {
        return this.f10474a;
    }

    public void setCode(RETCODE retcode) {
        this.f10474a = retcode;
    }

    public String getMsg() {
        return this.b;
    }

    public void setMsg(String str) {
        this.b = str;
    }

    public enum RETCODE {
        SUC(0),
        CONNTIMEOUT(1),
        DNSTIMEOUT(2),
        STREAMERROR(3),
        COMPRESS_ERROR(4),
        PARAM_ERROR(5),
        INVALID_ACL(6),
        INVALID_TOKEN(7),
        GET_TOKEN_FAILED(8),
        NO_PRIVILEGE(9),
        INVALID_CODE(10),
        UPLOAD_ERROR(11),
        MD5_FAILED(12),
        STORE_FAILED(13),
        INVALID_DJANGO(14),
        INCONSISTENT_CHUNK_NUM(15),
        INCONSISTENT_SIZE(16),
        INVALID_APPKEY(17),
        FILE_IS_EXISTED(18),
        FILE_NOT_EXIST(19),
        DB_FAILED(20),
        CACHE_FAILED(21),
        TFS_READ_FAILED(22),
        TAIR_READ_FAILED(23),
        DOWNLOAD_FAILED(24),
        UNKNOWN_ERROR(25),
        CANCEL(26),
        REUSE(27),
        INVALID_NETWORK(28),
        SPACE_NOT_ENOUGH(29),
        ENCRYPT_FAILED(30),
        DECRYPT_FAILED(31),
        TIME_OUT(32),
        CURRENT_LIMIT(2000);
        
        int code;

        private RETCODE(int i) {
            this.code = i;
        }

        public final int value() {
            return this.code;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("APImageRetMsg{code=");
        sb.append(this.f10474a);
        sb.append(", msg='");
        sb.append(this.b);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
