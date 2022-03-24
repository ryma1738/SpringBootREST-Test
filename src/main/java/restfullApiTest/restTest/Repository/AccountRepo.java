package restfullApiTest.restTest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import restfullApiTest.restTest.Models.Account;

public interface AccountRepo extends JpaRepository<Account, Long> { 
    // JpaRepository<model you want, the type for the id of the model>
    
}
