package ru.netology.afisha;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AfishaMoviestThirdTest_5 {
    private Afisha manager = new Afisha(10);
    private MovieItem first = new MovieItem(1, 1, "Номер один", "Комедия");
    private MovieItem second = new MovieItem(2, 2, "Тролли. Мировой тур", "Мультфильм");
    private MovieItem third = new MovieItem(3, 3, "Человек-невидимка", "Ужасы");
    private MovieItem fourth = new MovieItem(4, 4, "Джентльмены", "Боевик");
    private MovieItem fifth = new MovieItem(5, 5, "Отель Белград", "Комедия");


    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
    }

    @Test
    public void fullListFilms() {
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[] {fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }
}