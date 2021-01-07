import java.util.Scanner;

public class ChallengeSetEight {
 static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        story();
    }

    //all of the pages
    static pages page0 = new pages("Your wake up on the floor of a dark house. \nTheres a door behind you, stairs leading \nup to your left, and a hallway you \ncant see down in front of you. \nwhat do you do?\n1: open the door\n2: walk up the stairs\n3: walk down the hallway",1,2,3);
    static pages page1 = new pages("You try to open the door but its locked.\n1: Walk up the stairs\n2: Walk down the hallway" ,2,3);
    static pages page2 = new pages("You walk up the stairs and find 2 doors.\n1: Go in the first door\n2: Go in the second door\n3: Go back down the stairs",7,6,3);
    static pages page3 = new pages("You walk down the hallway into the kitchen. you see a shelf and a sink\n1: Go to the shelf\n2: Go to the sink\n2: Go back to the stairs",4,5,2);
    static pages page4 = new pages("You go to the shelf and find a key. You take the key to the front door and unlock it. THE END",1,2,3);
    static pages page5 = new pages("You go to the sink and try to turn it on but it doesn't work.\n1: Go back to the stairs\n2: GO to the shelf");
    static pages page6 = new pages("You open the door and walk into the room. the room is empty but theres a window in the corner.\n1: Break the window\n2: Go back downstairs" ,8,3);
    static pages page7 = new pages("The first door is locked.\n1: try to open the other door\n2: go back downstairs",6,3);
    static pages page8 = new pages("You break the window and climb down to the street. THE END");

    //takes the users input and prints the pages
    public static void story(){
        String end = "yes";
        int input;
        int nextPage;
        int currentPage = 0;
        while (end.equals("yes")) {
            while (1!=0) {
                if (currentPage == 0){
                    System.out.println(page0.getPageText());
                    if (page0.getNumChoices() > 0) {
                        input = myScanner.nextInt();
                        if (input == 1) {
                            currentPage = page0.getChoice1PageNum();
                        }
                        if (input == 2) {
                            currentPage = page0.getChoice2PageNum();
                        }
                        if (input == 3 && page0.getNumChoices() == 3) {
                            currentPage = page0.getChoice3PageNum();
                        }
                    }
                }
                if (currentPage == 1){
                    System.out.println(page1.getPageText());
                    if (page1.getNumChoices() > 0) {
                        input = myScanner.nextInt();
                        if (input == 1) {
                            currentPage = page1.getChoice1PageNum();
                        }
                        if (input == 2) {
                            currentPage = page1.getChoice2PageNum();
                        }
                        if (input == 3 && page1.getNumChoices() == 3) {
                            currentPage = page1.getChoice3PageNum();
                        }
                    }
                }
                if (currentPage == 2){
                    System.out.println(page2.getPageText());
                    if (page2.getNumChoices() > 0) {
                        input = myScanner.nextInt();
                        if (input == 1) {
                            currentPage = page2.getChoice1PageNum();
                        }
                        if (input == 2) {
                            currentPage = page2.getChoice2PageNum();
                        }
                        if (input == 3 && page2.getNumChoices() == 3) {
                            currentPage = page2.getChoice3PageNum();
                        }
                    }
                }
                if (currentPage == 3){
                    System.out.println(page3.getPageText());
                    if (page3.getNumChoices() > 0) {
                        input = myScanner.nextInt();
                        if (input == 1) {
                            currentPage = page3.getChoice1PageNum();
                        }
                        if (input == 2) {
                            currentPage = page3.getChoice2PageNum();
                        }
                        if (input == 3 && page3.getNumChoices() == 3) {
                            currentPage = page3.getChoice3PageNum();
                        }
                    }
                }
                if (currentPage == 4){
                    System.out.println(page4.getPageText());
                    if (page4.getNumChoices() > 0) {
                        input = myScanner.nextInt();
                        if (input == 1) {
                            currentPage = page4.getChoice1PageNum();
                        }
                        if (input == 2) {
                            currentPage = page4.getChoice2PageNum();
                        }
                        if (input == 3 && page4.getNumChoices() == 3) {
                            currentPage = page4.getChoice3PageNum();
                        }
                    }
                }
                if (currentPage == 5){
                    System.out.println(page5.getPageText());
                    if (page5.getNumChoices() > 0) {
                        input = myScanner.nextInt();
                        if (input == 1) {
                            currentPage = page5.getChoice1PageNum();
                        }
                        if (input == 2) {
                            currentPage = page5.getChoice2PageNum();
                        }
                        if (input == 3 && page5.getNumChoices() == 3) {
                            currentPage = page5.getChoice3PageNum();
                        }
                    }
                }
                if (currentPage == 6){
                    System.out.println(page6.getPageText());
                    if (page6.getNumChoices() > 0) {
                        input = myScanner.nextInt();
                        if (input == 1) {
                            currentPage = page6.getChoice1PageNum();
                        }
                        if (input == 2) {
                            currentPage = page6.getChoice2PageNum();
                        }
                        if (input == 3 && page6.getNumChoices() == 3) {
                            currentPage = page6.getChoice3PageNum();
                        }
                    }
                }
                if (currentPage == 7){
                    System.out.println(page7.getPageText());
                    if (page7.getNumChoices() > 0) {
                        input = myScanner.nextInt();
                        if (input == 1) {
                            currentPage = page7.getChoice1PageNum();
                        }
                        if (input == 2) {
                            currentPage = page7.getChoice2PageNum();
                        }
                        if (input == 3 && page7.getNumChoices() == 3) {
                            currentPage = page7.getChoice3PageNum();
                        }
                    }
                }
                if (currentPage == 8){
                    System.out.println(page8.getPageText());
                    if (page8.getNumChoices() > 0) {
                        input = myScanner.nextInt();
                        if (input == 1) {
                            currentPage = page0.getChoice1PageNum();
                        }
                        if (input == 2) {
                            currentPage = page8.getChoice2PageNum();
                        }
                        if (input == 3 && page8.getNumChoices() == 3) {
                            currentPage = page8.getChoice3PageNum();
                        }
                    }
                }
                System.out.println("would you like to play again?");
                end = myScanner.next();
                if (end.equals("yes")){
                    currentPage = 0;
                }
            }
        }
    }
}