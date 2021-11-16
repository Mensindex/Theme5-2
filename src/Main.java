import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

    public static void sortPeople(List<Human> list) {

        boolean sorted = false;


        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(j).getWeight() < list.get(i).getWeight()) {
                    Human temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp);
                }


            }

        }

//        while (!sorted) {
//            sorted = true;
//        }
//
//        for (int i = 0; i < list.size() - 1; i++) {
//            if (list.get(i).getWeight() > list.get(i + 1).getWeight()) {
//                temp = list.get(i); //кладу больший элемент в temp//
//                list.set(list.get(i), i+1);
//                list.set(i,list.get(i+1));
//
//                sorted=false;
//
//            }
//
//        }


    }


    //temp = list.get(i);
    //list.set(list.get(j),i);
    //list.set(temp,j);


    public static void main(String[] args) {

        Human Ban = new Human();
        Ban.setName("Бэн");
        Ban.setWeight(74.5);

        Human Dina = new Human();
        Dina.setName("Дина");
        Dina.setWeight(62.2);

        Human Sam = new Human();
        Sam.setName("Сэм");
        Sam.setWeight(87.2);

        Human Mike = new Human();
        Mike.setName("Майк");
        Mike.setWeight(78.8);

        Human Rich = new Human();
        Rich.setName("Рич");
        Rich.setWeight(89.1);

        Human July = new Human();
        July.setName("Джулия");
        July.setWeight(47.4);

        Human Linda = new Human();
        Linda.setName("Линда");
        Linda.setWeight(54.0);


        List<Human> people = new ArrayList<>(7);
        people.add(Ban);
        people.add(Dina);
        people.add(Sam);
        people.add(Mike);
        people.add(Rich);
        people.add(July);
        people.add(Linda);

        sortPeople(people);

        for (Human human: people) {
            System.out.println(human.getName());
        }


    }


}
