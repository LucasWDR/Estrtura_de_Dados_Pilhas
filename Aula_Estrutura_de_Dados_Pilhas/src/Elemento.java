import java.util.Scanner;

public class Elemento {
    Scanner tc =new Scanner(System.in);
    String nome;

    public void ler(){

        System.out.println("Digite o nome:");
        nome=tc.next();
}
@Override
    public String toString(){
        return
                "nome="+nome;
}



}
