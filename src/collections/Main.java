package collections;

public class Main {
    public static void main(String[] args) {

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
