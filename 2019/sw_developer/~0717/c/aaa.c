#include <stdio.h>
#include <stdlib.h>

typedef struct user {
   int uuid;
}User;
User new_User(int id) {
   User* p;
   p = (User*)malloc(sizeof(User*));
   p->uuid = id;
   return *p;
}

int main() {
   User user = new_User(1219);
   printf("UUID: %d\n", user.uuid);
   User aaa = new_User(1111);
   printf("UUUID: %d\n", aaa.uuid);
   printf("UUID: %d\n", user.uuid);
}