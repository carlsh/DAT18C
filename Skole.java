public class Skole {
   public static void main(String[] args) {
   
//Lav instantser af studerende
Studerende nyElev1 = new Studerende("Morten", "FoersteKlasse", 75.5, 182);
Studerende nyElev2 = new Studerende("Kim", "AndenKlasse", 82.4, 190);
Studerende nyElev3 = new Studerende("Lars", "TredjeKlasse", 79.6, 174);
// test af get/set //System.out.println(nyElev1.getNavn() + " går i " + nyElev1.getKlasse());

System.out.println("Skolens Elever:");
System.out.println(nyElev1.getNavn() + " gaar i " + nyElev1.getKlasse() + " vejer " + nyElev1.getVaegt() + " tårner " + nyElev1.getHoejde());
System.out.println(nyElev2.getNavn() + " gaar i " + nyElev2.getKlasse());
System.out.println(nyElev3.getNavn() + " gaar i " + nyElev3.getKlasse());



   }
}