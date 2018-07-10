import java.io.*;
import java.util.*;

public class CardArray
{
    protected List<String> cardsArray = new ArrayList<>();

    public CardArray() throws IOException {
        FileReader fr = new FileReader("src/card.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;
        while ((s = br.readLine()) != null)
        {
            cardsArray.add(s);
        }
        cardsArray.remove(0);
        String supertrump1 = "The Mineralogist,null,null,null,null,null";
        String supertrump2 = "The Geologist,null,null,null,null,null";
        String supertrump3 = "The Geophysicist,null,null,null,null,null";
        String supertrump4 = "The Petrologist,null,null,null,null,null";
        String supertrump5 = "The Miner,null,null,null,null,null";
        String supertrump6 = "The Gemmologist,null,null,null,null,null";
        cardsArray.add(supertrump1);
        cardsArray.add(supertrump2);
        cardsArray.add(supertrump3);
        cardsArray.add(supertrump4);
        cardsArray.add(supertrump5);
        cardsArray.add(supertrump6);
    }

    public List<String> getCardsArray() {
        return cardsArray;
    }
}
