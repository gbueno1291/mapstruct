package com.mapstruct.Mapstruct.mappers;

import com.mapstruct.Mapstruct.models.Conta;
import com.mapstruct.Mapstruct.to.ContaTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-05T16:49:43-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_211 (Oracle Corporation)"
)
@Component
public class ContaMapperImpl implements ContaMapper {

    @Override
    public Conta convert(ContaTO contaTO) {
        if ( contaTO == null ) {
            return null;
        }

        Conta conta = new Conta();

        conta.setSaldo( contaTO.getSaldoConta() );
        conta.setAgencia( contaTO.getAgencia() );
        conta.setNumeroConta( contaTO.getNumeroConta() );

        return conta;
    }
}
