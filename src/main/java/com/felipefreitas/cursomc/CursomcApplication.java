package com.felipefreitas.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.felipefreitas.cursomc.domain.Categoria;
import com.felipefreitas.cursomc.domain.Cidade;
import com.felipefreitas.cursomc.domain.Cliente;
import com.felipefreitas.cursomc.domain.Endereco;
import com.felipefreitas.cursomc.domain.Estado;
import com.felipefreitas.cursomc.domain.ItemPedido;
import com.felipefreitas.cursomc.domain.Pagamento;
import com.felipefreitas.cursomc.domain.PagamentoComBoleto;
import com.felipefreitas.cursomc.domain.PagamentoComCartao;
import com.felipefreitas.cursomc.domain.Pedido;
import com.felipefreitas.cursomc.domain.Produto;
import com.felipefreitas.cursomc.domain.enums.EstadoPagamento;
import com.felipefreitas.cursomc.domain.enums.TipoCliente;
import com.felipefreitas.cursomc.repositories.CategoriaRepository;
import com.felipefreitas.cursomc.repositories.CidadeRepository;
import com.felipefreitas.cursomc.repositories.ClienteRepository;
import com.felipefreitas.cursomc.repositories.EnderecoRepository;
import com.felipefreitas.cursomc.repositories.EstadoRepository;
import com.felipefreitas.cursomc.repositories.ItemPedidoRepository;
import com.felipefreitas.cursomc.repositories.PagamentoRepository;
import com.felipefreitas.cursomc.repositories.PedidoRepository;
import com.felipefreitas.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

 	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
