package annotation;
public class AnnotationUse {
    @ShowLog(showMessage = "Hi this is ShowDetails method",userName = "Current user is Arpit", logType = LogType.INFO)
    public void showDetails() {


        System.out.println("This is show Details method");

    }
    public static void main(String[] args) {
    AnnotationUse annotationUse = new AnnotationUse();
    annotationUse.showDetails();
    }
}
