package black.service;

import black.model.Member;

public class MemberServiceTest {
    public static void main(String[] args) {
        Member member1 = Member
                .builder()
                .id(1)
                .name("Siyavash")
                .family("Afeilyzadeh")
                .age(32)
                .build();
        Member member2 = Member
                .builder()
                .id(2)
                .name("Shiva")
                .family("Elahian")
                .age(16)
                .build();

        System.out.println(member1);
        System.out.println(member2);

        MemberService memberService = new MemberService();
        memberService.saveMember(member1);
        memberService.saveMember(member2);

        memberService.printMemberList();
        memberService.countMemberList();

        System.out.println(MemberService.findByName("Siyavash"));
        System.out.println(MemberService.findByName("Ali"));

        System.out.println(MemberService.findByID(2));
        System.out.println(MemberService.findByID(3));

    }
}
