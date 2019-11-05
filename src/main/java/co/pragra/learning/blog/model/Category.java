package co.pragra.learning.blog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "category")
@Entity
public class Category {
    @Id
    private Long id;
    private String name;
    private String description;
}
