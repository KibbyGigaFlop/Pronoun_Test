import javax.swing.JOptionPane;

//DATA STORAGE


//Below is to start program.
class Adventure {

    public static void main(String[] args){

        //Name, age, pronouns, class
    
        String playerName;
        int playerAgeParsed;
        String numberOption;
        int optionParse;
        
        String playerClass;
        String playerAgeString;
        String[] pronounTypes = {"subject", "object", "possessive adjective", "possessive pronoun", "reflexive"};

        String[] girl = {"she", "her", "her", "hers", "herself"};
        String[] boy = {"he", "him", "his", "his", "himself"};
        String[] neutral = {"they", "them", "their", "theirs", "themselves"};
        String[] customPlayerPronouns = new String[5]; //Object, PossessiveAdj., possessivepron,reflexpronouns

        ////////////////
        
        JOptionPane.showMessageDialog(null, "Hello traveler! Welcome to HelloWorld. Please tell us about yourself to begin.");
        
        playerName = JOptionPane.showInputDialog("What is your name, traveler?");
        playerName = JOptionPane.showInputDialog("You entered in " + playerName + ". Want to reenter that?");
        playerAgeString = JOptionPane.showInputDialog("You have a wonderful name, " + playerName + ". How old are you?");
            playerAgeParsed = Integer.parseInt(playerAgeString);
        
        JOptionPane.showMessageDialog(null, "Excellent. What are your pronouns? To make sure we get it \n right, please enter your pronouns in the \n object, possessive object, possessive pronoun, and reflexive forms.");
    
        numberOption = JOptionPane.showInputDialog("What are your pronouns? You can select from a pre-determined list or enter in custom pronouns.\n Enter 1 for girl, 2 for boy, 3 for neutral, or 4 for custom pronouns.");
            optionParse = Integer.parseInt(numberOption);
        
           if (optionParse == 4){
            for (int i=0;i<5;i++){
        
                customPlayerPronouns[i] = JOptionPane.showInputDialog((i+1) + ". " + "What are your pronouns in the " + pronounTypes[i] + " form?");
        
            }
           }
            
    
        playerClass = JOptionPane.showInputDialog("Awesome! Last question, what class are you?");
    
    
        switch (optionParse) {
            case 1:
                JOptionPane.showMessageDialog(null, "Okay. So your story begins as such...");
                JOptionPane.showMessageDialog(null, "There once was a " + playerClass + " named " + playerName + "...");
                JOptionPane.showMessageDialog(null, "At the age of " + playerAgeParsed + ", " + girl[0] + " decided to leave " + 
                girl[2] + " home, craving the taste of adventure!");
                JOptionPane.showMessageDialog(null, "With only " + girl[2] + " weapon, a few belongings of \n" + girl[3] + ", " + girl[4] + " and " 
                + girl[2] + " wit, " + girl[0] + " set off.");
                break;
                
            case 2:
                JOptionPane.showMessageDialog(null, "Okay. So your story begins as such...");
                JOptionPane.showMessageDialog(null, "There once was a " + playerClass + " named " + playerName + "...");
                JOptionPane.showMessageDialog(null, "At the age of " + playerAgeParsed + ", " + boy[0] + " decided to leave " + 
                boy[2] + " home, craving the taste of adventure!");
                JOptionPane.showMessageDialog(null, "With only " + boy[2] + " weapon, a few belongings of \n" + boy[3] + ", " + boy[4] + " and " 
                + boy[2] + " wit, " + boy[0] + " set off.");
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Okay. So your story begins as such...");
                JOptionPane.showMessageDialog(null, "There once was a " + playerClass + " named " + playerName + "...");
                JOptionPane.showMessageDialog(null, "At the age of " + playerAgeParsed + ", " + neutral[0] + " decided to leave " + 
                neutral[2] + " home, craving the taste of adventure!");
                JOptionPane.showMessageDialog(null, "With only " + neutral[2] + " weapon, a few belongings of \n" + neutral[3] + ", " + neutral[4] + " and " 
                + neutral[2] + " wit, " + neutral[0] + " set off.");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Okay. So your story begins as such...");
                JOptionPane.showMessageDialog(null, "There once was a " + playerClass + " named " + playerName + "...");
                JOptionPane.showMessageDialog(null, "At the age of " + playerAgeParsed + ", " + customPlayerPronouns[0] + " decided to leave " + 
                customPlayerPronouns[2] + " home, craving the taste of adventure!");
                JOptionPane.showMessageDialog(null, "With only " + customPlayerPronouns[2] + " weapon, a few belongings of \n" + customPlayerPronouns[3] + ", " + customPlayerPronouns[4] + " and " 
                + customPlayerPronouns[2] + " wit, " + customPlayerPronouns[0] + " set off.");
                break;
        
            default:
                break;
        }
    }
    
    


}
