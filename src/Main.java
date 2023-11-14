public class Main {

    public static void main(String[] args){
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1(){
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18){
            System.out.println("Если возраст человека равен " + age + ", он совершеннолетний.");
        }
        if (age < 18){
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2(){
        System.out.println("Задача 2");
        int airTemperatures = 5;
        if (airTemperatures < 5){
            System.out.println("На улице " + airTemperatures + " градусов, нужно надеть шапку.");
        }
        if (airTemperatures >= 5){
            System.out.println("На улице " + airTemperatures + " градусов, можно идти без шапки.");
        }
    }

    public static void task3(){
        System.out.println("Задача 3");
        int speed = 60;
        if (speed > 60){
            System.out.println("Если скорость " + speed + ", придется заплатить штраф.");
        }
        if (speed <= 60){
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        }
    }

    public static void task4(){
        System.out.println("Задача 4");
        int age = 18;
        if (age >= 2 && age <= 6){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 17){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age >= 18 && age <=24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в уневерситет.");
        } else if (age > 24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }
    }

    public static void task5(){
        System.out.println("Задача 5");
        int age = 5;
        if (age <= 5){
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else if (age > 5 && age < 14){
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослых.");
        } else if (age >= 14){
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься без сопровождения взрослого");
        }
    }

    public static void task6(){
        System.out.println("Задача 6");
        int peopleInTrain = 102;
        int allSeatsInTrain = 102;
        int allSeatingTrain = 60;
        int standingPlacesInTrain = allSeatsInTrain - allSeatingTrain;
        int freeSeatingTrain = allSeatingTrain - peopleInTrain;
        int freeStandingPlacesInTrain = allSeatsInTrain - peopleInTrain;
        if (peopleInTrain < allSeatingTrain){
            System.out.println("Если в вагоне поедут " + peopleInTrain + " человек. То останется свободно " + freeSeatingTrain + " сидячих мест и " + standingPlacesInTrain + " стоячих мест.");
        } else if (peopleInTrain == allSeatingTrain){
            System.out.println("Если в вагоне поедут " + peopleInTrain + " человек. То все сидячие места заняты остались только " + standingPlacesInTrain + " стоячих мест.");
        } else if (peopleInTrain > allSeatingTrain && peopleInTrain < allSeatsInTrain){
            System.out.println("Если в вагоне поедут " + peopleInTrain + " человек. То все сидячие места заняты остались только " + freeStandingPlacesInTrain + " стоячих мест.");
        } else if (peopleInTrain == allSeatsInTrain){
            System.out.println("Если в вагоне поедут " + peopleInTrain + " человек. То все места буду заняты.");
        } else if (peopleInTrain > allSeatsInTrain){
            System.out.println("Все места заняты. Свободных мест нет.");
        }
    }

    public static void task7(){
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one >= two && one >= three){
            System.out.println("Самое большое число = " + one);
        } else if (two >= one && two >= three){
            System.out.println("Самое большое число = " + two);
        }  else if (three >= one && three >= two){
            System.out.println("Самое большое число = " + three);
        }
    }
}
