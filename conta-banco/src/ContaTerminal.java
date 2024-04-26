public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, insira os dados pedidos: ");
        System.out.print("número da conta: ");
        numero = sc.nextInt();
        System.out.print("Agência: ");
        sc.nextLine();
        agencia = sc.nextLine();
        System.out.print("Seu nome : ");
        nomeCliente = sc.nextLine();
        System.out.print("Saldo: ");
        saldo = sc.nextDouble();

        System.out.println(
                "Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                        " conta " + numero + " e seu saldo R$ " + saldo + "  já está disponível para saque ");

    }
}
