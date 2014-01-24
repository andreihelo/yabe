package models;

import play.db.jpa.Model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by ahelo on 23/01/14.
 */
@Entity
@Table(name = "Users")
public class User extends Model {

    public String  email;
    public String  password;
    public String  fullName;
    public Boolean isAdmin;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    public List<Post> posts;

    public User(String email, String password, String fullName, Boolean isAdmin) {
        this.email    = email;
        this.password = password;
        this.fullName = fullName;
        this.isAdmin  = isAdmin;
    }

    @Override
    public String toString() {
        return fullName;
    }

}
