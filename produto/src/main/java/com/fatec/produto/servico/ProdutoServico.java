package com.fatec.produto.servico;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fatec.produto.model.Catalogo;
import com.fatec.produto.model.IImagemRepository;
import com.fatec.produto.model.IProdutoRepository;
import com.fatec.produto.model.Imagem;
import com.fatec.produto.model.Produto;

@Service
public class ProdutoServico implements IProdutoServico {
	@Autowired
	IProdutoRepository repositoryP;
	@Autowired
	IImagemRepository repositoryI;

	@Override
	public List<Catalogo> consultaCatalogo() {
		Catalogo c = null;
		List<Catalogo> lista = new ArrayList<>();
		List<Produto> listaP = repositoryP.findAll();
		List<Imagem> listaI = repositoryI.findAll();
		for (Produto p : listaP) {
			for (Imagem i : listaI) {
				if (p.getId().equals(i.getId())) {
					c = new Catalogo(p.getId(), p.getDescricao(), p.getCategoria(), p.getQuantidadeNoEstoque(), i.getArquivo());
					lista.add(c);
				}
			}
		}
		return lista;
	}

	@Override
	public Optional<Imagem> salvar(MultipartFile arquivo, long id) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Imagem> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] getImagem(String nomeArquivo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] getImagemById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
