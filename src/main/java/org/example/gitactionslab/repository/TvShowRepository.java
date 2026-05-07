package org.example.gitactionslab.repository;

import org.example.gitactionslab.model.TvShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TvShowRepository extends JpaRepository<TvShow,Long> {
}
