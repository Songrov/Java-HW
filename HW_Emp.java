package lesson19;

import java.util.Comparator;
import java.util.stream.Collectors;

public class HW_Emp {

        System.out.println();
        employees.stream()
                .mapToDouble(e -> e.getAge())
            .average()
                .ifPresent(System.out::println);

        System.out.println();
        System.out.println(
                employees.stream()
                .filter(e -> e.getPosition().equals("programmer"))
            .filter(e -> !e.getName().endsWith("a"))
            .count()
        );

        System.out.println();
        System.out.println(
                employees.stream()
                .mapToInt(Employee::getAge)
                        .reduce(0, (x, y) -> x + y)
            );

        System.out.println();
        System.out.println(
                employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() > 40))
            );

        System.out.println();
        employees.stream()
                .collect(Collectors.groupingBy(e -> e.getAge() > 40))
            .entrySet().stream()
                .filter(pair -> !pair.getKey())
            .flatMap(pair -> pair.getValue().stream())
            .max(Comparator.comparing(Employee::getAge))
            .ifPresent(e -> System.out.println(e.getPosition()));
}
