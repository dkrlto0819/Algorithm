#include<stdio.h>


double danri(double money, int repeat, double rate){
    return money + money*rate*repeat;
}

double bokri(double money, int repeat, double rate){
    for(int i=1;i<=repeat;i++) money += money*rate;
    return money;
}

int main(){
    double (*fp)(double r, int c, double n);
    double r;

    fp=danri;
    r=fp(100.0, 100, 0.066);
    printf("%f\n", r);

    fp=bokri;
    r=fp(100.0, 100, 0.066);
    printf("%f\n", r);
    return 0;
}