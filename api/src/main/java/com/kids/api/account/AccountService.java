package com.kids.api.account;

import java.util.List;

public interface AccountService<T extends User> {
    T login(T request);
    
    int add(T object);

    long delete(T request);

    T detail(int kidId);

    List<T> getKidsByParentId(int parentId);

    boolean updateToken(int id, String token);
    
    public String getTokenById(int id);
}
