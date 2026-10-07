package test;

import java.util.List;

import bank.member.Member;
import bank.member.MemberDao;
import bank.member.MemberListDao;

public class TestMember {
	public static void main(String[] args) {
		testMemberDao();
	}
	
	public static void testMemberDao() {
		MemberDao mdao = new MemberListDao();
		// 회원 추가
		System.out.println(">>> 회원 추가");
		mdao.save(new Member("aaa", "1111", "유징징", null, null));
		mdao.save(new Member("miniiow", "1111", "미옹미옹", null, null));
		// 회원 모두 조회
		System.out.println(">>> 회원 목록");
		List<Member> mlist = mdao.findAll();
		// 회원 출력
		printMemberList(mlist);
		// id로 회원 조회
		System.out.println(">>> id로 회원 조회");
		Member m = mdao.findById("miniiow");
		System.out.println(m);
		
		System.out.println(">>> 비밀번호 변경");
		m.setPassword("1234");
		mdao.update(m);
		printMemberList(mdao.findAll());

		System.out.println(">>> 회원 삭제");
		mdao.delete(mdao.findById("miniiow"));
		printMemberList(mdao.findAll());
	}
	
	public static void printMemberList(List<Member> mlist) {
		for(Member m : mlist) {
			System.out.println(m);
		}
	}
}
