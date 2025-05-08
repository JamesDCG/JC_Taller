
//Nombres: James Columba, Jean Peralta

package Paso1;

public class Main {
    public static void main(String[] args) {

        String[] ciudades = {"Quito", "Guayaquil", "Cuenca"};

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril" , "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        int[][] lluvia = {
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11},
                {10, 20, 15, 18, 22, 25, 30, 28, 27, 20, 19, 15},
                {5, 6, 7, 5, 6, 4, 3, 4, 5, 6, 5, 7}
        };

        for (int ciudad = 0; ciudad < ciudades.length; ciudad++)
        {
            int lluviaTotal = 0;

            System.out.println("\nCiudad: " + ciudades[ciudad]);
            for (int mes = 0; mes < meses.length; mes++)
            {
                System.out.println("La lluvia en " + meses[mes] + " es: " + lluvia[ciudad][mes] + " l/m2");
                lluviaTotal += lluvia[ciudad][mes];
            }

            int promedio = lluviaTotal / 12;
            System.out.println("La lluvia total en " + ciudades[ciudad] + " es: " + lluviaTotal + " l/m2");
            System.out.println("El promedio de la lluvia en " + ciudades[ciudad] + " es: " + promedio + " l/m2");
        }
    }
}
