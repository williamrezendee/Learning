namespace tabuleiro
{
    class Peca
    {
        public Posicao posicao { get; set; }
        public Cor  cor { get; protected set; }
        public int quantidadeMovimentos { get; protected set; }
        public Tabuleiro tabuleiro { get; protected set; }

        public Peca(Posicao pos, Tabuleiro tab, Cor cor)
        {
            this.posicao = pos;
            this.tabuleiro = tab;
            this.cor = cor;
            this.quantidadeMovimentos = 0;
        }
    }
}
