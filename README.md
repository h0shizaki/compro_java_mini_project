# Mini-project
This program will do a gacha simulation. you will start at 150 coins which 1 coin can roll 1 gacha pull.
  then you can exchange the coins to the item in the list.

## Inspiration
I always have a bad luck in a gacha game and I want to spread my emotion.  

# How to play
**Select mode**  
Enter G or g to play gacha 🎲  
Enter E or e to exchange coin to item 🪙  
Enter I or i to open your item list 👜  

## Gacha (G)
🥇Jackpot rate is 1/10 and prize is 20 coins
```Java
int luckyNum = (int)(System.currentTimeMillis()%10); //jackpot number
int userNum = (int)((System.currentTimeMillis()*Math.PI) %10) ; //user random number
```
    
How to gacha
- Enter number of coin  
- Pray for jackpot
- Get the result 

## Exchange (E)
There are 4 items which can exchange.  
- First is Instant noodle, it costs 100 coins.  
- Second is Anime figure, it costs 500 coins.  
- Third is iPhone 12, it costs 1000 coins.  
- Fourth is Nvidia RTX 3080, it costs 2000 coins.  

## Item list (I)
Display your inventory.
