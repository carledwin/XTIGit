package br.com.xti.logica.fibonacci;
public class DesafioF{
public static void main(String[] args){
//System.out.print("ou");

int anterior = 0;
int proximo = 1; //novo numero da serie

//proximo[3] = proximo[2] + anterior[1];
//anterior[2] = proximo[3] - anterior[1];


while(proximo <50){
System.out.println(proximo);
proximo = proximo + anterior;
anterior = proximo - anterior;
}

}
}