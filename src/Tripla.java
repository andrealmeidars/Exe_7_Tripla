

public class Tripla {


    public boolean isTripla(int[] array){

        boolean isTripla = false;
        int count = 1;
        int value = array[0];


        for (int i = 0; i <= 4; i++){

            if ( i <= 0  ) {
                value = array[i];
            }

            else if (value == array[i]){
                count = count + 1;
                value = array[i];

                    if (count == 3){
                        isTripla = true;
                    }

            }else  value = array[i];
        }

        return isTripla;
    }
}
