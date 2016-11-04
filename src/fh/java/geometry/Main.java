package fh.java.geometry;

import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.curved.Circle;
import fh.java.geometry.model.quadrilateral.Rectangle;
import fh.java.geometry.model.trilateral.RightTriangle;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
		//TODO: main() is missing

    public static void main(String[] args) {

        Main main = new Main();
        main.doIt();

    }

    private void doIt() {
        List<GeometricShape> shapelist = new ArrayList<>();

        fillList(shapelist);

        printList(shapelist);

        List<Circle> circleList = new ArrayList<>();
        for (GeometricShape shape: shapelist){
            if (shape instanceof Circle){
                circleList.add((Circle)shape);
            }
        }

        System.out.println("--------- circle ---------");
        for (Circle circle: circleList){
            System.out.println(circle);
        }
    }


    public void fillList(List<GeometricShape> shapeList) {
		//TODO: Implement
        shapeList.add(new Circle(1,2,2.0));
        shapeList.add(new Circle(2,22,7.0));
        shapeList.add(new Circle(2,45,2.0));

        shapeList.add(new RightTriangle(11,22,10.0,11.0));
        shapeList.add(new RightTriangle(12,24,10.0,11.0));

        shapeList.add(new Rectangle(1,2,20.1,21.11));

    }


    public void printList(List<GeometricShape> shapeList) {
		//TODO: Implement

        //First Solution (NOT recommended)
        System.out.println("--------- for loop ---------");
        for (int pos = 0; pos < shapeList.size(); pos++) {
            System.out.println(shapeList.get(pos));
        }


        //Second Solution (this is OK, but not perfect)
        System.out.println("--------- for each ---------");
        for (GeometricShape shape : shapeList) {
            System.out.println(shape);
        }

        //Third Solution (the best one)
        System.out.println("--------- stream1 ---------");
        shapeList.stream().forEach(shape -> System.out.println(shape));

        System.out.println("--------- stream2 ---------");
        shapeList.stream().forEach(System.out::println);

    }

}
