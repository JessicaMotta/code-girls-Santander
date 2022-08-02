package EstruturaPliforfismo;

public class RodarAplicacao {
    public static void main(String[] args) {
        ClasseMae[] classes = new ClasseMae[]{new Classefilha1(), new Classefilha2(), new ClasseMae()};

        for (ClasseMae classe : classes) {
            classe.metodo1();
        }

        System.out.println("");

        for (ClasseMae classe : classes)
            classe.metodo2();
        }

        System.out.println("");

        Classefilha1 classefilha11 = new Classefilha1();
        clasefilha2.metodo2();

    }
}
