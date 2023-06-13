package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Demo_2 {
    public static void main(String[] args) {
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("《肖申克的救赎》", 9.7, "罗宾斯"));
        movies.add(new Movie("《霸王别姬》", 9.6, "张国荣、张丰毅"));
        movies.add(new Movie("《阿甘正传》", 9.5, "汤姆汉克斯"));

        Iterator<Movie> it = movies.iterator();
        while (it.hasNext()) {
            printInfo(it.next());
        }

        for (Movie movie : movies) {
            printInfo(movie);
        }

        movies.forEach(movie -> printInfo(movie));
        movies.forEach(Demo_2::printInfo);  //静态方法引用   lambda表达式简化
    }

    public static void printInfo(Movie movie) {
        System.out.println("电影名：" + movie.getName());
        System.out.println("评分：" + movie.getScore());
        System.out.println("主演：" + movie.getActor());
        System.out.println("--------------------------------------------");
    }
}
