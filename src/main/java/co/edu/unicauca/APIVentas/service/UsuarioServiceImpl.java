package co.edu.unicauca.APIVentas.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.unicauca.APIVentas.Repository.IUsuarioRepository;
import co.edu.unicauca.APIVentas.model.usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	private IUsuarioRepository usuarioRepo;
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<usuario> findAll() {
		return usuarioRepo.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<usuario> findAll(Pageable pageable) {
		return usuarioRepo.findAll(pageable);
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<usuario> findById(String UsuarioNick) {
		return usuarioRepo.findById(UsuarioNick);
	}

	@Override
	@Transactional
	public usuario save(usuario user) {
		return usuarioRepo.save(user);
	}

	@Override
	@Transactional
	public void deleteById(String UsuarioNick) {
		usuarioRepo.deleteById(UsuarioNick);
	}

}
