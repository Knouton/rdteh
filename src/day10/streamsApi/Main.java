package day10.streamsApi;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {
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

        Path file = new File("E:\\java proj\\study java\\rdteh\\src\\day9\\streamsApi\\ktulhu.txt").toPath();
        System.out.println(file.getFileName());

        Stream stringsStream = Files.lines(file, Charset.forName("windows-1251"))
                .flatMap(string -> Stream.of(string
                        .replaceAll("[^A-Za-zА-Яа-я0-9-\s]", "")
                        .split(" ")));
        //System.out.println(stringsStream.count());
        //System.out.println(stringsStream.filter(i -> i.toString().substring(0, 1).matches("[a-z]")).count());
        /*System.out.println(stringsStream
                .collect(Collectors.groupingBy(i -> i, Collectors.counting())));*/
        /*stringsStream.collect(Collectors
                .collectingAndThen(Collectors.groupingBy(s -> s, Collectors.counting())), )*/

        //s.forEach(System.out::println);
        System.out.println();
    }
}
