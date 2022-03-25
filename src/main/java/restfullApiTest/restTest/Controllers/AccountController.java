package restfullApiTest.restTest.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import restfullApiTest.restTest.Models.Account;
import restfullApiTest.restTest.Service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/")
    public List<Account> getAccounts() {
        return accountService.getAccounts();
    }

    @GetMapping("/account/{id}")
    public Account getAccount(@PathVariable long id) {
        
        return this.accountService.getAccount(id);
    }

    @PostMapping("/account")
    public Account postMethodName(@RequestBody Account account) {
        return this.accountService.addAccount(account);
    }

    @PutMapping("/account")
    public Account updateAccountRoute(@RequestBody Account account) {
        return this.accountService.updateAccount(account);
    }

    @DeleteMapping("/account/{id}")
    public String deleteAccountRoute(@PathVariable long id) {
        return this.accountService.deleteAccount(id);
    }
    
}
