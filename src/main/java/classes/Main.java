import org.studyeasy.Iphone;
import org.studyeasy.Nokia3310;
import org.studyeasy.Phone;
// polymorphism can be used by crating objects for a main class and subclasses which inerits properties of main class.
public class Main {
    public static void main(String[] args) {
//        Phone phone = new Phone();
//        phone.feature();
//
//        Nokia3310 nokia = new Nokia3310();
//        nokia.feature();
//
//        Iphone iphone = new Iphone();
//        iphone.feature();
// rather than creating every single seperate form,create a single object and then assign it various types or forms of objects.

          Phone phone;//create an object for class Phone 
// phone is an object of 'Phone' which can instantiate other forms or files using which we can easily acces them.
          phone = new Phone();//assign various forms for object Phone and access its contents
          phone.feature();
          phone = new Iphone();//assign various forms for object Phone and access its contents
          phone.feature();
          phone = new Nokia3310();//assign various forms for object Phone and access its contents
          phone.feature();

    }
}
