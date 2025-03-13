public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, DevOps Toledo Prudente!");

        System.out.println("Executando operações matemáticas");
        System.out.println(Calculadora.dividir(10, 5));

        System.out.println("Criando objeto do tipo Pessoa");
        Pessoa pessoa = new Pessoa("John Doe", "johndoe@gmail.com", 25, "DEV", "(18)12345-6789");
        pessoa.apresentarse();
    }
}
