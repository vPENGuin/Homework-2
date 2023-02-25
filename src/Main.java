public class Main {
    public static void main(String[] args) {
        //задача 1
        System.out.println(" Задача 1:");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + "\n" + cat + "\n" + paper);

        //задача 2
        System.out.println("\n Задача 2:");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog + "\n" + cat + "\n" + paper);

        //задача 3
        System.out.println("\n Задача 3:");
        var dog1 = 8.0;
        dog1 = dog1 - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog1 + "\n" + cat + "\n" + paper);

        //задача 4
        System.out.println("\n Задача 4:");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //задание 5
        System.out.println("\n Задача 5:");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //задача 6,7
        System.out.println("\n Задача 6, 7:");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var boxersSum = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес двух бойцов: " + boxersSum);
        var boxersDiff = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе бойцов: " + boxersDiff);
        boxersDiff = boxerWeight2 % boxerWeight1;
        System.out.println("Разница(остаток от деления): " + boxersDiff);

        //задача 8
        System.out.println("\n Задача 8:");
        var hours = 640;
        var workTime = 8;
        var staff = hours / workTime;
        System.out.println("Если в компании работает " + staff + " человек, то всего " + hours +
                " часов работы может быть поделено между сотрудниками.");

        staff = staff + 94;
        hours = staff * 8;
        System.out.println("Если в компании работае " + staff + " человек, то всего " + hours +
                " часов работы может быть поделено между сотрудниками.");
    }
}