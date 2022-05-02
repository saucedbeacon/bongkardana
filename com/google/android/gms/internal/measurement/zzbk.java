package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzbk extends zzaw {
    protected zzbk() {
        this.zza.add(zzbl.ASSIGN);
        this.zza.add(zzbl.CONST);
        this.zza.add(zzbl.CREATE_ARRAY);
        this.zza.add(zzbl.CREATE_OBJECT);
        this.zza.add(zzbl.EXPRESSION_LIST);
        this.zza.add(zzbl.GET);
        this.zza.add(zzbl.GET_INDEX);
        this.zza.add(zzbl.GET_PROPERTY);
        this.zza.add(zzbl.NULL);
        this.zza.add(zzbl.SET_PROPERTY);
        this.zza.add(zzbl.TYPEOF);
        this.zza.add(zzbl.UNDEFINED);
        this.zza.add(zzbl.VAR);
    }

    public final zzap zza(String str, zzg zzg, List<zzap> list) {
        String str2;
        zzbl zzbl = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        int i = 0;
        if (ordinal == 3) {
            zzh.zza(zzbl.ASSIGN.name(), 2, list);
            zzap zza = zzg.zza(list.get(0));
            if (!(zza instanceof zzat)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", new Object[]{zza.getClass().getCanonicalName()}));
            } else if (zzg.zzd(zza.zzc())) {
                zzap zza2 = zzg.zza(list.get(1));
                zzg.zze(zza.zzc(), zza2);
                return zza2;
            } else {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", new Object[]{zza.zzc()}));
            }
        } else if (ordinal == 14) {
            zzh.zzb(zzbl.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                int i2 = 0;
                while (i2 < list.size() - 1) {
                    zzap zza3 = zzg.zza(list.get(i2));
                    if (zza3 instanceof zzat) {
                        zzg.zzg(zza3.zzc(), zzg.zza(list.get(i2 + 1)));
                        i2 += 2;
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", new Object[]{zza3.getClass().getCanonicalName()}));
                    }
                }
                return zzap.zzf;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
        } else if (ordinal == 24) {
            zzh.zzb(zzbl.EXPRESSION_LIST.name(), 1, list);
            zzap zzap = zzap.zzf;
            while (i < list.size()) {
                zzap = zzg.zza(list.get(i));
                if (!(zzap instanceof zzag)) {
                    i++;
                } else {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
            }
            return zzap;
        } else if (ordinal == 33) {
            zzh.zza(zzbl.GET.name(), 1, list);
            zzap zza4 = zzg.zza(list.get(0));
            if (zza4 instanceof zzat) {
                return zzg.zzh(zza4.zzc());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", new Object[]{zza4.getClass().getCanonicalName()}));
        } else if (ordinal == 49) {
            zzh.zza(zzbl.NULL.name(), 0, list);
            return zzap.zzg;
        } else if (ordinal == 58) {
            zzh.zza(zzbl.SET_PROPERTY.name(), 3, list);
            zzap zza5 = zzg.zza(list.get(0));
            zzap zza6 = zzg.zza(list.get(1));
            zzap zza7 = zzg.zza(list.get(2));
            if (zza5 == zzap.zzf || zza5 == zzap.zzg) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", new Object[]{zza6.zzc(), zza5.zzc()}));
            }
            if ((zza5 instanceof zzae) && (zza6 instanceof zzah)) {
                ((zzae) zza5).zzn(zza6.zzd().intValue(), zza7);
            } else if (zza5 instanceof zzal) {
                ((zzal) zza5).zzm(zza6.zzc(), zza7);
            }
            return zza7;
        } else if (ordinal != 17) {
            if (ordinal != 18) {
                if (ordinal == 35 || ordinal == 36) {
                    zzh.zza(zzbl.GET_PROPERTY.name(), 2, list);
                    zzap zza8 = zzg.zza(list.get(0));
                    zzap zza9 = zzg.zza(list.get(1));
                    if ((zza8 instanceof zzae) && zzh.zzd(zza9)) {
                        return ((zzae) zza8).zzl(zza9.zzd().intValue());
                    }
                    if (zza8 instanceof zzal) {
                        return ((zzal) zza8).zzk(zza9.zzc());
                    }
                    if (zza8 instanceof zzat) {
                        if ("length".equals(zza9.zzc())) {
                            return new zzah(Double.valueOf((double) zza8.zzc().length()));
                        }
                        if (zzh.zzd(zza9) && zza9.zzd().doubleValue() < ((double) zza8.zzc().length())) {
                            return new zzat(String.valueOf(zza8.zzc().charAt(zza9.zzd().intValue())));
                        }
                    }
                    return zzap.zzf;
                }
                switch (ordinal) {
                    case 62:
                        zzh.zza(zzbl.TYPEOF.name(), 1, list);
                        zzap zza10 = zzg.zza(list.get(0));
                        if (zza10 instanceof zzau) {
                            str2 = "undefined";
                        } else if (zza10 instanceof zzaf) {
                            str2 = "boolean";
                        } else if (zza10 instanceof zzah) {
                            str2 = "number";
                        } else if (zza10 instanceof zzat) {
                            str2 = "string";
                        } else if (zza10 instanceof zzao) {
                            str2 = "function";
                        } else if ((zza10 instanceof zzaq) || (zza10 instanceof zzag)) {
                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[]{zza10}));
                        } else {
                            str2 = "object";
                        }
                        return new zzat(str2);
                    case 63:
                        zzh.zza(zzbl.UNDEFINED.name(), 0, list);
                        return zzap.zzf;
                    case 64:
                        zzh.zzb(zzbl.VAR.name(), 1, list);
                        for (zzap zza11 : list) {
                            zzap zza12 = zzg.zza(zza11);
                            if (zza12 instanceof zzat) {
                                zzg.zzf(zza12.zzc(), zzap.zzf);
                            } else {
                                throw new IllegalArgumentException(String.format("Expected string for var name. got %s", new Object[]{zza12.getClass().getCanonicalName()}));
                            }
                        }
                        return zzap.zzf;
                    default:
                        return super.zzb(str);
                }
            } else if (list.isEmpty()) {
                return new zzam();
            } else {
                if (list.size() % 2 == 0) {
                    zzam zzam = new zzam();
                    while (i < list.size() - 1) {
                        zzap zza13 = zzg.zza(list.get(i));
                        zzap zza14 = zzg.zza(list.get(i + 1));
                        if ((zza13 instanceof zzag) || (zza14 instanceof zzag)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        zzam.zzm(zza13.zzc(), zza14);
                        i += 2;
                    }
                    return zzam;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
            }
        } else if (list.isEmpty()) {
            return new zzae();
        } else {
            zzae zzae = new zzae();
            for (zzap zza15 : list) {
                zzap zza16 = zzg.zza(zza15);
                if (!(zza16 instanceof zzag)) {
                    zzae.zzn(i, zza16);
                    i++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return zzae;
        }
    }
}
