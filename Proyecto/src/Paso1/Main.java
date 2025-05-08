package Paso1;

public class Main {
    public static void main(String[] args) {

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril" , "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        int [] lluvia = new int[12];
        lluvia[0] = 23;        lluvia[1] = 8;        lluvia[2] = 12;       lluvia[3] = 13;
        lluvia[4] = 42;        lluvia[5] = 30;       lluvia[6] = 2;        lluvia[7] = 3;
        lluvia[8] = 33;        lluvia[9] = 22;       lluvia[10] = 11;      lluvia[11] = 7;

        int acumulado = 0;

        for (int i = 0 ; i < lluvia.length ; i++)
        {
            System.out.println("La lluvia en " + meses[i] + " es: " + lluvia[i] + " l/m2.");
            acumulado += lluvia[i];
        }

        System.out.println("La lluvia acumulada es: " + acumulado);
        System.out.println("La lluvia promedio es: " + acumulado/12);

        for(String nombreMes : meses)
            System.out.println(nombreMes);

    }
}
