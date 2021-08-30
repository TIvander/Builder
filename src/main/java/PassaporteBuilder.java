import java.util.Calendar;

public class PassaporteBuilder {
    Passaporte pass = new Passaporte();

    public Passaporte build() {
        Calendar calendarDate=Calendar.getInstance();
        calendarDate.clear();
        calendarDate.getTime();

        if(pass.getNome().equals("")){
            throw new IllegalArgumentException("Nome não pode ser nulo");
        }
        if(pass.getDataValidade().equals(calendarDate) || pass.getDataValidade().before(calendarDate)){
            throw new IllegalArgumentException("Data de validade do passaporte expirada");
        }
        if(pass.getNumeroRg().length() < 9){
            throw new IllegalArgumentException("Numero de RG inválido");
        }
        return pass;
    }

    public PassaporteBuilder setNome(String nome) {
        pass.setNome(nome);
        return this;
    }
    public PassaporteBuilder setNacionalidade(String nacionalidade) {
        pass.setNacionalidade(nacionalidade);
        return this;
    }
    public PassaporteBuilder setDataNascimento(Calendar dtNascimento){
       pass.setDataNascimento(dtNascimento);
       return this;
    }
    public PassaporteBuilder setSexo(String sexo) {
        pass.setSexo(sexo);
        return this;
    }
    public PassaporteBuilder setNaturalidade(String naturalidade) {
        pass.setNacionalidade(naturalidade);
        return this;
    }
    public PassaporteBuilder setRg(String rg) {
        pass.setNumeroRg(rg);
        return this;
    }
    public PassaporteBuilder setNmMae(String nmMae) {
        pass.setNomeMae(nmMae);
        return this;
    }
    public PassaporteBuilder setNmPai(String nmPai) {
        pass.setNomePai(nmPai);
        return this;
    }
    public PassaporteBuilder setDtExpedicao(Calendar dtExpedicao) {
        pass.setDataExpedicao(dtExpedicao);
        return this;
    }
    public PassaporteBuilder setDtValidade(Calendar dtValidade) {
        pass.setDataValidade(dtValidade);
        return this;
    }
    public PassaporteBuilder setAutoridade(String autoridade) {
        pass.setAutoridade(autoridade);
        return this;
    }

    //Calendar c = Calendar.getInstance(); c.set(2007, 7, 16); // 16/08/2007
}
