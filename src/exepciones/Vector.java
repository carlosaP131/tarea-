package exepciones;

public class Vector {
    static int  vector[] = {1,2,3,4,5};

    public static void main(String[] args) {
        boolean continuar= true;
        do {
            try {


                for (int i = 0; i < 6; i++) {
                    System.out.println("vector" + vector[i]);

                }
                continuar=false;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ERROR"+e.getMessage());
                System.out.println("jaja");
            }
        }while (continuar);
    }

}
