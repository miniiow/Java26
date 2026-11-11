package bank.account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountMapDao implements AccountDao{
	
	Map<String, Account> accountDB = new HashMap<String, Account>();
	
	@Override
	public boolean save(Account a) {
		accountDB.put(a.getMemberId(), a);
		return true;
	}

	@Override
	public List<Account> findAll() {
		if(!accountDB.isEmpty()) {
			List<Account> alist = new ArrayList<Account>();
			for(Account a : accountDB.values()) {
				alist.add(a);
			}
			return alist;
		}
		return null;
	}

	@Override
	public Account findByNo(int no) {
		return accountDB.get(no);
	}

	@Override
	public List<Account> findByMember(String id) {
		if(!accountDB.isEmpty()) {
			List<Account> alist = new ArrayList<Account>();
			for(Account a : accountDB.values()) {
				alist.add(a);
			}
			return alist;
		}
		return null;
	}

	@Override
	public boolean update(Account a) {
		accountDB.put(a.getMemberId(), a);
		return true;
	}

	@Override
	public boolean delete(Account a) {
		accountDB.remove(a.getMemberId());
		return false;
	}
	
}
