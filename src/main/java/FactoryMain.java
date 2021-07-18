import com.phone.Android;
import com.phone.OS;
import com.phone.OperatingSystemFactory;

public class FactoryMain {
    public static void main(String[] args) {
        //in Factory Pattern I want to hide internal implementation of instating the objects
/*        OS operatingSystem = new Android();
        operatingSystem.spec();*/

        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
       OS obj= operatingSystemFactory.getInstancee("Closed");
       obj.spec();


    }
}
