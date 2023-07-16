public class Main {
    public static void main(String[] args) {
        System.out.println("Conversão de Celsius para Fahrenheit"); //título

        int celsius = 25; // temperatura em graus celsius
        double calculo = (celsius * 1.8) + 32; //cálculo para transformar celsius em fahrenheit
        int fahrenheit = (int) (calculo); //tirando a casa decimal

        //resultado completo
        System.out.println("A temperatura de " + celsius + "°C, é equivalente a " + fahrenheit + "°F.");
    }
}