package models;

import play.db.jpa.Model;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by ahelo on 23/01/14.
 */
@Entity
@Table(name = "Comments")
public class Comment extends Model {

    public String author;
    public Date postedAt;

    @Lob
    public String content;
    @ManyToOne
    public Post post;

    public Comment(String author, String content, Post post) {
        this.author   = author;
        this.content  = content;
        this.post     = post;
        this.postedAt = new Date();
    }

}
