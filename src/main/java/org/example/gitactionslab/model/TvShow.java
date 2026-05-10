package org.example.gitactionslab.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tv_shows")
public class TvShow {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
private String genre;
    @Column(name = "release_year")
    private int releaseYear;
private double rating;



}
