package models;

import play.db.jpa.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by ahelo on 23/01/14.
 */
@Entity
@Table(name = "Posts")
public class Post extends Model {

    public String title;
    public Date   postedAt;

    @Lob
    public String content;
    @ManyToOne
    public User   author;
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    List<Comment> comments;

    public Post(String title, User author, String content) {
        this.title    = title;
        this.postedAt = new Date();
        this.author   = author;
        this.content  = content;
    }

}
