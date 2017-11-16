package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Translator trans;
        String heb = "", eng = "", resultEng;
        ArrayList<String> engWords;

        Scanner scan = new Scanner(System.in);

        trans = new Translator();

        while (true) {
            System.out.println("enter word in hebrew and afer theat its meaning in english: ");
            heb = scan.next();
            if (heb.equals("stop")) {
                break;
            }
            eng = scan.next();
            trans.add(heb, eng);
        }
        System.out.println("Enter sentence in hebrew");
        System.out.println();
        scan.reset();
        eng = scan.nextLine();
        eng = scan.nextLine();

        resultEng = trans.translate(eng);

        System.out.println(resultEng);
    }

}

/*
        HashMap<Driver, Cars> hash = new HashMap<>();

        Driver michael = new Driver("Michael",3049, 27);
        Driver max = new Driver("Max", 1241,27);
        Driver sapir = new Driver("Sapir", 2011, 27);
        Driver eddie = new Driver("Eddie",234,24);

        hash.put(michael,new Cars("Hundai",100));
        hash.put(max, new Cars("Bike", 400));
        hash.put(sapir, new Cars("Hundai",200));
        hash.put(eddie, new Cars("IDK",300));



        Set<Driver> setCars = hash.keySet();
        Collection<Cars> collectionCars = hash.values();

        ArrayList<Cars> listCars = new ArrayList<>();
        listCars.addAll(collectionCars);


        System.out.println("Befor Sorting: ");
        for(int i = 0; i < listCars.size(); i++)
        {
            System.out.println(listCars.get(i));
        }

        System.out.println();
        System.out.println("After Sorting: ");
        listCars.sort(new Comparator<Cars>() {
            @Override
            public int compare(Cars o1, Cars o2)
            {
                if(o1.getId() > o2.getId()) {
                    return 1;
                }

                if(o1.getId() < o2.getId())
                {
                    return -1;
                }
                return 0;
            }
        });

        for(int i = 0; i < listCars.size(); i++)
        {
            System.out.println(listCars.get(i));
        }

 */
