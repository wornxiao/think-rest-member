package rest.server.thinkcat.think.rest.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import rest.server.thinkcat.think.rest.member.pojo.MemberInfo;
import rest.server.thinkcat.think.rest.member.service.MemberService;

import java.util.List;

@RestController
@RequestMapping(value = "admin/")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("list")
    @ResponseBody
    public Object list(@RequestParam(value = "pageNum") int pageNum, @RequestParam(value = "pageSize")int pageSize){
        List<MemberInfo> all = memberService.findAll(pageNum,pageSize);
        return all;
    }
}
