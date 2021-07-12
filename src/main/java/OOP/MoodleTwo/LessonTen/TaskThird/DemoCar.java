package OOP.MoodleTwo.LessonTen.TaskThird;

import java.util.ArrayList;
import java.util.List;

public class DemoCar {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(0, new Car("Black", "BMW", "01 A 543 BA"));
        carList.add(1, new Car("Black", "Chevrolet", "01 b 323 AA"));
        carList.add(2, new Car("White", "Audi", "01 A 333 BA"));
        carList.add(3, new Car("Red", "Mercedes", "01 C 623 BA"));
        carList.add(4, new Car("White", "Tesla", "01 O 783 BA"));
        carList.add(5, new Car("Pink", "Lamborghini", "01 D 323 BA"));
        carList.add(6, new Car("Red", "Ferrari", "01 A 542 BA"));
        carList.add(7, new Car("Black", "Ferrari", "01 S 121 BA"));
        carList.add(8, new Car("Orange", "BMW", "01 J 022 BA"));
        carList.add(9, new Car("Brown", "Mercedes", "01 O 002 BA"));
        /*carList.add(10, new Car("Brown", "Black box", "01 O 002 BA"));
        carList.add(11, new Car("Brown", "Black box", "01 O 002 BA"));
        carList.add(12, new Car("Brown", "Black box", "01 O 002 BA"));*/

        List<Car> carList2 = new ArrayList<>();
        carList2.add(0, new Car("Brown", "Mercedes new", "01 O 002 BA"));
        carList2.add(1, new Car("Brown", "Bugatti new", "01 O 002 BA"));
        carList2.add(2, new Car("Green", "BMW new", "01 O 002 BA"));
        carList2.add(3, new Car("Brown", "Hyundai new", "01 O 002 BA"));
        carList.addAll(1, carList2);

        System.out.println(removeDuplicates(carList));

       /* for (Car cars:carList) {
            System.out.println(cars);
        }*/

        //carList.sort(Car::compareTo);
//        carList.sort(Comparator.comparing(Car::getModel));

//        carList.removeAll(carList2);


       /* int count = 0;
        while (true) {
            Car randomCar = getRandomCar(carList);
            if (count == carList.size())
                return;
            count++;
            System.out.println(count+"."+randomCar);
        }*/

        /*if(randomCar.getModel().equals("Black box")){
            System.out.println("You lost!");
            System.out.println(randomCar);
        } else {
            System.out.println("Congratulations!");
            System.out.println(randomCar);
        }*/
    }

    public static List<Car> removeDuplicates(List<Car> oldList) {
        List<Car> newList = new ArrayList<>();
        for (Car car : oldList) {
            if(!checkList(newList, car)){
                newList.add(car);
            }
        }
        return newList;
    }

    private static boolean checkList(List<Car> newList, Car car) {
        for (Car car1 : newList) {
            if(car1.getColar().equals(car.getColar()))
                return true;
        }
        return false;
    }

   /* public static Car getRandomCar(List<Car> carList) {
        Random random = new Random();
        return carList.get(random.nextInt(carList.size() - 1));
    }*/


}



