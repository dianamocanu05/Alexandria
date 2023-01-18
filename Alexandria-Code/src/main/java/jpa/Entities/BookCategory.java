package jpa.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="books_categories")
public class BookCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private int id;

    @Basic(optional = false)
    @Column(name = "book_id")
    private int bookId;

    @Basic(optional = false)
    @Column(name = "category_id")
    private int categoryId;

    public BookCategory(int id, int bookId, int categoryId){
        this.id = id;
        this.bookId = bookId;
        this.categoryId = categoryId;
    }

}
