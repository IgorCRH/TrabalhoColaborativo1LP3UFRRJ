class Retangulo {
    private double comprimento;
    private double largura;

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getLargura() {
        return largura;
    }

    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }

    public double calcularArea() {
        return comprimento * largura;
    }
}