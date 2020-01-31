package libreria;

/**
 *
 * @author irodriguezsteuerberg
 */
public class MetodosArrays {

public static int buscarElemento(int [] lista,int elemBuscar){

int atopado = 0; //no está
int indice=0;
for(int i=0;i<lista.length;i++){
if (elemBuscar == lista[i]){
atopado=1;
indice=i;
break;
}
}
if (atopado == 0){
  System.out.println("Non está"); 
  return -1;
}
else{
  System.out.println("Está");
return indice;
}
}    
/*
public static void borrarElemento(int [] lista,int elemBorrar){
int i = buscarElemento(lista,elemBorrar);

  for (int j = i; j < lista.length-1; j++) {
    lista[j] = lista[j+1];
  }

}*/
}        
