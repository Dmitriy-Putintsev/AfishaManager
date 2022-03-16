//package ru.netology.manager;
//
//import ru.netology.domain.Afisha;
//
//public class AfishaManager {
//    Afisha[] films;
//    int filmsNumber;
//
//    // конструктор с параметром
//    public AfishaManager(int filmsNumber) {
//        this.filmsNumber = filmsNumber;
//        this.films = new Afisha[filmsNumber];
//        fillAfisha();
//    }
//
//    // конструктор без параметра, он вызывает конструктор с параметром
//    public AfishaManager() {
//        this(10);
//    }
//
//    // заполнение в цикле массива афиш произвольными данными
//    private void fillAfisha() {
//        for (int i = 0; i < filmsNumber; i++) {
//            Afisha afisha = new Afisha(i, "Cinema" + i, "jpg", "genre" + i, true);
//            this.films[i] = afisha;
//        }
//    }
//
//    // ----------Добавление в массив, путем создания нового массива------------
//    private void addAfisha(Afisha afisha) {
//        Afisha[] collection = new Afisha[films.length + 1];
//        for (int i = 0; i < films.length; i++) {
//            collection[i] = films[i];
//        }
//        collection[collection.length - 1] = afisha;
//        films = collection;
//        filmsNumber = collection.length;
//    }
//
//    public int getAfishaNumber() {
//        return filmsNumber;
//    }
//
//    //--------- Вывод элементов из массива в обратном порядке--------
//    public Afisha[] showAll() {
//
//        int resultLength;
//        if (filmsNumber > 10) {
//            resultLength = 10;
//        } else {
//            resultLength = filmsNumber;
//        }
//        Afisha[] result = new Afisha[resultLength];
//
//        for (int i = 0; i < resultLength; i++) {
//            int index = resultLength - i - 1;
//            result[i] = films[index];
//        }
//        return result;
//    }
//
//    public Afisha[] getSeveralFilms() {
//        Afisha[] result = new Afisha[filmsNumber];
//        Afisha[] tmp = showAll();
//        System.arraycopy(tmp, 0, result, 0, filmsNumber);
//        return result;
//    }
//
//    public void printAfisha(Afisha[] films) {
//        for (int i = 0; i < films.length; i++) {
//            System.out.println(films[i].toString());
//        }
//    }
//
//    public static void main(String[] args) {
//        AfishaManager managerN = new AfishaManager(5);
//        Afisha[] result = managerN.showAll();
//        managerN.printAfisha(result);
//
//        Afisha afisha1 = new Afisha(5, "sasdasd", "jpg", "ssss", true);
//        managerN.addAfisha(afisha1);
//        result = managerN.showAll();
//        managerN.printAfisha(result);

//        Afisha afisha1 = new Afisha(1,"sasdasd","jpg","ssss",true);
        //       managerN.addAfisha(afisha1);
//        Afisha[] films = new Afisha[10];
//        films[0]=new Afisha(1, "Один дома", "jpg", "comedy", true);
//        films[0]=new Afisha(2, "Драйв", "jpg", "action", true);
//        films[0]=new Afisha(3, "Достучаться до небес", "jpg", "comedy", true);
//        films[0]=new Afisha(4, "Отель", "jpg", "comedy", true);
//        films[0]=new Afisha(5, "Битва за Москву", "jpg", "comedy", true);
//        films[0]=new Afisha(6, "В августе 44-го", "jpg", "comedy", true);
//        films[0]=new Afisha(7, "Интерстеллар", "jpg", "comedy", true);
//        films[0]=new Afisha(8, "Матрица", "jpg", "comedy", true);
//        films[0]=new Afisha(9, "Безумный Макс", "jpg", "comedy", true);
//    }
//
////        String[] afisha = {
////                "Один дома",
////                "Драйв",
////                "Достучаться до небес",
////                "Отель",
////                "Битва за Москву",
////                "В августе 44-го",
////                "Интерстеллар",
////                "Матрица",
////                "Безумный Макс",
////                "Поезд на Юму"
////        };
////        String newFilm = "2012";
////
////        String[] collection = new String[afisha.length + 1];
////        for (int i = 0; i < afisha.length; i++) {
////            collection[i] = afisha[i];
////        }
////        collection[collection.length - 1] = newFilm;
////    }
//
//}
