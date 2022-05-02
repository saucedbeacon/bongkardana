package com.alipayplus.mobile.component.domain.model.user;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class UserInfo implements Serializable {
    public String avatarUrl;
    public String birthday;
    public boolean certified;
    public String certifiedLevel;
    public Map<String, Classification> classifications;
    public List<String> emails;
    public String firstName;
    public String gender;
    public String job;
    public String language;
    public String lastName;
    public List<LoginInfo> loginIdInfos;
    public String middleName;
    public List<String> mobileNos;
    public String nationality;
    public String nickname;
    public Date registeredTime;
    public String userId;
    public String userStatus;
}
