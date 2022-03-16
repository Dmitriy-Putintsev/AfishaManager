package ru.netology.manager;

import ru.netology.domain.Afisha;

public class Manager {
    private Afisha[] films;
    private int filmsNumber;

    //------- метод для добавления элементов в массив из любого места программы------

    public void addFilm(Afisha film) {
        Afisha[] collection = new Afisha[films.length + 1];
        System.arraycopy(films, 0, collection, 0, films.length);
        collection[collection.length - 1] = film;
        films = collection;
    }

    //------------- конструктор с задаваемым параметром------
    public Manager(int filmsNumber) {
        this.filmsNumber = filmsNumber;
        this.films = new Afisha[0];
    }

    // ---------конструктор без параметра, он вызывает конструктор с параметром по умолчанию-------
    public Manager() {
        this(10);
    }
    //  ------------------создание массива и заполнение ячеек и передаю менеджеру в массив новые фильмы----------------

//        Manager manager = new Manager(10);
//        manager.addFilm(new Afisha(1, "Один дома", "jpg", "comedy", true));
//        manager.addFilm(new Afisha(2, "Драйв", "jpg", "action", true));
//        manager.addFilm(new Afisha(3, "Достучаться до небес", "jpg", "drama", true));
//        manager.addFilm(new Afisha(4, "Отель", "jpg", "comedy", false));
//        manager.addFilm(new Afisha(5, "Битва за Москву", "jpg", "military drama", true));
//        manager.addFilm(new Afisha(6, "В августе 44-го", "jpg", "military drama", false));
//        manager.addFilm(new Afisha(7, "Интерстеллар", "jpg", "action", true));
//        manager.addFilm(new Afisha(8, "Матрица", "jpg", "action", true));
//        manager.addFilm(new Afisha(9, "Безумный Макс", "jpg", " action ", true));
//        manager.addFilm(new Afisha(10, "Поезд на Юму", "jpg", "western", false));
//
//
//// ------------добавление в массив элемента с помощью создания нового массива-------------
//        Afisha afisha = new Afisha(11, "2012", "jpg", "fantastic", false);
//        manager.addFilm(afisha);
//
//    }

    // --------- Выводим все фильмы в обратном порядке---------------------------
    public Afisha[] showAll() {
        int resultLength;
        if (films.length > filmsNumber) {
            resultLength = filmsNumber;
        } else {
            resultLength = films.length;
        }
        Afisha[] result = new Afisha[resultLength];

        for (int i = 0; i < resultLength; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    //--------------- Выводим любой фильм по индексу из массива---------------
    public Afisha getAfisha(int index) {
        Afisha result = null;
        if (index >= 0 && index < films.length) {
            result = films[index];
        }
        return result;
    }

    public int getFilmsNumber() {
        return filmsNumber;
    }

    public int getFilmQuantity() {
        return films.length;
    }

}


