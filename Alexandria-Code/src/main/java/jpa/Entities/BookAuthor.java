package jpa.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="books_authors")
public class BookAuthor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private int id;

    @Basic(optional = false)
    @Column(name = "book_id")
    private int bookId;

    @Basic(optional = false)
    @Column(name = "author_id")
    private int authorId;

    public BookAuthor(int id, int bookId, int authorId){
        this.id = id;
        this.bookId = bookId;
        this.authorId = authorId;
    }

    public BookAuthor(int bookId, int authorId){
        this.bookId = bookId;
        this.authorId = authorId;
    }
}
