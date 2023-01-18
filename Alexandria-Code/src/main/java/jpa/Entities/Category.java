package jpa.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="categories")
@NamedQueries({
        @NamedQuery(name="category.findByName", query = "SELECT a FROM category a where a.name = :name")
})
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private int id;

    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public Category(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return getId() + " - " + getName();
    }

    @Override
    public boolean equals(Object other){
        if(this == other){
            return true;
        }
        if(! (other instanceof Category)){
            return false;
        }
        return (this.id == ((Category) other).getId());
    }
}
