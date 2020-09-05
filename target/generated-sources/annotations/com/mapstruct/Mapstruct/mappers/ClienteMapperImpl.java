package com.mapstruct.Mapstruct.mappers;

import com.mapstruct.Mapstruct.models.Cliente;
import com.mapstruct.Mapstruct.models.Conta;
import com.mapstruct.Mapstruct.to.ClienteTO;
import com.mapstruct.Mapstruct.to.ContaTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-05T16:49:43-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_211 (Oracle Corporation)"
)
@Component
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public Cliente convert(ClienteTO clienteTO) {
        if ( clienteTO == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        cliente.setContas( contaTOListToContaList( clienteTO.getContasTO() ) );
        cliente.setNome( clienteTO.getNome() );

        return cliente;
    }

    protected Conta contaTOToConta(ContaTO contaTO) {
        if ( contaTO == null ) {
            return null;
        }

        Conta conta = new Conta();

        conta.setAgencia( contaTO.getAgencia() );
        conta.setNumeroConta( contaTO.getNumeroConta() );

        return conta;
    }

    protected List<Conta> contaTOListToContaList(List<ContaTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Conta> list1 = new ArrayList<Conta>( list.size() );
        for ( ContaTO contaTO : list ) {
            list1.add( contaTOToConta( contaTO ) );
        }

        return list1;
    }
}
