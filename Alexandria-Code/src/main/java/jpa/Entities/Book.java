package jpa.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="books")
//@NamedQueries({
//        @NamedQuery(name="books.findByName", query = "SELECT a FROM category a where a.name = :name")
//})
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    int id;

    @Basic(optional = false)
    @Column(name = "title")
    String title;

    @Basic(optional = true)
    @Column(name = "subtitle")
    String subtitle;

    @Basic(optional = true)
    @Column(name = "series")
    String series;

    @Basic(optional = false)
    @Column(name = "pages")
    int pages;

    @Basic(optional = false)
    @Column(name = "publisher")
    String publisher;

    @Basic(optional = false)
    @Column(name = "year_of_publication")
    int yearOfPublication;

    public Book(String title, String subtitle, String series, int pages, String publisher, int yearOfPublication){
        this.title = title;
        this.subtitle = subtitle;
        this.series = series;
        this.pages = pages;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
    }
}
