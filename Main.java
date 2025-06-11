class Main {
  public static void main(String[] args) {
    try {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      String op = args[2];

      switch (op) {
        case "+":
          System.out.println(a + b);
          break;
        case "-":
          System.out.println(a - b);
          break;
        case "*":
          System.out.println(a * b);
          break;
        case "/":
          if (b == 0) {
            System.out.println("Erreur : Division par zéro");
            System.exit(-1);
          } else {
            System.out.println(a / b);
          }
          break;
        default:
          System.out.println("Opérateur invalide");
          System.exit(-1);
      }
    } catch (NumberFormatException e) {
      System.out.println("Erreur : Entrée non numérique");
      System.exit(-1);
    }
  }
}
