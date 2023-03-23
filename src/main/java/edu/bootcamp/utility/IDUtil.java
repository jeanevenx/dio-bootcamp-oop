package edu.bootcamp.utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class IDUtil {

    public static String uniqueID(String string){

        int randomNumber = (int) Math.random();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss");
        String formatDateTime = now.format(format);

        return "ID:" + randomNumber + formatDateTime + string;

    }


}
