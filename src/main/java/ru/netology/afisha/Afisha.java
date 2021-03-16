package ru.netology.afisha;

import lombok.NoArgsConstructor;
import ru.netology.domain.MovieItem;

@NoArgsConstructor
public class Afisha {
   private MovieItem[] items = new MovieItem[0];
   private int moviesLength = 10;

   public Afisha(int moviesLength) {
       this.moviesLength = moviesLength;
   }

   public void add(MovieItem item) {
       // проверяем, чтобы items был не длиннее moviesLength
       if (items.length == moviesLength) {
           return;
       }
       // создаем новый массив, на единицу длиннее, чем MovieItem[0]
       int length = items.length + 1;
       MovieItem[] tmp = new MovieItem[length];
       // сопируем в tmp количество элементов items.length
       System.arraycopy(items, 0, tmp, 0, items.length);
       //кладем последний элемент items
       int lastIndex = tmp.length - 1;
       tmp[lastIndex] = item;
       items = tmp;
   }

   public MovieItem[] getAll() {
       MovieItem[] result;
       // условие, что если items.length <= moviesLength, то запускается цикл с огрначинием items.length
       if (items.length <= moviesLength) {
           result = new MovieItem[items.length];
           for (int i = 0; i < items.length; i++) {
               int index = items.length -i - 1;
               result[i] = items[index];
           }
           // если условие не выполняется, то запускается цикл с ограничением moviesLength
       } else {
           result = new MovieItem[moviesLength];
           for (int i = 0; i < moviesLength; i++) {
               int index = items.length - i - 1;
               result[i] = items[index];
           }
       }
       return result;
   }
}
