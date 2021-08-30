import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class PassaporteBuilderTest {

    @Test
    void deveRetornarExcecaoPassaporteNomeNulo(){
       try {
           PassaporteBuilder passBuilder = new PassaporteBuilder();
           Passaporte passaporte = passBuilder.setNome("")
                                              .build();
           fail();
       }
       catch (IllegalArgumentException e) {
           assertEquals("Nome não pode ser nulo", e.getMessage());
       }

    }
    @Test
    void deveRetornarExcecaoValidadeDoPassaporteExepirada(){
        try {
            PassaporteBuilder passBuilder = new PassaporteBuilder();
            Calendar calendarDate=Calendar.getInstance();
            calendarDate.clear();
            calendarDate.getTime();
            Passaporte passaporte = passBuilder.setNome("sdfsdfsdf")
                                               .setDtValidade(calendarDate)
                                               .build();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Data de validade do passaporte expirada", e.getMessage());
        }
    }
    @Test
    void deveRetornarExcecaoCaracteresInsuficientesNoRg(){
        try {
            PassaporteBuilder passBuilder = new PassaporteBuilder();
            Calendar calendarDate=Calendar.getInstance();
            calendarDate.clear();
            calendarDate.set(2000, 6, 1,0,0,0);
            Passaporte passaporte = passBuilder.setNome("nomeValido")
                                               .setDtValidade(calendarDate)
                                               .setRg("12345678")
                                               .build();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Numero de RG inválido", e.getMessage());
        }
    }

}