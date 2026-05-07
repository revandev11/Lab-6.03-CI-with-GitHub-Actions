package org.example.gitactionslab.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TvShow {
private String title;
private String genre;
private int relase_year;
private double rating;



}
