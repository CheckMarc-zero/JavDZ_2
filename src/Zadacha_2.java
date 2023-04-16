import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Zadacha_2 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");

        int size = input.nextInt();
        int array[] = new int[size];

        System.out.println("Введите элементы массива: ");

        for (int i=0; i<size ; i++){
            array[i] = input.nextInt();
        }

        System.out.print("Введенный массив: ");
        for (int i =0; i<size; i++){
            System.out.print(" "+array[i]);
        }

        System.out.println();

        int max = array[0];

        Logger logger = Logger.getLogger(Zadacha_2.class.getName());
        FileHandler fh = new FileHandler("log.xml");


        for (int i=1; i<size; i++){
            if (array[i]>max) max=array[i];
            logger.addHandler(fh);
            XMLFormatter xml = new XMLFormatter();
            fh.setFormatter(xml);
            logger.log(Level.WARNING,"Test");
            logger.info("Test norm.");

        }

        System.out.println("Максимальное значение в массиве: "+ max);

    }
}
