#include<iostream>
#include <string>
#include <stdlib.h>
#include <math.h>

using namespace std;



int main(void){
	


	int i,n1, n2, poten,error, fac,fact;
	float resultado;
	char op, sumar, restar, multiplicar, dividir, potencia, factorial, salir;
	
	cout<<"Digite el Primer numero"<<endl;
	cin>>n1;
	cout<<"Digite el Segundo numero"<<endl;
	cin>>n2;
	cout<<"Los casos posibles son: \n1 sumar '+'\n2 restar '-'\n3 multiplicar '*'\n4 dividir '/'\n5 potencia '^'\n6 factorial '!'\n7 salir 'S'\n\n";
	cout<<"Digite el signo de la operacion que desea realizar"<<endl;
	cin>>op;	
	
	switch (op){
		case '+':
			resultado=n1+n2;
			cout<<"El resultado de la operacion es: "<<resultado<<endl;
			break;
		case '-': 
			resultado=n1-n2;
			cout<<"El resultado de la operacion es: "<<resultado<<endl;
			break;
		case '*':
			resultado=n1*n2;
			cout<<"El resultado de la operacion es: "<<resultado<<endl;
			break;
		case '/':
			resultado=n1/n2;
			cout<<"El resultado de la operacion es: "<<resultado<<endl;
			break;
		case '^':
			resultado= pow (n1, n2);
			cout<<"El resultado de la operacion es: "<<resultado<<endl;
			break;
		case '!':
			fac=n1;
			for(int i=1; i<n1; i++){
				fac=fac*i;	}	
			cout<<"el factorial de n1 es:"<<fac<<endl;
			
			fact=n2;
			for(int i=1; i<n2; i++)
				fact=fact*i;
				cout<<"el factorial de n2 es:"<<fact<<endl;
			
			break;
		case 'S':
			system("CLS");
			cout<<"El programa se cerro"<<endl;

}

}