#include<stdio.h>
#include<stdlib.h>

typedef struct apple
{
    int i;
    int add;
    /* data */
    // int (*add)(int, int);
}Apple;

int main(){
    //apple 구조체의 기억공간을 가리킬 수 있는 포인터 변수
    struct apple* t;

    ///포인터 변수가 해당 공간을 가리킴(malloc)
    //해당 공간은 로컬 변수가 아니라서 자동 삭제가 안됨

    //t=(struct apple*)malloc(sizeof(struct apple)); ////malloc == new? 주소 정해서 주는거니까?
    t=(Apple*)malloc(sizeof(Apple));

    t->i = 100;
    t->add = 20;
    //t->add = apple_add;

    printf("%d\n", (t->i + t->add));
    //t->add(100, 100);

    //t가 가리키는 대상 삭제
    free(t);

    return 0;
}