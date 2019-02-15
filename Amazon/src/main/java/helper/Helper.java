package helper;

import base.CommonAPI;
import reporting.TestLogger;

import static base.CommonAPI.convertToString;

public class Helper extends CommonAPI {

    public void logger(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
    }
}
