package br.com.xti.logica.fibonacci;
public class DesafioFF{

public static void main(String[] args){

int anterior = 1; //n1
int proximo = 0;//n

	  //n<50
while(proximo < 50){

System.out.println(proximo);//n

proximo = proximo + anterior; //n = n + n1
anterior = proximo - anterior; // n1 = n - n1

}

}

}