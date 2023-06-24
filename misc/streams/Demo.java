package misc.streams;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    private static Employee[] arrayOfEmps = {
            new Employee(1, "Mark Twain", 10_000),
            new Employee(2, "Alan Watts", 12_000),
            new Employee(3, "Marcus Aurelius", 20_000)
    };

    public static void main(String[] args) {
        // get stream from array
        Stream.of(arrayOfEmps);

        // get stream from list
        List<Employee> empList = Arrays.asList(arrayOfEmps);
        empList.stream();

        // stream from individual objects
        Stream.of(arrayOfEmps[0], arrayOfEmps[1], arrayOfEmps[2]);

        // stream builder
        Stream.Builder<Employee> empStreamBuilder = Stream.builder();

        empStreamBuilder.accept(arrayOfEmps[0]);
        empStreamBuilder.accept(arrayOfEmps[1]);
        empStreamBuilder.accept(arrayOfEmps[2]);

        Stream<Employee> empStream = empStreamBuilder.build();

        List<String> list = Stream.of("One", "Two", "Three", "Four", "Five").toList();
        boolean isExist = list.stream().anyMatch(e -> e.contains("One"));

        // filter
        Stream<String> stream = list.stream().filter(e -> e.contains("e"));


        // Mapping
        List<String> uris = new ArrayList<>();
        uris.add("C:\\My.txt");
        Stream<Path> pathStream = uris.stream().map(Paths::get);

        List<Detail> details = new ArrayList<>();
        details.add(new Detail());
        Stream<String> detailStream = details.stream().flatMap(detail -> detail.getParts().stream());

        // Matching
        boolean isValid = list.stream().anyMatch(e -> e.contains("h")); // true
        boolean isValidOne = list.stream().allMatch(e -> e.contains("h")); // false
        boolean isValidTwo = list.stream().noneMatch(e -> e.contains("h")); // false
        Stream.empty().allMatch(Objects::nonNull); // true for any given predicate
        Stream.empty().anyMatch(Objects::nonNull); // false for any given predicate

        // Reduction
        List<Integer> integers = Arrays.asList(1, 1, 1);
        Integer reduced = integers.stream().reduce(23, Integer::sum);

        // Collecting
        List<String> resultList = list.stream().map(String::toUpperCase).toList();
    }
}
