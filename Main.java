public class Main {

    public static void main(String[] args) {

        //Ejercicio if
        int numeroIf = 0;

        if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es cero");
        };

        //Ejercicio While
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        };

        //Ejercicio Do While
        int numeroDoWhile = 2;

        do {
            System.out.println(numeroDoWhile)
            numeroDoWhile++
        } while (numeroDoWhile < 3);

        //Ejercicio For
        for(numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        };

        //Ejercicio Switch
        var estacion = "verano";

        switch(estacion) {
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case default:
                System.out.println(estacion + "no es una estación");
        }
    }

}
