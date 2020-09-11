package _06Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exm5Sorted {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        array = Arrays.stream(array).sorted().toArray();
//        System.out.println(Arrays.toString(array));

        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolaj", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Marija", 'f', 23, 3, 7.4);

        List<Student> studList = new ArrayList<>();
        studList.add(st1);
        studList.add(st2);
        studList.add(st3);
        studList.add(st4);
        studList.add(st5);

        studList = studList.stream().sorted((x, y) -> x.getName().compareTo(y.getName())).collect(Collectors.toList());
        System.out.println(studList);
    }
}
