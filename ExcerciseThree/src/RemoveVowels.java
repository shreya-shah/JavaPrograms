public class RemoveVowels {
    public static void main(String[] args) {
        RemoveVowels removeVowels = new RemoveVowels();
        String[] places = {"India","United States","Germany","Egypt","czechoslovakia"};
        places = removeVowels.getWithoutVowels(places);

        for(int i=0;i<places.length;i++){
            System.out.println("Place Name without Vowels:"+(i)+" "+places[i]);
        }
    }

    public String[] getWithoutVowels(String[] places) {
        for (int i=0;i<places.length;i++){
            places[i] = places[i].replaceAll("[aeiou]","");
        }

        return places;
    }
}
