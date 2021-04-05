#include<iostream>
using namespace std;
int a=1;
int funcion(int numln){
  a=a+1;
  int numfin =numln*numln;
  return numfin;
}
int main(){
  cout<<(a+2 *funcion(2))<<endl;
  cout<<funcion(2);
}