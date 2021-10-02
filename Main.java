class Main {
  public static void main(String[] args) {

        Pokemon myPokemon = new Pokemon("Cindarace", "Fogo", 70);
        Pokemon enemyPokemon = new Pokemon("Blastoise", "Agua", 30);
                           
        myPokemon.imprimiPokemon();
        enemyPokemon.imprimiPokemon();

        Batalha batalha = new Batalha(myPokemon.getVida(), enemyPokemon.getVida(), myPokemon.getMove(), enemyPokemon.getMove(), myPokemon.getNome(), enemyPokemon.getNome());
        
        
  }
}