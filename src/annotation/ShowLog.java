package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface ShowLog {
    String showMessage();

    String userName() default "Java8";

    LogType logType();
}

enum LogType{
    INFO,
    ERROR,
    WARNING
}