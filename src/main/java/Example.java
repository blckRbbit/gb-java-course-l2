import some.Log;
import some.Some;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Example {
    static Logger logger = Log.log(Example.class.getName());

    public static void main(String[] args) {
//        int x;
//        int number;
//
//        try {
//            // код который выполнится если не произойдет исключений
//        }
//        catch (IOException e) {
//            // любой код, который нужно выполнить при возникновении исключения
//        } catch (ReflectiveOperationException ex) {
//
//        }
        Some some = new Some();
        some.setSome(12);
        System.out.println(some.getSome());
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        String[] split = json.split("},");
        System.out.println(Arrays.toString(split));

        logger.log(Level.INFO, "Мы запустили мэйн");
    }
}
