package ru.netology.afisha;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AfishaMoviestSecondTest_11 {
    private Afisha manager = new Afisha();
    private MovieItem first = new MovieItem(1, 1, "Номер один", "Комедия");
    private MovieItem second = new MovieItem(2, 2, "Тролли. Мировой тур", "Мультфильм");
    private MovieItem third = new MovieItem(3, 3, "Человек-невидимка", "Ужасы");
    private MovieItem fourth = new MovieItem(4, 4, "Джентльмены", "Боевик");
    private MovieItem fifth = new MovieItem(5, 5, "Отель Белград", "Комедия");
    private MovieItem sixth = new MovieItem(6, 6, "Вперед", "Мультфильм");
    private MovieItem seventh = new MovieItem(7, 7, "Бладшот", "Боевик");
    private MovieItem eighth = new MovieItem(8, 8, "Один дома", "Комедия");
    private MovieItem ninth = new MovieItem(9, 9, "Гарри Поттер и Тайная комната", "Фэнтези");
    private MovieItem tenth = new MovieItem(10, 10, "Бывшая", "Ужасы");
    private MovieItem eleventh = new MovieItem(11, 11, "Паровозик-Который-Смог", "Ужасы");

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
    }

    @Test
    public void fullListFilms() {
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[] {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }
}