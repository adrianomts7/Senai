//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Advogado santos = new Advogado("Santos","927987","18278",new Endereco("Rua A","20","n/a","9187391","Salvador",UnidadeFederativa.BAHIA),Setor.JURIDICO,Sexo.MASCULINO,5500.00,"20/10/1999","Criminalista");

        //System.out.println(santos.toString());
        //System.out.println(santos.salarioFinal(200.6));

        Motorista silva = new Motorista("Silva","1287987","91287398",new Endereco("Rua B","20","N/A","1732868","Nova Iguaçu",UnidadeFederativa.RIO_DE_JANEIRO),Setor.OPERACOES,Sexo.MASCULINO,2550.90,"31/01/2000","D");

        //System.out.println(silva.toString());
        //System.out.println(silva.salarioFinal(20));

        Gerente araujo = new Gerente("Araujo","91879","12892",new Endereco("Rua da Cajá","20","N/A","18726817","Guarujá",UnidadeFederativa.SAO_PAULO),Setor.OPERACOES,Sexo.FEMININO,4500.90,"20/10/1995");
        //System.out.println(araujo.toString());
        //System.out.println("Sálario Final: " + araujo.salarioFinal());

        Diretor souza = new Diretor("Souza","183239","2987192",new Endereco("Amaralinas","980","Rua Principal","0288080","Salvador",UnidadeFederativa.BAHIA),Setor.OPERACOES,Sexo.MASCULINO,6000,"28/02/2024");
        System.out.println(souza.toString());
        System.out.println("Sálario Final: " + souza.salarioFinal());

    }
}