package com.example.exam.exception;

import com.example.exam.advice.ApplicationExceptionHandling;
import com.example.exam.from.AccountingLineXYZ;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ApplicationException extends RuntimeException{

public ApplicationException(){

    final Logger logger = LogManager.getLogManager().getLogger(ApplicationException.class.getName());

        try {
            FileWriter fw = new FileWriter(new File("C:\\Users\\COLLABERA\\Desktop\\Log File"));
            fw.close();
        } catch (IOException e) {
            logger.info("Unable to open file.");
        }
    }
}
