import 'dart:io';
// usar "dart run Calc.dart" para rodar o programa/Ler expressões '2+2-1/0'
void main() {
  while (true) {
    limpar();
    
    print("=== CALCULADORA ===");
    print("Digite a conta (ou 'sair'):");
    stdout.write("> ");
    
    String? leitura = stdin.readLineSync();
    
    if (leitura == null || leitura.toLowerCase() == 'sair') break;
    if (leitura.trim().isEmpty) continue;

    try {
      String conta = leitura.replaceAll(" ", "");
      double res = resolverExpressao(conta);
      
      print("\nResultado: $res");
      print("\n[Pressione Enter]");
      stdin.readLineSync();
    } catch (e) {
      print("\nErro: Formato invalido.");
      sleep(Duration(seconds: 2));
    }
  }
}

double resolverExpressao(String texto) {
  List<String> itens = texto.split(RegExp(r'(?<=[-+*/])|(?=[-+*/])')); 

  for (int i = 0; i < itens.length; i++) {
    if (itens[i] == "*" || itens[i] == "/") {
      double n1 = double.parse(itens[i - 1]);
      double n2 = double.parse(itens[i + 1]);
      double subtotal = 0;

      if (itens[i] == "*") subtotal = n1 * n2;
      if (itens[i] == "/") subtotal = n1 / n2;

      itens.replaceRange(i - 1, i + 2, [subtotal.toString()]);
      i--;
    }
  }
  double total = double.parse(itens[0]);
  for (int i = 1; i < itens.length; i += 2) {
    String sinal = itens[i];
    double proximo = double.parse(itens[i + 1]);

    if (sinal == "+") total += proximo;
    if (sinal == "-") total -= proximo;
  }

  return total;
}

// O seu "os.system('clear')" do Dart
void limpar() {
  stdout.write('\x1B[2J\x1B[0;0H');
}