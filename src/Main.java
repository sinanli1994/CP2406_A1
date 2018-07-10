import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        List<String> p1 = new ArrayList<>();
        List<String> p2 = new ArrayList<>();
        List<String> p3 = new ArrayList<>();
        List<String> p4 = new ArrayList<>();
        List<String> p5 = new ArrayList<>();
        List<Double> comp = new ArrayList<>();
        List<Integer> win = new ArrayList<>();

        boolean quit = false;

        System.out.println("Welcome to Mineral Supertrumps!!!");
        int num = getplayer();
        getDealer(num);
        CardArray ca = new CardArray();
        List<String> cards = ca.getCardsArray();

        if (num == 3) {
            win.add(num);
            getCard(cards, p1);
            getCard(cards, p2);
            getCard(cards, p3);

            System.out.println("Game Start");
            printCards(p1);
            int cNum = stateCategory();
            String cate = category(cNum);
            cNum = playCard(p1,comp,cate,cNum);
            cate = category(cNum);

            while (!quit) {
                if (win.get(0) == 1)
                    quit = true;
                else {
                    if (!p2.isEmpty()) {
                        printCards(p2);
                        int option2 = playPass(comp, cate);
                        if (option2 == 1) {
                            cNum = playCard(p2, comp, cate, cNum);
                            cate = category(cNum);
                            if(p2.isEmpty())
                                win.set(0, win.get(0) - 1);
                        } else {
                            passAddCard(p2, cards);
                        }
                    }
                }

                if (win.get(0) == 1)
                    quit = true;
                else {
                    if (!p3.isEmpty()) {
                        printCards(p3);
                        int option3 = playPass(comp, cate);
                        if (option3 == 1) {
                            cNum = playCard(p3, comp, cate, cNum);
                            cate = category(cNum);
                            if(p3.isEmpty())
                                win.set(0, win.get(0) - 1);
                        } else {
                            passAddCard(p3, cards);
                        }
                    }
                }

                if (win.get(0) == 1)
                    quit = true;
                else {
                    if (!p1.isEmpty()) {
                        printCards(p1);
                        int option1 = playPass(comp, cate);
                        if (option1 == 1) {
                            cNum = playCard(p1, comp, cate, cNum);
                            cate = category(cNum);
                            if(p1.isEmpty())
                                win.set(0, win.get(0) - 1);
                        } else {
                            passAddCard(p1, cards);
                        }
                    }
                }
            }
        }
        if (num == 4) {
            win.add(num);
            getCard(cards, p1);
            getCard(cards, p2);
            getCard(cards, p3);
            getCard(cards, p4);

            System.out.println("Game Start");
            printCards(p1);
            int cNum = stateCategory();
            String cate = category(cNum);
            cNum = playCard(p1,comp,cate,cNum);
            cate = category(cNum);

            while (!quit) {
                if (win.get(0) == 1)
                    quit = true;
                else {
                    if (!p2.isEmpty()) {
                        printCards(p2);
                        int option2 = playPass(comp, cate);
                        if (option2 == 1) {
                            cNum = playCard(p2, comp, cate, cNum);
                            cate = category(cNum);
                            if(p2.isEmpty())
                                win.set(0, win.get(0) - 1);
                        } else {
                            passAddCard(p2, cards);
                        }
                    }
                }

                if (win.get(0) == 1)
                    quit = true;
                else {
                    if (!p3.isEmpty()) {
                        printCards(p3);
                        int option3 = playPass(comp, cate);
                        if (option3 == 1) {
                            cNum = playCard(p3, comp, cate, cNum);
                            cate = category(cNum);
                            if(p3.isEmpty())
                                win.set(0, win.get(0) - 1);
                        } else {
                            passAddCard(p3, cards);
                        }
                    }
                }

                if (win.get(0) == 1)
                    quit = true;
                else {
                    if (!p4.isEmpty()) {
                        printCards(p4);
                        int option4 = playPass(comp, cate);
                        if (option4 == 1) {
                            cNum = playCard(p4, comp, cate, cNum);
                            cate = category(cNum);
                            if(p4.isEmpty())
                                win.set(0, win.get(0) - 1);
                        } else {
                            passAddCard(p4, cards);
                        }
                    }
                }

                if (win.get(0) == 1)
                    quit = true;
                else {
                    if (!p1.isEmpty()) {
                        printCards(p1);
                        int option1 = playPass(comp, cate);
                        if (option1 == 1) {
                            cNum = playCard(p1, comp, cate, cNum);
                            cate = category(cNum);
                            if(p1.isEmpty())
                                win.set(0, win.get(0) - 1);
                        } else {
                            passAddCard(p1, cards);
                        }
                    }
                }
            }
        }
        if (num == 5) {
            win.add(num);
            getCard(cards, p1);
            getCard(cards, p2);
            getCard(cards, p3);
            getCard(cards, p4);
            getCard(cards, p5);

            System.out.println("Game Start");
            printCards(p1);
            int cNum = stateCategory();
            String cate = category(cNum);
            cNum = playCard(p1,comp,cate,cNum);
            cate = category(cNum);

            while (!quit) {
                if (win.get(0) == 1)
                    quit = true;
                else {
                    if (!p2.isEmpty()) {
                        printCards(p2);
                        int option2 = playPass(comp, cate);
                        if (option2 == 1) {
                            cNum = playCard(p2, comp, cate, cNum);
                            cate = category(cNum);
                            if(p2.isEmpty())
                                win.set(0, win.get(0) - 1);
                        } else {
                            passAddCard(p2, cards);
                        }
                    }
                }

                if (win.get(0) == 1)
                    quit = true;
                else {
                    if (!p3.isEmpty()) {
                        printCards(p3);
                        int option3 = playPass(comp, cate);
                        if (option3 == 1) {
                            cNum = playCard(p3, comp, cate, cNum);
                            cate = category(cNum);
                            if(p3.isEmpty())
                                win.set(0, win.get(0) - 1);
                        } else {
                            passAddCard(p3, cards);
                        }
                    }
                }

                if (win.get(0) == 1)
                    quit = true;
                else {
                    if (!p4.isEmpty()) {
                        printCards(p4);
                        int option4 = playPass(comp, cate);
                        if (option4 == 1) {
                            cNum = playCard(p4, comp, cate, cNum);
                            cate = category(cNum);
                            if(p4.isEmpty())
                                win.set(0, win.get(0) - 1);
                        } else {
                            passAddCard(p4, cards);
                        }
                    }
                }

                if (win.get(0) == 1)
                    quit = true;
                else {
                    if (!p5.isEmpty()) {
                        printCards(p5);
                        int option5 = playPass(comp, cate);
                        if (option5 == 1) {
                            cNum = playCard(p5, comp, cate, cNum);
                            cate = category(cNum);
                            if(p5.isEmpty())
                                win.set(0, win.get(0) - 1);
                        } else {
                            passAddCard(p5, cards);
                        }
                    }
                }

                if (win.get(0) == 1)
                    quit = true;
                else {
                    if (!p1.isEmpty()) {
                        printCards(p1);
                        int option1 = playPass(comp, cate);
                        if (option1 == 1) {
                            cNum = playCard(p1, comp, cate, cNum);
                            cate = category(cNum);
                            if(p1.isEmpty())
                                win.set(0, win.get(0) - 1);
                        } else {
                            passAddCard(p1, cards);
                        }
                    }
                }
            }
        }
        System.out.println("Game Over.");
    }

    public static int getplayer() {
        int playerNum = 0;
        boolean valid = false;

        while (!valid) {
            Scanner input = new Scanner(System.in);
            try {
                System.out.println("Please enter the number of players, 3 to 5 >>");
                playerNum = input.nextInt();
                if (playerNum < 3 || playerNum > 5) {
                    System.out.println("Invalid input, please enter again>> ");
                } else {
                    valid = true;
                    System.out.println(playerNum + " Players.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again>> ");
            }
        }
        return playerNum;
    }

    public static int getDealer(int numPlaryer) {
        int dealer;
        Random r = new Random();
        dealer = r.nextInt(numPlaryer) + 1;
        System.out.println("The dealer is player " + dealer);
        return dealer;
    }

    public static List getCard(List<String> cards, List<String> pList) {
        Collections.shuffle(cards);
        for (int i = 0; i < 8; ++i) {
            pList.add(cards.get(i));
            cards.remove(i);
        }
        return pList;
    }

    public static void printCards(List<String> pList) {
        int count = 0;
        String[] array;

        for (String e : pList) {
            ++count;
            array = e.split(",");
            System.out.println(count + "." + " Name: " + array[0] + " Hardness: " + array[1] + " Specific Gravity: " + array[2] + " Cleavage: " + array[3] +
                    " Crustal Abundance: " + array[4] + " Economic Value: " + array[5]);
        }
    }

    public static int stateCategory() {
        boolean valid = false;
        int category = 0;
        while (!valid) {
            Scanner in = new Scanner(System.in);
            try {
                System.out.println("1. Hardness\n2. Specific Gravity\n3. Cleavage\n4. Crustal Abundance\n5. Economic Value" +
                        "\nPlease state your category by entering the number");
                category = in.nextInt();
                if (category >= 1 && category <= 5) {
                    valid = true;
                } else {
                    System.out.println("Invalid input, please enter again >>");
                }
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again >>");
            }
        }
        return category;
    }

    public static int playCard(List<String> pList, List<Double> comp, String category, int cNum) {
        boolean v = false;
        int count3 = 0, numP = 0;
        String[] array, array2, array3, array4;

        while (!v) {
            int numPlay = 0, count = 0, count2 = 0;
            double compNum = 0.0;
            boolean valid = false;

            for (String e : pList) {
                ++count;
                array = e.split(",");
                System.out.println(count + "." + " Name: " + array[0] + " Hardness: " + array[1] + " Specific Gravity: " + array[2] + " Cleavage: " + array[3] +
                        " Crustal Abundance: " + array[4] + " Economic Value: " + array[5]);
            }

            if (comp.size() == 1)
                System.out.println("The category is " + category  + ". and previous card value is " + comp.get(0));
            else
                System.out.println("The category is " + category);

            System.out.println("Please enter the number of the card you want to play >>");

            while (!valid) {
                Scanner in = new Scanner(System.in);
                try {
                    numPlay = in.nextInt();
                    if (numPlay >= 0 && numPlay <= pList.size()) {
                        valid = true;
                    } else {
                        System.out.println("Invalid input, please enter again >>");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input, please enter again >>");
                }
            }

            for (String e : pList) {
                ++count2;
                array2 = e.split(",");
                if (numPlay == count2) {
                    if(array2[cNum].equals("null"))
                        v = true;
                    else {
                        switch (cNum) {
                            case 1:
                                compNum = Double.parseDouble(array2[cNum]);
                                break;
                            case 2:
                                compNum = Double.parseDouble(array2[cNum]);
                                break;
                            case 3:
                                compNum = transformCleavage(array2[cNum]);
                                break;
                            case 4:
                                compNum = transformCrustalAbundance(array2[cNum]);
                                break;
                            case 5:
                                compNum = transformEcoValue(array2[cNum]);
                                break;
                        }
                        comp.add(compNum);
                    }
                }
            }

            if (comp.size() == 2)
            {
                if (comp.get(1) <= comp.get(0)) {
                    System.out.println("This card's value is not higher than previous card, please play another card");
                    comp.remove(1);
                }
                else
                {
                    comp.remove(0);
                    v = true;
                }
            }
            else {
                v = true;
            }
            numP = numPlay;
        }


        for (String e : pList) {
            ++count3;
            array3 = e.split(",");
            if (numP == count3) {
                System.out.println(array3[0] + ", " + category + ", " + array3[cNum]);
                switch (array3[0])
                {
                    case "The Mineralogist":
                        cNum = 3;
                        comp.clear();
                        break;
                    case "The Geologist":
                        cNum = stateCategory();
                        comp.clear();
                        break;
                    case "The Geophysicist":
                        cNum = 2;
                        comp.clear();
                        for (String i: pList){
                            array4 = e.split(",");
                            if (array4[0].equals("Magnetite"))
                                pList.clear();
                        }
                        break;
                    case "The Petrologist":
                        cNum = 4;
                        comp.clear();
                        break;
                    case "The Miner":
                        cNum = 5;
                        comp.clear();
                        break;
                    case "The Gemmologist":
                        cNum = 1;
                        comp.clear();
                        break;
                }
            }
        }
        if (pList.size() != 0)
            pList.remove(numP - 1);

        return cNum;
    }


    public static int playPass(List<Double> comp, String category) {
        boolean valid = false;
        int numChoice = 0;

        if (comp.size() == 1)
            System.out.println("The category is " + category  + ". and previous card value is " + comp.get(0));
        else
            System.out.println("The category is " + category);

        while (!valid) {
            Scanner in = new Scanner(System.in);
            try {
                System.out.println("Do you want to play a card or pass, please enter '1' to play or '2' to pass>>");
                numChoice = in.nextInt();
                if (numChoice == 1 || numChoice == 2) {
                    valid = true;
                } else {
                    System.out.println("Invalid input, please enter again >>");
                }
            } catch (Exception e) {
                System.out.println("Invalid input, please enter again >>");
            }
        }
        return numChoice;
    }

    public static String category(int cNum)
    {
        String category = null;
        if (cNum == 1)
            category = "Hardness";
        if(cNum == 2)
            category = "Specific Gravity";
        if(cNum == 3)
            category = "Cleavage";
        if(cNum == 4)
            category = "Crustal Abundance";
        if(cNum == 5)
            category = "Economic Value";

        return category;
    }

    public static double transformCleavage(String c)
    {
        double tNum = 0;
        switch (c)
        {
            case "none":
                tNum = 0;
                break;
            case "poor/none":
                tNum = 1;
                break;
            case "1 poor":
                tNum = 2;
                break;
            case "2 poor":
                tNum = 3;
                break;
            case "1 good":
                tNum = 4;
                break;
            case "1 good/1 poor":
                tNum = 5;
                break;
            case "2 good":
                tNum = 6;
                break;
            case "3 good":
                tNum = 7;
                break;
            case "1 perfect":
                tNum = 8;
                break;
            case "1 perfect/1 good":
                tNum = 9;
                break;
            case "1 perfect/2 good":
                tNum = 10;
                break;
            case "2 perfect/1 good":
                tNum = 11;
                break;
            case "3 perfect":
                tNum = 12;
                break;
            case "4 perfect":
                tNum = 13;
                break;
            case "6 perfect":
                tNum = 14;
                break;
        }
        return tNum;
    }

    public static double transformCrustalAbundance(String ca)
    {
        double tNum = 0;
        switch (ca)
        {
            case "ultratrace":
                tNum = 0;
                break;
            case "trace":
                tNum = 1;
                break;
            case "low":
                tNum = 2;
                break;
            case "moderate":
                tNum = 3;
                break;
            case "high":
                tNum = 4;
                break;
            case "very high":
                tNum = 5;
                break;
        }
        return tNum;
    }

    public static double transformEcoValue(String cv)
    {
        double tNum = 0;
        switch (cv)
        {
            case "trivial":
                tNum = 0;
                break;
            case "low":
                tNum = 1;
                break;
            case "moderate":
                tNum = 2;
                break;
            case "high":
                tNum = 3;
                break;
            case "very high":
                tNum = 4;
                break;
            case "I'm rich!":
                tNum = 5;
                break;
        }
        return tNum;
    }

    public static void passAddCard(List<String> pCard, List<String> cards)
    {
        if (!cards.isEmpty())
        {
            pCard.add(cards.get(0));
            cards.remove(0);
        }
        else
            System.out.println("There is no remaining card");
    }
}
