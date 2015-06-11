
package mbeans;

import entities.Account;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import sessions.AccountFacade;

@ManagedBean
@RequestScoped
public class AccountBean {

    @EJB
    AccountFacade facade;

    public AccountFacade getFacade() {
        return facade;
    }

    public void setFacade(AccountFacade facade) {
        this.facade = facade;
    }
    
    private Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
    public AccountBean() {
        account = new Account();
    }
    
    public String actionMethod(){
        facade.openAccount(account.getOwnername(), account.getBalance());
        return "response";
    }
}
