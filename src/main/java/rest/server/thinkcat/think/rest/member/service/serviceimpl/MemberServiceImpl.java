package rest.server.thinkcat.think.rest.member.service.serviceimpl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.server.thinkcat.think.rest.member.mapper.MemberInfoMapper;
import rest.server.thinkcat.think.rest.member.pojo.MemberInfo;
import rest.server.thinkcat.think.rest.member.pojo.MemberInfoExample;
import rest.server.thinkcat.think.rest.member.service.MemberService;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberInfoMapper memberInfoMapper;

    @Override
    public List<MemberInfo> findAll(int pageNum,int pageSize) {
        MemberInfoExample memberInfoExample=new MemberInfoExample();
        MemberInfoExample.Criteria criteria = memberInfoExample.createCriteria();
        PageHelper.startPage(pageNum, pageSize);
        Page<MemberInfo> page=   (Page<MemberInfo>) memberInfoMapper.selectByExample(memberInfoExample);
        return page.getResult();
    }
}
