package rest.server.thinkcat.think.rest.member.service;

import rest.server.thinkcat.think.rest.member.pojo.MemberInfo;

import java.util.List;

public interface MemberService {
    public List<MemberInfo> findAll(int pageNum,int pageSize);
}
