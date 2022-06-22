public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;

        if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        } else if (numeroIf > 0){
            System.out.println("El numero es positivo");
        }
        else {
            System.out.println("El numero es cero");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println("Usando while: " + numeroWhile);
            numeroWhile++;
        }

        int numeroDoWhile = 3;
        do {
            System.out.println("Usando do while: " + numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("Usando for: " + numeroFor);
        }

        String estacion = "calor";

        switch (estacion){
            case "verano": System.out.println("Es verano");
                break;
            case "otoño": System.out.println("Es primavera");
                break;
            case "invierno":  System.out.println("Es invierno");
                break;
            case "primavera": System.out.println("Es primavera");
                break;
            default: System.out.println("No es una estacion");
                break;
        }
    }
}