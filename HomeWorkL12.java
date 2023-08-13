package lesson12.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class HomeWork {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>(
                Arrays.asList("Andorra", "Belize", "Cayman", "France", "Argentina", "Cuba", "Sweden"));
        List<String> words =
                Arrays.asList("Andorra", "Canada", "First", "candy", "Argentina", "wood", "parrot", "cat", "Alan", "Cuba", "Finland", "Axelrod" , "Avangard", "Cuba");

        countries.retainAll(words);

        System.out.println(countries);

        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext())
        {
            String country = iterator.next();
            if (!country.startsWith("A"))
                iterator.remove();
            System.out.println(countries);
        }
    }
}
