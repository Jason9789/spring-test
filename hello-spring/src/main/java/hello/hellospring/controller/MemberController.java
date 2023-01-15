package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    // 생성자를 통해서 주입하는 것이 요즘 방식.
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
