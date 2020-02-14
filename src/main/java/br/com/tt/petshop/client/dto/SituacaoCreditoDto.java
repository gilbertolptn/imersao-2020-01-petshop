package br.com.tt.petshop.client.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SituacaoCreditoDto {

    private String situacao;

    @JsonProperty("pontos")
    //@JsonAlias({"pts", "pontuacao"})
    private int pontuacao;

//    @JsonCreator
//    public SituacaoCreditoDto(
//            @JsonProperty("situacao") String situacao,
//            @JsonProperty("pontos") int pontuacao) {
//        this.situacao = situacao;
//        this.pontuacao = pontuacao;
//    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public boolean isNegativado() {
        return "NEGATIVADO".equalsIgnoreCase(situacao);
    }
}
