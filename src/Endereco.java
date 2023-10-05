public record Endereco(String cep, String logradouro, String complemento, String bairro,
                       String localidade, String uf) {
    @Override
    public String toString() {
        return "Endereco\n" +
                "CEP = " + cep + '\'' +
                ", Logradouro ='" + logradouro + '\'' +
                ", Complemento ='" + complemento + '\'' +
                ", Bairro ='" + bairro + '\'' +
                ", Localidade ='" + localidade + '\'' +
                ", UF ='" + uf + '\'';
    }
}
