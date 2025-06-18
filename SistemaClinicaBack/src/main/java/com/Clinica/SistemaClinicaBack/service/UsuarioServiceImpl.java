
package com.Clinica.SistemaClinicaBack.service;

import com.Clinica.SistemaClinicaBack.entity.Usuario;
import com.Clinica.SistemaClinicaBack.exception.ResourceNotFoundException;
import com.Clinica.SistemaClinicaBack.repository.UsuarioRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
class UsuarioServiceImpl implements UsuarioService{

    private final UsuarioRepository usuariorepository;

    public UsuarioServiceImpl(UsuarioRepository usuariorepository) {
        this.usuariorepository = usuariorepository;
    }
   
    
    @Override
    public Usuario save(Usuario usuario) {
        return usuariorepository.save(usuario);
    }

    @Override
    public List<Usuario> findAll() {
        return usuariorepository.findAll();
    }

    @Override
    public Usuario findById(String id) {
        Usuario usuario = usuariorepository.findById(id).orElseThrow(
            () ->{
                throw new ResourceNotFoundException("El usurio con matricula "+id+" no se encuentra");
            }    
        );
        //return usuariorepository.findById(id).get();
        return usuario;
    }

    @Override
    public void deleteById(String id) {
        usuariorepository.deleteById(id);
    }

    @Override
    public Usuario update(Usuario usuario) {
        return usuariorepository.save(usuario);
    }
    
    
    
    
}
