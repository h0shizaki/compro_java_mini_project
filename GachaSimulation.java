import java.util.Scanner ;
class GachaSimulation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        int coin = 150;
        String prizeList = "";
        

        //select 1.Gacha 2.Exchange coin to item 3.Show inventory
        sayHello();

        //check mode
        System.out.print("Select mode : ");
        char mode = input.nextLine().charAt(0);

        while(mode != 'x' && mode != 'X'){
            
            if(mode == 'G' || mode == 'g'){
                //do show coins -> random -> give prize -> return
                System.out.println("You have " + coin + " coins");
                System.out.print("How many coin you will use :");
                int useCoin = input2.nextInt();
                //check use coin
                if(useCoin <= 0){
                    System.out.print("Please enter coin number again :");
                    useCoin = input2.nextInt();
                }

                //gacha
                if(checkCoin(coin ,useCoin)){
                    coin -= useCoin;
                    coin += doRandom(useCoin) ;
                    System.out.println("You have " + coin + " coins");
                }

            }
            else if(mode == 'E' || mode == 'e'){
                //do show coin -> show item list -> select item -> delete coin -> return item
                System.out.println("You have "+ coin+ " coins \n");
                showPrizeList();
                System.out.print("Enter number of item or enter 0 to cancel : ");
                int selectedItem = input3.nextInt();
                
                switch(selectedItem){
                    case 0 : {
                        System.out.println("Canceled");
                        break;}
                    //do exchange step one delete coin two add item into list    
                    case 1 : {
                        System.out.println("*You got Instant noodle*");
                        if(checkCoin(coin,100)){
                            coin -= 100;
                            prizeList += "\tInstant noodle \n";
                        }
                        break;
                    }
                    case 2 : {
                        System.out.println("*You got Anime figure*");
                        if(checkCoin(coin,500)){
                            coin -= 500;
                            prizeList += "\tAnime figure \n";
                        }
                        break;
                    }
                    case 3 : {
                        System.out.println("*You got iPhone 12*");
                        if(checkCoin(coin,1000)){
                            coin -= 1000;
                            prizeList += "\tiPhone 12 \n";
                        } 
                        break;
                    }
                    case 4 : {
                        System.out.println("*You got Nvidia RTX 3080*");
                        if(checkCoin(coin,2000)){
                            coin -= 2000;
                            prizeList += "\tNvidia RTX 3080 \n";
                        }  
                        break;
                    }
                    default :{
                        System.out.println("Wrong input number");
                        break;
                    }
                }

            }
            else if(mode == 'I' || mode == 'i'){
                //show itemlist -> return
                System.out.println("\t -----Your item list----- \t");
                System.out.println("\tYou have "+ coin+ " coins");
                //show item
                System.out.println(prizeList);

            }
            else {
                System.out.println("Please input the command again");
            }

            System.out.print("Select mode : ");
            mode = input.nextLine().charAt(0);
        }

        sayBye();

    }

    public static void sayHello(){
        System.out.println();
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||                                                      ||");
        System.out.println("||      Enter G to start Gacha using 1 coin per roll    ||");
        System.out.println("||      Enter E to open exchange menu                   ||");
        System.out.println("||      Enter I to show your item list                  ||");
        System.out.println("||      Enter X to exit program                         ||");
        System.out.println("||                                                      ||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println();
    }

    public static void sayBye(){
        System.out.println();
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||                                                      ||");
        System.out.println("||              Thank you and good luck!                ||");
        System.out.println("||                                                      ||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println();
    }

    public static boolean checkCoin(int playerCoin, int useCoin){
        if(playerCoin >= useCoin && playerCoin > 0){
            return true;
        }
        else {
            System.out.println("Not enough coin");
        }
        return false;
    }

    public static int doRandom(int time){
        int prize = 0;

        for(int count = 1; count <= time ;count++){
            int luckyNum = (int)(System.currentTimeMillis()%10);
            int userNum = (int)((System.currentTimeMillis()*Math.PI) %10) ;
            if(userNum == luckyNum ){
                System.out.println("["+count+"th roll] Jackpot!");
                System.out.println(":You got more 20 coins:");
                prize += 20;
            }
            else {
                System.out.println("["+count+"th roll] Bad luck");
            }
        }

        return prize;      
    }

    public static void showPrizeList(){
        System.out.println("Here is the item list");
        System.out.println( "[1] : Instant noodle costs 100 coins");
        System.out.println( "[2] : Anime figure costs 500 coins");
        System.out.println( "[3] : iPhone 12 costs 1000 coins");
        System.out.println( "[4] : Nvidia RTX 3080 costs 2000 coins");
    }


    
}