import javax.swing.plaf.synth.SynthLookAndFeel;

public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println (cat);
        var paper = 763789.0;
        System.out.println (paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat +4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var oneBoxer = 78.2;
        var twoBoxer = 82.7;
        var total = oneBoxer + twoBoxer;
        System.out.println("общий вес 2 бойцов " + total + "кг.");
        var difference = oneBoxer - twoBoxer;
        System.out.println("разница между весами 2 бойцов "+ difference + " кг!");
        var way1 = twoBoxer - oneBoxer;
        System.out.println("разница между весами 2 спортсменов, 1 вариант расчета "+ way1);
        var way2= twoBoxer / oneBoxer;
        System.out.println("Второй вариант расчета. Разница между весами спортсменов " + way2 + " %");
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