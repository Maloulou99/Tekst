public class Main {

    //EksamensOpgave TekstLinjer øvelse 1

    public static void main(String[] args){

        Tekst tekst = new Tekst();
        tekst.tilføj("Hej");
        tekst.tilføj("Hej");
        tekst.tilføj("farvel");


        System.out.println(tekst.tilføjAntalUnikke());
    }
}
