package myapp.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column (name = "id")
    private int id;
    @Column (name = "name")
    private String name;
    @Column (name = "lastname")
    private String lastname;
    @Column (name = "dateofbirth")
    private String dateofbirth;
    @Column (name = "login")
    private String login;
    @Column (name = "password")
    private String password;
    @Column (name = "other")
    private String other;
    @Column(name = "address")
    private String address;

    public User(){}

    public User(String name, String lastname, String dateofbirth, String login,
               String password, String other, String address ){
//        this.id = id ;
        this.name = name;
        this.lastname = lastname;
        this.dateofbirth = dateofbirth;
        this.login = login;
        this.password = password;
        this.other = other;
        this.address = address;
    }

    @Override
    public String toString() {
        return "models.User{" +
                "id=" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastname=" + lastname +
                ", dateofbirth='" + dateofbirth + '\'' +
                ", login=" + login +
                ", password='" + password + '\'' +
                ", other=" + other + '\'' +
                ", address=" + address +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
