import java.lang.ref.Cleaner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int op;
            int tam=0;
        Elemento[]lista =new Elemento[tam];
            Scanner tc=new Scanner(System.in);
            do {
                System.out.println(

                        "\n 1- Add ELemento no inicio" +
                                "\n 2- Remover Elemento no começo" +
                                "\n 3-localizar elemento pela posição" +
                                "\n 4- Sair"+
                                "\n 5-Destruição"
                );
                op=tc.nextInt();

            }while(op!=4);

            switch (op){
                case 1:{
                    Elemento e=new Elemento();
                    e.ler();
                    lista[tam]=e;
                    tam++;
                    break;

                }
                case 2:{
                       lista[tam-1]=null;
                       tam--;
                       break;
                }
                case 3:{
                    System.out.println("Digite o elememnto pela posição");
                    int posicao;
                    posicao=tc.nextInt();
                    for(int i=0;i<tam;i++){
                        if(i==posicao){
                            System.out.println(lista[i]);
                        }
                    }
                    break;


                }
                case 4:{
                    if(lista !=null) {
                        for (int i = 0; i < tam; i++) {
                            System.out.println(lista[i]);
                        }
                    }
                }
                case 5:{
                    for(int i=0;i<tam;i++){
                        lista[i]= null;

                        for(int k=0;k<tam;k++) {
                            tam--;
                        }

                    }
                    break;
                }
                case 6:{
                    System.out.println("Progama Ecerrado!!");
                    break;
                }
            }


        }
    }

