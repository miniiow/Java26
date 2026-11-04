package bank.app;

import bank.account.AccountListDao;
import bank.account.AccountService;
import bank.account.YJAccountService;
import bank.app.menu.StartMenu;
import bank.member.MemberListDao;
import bank.member.MemberService;
import bank.member.YJMemberService;

public class YJConsoleBankApp {
	public static void main(String[] args) {
		MemberService ms = new YJMemberService(new MemberListDao());
		AccountService as = new YJAccountService(new AccountListDao());
		
		new StartMenu(as, ms).run();
	}
}
