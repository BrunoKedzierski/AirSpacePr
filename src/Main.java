import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class Main {





    public static void insertionSortOverRows(Aircraft[][] aircrafts){

        //iterate over rows
        for (int i = 0; i < aircrafts.length; i++) {

            //iterate over a selected row
            for (int j = 0; j <aircrafts[i].length ; j++) {

                // currently selected plane
                Aircraft sel =aircrafts[i][j];

                int k = j - 1;

                while (k >= 0 && distanceFromRadar(aircrafts[i][k].getX(),aircrafts[i][k].getY(),aircrafts[i][k].getPulap() )> distanceFromRadar(sel.getX(), sel.getY(), sel.getPulap()))
                {
                    aircrafts[i][k + 1] = aircrafts[i][k];
                    k = k - 1;
                }
                aircrafts[i][k + 1] = sel;
            }




        }








    }

    //Helper function to remove null values from the aircrafts array
    public static Aircraft[][] removeNulls(Aircraft[][]aircrafts){

        //iterate over rows
        for (int i = 0; i <aircrafts.length ; i++) {

            //iterate over selected row, from the end
            for (int j = aircrafts[i].length -1; j >=0 ; j--) {


                //if encountered an non-null plane, replace the row with it's copy
                //but ending on this index 'j', thus removing all null values
                // this works because when inserting the the planes into the array, they go in order
                // so there is no way that for ex. plane null plane null will occur.
                if(aircrafts[i][j] != null){

                    aircrafts[i] = Arrays.copyOfRange(aircrafts[i],0,j+1);

                    break;

                }
                //if all objects are null, replace the row with an empty array of Aircraft type
                else if (j == 0){
                    aircrafts[i] = new Aircraft[0];

                }


            }
        }

        return aircrafts;



    }

    // Helper method to calulate euclidean distance
    public static double distanceFromRadar(int x, int y, int pulap){


        return Math.sqrt(Math.pow((x - 0),2) + Math.pow((y-0),2) + Math.pow((pulap-0),2));


    }

    // helper function to calculated which row should the aircraft be placed in, based on the distance from radar
    public static int calculateRow( double distance){

        int sequenceValue = 3;
        int commonRation =3;
        int flag = 0;

        while(sequenceValue<= distance){

            sequenceValue = sequenceValue*commonRation;
            flag++;
        }

        return flag;


    }



    public static void main(String[] args) {


        //checking if the number of arguments is correct
       if(args.length ==0 || args.length > 2){

           System.out.println("Incorrect parameters! try again.");
       }
       //Check the args parameter
       else if (args[0].equals("save")) {

            //Initialize passangerPlane objects
            PassengerPlane pass1 = new PassengerPlane("hpc13", "Boeing 737", "jet", 4, 2, "LOT", "LO123", "warsaw", "Berlin", 150, 6);
            PassengerPlane pass2 = new PassengerPlane("hza212", "Boeing 787", "jet", 4, 2, "Lufthansa", "LU111", "berlin", "london", 220, 8);
            PassengerPlane pass3 = new PassengerPlane("hza333", "Airbus A320", "jet", 4, 2, "Austrian", "AS112", "Budapest", "Salzburg", 200, 8);
            PassengerPlane pass4 = new PassengerPlane("zza213", "Airbus A220", "jet", 2, 2, "American Airlines", "AM113", "New York", "London", 200, 8);
            PassengerPlane pass5 = new PassengerPlane("bb111", "Bombardier Q-400", "turboprop", 2, 2, "LOT", "LO124", "Warsaw", "Cracov", 100, 4);
            PassengerPlane pass6 = new PassengerPlane("dj114", "DHC-8", "turboprop", 2, 2, "Lufthansa", "LU111", "berlin", "Lyon", 80, 3);
            PassengerPlane pass7 = new PassengerPlane("ee331", "Embraer E175", "jet", 2, 2, "Air france", "AF561", "Paris", "Barcelona", 150, 5);
            PassengerPlane pass8 = new PassengerPlane("eb312", "Embraer E195", "jet", 2, 2, "Lufthansa", "LU119", "Hamburg", "Stuttagrd", 180, 6);
            PassengerPlane pass9 = new PassengerPlane("ty123", "Boeing 777", "jet", 4, 2, "Air Canada", "AC223", "Toronto", "New Yotk", 222, 8);
            PassengerPlane pass10 = new PassengerPlane("aa333", "Airbus A340", "jet", 4, 2, "Etihad", "ET837", "Abu Dhabi", "Tokyo", 200, 10);


            //-------------------------------------------------------------------------------------------------------------------------------------------------------------

            //Initialize CargoPlane objects
            CargoPlane cargo1 = new CargoPlane("HH124", "Airbus A300-600RF", "jet", 4, 2, "FedEx Express", "FE333", "Washington", "London", "mail", 15000, false);
            CargoPlane cargo2 = new CargoPlane("uz145", "Boeing 777F", "jet", 2, 2, "Lufthansa Cargo", "LU134", "Berlin", "Rome", "electronics", 20000, true);
            CargoPlane cargo3 = new CargoPlane("gg221", "Boeing 747-8F", "jet", 2, 2, "Cargolux", "CL221", "Manchester", "Oslo", "clothes", 10000, false);
            CargoPlane cargo4 = new CargoPlane("ez884", "Boeing 767-300F", "jet", 2, 2, "UPS", "UP521", "Tokyo", "Oslo", "mail", 10000, false);
            CargoPlane cargo5 = new CargoPlane("gb184", "Boeing 767-300F", "jet", 2, 2, "UPS", "UP521", "Cracov", "Berlin", "mail", 10000, false);
            CargoPlane cargo6 = new CargoPlane("ww214", "Boeing 767-300F", "jet", 2, 2, "UPS", "UP111", "Moscov", "Beijng", "mail", 10000, false);
            CargoPlane cargo7 = new CargoPlane("js177", "Boeing 767-300F", "jet", 2, 2, "UPS", "UP441", "Tokyo", "Hong Kong", "mail", 10000, false);
            CargoPlane cargo8 = new CargoPlane("ww234", "Boeing 767-300F", "jet", 2, 2, "UPS", "UP231", "Cair", "Barcelona", "mail", 10000, false);
            CargoPlane cargo9 = new CargoPlane("ll222", "Boeing 767-300F", "jet", 2, 2, "UPS", "UP999", "Washington", "Las Vegas", "mail", 10000, false);
            CargoPlane cargo10 = new CargoPlane("oo123", "Boeing 767-300F", "jet", 2, 2, "UPS", "UP221", "Tokyo", "Seul", "mail", 10000, false);


            //-------------------------------------------------------------------------------------------------------------------------------------------------------------

            //Initialize PrivatePlane objects
            PrivatePlane plane1 = new PrivatePlane("asz198", "Embraer Legacy 600", "jet", 2, 2, "John", "smith");
            PrivatePlane plane2 = new PrivatePlane("asz292", "Bombardier Challenger 350", "jet", 2, 2, "Mark", "Adams");
            PrivatePlane plane3 = new PrivatePlane("azz888", "Bombardier Challenger 350", "jet", 2, 2, "Paul", "Black");
            PrivatePlane plane4 = new PrivatePlane("aqq555", "Gulfstream G650ER", "jet", 2, 2, "Richard", "lott");
            PrivatePlane plane5 = new PrivatePlane("arr665", "Bombardier Global 6000", "jet", 2, 2, "Tom", "glide");
            PrivatePlane plane6 = new PrivatePlane("arr662", "Cessna Conquest II", "turboprop", 2, 2, "Larry", "Hill");
            PrivatePlane plane7 = new PrivatePlane("atx221", "Pilatus PC-12", "turboprop", 1, 2, "Harry", "King");
            PrivatePlane plane8 = new PrivatePlane("atz111", "Piper M350", "piston", 1, 1, "Lars", "Field");
            PrivatePlane plane9 = new PrivatePlane("atr331", "Piper M350", "piston", 1, 1, "Sven", "Ford");
            PrivatePlane plane10 = new PrivatePlane("atr333", "Cirrus SR22", "turboprop", 1, 1, "Jake", "Ford");


            //-------------------------------------------------------------------------------------------------------------------------------------------------------------

            //Initialize Helicopter objects
            Helicopter heli1 = new Helicopter("hh112", "Robinson R22", "pison", 2, 2);
            Helicopter heli2 = new Helicopter("hh133", "Robinson R22", "pison", 2, 2);
            Helicopter heli3 = new Helicopter("ht443", "Bell 47", "piston", 2, 2);
            Helicopter heli4 = new Helicopter("ht222", "Bell 206", "turboshaft", 2, 2);
            Helicopter heli5 = new Helicopter("ht100", "Hribo HX1", "piston", 1, 1);
            Helicopter heli6 = new Helicopter("ht120", "Hribo HX1", "piston", 1, 1);
            Helicopter heli7 = new Helicopter("hw243", "Bell 47", "piston", 2, 2);
            Helicopter heli8 = new Helicopter("he143", "Bell 47", "piston", 2, 2);
            Helicopter heli9 = new Helicopter("he443", "Augusta Westland 139", "turboshaft", 2, 2);
            Helicopter heli10 = new Helicopter("hz843", "Augusta Westland 139", "turboshaft", 2, 2);


            // Create an array, containing the aircrafts
            Aircraft[] aircrafts = {pass1, pass2, pass3, pass4, pass5, pass6, pass7, pass8, pass9, pass10,
                    cargo1, cargo2, cargo3, cargo4, cargo5, cargo6, cargo7, cargo8, cargo9, cargo10,
                    plane1, plane2, plane3, plane4, plane5, plane6, plane7, plane8, plane9, plane10,
                    heli1, heli2, heli3, heli4, heli5, heli6, heli7, heli8, heli9, heli10
            };


            // Write the aircrafts to a file
            try {

                // The file will be created in the directory of the project
                FileWriter writer = new FileWriter("aircrafts.txt");


                for (Aircraft a : aircrafts) {

                    // Wrting the class name before attributes for later identification
                    writer.write(a.getClass().getSimpleName() + ", " + a.toString());
                    writer.write("\n");

                }


                writer.close();


            } catch (Exception e) {

                e.printStackTrace();
            }

            //ending code execution
            return;
        }
        //Checking the args parameter
        else if(args[0].equals("load")){

            int times = 0;

            //Reading the load number parameter
            //Catching the NumberFormatException - checking if the number parameter is a integer
            try {
                times = Integer.parseInt(args[1]);
            }catch (NumberFormatException n){
                System.out.println("The load parameter has to be an Integer!");
            }


            // In the worst case, each row will hold only 1 aircraft OR all aircrafts will be in 1 row;
            //The 'minimal' coordinates are x=0,y=0, pulap = 600 (as specified in the program) - the minimal distance is 600 then;
            //The 'Maximal' coordinates are x=100,y=100, pulap =2500 (as specified in the program) - the maximal distance is 2503.99;
            //So the max amount of rows that we need, given the sequence 3,9,27... is 8, each row has to have 40 * the parameter spaces, if all aircrafts happen to have the same coordinates
            Aircraft[][] aircrafts = new Aircraft[8][40*times];


            try {
                BufferedReader reader = new BufferedReader(new FileReader("aircrafts.txt"));

                String l = reader.readLine();

                //distance from radar
                double distance;

                //row of the final array
                int row;



                while (l != null) {

                    // Splitting each line into attributes on ','
                   String[] attributes =  l.split(", ");

                   //looping i times, as specified in args[], so that each plane is added i times
                    for (int i = 0; i <times ; i++) {

                    // Each line starts with class name, switch statements checks the plane type
                    switch (attributes[0]) {
                        case "PassengerPlane":

                            // Creating new instant of a plane
                            PassengerPlane plane = new PassengerPlane();

                            // Setting the attributes in the order that they come in the textfile
                            // constraining x to <0,100>, y to <0,100> and pulap to <600,2500>
                            plane.setX((int)(Math.random() * 100) + 0);
                            plane.setY((int)(Math.random() * 100) + 0);
                            plane.setVelocity((int)(Math.random() * 1200) + 400);
                            plane.setPulap((int)(Math.random() * 2500) + 600);
                            plane.setWektorRuchu((int)(Math.random() * 260) + 1);
                            plane.setAircraftRegistration(attributes[6].split(":")[1]);

                            plane.setModel(attributes[7].split(":")[1]);
                            plane.setEngineType(attributes[8].split(":")[1]);
                            plane.setNumberOfEngines(Integer.parseInt(attributes[9].split(":")[1]));
                            plane.setNumberOfPilots(Integer.parseInt(attributes[10].split(":")[1]));
                            plane.setAirline(attributes[11].split(":")[1]);
                            plane.setFlightNumber(attributes[12].split(":")[1]);
                            plane.setOrigin(attributes[13].split(":")[1]);
                            plane.setDestination(attributes[14].split(":")[1]);
                            plane.setNumberOfPassengers(Integer.parseInt(attributes[15].split(":")[1]));
                            plane.setNumberOfCabinCrew(Integer.parseInt(attributes[16].split(":")[1]));

//                            System.out.println(plane.toString());

                            // calculating distance of a plane from the radar
                            distance = distanceFromRadar(plane.getX(), plane.getY(), plane.getPulap());

                            // calculating row
                             row = calculateRow(distance);

                             // looking for a null (empty) value in a specified row and inserting the plane
                            for (int j = 0; j < aircrafts[row].length; j++) {

                                if(aircrafts[row][j] == null){

                                    aircrafts[row][j]= plane;
                                    break;


                                }

                            }



                            break;
                        case "CargoPlane":

                            CargoPlane cargo = new CargoPlane();

                            // Setting the attributes in the order that they come in the textfile
                            // constraining x to <0,100>, y to <0,100> and pulap to <600,2500>
                            cargo.setX((int)(Math.random() * 100) + 1);
                            cargo.setY((int)(Math.random() * 100) + 1);
                            cargo.setVelocity((int)(Math.random() * 1200) + 400);
                            cargo.setPulap((int)(Math.random() * 2500) + 600);
                            cargo.setWektorRuchu((int)(Math.random() * 260) + 1);
                            cargo.setAircraftRegistration(attributes[6].split(":")[1]);

                            cargo.setModel(attributes[7].split(":")[1]);
                            cargo.setEngineType(attributes[8].split(":")[1]);
                            cargo.setNumberOfEngines(Integer.parseInt(attributes[9].split(":")[1]));
                            cargo.setNumberOfPilots(Integer.parseInt(attributes[10].split(":")[1]));
                            cargo.setAirline(attributes[11].split(":")[1]);
                            cargo.setFlightNumber(attributes[12].split(":")[1]);
                            cargo.setOrigin(attributes[13].split(":")[1]);
                            cargo.setDestination(attributes[14].split(":")[1]);
                            cargo.setCargoType(attributes[15].split(":")[1]);
                            cargo.setLoadKg(Integer.parseInt(attributes[16].split(":")[1]));
                            cargo.setDangerousCargo(Boolean.parseBoolean( attributes[17].split(":")[1]));

//                            System.out.println(cargo.toString());

                             distance = distanceFromRadar(cargo.getX(), cargo.getY(),cargo.getPulap());

                             row = calculateRow(distance);

                            for (int j = 0; j < aircrafts[row].length; j++) {

                                if(aircrafts[row][j] == null){

                                    aircrafts[row][j]= cargo;
                                    break;


                                }

                            }





                            break;
                        case "PrivatePlane":

                            PrivatePlane priv = new PrivatePlane();

                            // Setting the attributes in the order that they come in the textfile
                            // constraining x to <0,100>, y to <0,100> and pulap to <600,2500>
                            priv.setX((int)(Math.random() * 100) + 1);
                            priv.setY((int)(Math.random() * 100) + 1);
                            priv.setVelocity((int)(Math.random() * 1200) + 400);
                            priv.setPulap((int)(Math.random() * 2500) + 600);
                            priv.setWektorRuchu((int)(Math.random() * 260) + 1);
                            priv.setAircraftRegistration(attributes[6].split(":")[1]);

                            priv.setModel(attributes[7].split(":")[1]);
                            priv.setEngineType(attributes[8].split(":")[1]);
                            priv.setNumberOfEngines(Integer.parseInt(attributes[9].split(":")[1]));
                            priv.setNumberOfPilots(Integer.parseInt(attributes[10].split(":")[1]));
                            priv.setOwnerName(attributes[11].split(":")[1]);
                            priv.setOwnerSurname(attributes[12].split(":")[1]);


//                            System.out.println(priv.toString());

                            distance = distanceFromRadar(priv.getX(), priv.getY(), priv.getPulap());

                            row = calculateRow(distance);

                            for (int j = 0; j < aircrafts[row].length; j++) {

                                if(aircrafts[row][j] == null){

                                    aircrafts[row][j]= priv;
                                    break;


                                }

                            }
                            break;

                        case "Helicopter":
                            Helicopter heli = new Helicopter();

                            // Setting the attributes in the order that they come in the textfile
                            // constraining x to <0,100>, y to <0,100> and pulap to <600,2500>
                            heli.setX((int)(Math.random() * 100) + 1);
                            heli.setY((int)(Math.random() * 100) + 1);
                            heli.setVelocity((int)(Math.random() * 1200) + 400);
                            heli.setPulap((int)(Math.random() * 2500) + 600);
                            heli.setWektorRuchu((int)(Math.random() * 260) + 1);
                            heli.setAircraftRegistration(attributes[6].split(":")[1]);

                            heli.setModel(attributes[7].split(":")[1]);
                            heli.setPowerPlantType(attributes[8].split(":")[1]);
                            heli.setNumOfRotors(Integer.parseInt(attributes[9].split(":")[1]));
                            heli.setNumberOfCrew(Integer.parseInt(attributes[10].split(":")[1]));

//                            System.out.println(heli.toString());

                            distance = distanceFromRadar(heli.getX(), heli.getY(), heli.getPulap());

                            row = calculateRow(distance);

                            for (int j = 0; j < aircrafts[row].length; j++) {

                                if(aircrafts[row][j] == null){

                                    aircrafts[row][j]= heli;
                                    break;


                                }

                            }

                            break;

                    }

                    }




                    l = reader.readLine();
                }


                aircrafts = removeNulls(aircrafts);


                for (int i = 0; i < aircrafts.length; i++)
                    System.out.println(Arrays.toString(aircrafts[i]));




                insertionSortOverRows(aircrafts);


                System.out.println("             ");

                for (Aircraft[] a : aircrafts){

                    for (Aircraft ar: a) {

                        System.out.print(distanceFromRadar(ar.getX(), ar.getY(), ar.getPulap()) +" , ");


                    }

                    System.out.println("    ");


                }



            }catch (Exception e){
                e.printStackTrace();
            }

            //ending code execution
            return;
        }
        //if other parameters specify, notify the user that it is not correct
        else {

           System.out.println("incorrect parameter !!");
       }


    }
}
