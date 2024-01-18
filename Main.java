import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstMenu = "S";
        while (firstMenu.equals("S")) {
            System.out.println("Você deseja converter uma temperatura S/N:");
            firstMenu = scanner.nextLine().toUpperCase();
            if(firstMenu.equals("S")){
                System.out.println("Digite a temperatura em Celsius:");
                Float temperatura = Float.valueOf(scanner.nextLine());
                System.out.println("Digite a Digite F para fahrenheit ou K para Kelvin:");
                String tipoDeTemperatura = scanner.nextLine();
                conversor(tipoDeTemperatura, temperatura);
            }else {
                System.out.println("Até a próxima...");
            }
        }
    }

    private static void conversor(String tipoDeTemperatura, Float temperatura) {
        if("F".equals(tipoDeTemperatura)){
            System.out.println(" Sua temperatura em fahrenheit é " +(temperatura * 1.8) + 32);
    }else{
            System.out.println("Sua temperatura em Kelvin é " + (temperatura + 273.15));
        }
    }
}