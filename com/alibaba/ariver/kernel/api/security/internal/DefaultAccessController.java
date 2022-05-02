package com.alibaba.ariver.kernel.api.security.internal;

import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.api.security.AccessControlException;
import com.alibaba.ariver.kernel.api.security.AccessControlManagement;
import com.alibaba.ariver.kernel.api.security.AccessController;
import com.alibaba.ariver.kernel.api.security.Accessor;
import com.alibaba.ariver.kernel.api.security.ApiPermissionCheckResult;
import com.alibaba.ariver.kernel.api.security.DefaultGroup;
import com.alibaba.ariver.kernel.api.security.Group;
import com.alibaba.ariver.kernel.api.security.Guard;
import com.alibaba.ariver.kernel.api.security.Inquirer;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DefaultAccessController implements AccessController {

    /* renamed from: a  reason: collision with root package name */
    private AccessControlManagement f9132a;

    public void setAccessControlManagement(AccessControlManagement accessControlManagement) {
        this.f9132a = accessControlManagement;
    }

    public boolean check(Accessor accessor, List<? extends Guard> list, @Nullable AccessController.ApplyCallback applyCallback) {
        String str;
        Group group = accessor.getGroup();
        AccessControlManagement accessControlManagement = this.f9132a;
        if (accessControlManagement == null || accessControlManagement.needPermissionCheck(accessor, list)) {
            AccessControlManagement accessControlManagement2 = this.f9132a;
            if (accessControlManagement2 != null) {
                group = accessControlManagement2.manageAccessorGroup(accessor);
            }
            ArrayList arrayList = new ArrayList();
            for (Guard guard : list) {
                Permission permit = guard.permit();
                if (permit != null) {
                    if (group == null) {
                        StringBuilder sb = new StringBuilder("the ");
                        sb.append(accessor);
                        sb.append(" not in any group.");
                        throw new AccessControlException(sb.toString());
                    } else if (a(permit, group)) {
                        StringBuilder sb2 = new StringBuilder("access");
                        sb2.append(accessor.hashCode());
                        sb2.append(" has group permission [");
                        sb2.append(permit.authority());
                        sb2.append("] ,group is [");
                        sb2.append(group.groupName());
                        sb2.append("]");
                        RVLogger.d("AriverKernel:Permission", sb2.toString());
                    } else {
                        ApiPermissionCheckResult permissionCheck = this.f9132a.permissionCheck(permit, accessor);
                        if (ApiPermissionCheckResult.IGNORE == permissionCheck || ApiPermissionCheckResult.ALLOW == permissionCheck) {
                            StringBuilder sb3 = new StringBuilder("access");
                            sb3.append(accessor.hashCode());
                            sb3.append(" has single permission [");
                            sb3.append(permit.authority());
                            sb3.append("]");
                            RVLogger.d("AriverKernel:Permission", sb3.toString());
                            if (this.f9132a.asyncPermissionCheck(permit, accessor)) {
                                arrayList.add(permit);
                            }
                        } else {
                            AccessControlManagement accessControlManagement3 = this.f9132a;
                            if (accessControlManagement3 != null && accessControlManagement3.bizPermissionCheck(permit, accessor)) {
                                StringBuilder sb4 = new StringBuilder("access");
                                sb4.append(accessor.hashCode());
                                sb4.append(" has custom permission [");
                                sb4.append(permit.authority());
                                sb4.append("]");
                                RVLogger.d("AriverKernel:Permission", sb4.toString());
                            } else if (permit instanceof Inquirer) {
                                arrayList.add(permit);
                            } else {
                                StringBuilder sb5 = new StringBuilder("access");
                                sb5.append(accessor.hashCode());
                                sb5.append(" no permission:");
                                sb5.append(permit.authority());
                                sb5.append(" when access ");
                                sb5.append(guard);
                                RVLogger.d("AriverKernel:Permission", sb5.toString());
                                if (permissionCheck == null || !permissionCheck.hasSignature()) {
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append(accessor);
                                    sb6.append(" no permission:");
                                    sb6.append(permit.authority());
                                    sb6.append(" when access ");
                                    sb6.append(guard);
                                    str = sb6.toString();
                                } else {
                                    str = permissionCheck.getSignature();
                                }
                                throw new AccessControlException(str);
                            }
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            a(accessor, arrayList, applyCallback);
            return true;
        }
        RVLogger.d("AriverKernel:Permission", "not need check permission");
        return false;
    }

    private boolean a(Permission permission, Group group) {
        if (group.groupName().equalsIgnoreCase(DefaultGroup.INTERNAL.groupName())) {
            return true;
        }
        Map<String, ? extends Permission> permissions = group.permissions();
        if (permissions == null || !permissions.containsKey(permission.authority())) {
            return false;
        }
        return true;
    }

    private void a(Accessor accessor, List<Permission> list, @Nullable final AccessController.ApplyCallback applyCallback) {
        accessor.inquiry(list, new Accessor.InquiryCallback() {
            public void onComplete(List<? extends Permission> list, List<? extends Permission> list2) {
                if (applyCallback == null) {
                    return;
                }
                if (list2 == null || list2.size() < 0) {
                    applyCallback.onSuccess();
                } else {
                    applyCallback.onFailure(list2);
                }
            }
        });
    }
}
