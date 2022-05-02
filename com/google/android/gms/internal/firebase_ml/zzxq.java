package com.google.android.gms.internal.firebase_ml;

final class zzxq {
    static String zzh(zztq zztq) {
        zzxp zzxp = new zzxp(zztq);
        StringBuilder sb = new StringBuilder(zzxp.size());
        for (int i = 0; i < zzxp.size(); i++) {
            byte zzcq = zzxp.zzcq(i);
            if (zzcq == 34) {
                sb.append("\\\"");
            } else if (zzcq == 39) {
                sb.append("\\'");
            } else if (zzcq != 92) {
                switch (zzcq) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (zzcq >= 32 && zzcq <= 126) {
                            sb.append((char) zzcq);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((zzcq >>> 6) & 3) + 48));
                            sb.append((char) (((zzcq >>> 3) & 7) + 48));
                            sb.append((char) ((zzcq & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
