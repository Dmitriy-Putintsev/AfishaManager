package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Afisha;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerTest {

    private Manager manager = new Manager();

    private Afisha first = new Afisha(1, "Один дома", "jpg", "comedy", true);
    private Afisha second = new Afisha(2, "Драйв", "jpg", "action", true);
    private Afisha third = new Afisha(3, "Достучаться до небес", "jpg", "drama", true);
    private Afisha fourth = new Afisha(4, "Отель", "jpg", "comedy", false);
    private Afisha fifth = new Afisha(5, "Битва за Москву", "jpg", "military drama", true);
    private Afisha sixth = new Afisha(6, "В августе 44-го", "jpg", "military drama", false);
    private Afisha seventh = new Afisha(7, "Интерстеллар", "jpg", "action", true);
    private Afisha eighth = new Afisha(8, "Матрица", "jpg", "action", true);
    private Afisha ninth = new Afisha(9, "Безумный Макс", "jpg", " action ", true);
    private Afisha tenth = new Afisha(10, "Поезд на Юму", "jpg", "western", false);

    void setUp() {
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
    }

    @Test
    public void shouldFindLastOver() {
        Manager manager = new Manager(9);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);


        Afisha[] expected = new Afisha[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        Afisha[] actual = manager.showAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastOver1() {
        Manager manager = new Manager(11);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);


        Afisha[] expected = new Afisha[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        Afisha[] actual = manager.showAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastOver2() {
        Manager manager = new Manager(12);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);

        Afisha[] expected = new Afisha[]{fifth, fourth, third, second, first};
        Afisha[] actual = manager.showAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastOver3() {
        Manager manager = new Manager(9);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);

        Afisha[] expected = new Afisha[]{seventh, sixth, fifth, fourth, third, second, first};
        Afisha[] actual = manager.showAll();

        assertArrayEquals(expected, actual);

    }

}
