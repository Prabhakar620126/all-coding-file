#include<stdio.h>
int main(){
    struct pokemon
    {
        int hp;
        int speed;
        int attack;
        char tier;
    };
    struct pokemon pikachu;
    pikachu.attack = 60;
    pikachu.hp =50;
    pikachu.speed = 100;
    pikachu.tier = 'A';


    struct pokemon chaizard;
    chaizard.attack = 70;
    chaizard.hp = 60;
    chaizard.speed = 200;
    chaizard.tier = 'S';
    printf("%d,%d ,%c ",pikachu.attack ,chaizard.attack , pikachu.tier);
    
    

    
    return 0;
}