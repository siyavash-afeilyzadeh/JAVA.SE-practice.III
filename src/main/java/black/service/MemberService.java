package black.service;

import black.model.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberService {
    public static List<Member> members = new ArrayList<>();

    public void saveMember(Member member) {
        members.add(member);
        System.out.println("Member Successfully Registered!");
    }

    public void printMemberList() {
        System.out.println(members);
    }

    public void countMemberList() {
        System.out.println(members.toArray().length);
    }

    public static Member findByName(String name) {
        for (Member member : members) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    public static Member findByID(int id) {
        for (Member member : members) {
            if (member.getId() == id) {
                return member;
            }
        }
        return null;
    }
}
