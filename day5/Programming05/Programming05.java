package assignment;

public class Programming05 {

    public static void main(String[] args) {

        Phone[] phones = {
                new Phone("황진이"),
                new Telephone("길동이", "내일"),
                new Smartphone("민국이", "갤러그")
        };

        for (Phone phone : phones) {

            if (phone instanceof Smartphone) {

                Smartphone smartphone = (Smartphone) phone;
                smartphone.playGame();

            } else if (phone instanceof Telephone) {

                Telephone telephone = (Telephone) phone;
                telephone.autoAnswering();

            } else {

                phone.talk();
            }
        }
    }
}