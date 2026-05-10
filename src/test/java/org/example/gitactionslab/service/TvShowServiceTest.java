package org.example.gitactionslab.service;

import org.example.gitactionslab.model.TvShow;
import org.example.gitactionslab.repository.TvShowRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TvShowServiceTest {

    @Mock
    private TvShowRepository tvShowRepository;

    @InjectMocks
    private TvShowService tvShowService;

    @Test
    void getAllTvShows_returnsAllShows() {
        List<TvShow> shows = List.of(
                new TvShow("One Piece", "Adventure", 2023, 8.4),
                new TvShow("House of the Dragon", "Fantasy", 2022, 8.4)
        );
        when(tvShowRepository.findAll()).thenReturn(shows);

        List<TvShow> result = tvShowService.getAllShows();

        assertEquals(2, result.size());
        assertEquals("One Piece", result.get(0).getTitle());
        assertEquals("House of the Dragon", result.get(1).getTitle());
    }

    @Test
    void getAllTvShows_returnsEmptyList_whenNoShows() {
        when(tvShowRepository.findAll()).thenReturn(List.of());

        List<TvShow> result = tvShowService.getAllShows();

        assertEquals(0, result.size());
    }
}