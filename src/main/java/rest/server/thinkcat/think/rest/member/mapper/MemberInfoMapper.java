package rest.server.thinkcat.think.rest.member.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import rest.server.thinkcat.think.rest.member.pojo.MemberInfo;
import rest.server.thinkcat.think.rest.member.pojo.MemberInfoExample;

public interface MemberInfoMapper {
    long countByExample(MemberInfoExample example);

    int deleteByExample(MemberInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MemberInfo record);

    int insertSelective(MemberInfo record);

    List<MemberInfo> selectByExample(MemberInfoExample example);

    MemberInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MemberInfo record, @Param("example") MemberInfoExample example);

    int updateByExample(@Param("record") MemberInfo record, @Param("example") MemberInfoExample example);

    int updateByPrimaryKeySelective(MemberInfo record);

    int updateByPrimaryKey(MemberInfo record);
}