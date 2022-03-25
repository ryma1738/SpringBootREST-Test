package restfullApiTest.restTest.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
// @Table(name = "accountdb") // - Optionally change name of table
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private String password;
    private String email;
    private boolean notifications;

    public Account() {}

    public Account(String username, String password, String email, boolean notifications) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.notifications = notifications;
    }

    public long getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }

    public boolean getNotifyStatus() {
        return this.notifications;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNotification(boolean notify) {
        this.notifications = notify;
    }

}
