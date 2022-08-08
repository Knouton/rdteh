package day5.shape;

import day5.shape.color.EnumColor;
import day5.shape.factory.ShapeFactory;
import day5.shape.factory.ShapeRandomFactory;
import day5.shape.factory.ellipse.CircleFactory;
import day5.shape.factory.ellipse.EllipseFactory;
import day5.shape.factory.tetragon.ParallelogramFactory;
import day5.shape.factory.tetragon.RectangleFactory;
import day5.shape.factory.tetragon.SquareFactory;
import day5.shape.factory.tetragon.TetragonFactory;
import day5.shape.factory.triangle.EquilateralTriangleFactory;
import day5.shape.factory.triangle.IsoscelesTriangleFactory;
import day5.shape.factory.triangle.RightTriangleFactory;
import day5.shape.factory.triangle.TriangleFactory;
import day5.shape.shape.Shape;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    private static char a;
    public static void main(String[] args) {

        ShapeRandomFactory factory = new ShapeRandomFactory(new ShapeFactory[]{
          new CircleFactory(),
          new EllipseFactory(),
          new ParallelogramFactory(),
          new RectangleFactory(),
          new SquareFactory(),
          new TetragonFactory(),
          new EquilateralTriangleFactory(),
          new IsoscelesTriangleFactory(),
          new RightTriangleFactory(),
          new TriangleFactory()
        });
        List<Shape> shapeList = new LinkedList<>();

        for(int i = 0; i < 20; i++) {
            shapeList.add(factory.create());
        }

        for (Shape shape: shapeList
             ) {
            System.out.println(shape.getId() + " " + shape.getColor() + " " + shape.getClass() + " " + shape.getArea());
        }

        //id черных фигур
        shapeList.stream().filter(Shape -> Shape.getColor().equals(EnumColor.BLACK.toString()))
                .map(Shape::getId)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //сколько фигур каждого цвета
        Map<String, Long> shapeColorCount = shapeList.stream()
                .map(Shape::getColor)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        shapeColorCount.forEach((k, v) -> System.out.println("Color: " + k + " amount: "+ v));

        //получим новые фигуры, которые в два раза больше старых
        List<Shape> shapeListClone = new LinkedList<>();
        for (Shape shape: shapeList
        ) {
            shapeListClone.add((Shape) shape.clone(2));
        }
        shapeListClone.stream()
                .map(Shape::getId)
                .forEach(System.out::println);
    }
}