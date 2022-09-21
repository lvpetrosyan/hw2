import javax.swing.plaf.synth.SynthLookAndFeel;

public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1");
        var dog = 8d;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println (cat);
        var paper = 763789.0;

        System.out.println (paper);
        System.out.println("задание 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat +4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        System.out.println("задание 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        System.out.println("задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 2;
        System.out.println(friend);
        System.out.println("задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = 3.5 * 10;
        System.out.println(frog);
        var frog2 = frog / 3.5;
        System.out.println(frog2);
        frog2 = frog2 + 4;
        System.out.println(frog2);
        System.out.println("задание 6");

        var oneBoxer = 78.2;
        var twoBoxer = 82.7;
        var total = oneBoxer + twoBoxer;
        System.out.println("общий вес 2 бойцов " + total + "кг.");
                var difference = oneBoxer - twoBoxer;
        System.out.println("разница между весами 2 бойцов "+ difference + " кг!");
        var way1 = twoBoxer - oneBoxer;
        System.out.println("задание 7" +
                " ");
        System.out.println("разница между весами 2 спортсменов, 1 вариант расчета "+ way1);
        var way2= twoBoxer / oneBoxer;
        System.out.println("Второй вариант расчета. Разница между весами спортсменов " + way2 + " %");
        System.out.println("задание 8" +
                " ");
        var time = 640;
        var hour = 8;
        var worker = time / hour;
        System.out.println("Всего работников в компании - " + worker + " человек.");
        var dopWorker = 94;
        var allWorker = worker + dopWorker;
        var allTime = hour * allWorker;
        System.out.println("Если в компании работет " + allWorker + " человек, то всего " + allTime + " часов работы может быть поделено между сотрудниками");




    }


}