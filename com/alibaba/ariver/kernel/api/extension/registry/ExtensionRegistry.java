package com.alibaba.ariver.kernel.api.extension.registry;

import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.extension.bridge.ActionMeta;
import com.alibaba.ariver.kernel.api.node.Scope;
import java.util.Collection;
import java.util.List;

public interface ExtensionRegistry {
    ActionMeta findActionMeta(String str);

    @Nullable
    Collection<Class<? extends Extension>> findExtensions(String str);

    int getActionCount();

    Class<? extends Extension> getExtensionClass(String str);

    Class<? extends Scope> getScope(Class<? extends Extension> cls);

    Class<? extends Scope> getScope(String str);

    void register(ExtensionMetaInfo extensionMetaInfo);

    void register(Plugin plugin);

    void register(Class<? extends Extension> cls);

    void register(Class<? extends Extension> cls, Class<? extends Scope> cls2);

    void unRegister(List<String> list);
}
