import Human.Human;
import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Human john = new Human("brown", 10);
        Human jacob = new Human("brown", LocalDate.of(2001, 12,07), 10);
        Human jeff = new Human();
        System.out.println(jacob.getAgeLocal());
        System.out.println(john.getAgeLocal());

        Human[][] humans = new Human[1][3];
        humans[0][0]=john;
        humans[0][1]=jacob;
        humans[0][2]=jeff;
//        for (int i=0; i < humans.length; i++){
//            System.out.println(humans[i]);
//        }

        for (int i=0; i<humans.length; i++){
            for (int j=1; j<humans[i].length; j+=2){
                humans[i][j].setEyeColour("blue");
                System.out.println(humans[i][j]);
            }
        }
    }
}