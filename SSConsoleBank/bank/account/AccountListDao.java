package bank.account;

import java.util.ArrayList;
import java.util.List;

public class AccountListDao implements AccountDao {

    List<Account> accountDB = new ArrayList<>();

    @Override
    public boolean save(Account a) {
        return accountDB.add(a);
    }

    @Override
    public List<Account> findAll() {
        if (accountDB.size() == 0) return null;

        List<Account> accounts = new ArrayList<>();
        for (Account a : accountDB) {
            accounts.add(a);
        }
        return accounts;
    }

    @Override
    public Account findByNo(int no) {
        for (Account a : accountDB) {
            if (a.getNo() == no)
                return a;
        }
        return null;
    }

    @Override
    public boolean update(Account a) {
        if (a == null) return false;

        Account target = findByNo(a.getNo());
        if (target == null) return false;

        accountDB.remove(target);
        accountDB.add(a);
        return true;
    }

    @Override
    public boolean delete(Account a) {
        if (a == null) return false;

        Account target = findByNo(a.getNo());
        if (target == null) return false;

        return accountDB.remove(target);
    }
}
