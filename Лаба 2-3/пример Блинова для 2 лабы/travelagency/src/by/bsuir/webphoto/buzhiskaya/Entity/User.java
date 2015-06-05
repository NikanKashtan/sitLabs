package by.bsuir.webphoto.buzhiskaya.Entity;

/**
 * Created by Veronika on 24.03.2015.
 */
public class User {
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User(String userName, String firstName, String lastName,
                String email, String password)
    {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){ return true;}
        if (o == null || getClass() != o.getClass()){ return false;}

        User user = (User) o;

        if (!email.equals(user.email)){ return false;}
        if (!firstName.equals(user.firstName)){ return false;}
        if (!lastName.equals(user.lastName)){ return false;}
        if (!password.equals(user.password)){ return false;}
        if (!userName.equals(user.userName)){ return false;}

        return true;
    }

    @Override
    public int hashCode() {
        int result = userName.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
