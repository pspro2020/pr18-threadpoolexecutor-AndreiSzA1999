import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Pow implements Runnable {

    double numero;
    private DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm:ss");

    public Pow(double numero) {
        this.numero = numero;
    }


    @Override
    public void run() {

        for (int i = 0; i <= 10; i++) {

            System.out.printf("%s -> %s -> %.0f ^ %.0f = %.0f\n", LocalTime.now().format(hora), Thread.currentThread().getName(), numero, (double) i, Math.pow(numero, i));
        }


    }
}
