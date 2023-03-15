
package basejava;


public class Numero {
int valor;
 public String parImpar (){
     if(this.valor % 2 ==0){
         return "PAR";
     }else{
         return "IMPAR";
     }
 }

 public String parImpar(int valor){
    if(valor % 2 ==0){
    return"PAR";
 }else{
    return "IMPAR";
 }
 }

public int maiormenor (int valor1, int valor2) {

    if(valor1 > valor2){
        return valor1;
    }
        return valor2;
}
public String ordenarCrescente(int v1, int v2, int v3){


    // if( v1 < v2 && v2 < v3 ) {

	// 	return  v1 + " " + v2 + " " + v3;

	// } if( v1 < v3 && v3 < v2 ) {

	// 	return  v1 + " " + v3 + " " + v2;

	// } if( v2 < v1 && v1 < v3 ) {

	// 	return  v2 + " " + v1 + " " + v3;

	// } if( v2 < v3 && v3 < v1 ) {

	// 	return  v2 + " " + v3 + " " + v1;

	// } if( v3 < v2 && v2 < v1 ) {

	// 	return  v3 + " " + v2 + " " + v1;
        
	// } if( v3 < v1 && v1 < v2 ) {
	// }
	// return  v3 + " " + v1 + " " + v2;

    int temp = 0;
    if (v1 > v2){
        temp = v1;
        v1 = v2;
        v2 = temp;
    }
    if (v2 > v3){
        temp = v3;
        v3 = v2;
        v2 = temp;
    }
    if (v1 > v3){
        temp = v3;
        v3 = v1;
        v1 = temp;
    }
    return  v1 + " " + v2 + " " + v3;
}
}

