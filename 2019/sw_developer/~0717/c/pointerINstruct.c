#include<stdio.h>
#include<stdlib.h>

typedef struct apple
{
    int i;
    int (*add)(int r, int c);
}Apple;

int apple_add(int i, int j){
    return i+j;
}

Apple* new_Apple(int j){
    Apple* n;
    n=(Apple*)malloc(sizeof(Apple));
    n->add = apple_add;
    n->i = j;
    return n;
}

int main(){

    Apple* t;
    t=new_Apple(100);

    printf("%d\n", (t->i + t->add(100, 100)));

    free(t);

    return 0;
}