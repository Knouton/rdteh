package day10.streamsApi;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {
        //checkRandom();
        getInfoBook();
    }
    public static void checkRandom(){
        Random random = new Random();
        long randomNumbersSize = 100000;
        double number = random.doubles(randomNumbersSize, 0, 1)
                .map(a -> Math.abs(a - 0.5))
                .sum()
                /randomNumbersSize;
        System.out.println(number);
    }

    public static void  getInfoBook() throws URISyntaxException, IOException {
        /*URL res = getClass().getClassLoader().getResource("test.txt");
        File file = Paths.get(res.toURI()).toFile();*/

        Path file = new File("E:\\java proj\\study java\\rdteh\\src\\day10\\streamsApi\\ktulhu.txt").toPath();

        Stream stringsStream = Files.lines(file, Charset.forName("windows-1251"))
                .flatMap(string -> Stream.of(string
                        .replaceAll("[^A-Za-zА-Яа-я0-9-\s]", "")
                        .split(" ")));

        List<String> arrayList = new ArrayList<String>(stringsStream.toList());

        arrayList.removeIf(item -> item == null || "".equals(item));

        //сколько всего слов
        System.out.println(arrayList.stream().count());
        //сколько слов со строчной буквы
        System.out.println(arrayList.stream().filter(i -> i.substring(0, 1).matches("[a-z]")).count());
        //посчитать сколько раз встречается каждое слово
        System.out.println(arrayList
                .stream().collect(Collectors.groupingBy(i -> i, Collectors.counting())));

        //50 наиболее часто встречаемых слов
        Map<String, Long> result = arrayList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(50)
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(result);
    }
}
