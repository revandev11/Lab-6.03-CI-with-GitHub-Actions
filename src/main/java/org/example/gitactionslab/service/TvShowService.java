package org.example.gitactionslab.service;

import org.example.gitactionslab.model.TvShow;
import org.example.gitactionslab.repository.TvShowRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TvShowService {
    private final TvShowRepository tvShowRepository;

    public TvShowService(TvShowRepository tvShowRepository) {
        this.tvShowRepository = tvShowRepository;
    }
    public List<TvShow> getAllShows(){
return tvShowRepository.findAll();
    }
}
