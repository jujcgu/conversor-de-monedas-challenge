import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConversionMoneda conversion = new ConversionMoneda();
        String divisaO = "", divisaD = "";
        Double cantidad = 0.0;
        String mensajeIngreso = "Ingrese el valor que desea convertir\r";
        try {
            while (true) {
                System.out.println("************************************\r");
                System.out.println("Sea bienvenido/a al Conversor de Moneda =]\r");
                System.out.println("\r1) Dolar =>> Peso argentino\r");
                System.out.println("2) Peso argentino =>> Dolar\r");
                System.out.println("3) Dolar =>> Real Brasileno\r");
                System.out.println("4) Real Brasileno =>> Dolar\r");
                System.out.println("5) Dolar =>> Peso colombiano\r");
                System.out.println("6) Peso colombiano =>> Dolar\r");
                System.out.println("7) Salir\r");
                System.out.println("Elija una opcion valida: \r");
                System.out.println("************************************\r\r");
                Integer opcion = Integer.valueOf(lectura.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.println(mensajeIngreso);
                        divisaO = "USD";
                        divisaD = "ARS";
                        cantidad = Double.valueOf(lectura.nextLine());
                        break;
                    case 2:
                        System.out.println(mensajeIngreso);
                        divisaO = "ARS";
                        divisaD = "USD";
                        cantidad = Double.valueOf(lectura.nextLine());
                        break;
                    case 3:
                        System.out.println(mensajeIngreso);
                        divisaO = "USD";
                        divisaD = "BRL";
                        cantidad = Double.valueOf(lectura.nextLine());
                        break;
                    case 4:
                        System.out.println(mensajeIngreso);
                        divisaO = "BRL";
                        divisaD = "USD";
                        cantidad = Double.valueOf(lectura.nextLine());
                        break;
                    case 5:
                        System.out.println(mensajeIngreso);
                        divisaO = "USD";
                        divisaD = "COP";
                        cantidad = Double.valueOf(lectura.nextLine());
                        break;
                    case 6:
                        System.out.println(mensajeIngreso);
                        divisaO = "COP";
                        divisaD = "USD";
                        cantidad = Double.valueOf(lectura.nextLine());
                        break;
                    default:
                        break;
                }                

                if (opcion.equals(7)) {
                    System.out.println("\rHasta luego, vuelva pronto");
                    break;
                }

                ValorCambio valorCambio = conversion.parametrosCambio(divisaO, divisaD, cantidad);
                System.out.println("El valor " + cantidad + " " + divisaO + " Corresponde al valor final de =>>> "
                        + valorCambio.getConversionResult() + " " + divisaD);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación.");
        }

    }
}
