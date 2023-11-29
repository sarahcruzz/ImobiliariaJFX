package br.com.imobiliaria.model;

public class Imovel {
    // atributos da classe imóvel
    private String proprietario;
    private String cidade;
    private String areaTerreno;


    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getAreaTerreno() {
        return areaTerreno;
    }

    public void setAreaTerreno(String areaTerreno) {
        this.areaTerreno = areaTerreno;
    }

    // métodos
    public String obterDadosImovel(){
        return String.format("Proprietário: %s \nCidade: %s \nÁrea do terreno: %s", this.proprietario, this.cidade,
                this.areaTerreno);
    }
}
