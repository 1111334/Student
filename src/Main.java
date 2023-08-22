import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*Implementa un metodo printFirstThreeLetters che accetta un array di oggetti String come
        parametro e stampa sul terminale le prime 3 lettere di ogni elemento dell'array.*/
        /*2. Implementare un metodo thirdLettersChains che accetta un array di oggetti String e un
        intero n come parametri e restituisce una stringa risultante dalla concatenazione di
        terzi caratteri dei primi n elementi dell'array.*/
        /*3. Dichiarare una classe Person con le seguenti variabili di istanza:
        - firstName: stringa
                - cognome: stringa
                - età: int*/
        /*4. Implementare un metodo principale in cui:
        - Viene assegnato un array di 3 oggetti Persona.
        - Un array di stringhe contenente i valori dell'attributo lastName per every
        Oggetto persona nell'array allocato in precedenza.
                - Il metodo printFirstThreeLetters viene chiamato passando l'array allocato come
        parametro.
                - Il metodo thirdLettersChains viene chiamato passando l'array allocato come
        parametro e n = 2 e il suo risultato viene stampato sullo schermo.
        - Vengono stampati i valori dell'attributo age per ogni oggetto nell'array
        schermo.*/

        Person[] person = {
                new Person("Marco", "cascino", 25),
                new Person("Luca", "rossi", 44),
                new Person("Giuseppe", "brambilla", 56),
        };

        String[] lastNamesArray = new String[person.length];

        for (int i = 0; i < person.length; i++) {
            lastNamesArray[i] = person[i].getLastName();
        }

        for (String lastName : lastNamesArray) {
            System.out.println(lastName);
        }

        printFirstThreeLetters(lastNamesArray);

        String result = thirdLettersChains(lastNamesArray, 2);
        System.out.println(result);

        for (Person personArray : person) {
            System.out.println(personArray.getAge());

        }


    }
    public static void printFirstThreeLetters(String[] arrayString) {
        for (String str : arrayString) {
            if (str.length() >= 3) {
                String threeLetters = str.substring(0,3);
                System.out.println(threeLetters);
            }
        }
    }

    public static String thirdLettersChains(String[] arr, int n) {
        String result = "";
        for (int i = 0; i < n && i < arr.length; i++) {
            char a = arr[i].charAt(2);
            result = result + a;
        }

        return result;

    }

}