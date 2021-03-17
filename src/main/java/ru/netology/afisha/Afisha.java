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

   public void add(MovieItem item)  {
       //if (items.length == moviesLength) {
       //     return;
       //}
       int length = items.length + 1;
       MovieItem[] tmp = new MovieItem[length];
       System.arraycopy(items, 0, tmp, 0, items.length);
       int lastIndex = tmp.length - 1;
       tmp[lastIndex] = item;
       items = tmp;
   }

   public MovieItem[] getAll() {
       // условие, что если items.length <= moviesLength, то запускается цикл с огрначинием items.length
       if (items.length <= moviesLength) {
           MovieItem[] result = new MovieItem[items.length];

           for (int i = 0; i < items.length; i++) {
               int index = items.length -i - 1;
               result[i] = items[index];
           }
           return result;
           // если условие не выполняется, то запускается цикл с ограничением moviesLength
       } else {
           MovieItem[] result = new MovieItem[moviesLength];
           for (int i = 0; i < moviesLength; i++) {
               int index = items.length - i - 1;
               result[i] = items[index];
           }
           return result;
       }
   }
}
