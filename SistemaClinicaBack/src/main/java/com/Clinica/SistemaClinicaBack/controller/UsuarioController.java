package com.Clinica.SistemaClinicaBack.controller;

import com.Clinica.SistemaClinicaBack.entity.Usuario;
import com.Clinica.SistemaClinicaBack.service.UsuarioService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
//localhost:8080/api/usuarios
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioservice;

    public UsuarioController(UsuarioService usuarioservice) {
        this.usuarioservice = usuarioservice;
    }
     
    //localhost:8080/api/usuarios
    @PostMapping
    public Usuario save(@RequestBody Usuario usuario){
        return usuarioservice.save(usuario);
    }
    
    //localhost:8080/api/usuarios
    @GetMapping
    public List<Usuario> findAll(){
        return usuarioservice.findAll();
    }
    
    //localhost:8080//localhost:8080/api/usuarios/"matricula del estudiante"
    @GetMapping("/{matricula}")
    public Usuario findById(@PathVariable("matricula") String id){
        return usuarioservice.findById(id);
    }
    
    //localhost:8080/api/usuarios/matricula del estudiante
    @DeleteMapping("/{matricula}")
    public void deleteById(@PathVariable("matricula") String id){
        usuarioservice.deleteById(id);  
    }
    
  //localhost:8080/api/usuarios
    @PutMapping
    public Usuario updateUsuario(@RequestBody Usuario usuario){
        Usuario usuariodb = usuarioservice.findById(usuario.getMatricula());
        usuariodb.setNombreUsuario(usuario.getNombreUsuario());
        usuariodb.setUsuario(usuario.getUsuario());
        usuariodb.setContrasena(usuario.getContrasena());
        usuariodb.setPeriodo(usuario.getPeriodo());
               
        return usuarioservice.update(usuariodb);
    }
}
