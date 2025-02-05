public class Practice2Darray {
    public static void main(String[] args) {
        String [][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Mustang";
        cars[0][2] = "Challenger";
        cars[1][0] = "Corvette";
        cars[1][1] = "Viper";
        cars[1][2] = "Prowler";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Lamborghini";
        cars[2][2] = "Porsche";

        //outer for loop -> for rows
        for(int i = 0; i <cars.length; i++)

        {

            System.out.println();

            //inner for loop -> for columns

            for(int j = 0; j < cars[i].length; j++)

            {

                System.out.print(cars[i][j] + " ");

            }
        }
    }
}
