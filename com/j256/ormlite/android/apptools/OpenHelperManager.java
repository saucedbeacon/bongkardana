package com.j256.ormlite.android.apptools;

import android.content.Context;
import android.content.res.Resources;
import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class OpenHelperManager {
    private static final String HELPER_CLASS_RESOURCE_NAME = "open_helper_classname";
    private static volatile OrmLiteSqliteOpenHelper helper = null;
    private static Class<? extends OrmLiteSqliteOpenHelper> helperClass = null;
    private static int instanceCount = 0;
    private static Logger logger = LoggerFactory.getLogger((Class<?>) OpenHelperManager.class);
    private static boolean wasClosed = false;

    public static synchronized void setOpenHelperClass(Class<? extends OrmLiteSqliteOpenHelper> cls) {
        synchronized (OpenHelperManager.class) {
            if (cls == null) {
                helperClass = null;
            } else {
                innerSetHelperClass(cls);
            }
        }
    }

    public static synchronized void setHelper(OrmLiteSqliteOpenHelper ormLiteSqliteOpenHelper) {
        synchronized (OpenHelperManager.class) {
            helper = ormLiteSqliteOpenHelper;
        }
    }

    public static synchronized <T extends OrmLiteSqliteOpenHelper> T getHelper(Context context, Class<T> cls) {
        T loadHelper;
        synchronized (OpenHelperManager.class) {
            if (cls != null) {
                innerSetHelperClass(cls);
                loadHelper = loadHelper(context, cls);
            } else {
                throw new IllegalArgumentException("openHelperClass argument is null");
            }
        }
        return loadHelper;
    }

    @Deprecated
    public static synchronized OrmLiteSqliteOpenHelper getHelper(Context context) {
        OrmLiteSqliteOpenHelper loadHelper;
        synchronized (OpenHelperManager.class) {
            if (helperClass == null) {
                if (context != null) {
                    innerSetHelperClass(lookupHelperClass(context.getApplicationContext(), context.getClass()));
                } else {
                    throw new IllegalArgumentException("context argument is null");
                }
            }
            loadHelper = loadHelper(context, helperClass);
        }
        return loadHelper;
    }

    public static synchronized void releaseHelper() {
        synchronized (OpenHelperManager.class) {
            instanceCount--;
            logger.trace("releasing helper {}, instance count = {}", (Object) helper, (Object) Integer.valueOf(instanceCount));
            if (instanceCount <= 0) {
                if (helper != null) {
                    logger.trace("zero instances, closing helper {}", (Object) helper);
                    helper.close();
                    helper = null;
                    wasClosed = true;
                }
                if (instanceCount < 0) {
                    logger.error("too many calls to release helper, instance count = {}", (Object) Integer.valueOf(instanceCount));
                }
            }
        }
    }

    private static void innerSetHelperClass(Class<? extends OrmLiteSqliteOpenHelper> cls) {
        if (cls != null) {
            Class<? extends OrmLiteSqliteOpenHelper> cls2 = helperClass;
            if (cls2 == null) {
                helperClass = cls;
            } else if (cls2 != cls) {
                StringBuilder sb = new StringBuilder("Helper class was ");
                sb.append(helperClass);
                sb.append(" but is trying to be reset to ");
                sb.append(cls);
                throw new IllegalStateException(sb.toString());
            }
        } else {
            throw new IllegalStateException("Helper class was trying to be reset to null");
        }
    }

    private static <T extends OrmLiteSqliteOpenHelper> T loadHelper(Context context, Class<T> cls) {
        if (helper == null) {
            if (wasClosed) {
                logger.info("helper was already closed and is being re-opened");
            }
            if (context != null) {
                helper = constructHelper(context.getApplicationContext(), cls);
                logger.trace("zero instances, created helper {}", (Object) helper);
                BaseDaoImpl.clearAllInternalObjectCaches();
                DaoManager.clearDaoCache();
                instanceCount = 0;
            } else {
                throw new IllegalArgumentException("context argument is null");
            }
        }
        instanceCount++;
        logger.trace("returning helper {}, instance count = {} ", (Object) helper, (Object) Integer.valueOf(instanceCount));
        return helper;
    }

    private static OrmLiteSqliteOpenHelper constructHelper(Context context, Class<? extends OrmLiteSqliteOpenHelper> cls) {
        try {
            try {
                return (OrmLiteSqliteOpenHelper) cls.getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            } catch (Exception e) {
                throw new IllegalStateException("Could not construct instance of helper class ".concat(String.valueOf(cls)), e);
            }
        } catch (Exception e2) {
            throw new IllegalStateException("Could not find public constructor that has a single (Context) argument for helper class ".concat(String.valueOf(cls)), e2);
        }
    }

    private static Class<? extends OrmLiteSqliteOpenHelper> lookupHelperClass(Context context, Class<?> cls) {
        Type[] actualTypeArguments;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(HELPER_CLASS_RESOURCE_NAME, "string", context.getPackageName());
        if (identifier != 0) {
            String string = resources.getString(identifier);
            try {
                return Class.forName(string);
            } catch (Exception e) {
                throw new IllegalStateException("Could not create helper instance for class ".concat(String.valueOf(string)), e);
            }
        } else {
            for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                Type genericSuperclass = cls2.getGenericSuperclass();
                if (!(genericSuperclass == null || !(genericSuperclass instanceof ParameterizedType) || (actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments()) == null || actualTypeArguments.length == 0)) {
                    for (Type type : actualTypeArguments) {
                        if (type instanceof Class) {
                            Class<? extends OrmLiteSqliteOpenHelper> cls3 = (Class) type;
                            if (OrmLiteSqliteOpenHelper.class.isAssignableFrom(cls3)) {
                                return cls3;
                            }
                        }
                    }
                    continue;
                }
            }
            StringBuilder sb = new StringBuilder("Could not find OpenHelperClass because none of the generic parameters of class ");
            sb.append(cls);
            sb.append(" extends OrmLiteSqliteOpenHelper.  You should use getHelper(Context, Class) instead.");
            throw new IllegalStateException(sb.toString());
        }
    }
}
