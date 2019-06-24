import java.util.Arrays;
import java.util.Random;

public class ChipotleJr {
    public static void main(String[] args) {


        String ingredients[] = {"rice", "meat", "beans", "salsa", "veggies", "cheese", "guac", "sourcream","queso"};
        String[] rice = {"White", "Brown", "No"};
        String meat[] = {"Chicken", "Steak", "Carnitas", "Chorizo", "Sofritas", "Veggies"};
        String beans[] = {"Pinto", "Black", "No"};
        String salsa[] = {"Mild", "Medium", "Hot", "No", "All"};
        String veggies[] = {"Lettuce", "Fajita Veggies", "No Veggies", "All Veggies"};
//
        Random rnd = new Random();
//        String burrito[] = new String[9];



        int x;
        int counter = 0;

        while(counter<25){
            String burrito[] = new String[9];

            double totalCost = 3.00;
            for (String ing: ingredients){

                switch(ing) {
                    case "rice":
                        //call getRice method
                        x = rnd.nextInt(rice.length);
                        String newRice = rice[x];
                        burrito[0] = newRice + " rice";
                        if(newRice == "No"){
                            continue;
                        }else{
                            totalCost+=.50;
                        }
                        break;

                    case "beans":
                        x = rnd.nextInt(beans.length);
                        String newBeans = beans[x];
                        burrito[3] = newBeans + " beans";
                        if(newBeans == "No"){
                            continue;
                        }else{
                            totalCost+=.50;
                        }
                        break;
                    case "meat":
                        x = rnd.nextInt(meat.length);
                        String newMeat = meat[x];
                        burrito[2] = newMeat;
                        totalCost+=.50;
                        break;
                    case "veggies":
                        x = rnd.nextInt(veggies.length);
                        String newVeggies = veggies[x];
                        burrito[1] = newVeggies;
                        if(newVeggies == "No"){
                            continue;
                        }else if(newVeggies == "All"){
                            totalCost+=1.00;
                        }else{
                            totalCost+=.50;
                        }
                        break;
                    case "salsa":
                        x = rnd.nextInt(salsa.length);
                        String newSalsa = salsa[x];
                        burrito[4] = newSalsa + " salsa";

                        if(newSalsa == "No"){
                            continue;
                        }else if(newSalsa == "All"){
                            totalCost+=1.50;
                        }else{
                            totalCost+=.50;
                        }
                        break;
                    case "cheese":
                        x = rnd.nextInt(2);
                        if (x == 0) {
                            burrito[5] = "No Cheese";
                        } else {
                            burrito[5] = "Cheese";
                            totalCost += .50;
                        }
                        break;
                    case "guac":
                        x = rnd.nextInt(2);
                        if (x == 0) {
                            burrito[6] = "No Guac";
                        } else {
                            burrito[6] = "Guac";
                            totalCost+= .50;
                        }
                        break;
                    case "queso":
                        x = rnd.nextInt(2);
                        if (x == 0) {
                            burrito[7] = "No Queso";
                        } else {
                            burrito[7] = "Queso";
                            totalCost+= .50;
                        }
                        break;
                    case "sourcream":
                        x = rnd.nextInt(2);
                        if (x == 0) {
                            burrito[8] = "No Sour Cream";
                        } else {
                            burrito[8] = "Sour Cream";
                            totalCost += .50;
                        }
                        break;
                }
            }
            counter++;
            System.out.println("Burrito " + (counter)+ ": " +Arrays.toString(burrito));
            System.out.println("Burrito " + (counter) + " Cost: $" + totalCost);

        }

    }
}
