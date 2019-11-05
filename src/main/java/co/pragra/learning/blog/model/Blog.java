package co.pragra.learning.blog.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@ToString
@Table(name = "blog")
@Entity
public class Blog {
    @Id
    private Long id;

    @ManyToOne(targetEntity = User.class, cascade = CascadeType.DETACH)
    private User author;

    @ManyToOne(targetEntity = Category.class,cascade = CascadeType.DETACH)
    private Category category;
    private String text;
    private Date createDate;
}
