package restfullApiTest.restTest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restfullApiTest.restTest.Models.Account;
import restfullApiTest.restTest.Repository.AccountRepo;

@Service    
public class AccountService {

    @Autowired
    public AccountRepo accountRepo;

    public List<Account> getAccounts() {
        return this.accountRepo.findAll();
    }

    public Account getAccount(long id) {
        return this.accountRepo.getById(id);
    }

    public Account addAccount(Account account) {
        return this.accountRepo.save(account);
    }

    public Account updateAccount(Account account) {
        return this.accountRepo.save(account); // also updates
    }

    public String deleteAccount(long id) {
        this.accountRepo.deleteById(id);
        return "Account was deleted successfully!";
    }
    
}
